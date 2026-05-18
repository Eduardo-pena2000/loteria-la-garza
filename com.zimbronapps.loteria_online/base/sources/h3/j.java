package H3;

import P2.K;
import o3.F;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements g {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public j(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    public static j a(i iVar, long j) {
        long[] jArr;
        long a = iVar.a();
        if (a == -9223372036854775807L) {
            return null;
        }
        long j2 = iVar.c;
        if (j2 == -1 || (jArr = iVar.f) == null) {
            F.a aVar = iVar.a;
            return new j(j, aVar.c, a, aVar.f);
        }
        F.a aVar2 = iVar.a;
        return new j(j, aVar2.c, a, aVar2.f, j2, jArr);
    }

    public final long b(int i) {
        return (this.c * i) / 100;
    }

    public long c(long j) {
        long j2 = j - this.a;
        if (!i() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) P2.a.h(this.g);
        double d = (j2 * 256.0d) / this.e;
        int h = K.h(jArr, (long) d, true, true);
        long b = b(h);
        long j3 = jArr[h];
        int i = h + 1;
        long b2 = b(i);
        return b + Math.round((j3 == (h == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (b2 - b));
    }

    public J.a f(long j) {
        if (!i()) {
            return new J.a(new o3.K(0L, this.a + this.b));
        }
        long q = K.q(j, 0L, this.c);
        double d = (q * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) P2.a.h(this.g))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new J.a(new o3.K(q, this.a + K.q(Math.round((d2 / 256.0d) * this.e), this.b, this.e - 1)));
    }

    public long h() {
        return this.f;
    }

    public boolean i() {
        return this.g != null;
    }

    public int k() {
        return this.d;
    }

    public long l() {
        return this.c;
    }

    public j(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }
}
