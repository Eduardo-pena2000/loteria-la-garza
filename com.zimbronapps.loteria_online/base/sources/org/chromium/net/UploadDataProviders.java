package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UploadDataProviders {

    public static class a implements d {
        public final /* synthetic */ File a;

        public a(File file) {
            this.a = file;
        }

        public FileChannel a() {
            return new FileInputStream(this.a).getChannel();
        }
    }

    public static class b implements d {
        public final /* synthetic */ ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public FileChannel a() {
            if (this.a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
            }
            this.a.close();
            throw new IllegalArgumentException("Not a file: " + this.a);
        }
    }

    public static final class c extends UploadDataProvider {
        public final ByteBuffer a;

        public /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        public long getLength() {
            return this.a.limit();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.a.remaining()) {
                byteBuffer.put(this.a);
            } else {
                int limit = this.a.limit();
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.a);
                this.a.limit(limit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        public void rewind(UploadDataSink uploadDataSink) {
            this.a.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public c(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }
    }

    public interface d {
        FileChannel a();
    }

    public static final class e extends UploadDataProvider {
        public volatile FileChannel a;
        public final d b;
        public final Object c;

        public /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        public final FileChannel a() {
            if (this.a == null) {
                synchronized (this.c) {
                    try {
                        if (this.a == null) {
                            this.a = this.b.a();
                        }
                    } finally {
                    }
                }
            }
            return this.a;
        }

        public void close() {
            FileChannel fileChannel = this.a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public long getLength() {
            return a().size();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel a = a();
            int i = 0;
            while (i == 0) {
                int read = a.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        public void rewind(UploadDataSink uploadDataSink) {
            a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        public e(d dVar) {
            this.c = new Object();
            this.b = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new c(ByteBuffer.wrap(bArr, i, i2).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
