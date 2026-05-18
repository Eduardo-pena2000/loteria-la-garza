package g3;

import android.net.Uri;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements R2.f {
    public final R2.f a;
    public final int b;
    public final a c;
    public final byte[] d;
    public int e;

    public interface a {
        void a(P2.z zVar);
    }

    public q(R2.f fVar, int i, a aVar) {
        P2.a.a(i > 0);
        this.a = fVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map e() {
        return this.a.e();
    }

    public long g(R2.j jVar) {
        throw new UnsupportedOperationException();
    }

    public void l(R2.x xVar) {
        P2.a.e(xVar);
        this.a.l(xVar);
    }

    public Uri o() {
        return this.a.o();
    }

    public final boolean q() {
        if (this.a.read(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new P2.z(bArr, i));
        }
        return true;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!q()) {
                return -1;
            }
            this.e = this.b;
        }
        int read = this.a.read(bArr, i, Math.min(this.e, i2));
        if (read != -1) {
            this.e -= read;
        }
        return read;
    }
}
