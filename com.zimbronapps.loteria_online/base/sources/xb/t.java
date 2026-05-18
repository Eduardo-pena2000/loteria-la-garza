package xb;

import java.io.RandomAccessFile;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class t extends j {
    public final RandomAccessFile e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        kotlin.jvm.internal.t.g(randomAccessFile, "randomAccessFile");
        this.e = randomAccessFile;
    }

    public synchronized void g() {
        this.e.close();
    }

    public synchronized int h(long j, byte[] array, int i, int i2) {
        kotlin.jvm.internal.t.g(array, "array");
        this.e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(array, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    public synchronized long k() {
        return this.e.length();
    }
}
