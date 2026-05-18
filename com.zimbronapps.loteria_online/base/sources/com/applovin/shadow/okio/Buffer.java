package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.-Buffer;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
            }
            if (i > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment writableSegment$okio = buffer.writableSegment$okio(i);
            int i2 = 8192 - writableSegment$okio.limit;
            writableSegment$okio.limit = 8192;
            long j = i2;
            buffer.setSize$okio(size + j);
            setSegment$okio(writableSegment$okio);
            this.offset = size;
            this.data = writableSegment$okio.data;
            this.start = 8192 - i2;
            this.end = 8192;
            return j;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            kotlin.jvm.internal.t.d(buffer);
            if (j == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j2 = this.offset;
            return seek(j2 == -1 ? 0L : j2 + (this.end - this.start));
        }

        public final long resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (j <= size) {
                if (j < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                }
                long j2 = size - j;
                while (true) {
                    if (j2 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    kotlin.jvm.internal.t.d(segment);
                    Segment segment2 = segment.prev;
                    kotlin.jvm.internal.t.d(segment2);
                    int i = segment2.limit;
                    long j3 = i - segment2.pos;
                    if (j3 > j2) {
                        segment2.limit = i - ((int) j2);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j2 -= j3;
                }
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j > size) {
                long j4 = j - size;
                boolean z = true;
                while (j4 > 0) {
                    Segment writableSegment$okio = buffer.writableSegment$okio(1);
                    int min = (int) Math.min(j4, 8192 - writableSegment$okio.limit);
                    writableSegment$okio.limit += min;
                    j4 -= min;
                    if (z) {
                        setSegment$okio(writableSegment$okio);
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        int i2 = writableSegment$okio.limit;
                        this.start = i2 - min;
                        this.end = i2;
                        z = false;
                    }
                }
            }
            buffer.setSize$okio(j);
            return size;
        }

        public final int seek(long j) {
            Segment segment;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j < -1 || j > buffer.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
            }
            if (j == -1 || j == buffer.size()) {
                setSegment$okio(null);
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment2 = buffer.head;
            long j2 = 0;
            if (getSegment$okio() != null) {
                long j3 = this.offset;
                int i = this.start;
                kotlin.jvm.internal.t.d(getSegment$okio());
                long j4 = j3 - (i - r9.pos);
                if (j4 > j) {
                    segment = segment2;
                    segment2 = getSegment$okio();
                    size = j4;
                } else {
                    segment = getSegment$okio();
                    j2 = j4;
                }
            } else {
                segment = segment2;
            }
            if (size - j > j - j2) {
                while (true) {
                    kotlin.jvm.internal.t.d(segment);
                    int i2 = segment.limit;
                    int i3 = segment.pos;
                    if (j < (i2 - i3) + j2) {
                        break;
                    }
                    j2 += i2 - i3;
                    segment = segment.next;
                }
            } else {
                while (size > j) {
                    kotlin.jvm.internal.t.d(segment2);
                    segment2 = segment2.prev;
                    kotlin.jvm.internal.t.d(segment2);
                    size -= segment2.limit - segment2.pos;
                }
                j2 = size;
                segment = segment2;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.t.d(segment);
                if (segment.shared) {
                    Segment unsharedCopy = segment.unsharedCopy();
                    if (buffer.head == segment) {
                        buffer.head = unsharedCopy;
                    }
                    segment = segment.push(unsharedCopy);
                    Segment segment3 = segment.prev;
                    kotlin.jvm.internal.t.d(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segment);
            this.offset = j;
            kotlin.jvm.internal.t.d(segment);
            this.data = segment.data;
            int i4 = segment.pos + ((int) (j - j2));
            this.start = i4;
            int i5 = segment.limit;
            this.end = i5;
            return i5 - i4;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static final class 1 extends OutputStream {
        public 1() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return Buffer.this + ".outputStream()";
        }

        public void write(int i) {
            Buffer.this.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "data");
            Buffer.this.write(bArr, i, i2);
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            kotlin.jvm.internal.t.d(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i2 = segment2.pos;
                messageDigest.update(bArr2, i2, segment2.limit - i2);
                segment2 = segment2.next;
                kotlin.jvm.internal.t.d(segment2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.t.f(digest, "digest(...)");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                kotlin.jvm.internal.t.d(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i2 = segment2.pos;
                    mac.update(bArr2, i2, segment2.limit - i2);
                    segment2 = segment2.next;
                    kotlin.jvm.internal.t.d(segment2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.t.f(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = -SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = -SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    @Ca.e
    public final byte -deprecated_getByte(long j) {
        return getByte(j);
    }

    @Ca.e
    public final long -deprecated_size() {
        return this.size;
    }

    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        Segment segment2 = segment.prev;
        kotlin.jvm.internal.t.d(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= r3 - segment2.pos;
        }
        return size;
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            kotlin.jvm.internal.t.d(segment);
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                kotlin.jvm.internal.t.d(segment3);
                kotlin.jvm.internal.t.d(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    public Buffer emit() {
        return this;
    }

    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                kotlin.jvm.internal.t.d(segment);
                Segment segment2 = buffer.head;
                kotlin.jvm.internal.t.d(segment2);
                int i = segment.pos;
                int i2 = segment2.pos;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(segment.limit - i, segment2.limit - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.data[i] == segment2.data[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == segment.limit) {
                        segment = segment.next;
                        kotlin.jvm.internal.t.d(segment);
                        i = segment.pos;
                    }
                    if (i2 == segment2.limit) {
                        segment2 = segment2.next;
                        kotlin.jvm.internal.t.d(segment2);
                        i2 = segment2.pos;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    public boolean exhausted() {
        return this.size == 0;
    }

    public void flush() {
    }

    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j) {
        -SegmentedByteString.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment == null) {
            kotlin.jvm.internal.t.d((Object) null);
            throw null;
        }
        if (size() - j < j) {
            long size = size();
            while (size > j) {
                segment = segment.prev;
                kotlin.jvm.internal.t.d(segment);
                size -= segment.limit - segment.pos;
            }
            kotlin.jvm.internal.t.d(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                kotlin.jvm.internal.t.d(segment);
                return segment.data[(int) ((segment.pos + j) - j2)];
            }
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
            j2 = j3;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
        } while (segment != this.head);
        return i;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac("HmacSHA512", byteString);
    }

    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    public long indexOfElement(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "targetBytes");
        return indexOfElement(byteString, 0L);
    }

    public InputStream inputStream() {
        return new 1();
    }

    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    public OutputStream outputStream() {
        return new 1();
    }

    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    public boolean rangeEquals(long j, ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        kotlin.jvm.internal.t.g(byteBuffer, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i = segment.pos + min;
        segment.pos = i;
        this.size -= min;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public long readAll(Sink sink) throws IOException {
        kotlin.jvm.internal.t.g(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        setSize$okio(size() - 1);
        if (i3 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public byte[] readByteArray() {
        return readByteArray(size());
    }

    public ByteString readByteString() {
        return readByteString(size());
    }

    public long readDecimalLong() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            Segment segment = this.head;
            kotlin.jvm.internal.t.d(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        Buffer writeByte = new Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + -SegmentedByteString.toHexString(getByte(0L)));
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        kotlin.jvm.internal.t.g(inputStream, "input");
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public void readFully(Buffer buffer, long j) throws EOFException {
        kotlin.jvm.internal.t.g(buffer, "sink");
        if (size() >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.t.d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            com.applovin.shadow.okio.Buffer r0 = new com.applovin.shadow.okio.Buffer
            r0.<init>()
            com.applovin.shadow.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = com.applovin.shadow.okio.-SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto La1
        L9f:
            r6.pos = r8
        La1:
            if (r1 != 0) goto La7
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        setSize$okio(size() - 4);
        if (i5 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return i6;
    }

    public int readIntLe() throws EOFException {
        return -SegmentedByteString.reverseBytes(readInt());
    }

    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        setSize$okio(size() - 8);
        if (i4 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return j2;
    }

    public long readLongLe() throws EOFException {
        return -SegmentedByteString.reverseBytes(readLong());
    }

    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        setSize$okio(size() - 2);
        if (i5 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return (short) i6;
    }

    public short readShortLe() throws EOFException {
        return -SegmentedByteString.reverseBytes(readShort());
    }

    public String readString(Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public String readUtf8() {
        return readString(this.size, Za.c.b);
    }

    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b = getByte(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (size() < j) {
            throw new EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + -SegmentedByteString.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = getByte(j2);
            if ((b2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (b2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) {
        return this.size >= j;
    }

    public void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    public int select(Options options) {
        kotlin.jvm.internal.t.g(options, "options");
        int selectPrefix$default = -Buffer.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            setSize$okio(size() - j2);
            j -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            kotlin.jvm.internal.t.d(segment);
            Segment segment2 = segment.prev;
            kotlin.jvm.internal.t.d(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment take = SegmentPool.take();
        this.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    public long writeAll(Source source) throws IOException {
        kotlin.jvm.internal.t.g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    public static final class 1 extends InputStream {
        public 1() {
        }

        public int available() {
            return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (Buffer.this.size() > 0) {
                return Buffer.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return Buffer.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "sink");
            return Buffer.this.read(bArr, i, i2);
        }
    }

    public Buffer clone() {
        return copy();
    }

    public final Buffer copyTo(OutputStream outputStream, long j) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
    }

    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public long indexOfElement(ByteString byteString, long j) {
        int i;
        int i2;
        kotlin.jvm.internal.t.g(byteString, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j < j) {
            j2 = size();
            while (j2 > j) {
                segment = segment.prev;
                kotlin.jvm.internal.t.d(segment);
                j2 -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j2 < size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = segment.pos;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    kotlin.jvm.internal.t.d(segment);
                    j = j2;
                }
                return -1L;
            }
            byte[] internalArray$okio = byteString.internalArray$okio();
            while (j2 < size()) {
                byte[] bArr2 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i4 = segment.limit;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray$okio) {
                        if (b4 == b5) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.t.d(segment);
                j = j2;
            }
            return -1L;
        }
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
            j2 = j3;
        }
        if (byteString.size() == 2) {
            byte b6 = byteString.getByte(0);
            byte b7 = byteString.getByte(1);
            while (j2 < size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b8 = bArr3[i];
                    if (b8 != b6 && b8 != b7) {
                        i++;
                    }
                    i2 = segment.pos;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.t.d(segment);
                j = j2;
            }
            return -1L;
        }
        byte[] internalArray$okio2 = byteString.internalArray$okio();
        while (j2 < size()) {
            byte[] bArr4 = segment.data;
            i = (int) ((segment.pos + j) - j2);
            int i6 = segment.limit;
            while (i < i6) {
                byte b9 = bArr4[i];
                for (byte b10 : internalArray$okio2) {
                    if (b9 == b10) {
                        i2 = segment.pos;
                    }
                }
                i++;
            }
            j2 += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
            j = j2;
        }
        return -1L;
        return (i - i2) + j2;
    }

    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(i3 + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.t.g(unsafeCursor, "unsafeCursor");
        return -Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    public byte[] readByteArray(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public ByteString readByteString(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(readByteArray(j));
        }
        ByteString snapshot = snapshot((int) j);
        skip(j);
        return snapshot;
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        kotlin.jvm.internal.t.g(inputStream, "input");
        if (j >= 0) {
            readFrom(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public String readString(long j, Charset charset) throws EOFException {
        kotlin.jvm.internal.t.g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.size < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.pos;
        if (i + j > segment.limit) {
            return new String(readByteArray(j), charset);
        }
        int i2 = (int) j;
        String str = new String(segment.data, i, i2, charset);
        int i3 = segment.pos + i2;
        segment.pos = i3;
        this.size -= j;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.t.g(unsafeCursor, "unsafeCursor");
        return -Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    public String readUtf8(long j) throws EOFException {
        return readString(j, Za.c.b);
    }

    public String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long indexOf = indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(this, indexOf);
        }
        if (j2 < size() && getByte(j2 - 1) == 13 && getByte(j2) == 10) {
            return -Buffer.readUtf8Line(this, j2);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public Buffer writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    public Buffer writeDecimalLong(long j) {
        boolean z;
        if (j == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = -Buffer.getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = -Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    public Buffer writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public Buffer writeIntLe(int i) {
        return writeInt(-SegmentedByteString.reverseBytes(i));
    }

    public Buffer writeLong(long j) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        writableSegment$okio.limit = i + 8;
        setSize$okio(size() + 8);
        return this;
    }

    public Buffer writeLongLe(long j) {
        return writeLong(-SegmentedByteString.reverseBytes(j));
    }

    public Buffer writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    public Buffer writeShortLe(int i) {
        return writeShort((int) -SegmentedByteString.reverseBytes((short) i));
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        -SegmentedByteString.checkOffsetAndCount(this.size, 0L, j);
        Segment segment = this.head;
        while (j > 0) {
            kotlin.jvm.internal.t.d(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            long j2 = min;
            this.size -= j2;
            j -= j2;
            if (i == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    public Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i && i < 57344) {
            writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            setSize$okio(size() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + -SegmentedByteString.toHexString(i));
            }
            Segment writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit = i4 + 4;
            setSize$okio(size() + 4);
        }
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j2) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        -SegmentedByteString.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            kotlin.jvm.internal.t.d(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.next;
        }
        while (j2 > 0) {
            kotlin.jvm.internal.t.d(segment);
            int min = (int) Math.min(segment.limit - r9, j2);
            outputStream.write(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    public long indexOf(ByteString byteString) throws IOException {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        return indexOf(byteString, 0L);
    }

    public Buffer writeString(String str, Charset charset) {
        kotlin.jvm.internal.t.g(str, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        return writeString(str, 0, str.length(), charset);
    }

    public Buffer writeUtf8(String str) {
        kotlin.jvm.internal.t.g(str, "string");
        return writeUtf8(str, 0, str.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    private final void readFrom(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            Segment writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j2 = read;
            this.size += j2;
            j -= j2;
        }
    }

    public long indexOf(byte b, long j, long j2) {
        Segment segment;
        int i;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > size()) {
            j2 = size();
        }
        if (j == j2 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j < j) {
            j3 = size();
            while (j3 > j) {
                segment = segment.prev;
                kotlin.jvm.internal.t.d(segment);
                j3 -= segment.limit - segment.pos;
            }
            while (j3 < j2) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.t.d(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        -SegmentedByteString.checkOffsetAndCount(size(), 0L, i);
        Segment segment = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.t.d(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.t.d(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public Buffer writeUtf8(String str, int i, int i2) {
        char charAt;
        kotlin.jvm.internal.t.g(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    Segment writableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i3 = writableSegment$okio.limit - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    int i5 = writableSegment$okio.limit;
                    int i6 = (i3 + i) - i5;
                    writableSegment$okio.limit = i5 + i6;
                    setSize$okio(size() + i6);
                } else {
                    if (charAt2 < 2048) {
                        Segment writableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i7 = writableSegment$okio2.limit;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio2.limit = i7 + 2;
                        setSize$okio(size() + 2);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt2 <= 56319 && 56320 <= charAt3 && charAt3 < 57344) {
                            int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            Segment writableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i10 = writableSegment$okio3.limit;
                            bArr3[i10] = (byte) ((i9 >> 18) | 240);
                            bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                            bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                            bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                            writableSegment$okio3.limit = i10 + 4;
                            setSize$okio(size() + 4);
                            i += 2;
                        } else {
                            writeByte(63);
                            i = i8;
                        }
                    } else {
                        Segment writableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                        bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio4.limit = i11 + 3;
                        setSize$okio(size() + 3);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }

    public void readFully(byte[] bArr) throws EOFException {
        kotlin.jvm.internal.t.g(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    public Buffer writeString(String str, int i, int i2, Charset charset) {
        kotlin.jvm.internal.t.g(str, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (i2 <= str.length()) {
                if (kotlin.jvm.internal.t.c(charset, Za.c.b)) {
                    return writeUtf8(str, i, i2);
                }
                String substring = str.substring(i, i2);
                kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        kotlin.jvm.internal.t.g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    public int read(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "sink");
        -SegmentedByteString.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i3 = segment.pos;
        Da.p.f(bArr2, bArr, i, i3, i3 + min);
        segment.pos += min;
        setSize$okio(size() - min);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final Buffer copyTo(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "out");
        return copyTo(buffer, j, this.size - j);
    }

    public Buffer write(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer buffer, long j, long j2) {
        kotlin.jvm.internal.t.g(buffer, "out");
        -SegmentedByteString.checkOffsetAndCount(size(), j, j2);
        if (j2 != 0) {
            buffer.setSize$okio(buffer.size() + j2);
            Segment segment = this.head;
            while (true) {
                kotlin.jvm.internal.t.d(segment);
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment = segment.next;
            }
            while (j2 > 0) {
                kotlin.jvm.internal.t.d(segment);
                Segment sharedCopy = segment.sharedCopy();
                int i3 = sharedCopy.pos + ((int) j);
                sharedCopy.pos = i3;
                sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    kotlin.jvm.internal.t.d(segment2);
                    Segment segment3 = segment2.prev;
                    kotlin.jvm.internal.t.d(segment3);
                    segment3.push(sharedCopy);
                }
                j2 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j = 0;
            }
        }
        return this;
    }

    public Buffer write(ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        byteString.write$okio(this, i, i2);
        return this;
    }

    public Buffer write(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public Buffer write(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "source");
        long j = i2;
        -SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            Da.p.f(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        setSize$okio(size() + j);
        return this;
    }

    public long read(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j > size()) {
            j = size();
        }
        buffer.write(this, j);
        return j;
    }

    public Buffer write(Source source, long j) throws IOException {
        kotlin.jvm.internal.t.g(source, "source");
        while (j > 0) {
            long read = source.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        int i;
        long j2 = j;
        kotlin.jvm.internal.t.g(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j3 = 0;
        if (j2 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j2 < j2) {
                    j3 = size();
                    while (j3 > j2) {
                        segment = segment.prev;
                        kotlin.jvm.internal.t.d(segment);
                        j3 -= segment.limit - segment.pos;
                    }
                    byte[] internalArray$okio = byteString.internalArray$okio();
                    byte b = internalArray$okio[0];
                    int size = byteString.size();
                    long size2 = (size() - size) + 1;
                    while (j3 < size2) {
                        byte[] bArr = segment.data;
                        long j4 = size2;
                        int min = (int) Math.min(segment.limit, (segment.pos + size2) - j3);
                        i = (int) ((segment.pos + j2) - j3);
                        while (i < min) {
                            if (bArr[i] == b && -Buffer.rangeEquals(segment, i + 1, internalArray$okio, 1, size)) {
                                return (i - segment.pos) + j3;
                            }
                            i++;
                        }
                        j3 += segment.limit - segment.pos;
                        segment = segment.next;
                        kotlin.jvm.internal.t.d(segment);
                        j2 = j3;
                        size2 = j4;
                    }
                } else {
                    while (true) {
                        long j5 = (segment.limit - segment.pos) + j3;
                        if (j5 > j2) {
                            break;
                        }
                        segment = segment.next;
                        kotlin.jvm.internal.t.d(segment);
                        j3 = j5;
                    }
                    byte[] internalArray$okio2 = byteString.internalArray$okio();
                    byte b2 = internalArray$okio2[0];
                    int size3 = byteString.size();
                    long size4 = (size() - size3) + 1;
                    while (j3 < size4) {
                        byte[] bArr2 = segment.data;
                        int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j3);
                        i = (int) ((segment.pos + j2) - j3);
                        while (i < min2) {
                            if (bArr2[i] == b2 && -Buffer.rangeEquals(segment, i + 1, internalArray$okio2, 1, size3)) {
                                return (i - segment.pos) + j3;
                            }
                            i++;
                        }
                        j3 += segment.limit - segment.pos;
                        segment = segment.next;
                        kotlin.jvm.internal.t.d(segment);
                        j2 = j3;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    public void write(Buffer buffer, long j) {
        Segment segment;
        kotlin.jvm.internal.t.g(buffer, "source");
        if (buffer != this) {
            -SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = buffer.head;
                kotlin.jvm.internal.t.d(segment2);
                int i = segment2.limit;
                kotlin.jvm.internal.t.d(buffer.head);
                if (j < i - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        kotlin.jvm.internal.t.d(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer.head;
                            kotlin.jvm.internal.t.d(segment4);
                            segment4.writeTo(segment, (int) j);
                            buffer.setSize$okio(buffer.size() - j);
                            setSize$okio(size() + j);
                            return;
                        }
                    }
                    Segment segment5 = buffer.head;
                    kotlin.jvm.internal.t.d(segment5);
                    buffer.head = segment5.split((int) j);
                }
                Segment segment6 = buffer.head;
                kotlin.jvm.internal.t.d(segment6);
                long j2 = segment6.limit - segment6.pos;
                buffer.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    kotlin.jvm.internal.t.d(segment7);
                    Segment segment8 = segment7.prev;
                    kotlin.jvm.internal.t.d(segment8);
                    segment8.push(segment6).compact();
                }
                buffer.setSize$okio(buffer.size() - j2);
                setSize$okio(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
