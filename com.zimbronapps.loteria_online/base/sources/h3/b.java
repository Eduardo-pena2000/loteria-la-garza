package H3;

import P2.K;
import P2.p;
import java.math.RoundingMode;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements g {
    public final long a;
    public final p b;
    public final p c;
    public final int d;
    public long e;

    public b(long j, long j2, long j3) {
        this.e = j;
        this.a = j3;
        p pVar = new p();
        this.b = pVar;
        p pVar2 = new p();
        this.c = pVar2;
        pVar.a(0L);
        pVar2.a(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.d = -2147483647;
            return;
        }
        long Z0 = K.Z0(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (Z0 > 0 && Z0 <= 2147483647L) {
            i = (int) Z0;
        }
        this.d = i;
    }

    public boolean a(long j) {
        p pVar = this.b;
        return j - pVar.b(pVar.c() - 1) < 100000;
    }

    public void b(long j, long j2) {
        if (a(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }

    public long c(long j) {
        return this.b.b(K.e(this.c, j, true, true));
    }

    public void d(long j) {
        this.e = j;
    }

    public J.a f(long j) {
        int e = K.e(this.b, j, true, true);
        o3.K k = new o3.K(this.b.b(e), this.c.b(e));
        if (k.a == j || e == this.b.c() - 1) {
            return new J.a(k);
        }
        int i = e + 1;
        return new J.a(k, new o3.K(this.b.b(i), this.c.b(i)));
    }

    public long h() {
        return this.a;
    }

    public boolean i() {
        return true;
    }

    public int k() {
        return this.d;
    }

    public long l() {
        return this.e;
    }
}
