package V4;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends InputStream {
    public final InputStream a;
    public int b = 1073741824;

    public k(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int a(int i) {
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    public int available() {
        return this.b;
    }

    public void close() {
        this.a.close();
    }

    public int read() {
        return a(this.a.read());
    }

    public long skip(long j) {
        return this.a.skip(j);
    }

    public int read(byte[] bArr) {
        return a(this.a.read(bArr));
    }

    public int read(byte[] bArr, int i, int i2) {
        return a(this.a.read(bArr, i, i2));
    }
}
