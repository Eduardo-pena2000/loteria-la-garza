package com.applovin.shadow.okhttp3.internal.cache2;

import Ca.I;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final ByteString PREFIX_CLEAN;
    public static final ByteString PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final Buffer buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final ByteString metadata;
    private int sourceCount;
    private Source upstream;
    private final Buffer upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Relay edit(File file, Source source, ByteString byteString, long j) throws IOException {
            t.g(file, "file");
            t.g(source, "upstream");
            t.g(byteString, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, source, 0L, byteString, j, null);
            randomAccessFile.setLength(0L);
            Relay.access$writeHeader(relay, Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            t.g(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            t.f(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, 32L);
            if (!t.c(buffer.readByteString(r1.size()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = buffer.readLong();
            long readLong2 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(readLong + 32, buffer2, readLong2);
            return new Relay(randomAccessFile, null, readLong, buffer2.readByteString(), 0L, null);
        }

        private Companion() {
        }
    }

    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            t.d(file);
            FileChannel channel = file.getChannel();
            t.f(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            Closeable closeable = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        Closeable file = relay.getFile();
                        relay.setFile(null);
                        closeable = file;
                    }
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (closeable != null) {
                Util.closeQuietly(closeable);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r10 = java.lang.Math.min(r23, r21.this$0.getUpstreamPos() - r21.sourcePos);
            r2 = r21.fileOperator;
            kotlin.jvm.internal.t.d(r2);
            r2.read(r21.sourcePos + 32, r22, r10);
            r21.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        
            r0 = r21.this$0.getUpstream();
            kotlin.jvm.internal.t.d(r0);
            r11 = r0.read(r21.this$0.getUpstreamBuffer(), r21.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            r0 = r21.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.t.e(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            r19 = java.lang.Math.min(r11, r23);
            r21.this$0.getUpstreamBuffer().copyTo(r22, 0, r19);
            r21.sourcePos += r19;
            r13 = r21.fileOperator;
            kotlin.jvm.internal.t.d(r13);
            r13.write(r21.this$0.getUpstreamPos() + 32, r21.this$0.getUpstreamBuffer().clone(), r11);
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
        
            if (r2.getBuffer().size() <= r2.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().size() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r11);
            r0 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.t.e(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
        
            return r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.t.e(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
        
            throw r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(com.applovin.shadow.okio.Buffer r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 387
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.cache2.Relay.RelaySource.read(com.applovin.shadow.okio.Buffer, long):long");
        }

        public Timeout timeout() {
            return this.timeout;
        }
    }

    static {
        ByteString.Companion companion = ByteString.Companion;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2, k kVar) {
        this(randomAccessFile, source, j, byteString, j2);
    }

    public static final /* synthetic */ void access$writeHeader(Relay relay, ByteString byteString, long j, long j2) {
        relay.writeHeader(byteString, j, j2);
    }

    private final void writeHeader(ByteString byteString, long j, long j2) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j);
        buffer.writeLong(j2);
        if (buffer.size() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        t.d(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.f(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, 32L);
    }

    private final void writeMetadata(long j) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        t.d(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.f(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, buffer, this.metadata.size());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        t.d(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        t.d(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            I i = I.a;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final ByteString metadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j;
        this.metadata = byteString;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new Buffer();
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }
}
