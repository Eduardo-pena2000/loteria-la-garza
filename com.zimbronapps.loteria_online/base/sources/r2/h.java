package R2;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends InputStream {
    public final f a;
    public final j b;
    public long f;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public h(f fVar, j jVar) {
        this.a = fVar;
        this.b = jVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.g(this.b);
        this.d = true;
    }

    public void b() {
        a();
    }

    public void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    public int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        P2.a.f(!this.e);
        a();
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f += read;
        return read;
    }
}
