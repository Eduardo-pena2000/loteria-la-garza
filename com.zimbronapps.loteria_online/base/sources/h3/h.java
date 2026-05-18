package H3;

import P2.K;
import P2.o;
import P2.z;
import o3.F;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements g {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public h(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public static h a(long j, long j2, F.a aVar, z zVar) {
        int G;
        zVar.U(10);
        int p = zVar.p();
        if (p <= 0) {
            return null;
        }
        int i = aVar.d;
        long X0 = K.X0(p, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int M = zVar.M();
        int M2 = zVar.M();
        int M3 = zVar.M();
        zVar.U(2);
        long j3 = j2 + aVar.c;
        long[] jArr = new long[M];
        long[] jArr2 = new long[M];
        int i2 = 0;
        long j4 = j2;
        while (i2 < M) {
            int i3 = M2;
            long j5 = j3;
            jArr[i2] = (i2 * X0) / M;
            jArr2[i2] = Math.max(j4, j5);
            if (M3 == 1) {
                G = zVar.G();
            } else if (M3 == 2) {
                G = zVar.M();
            } else if (M3 == 3) {
                G = zVar.J();
            } else {
                if (M3 != 4) {
                    return null;
                }
                G = zVar.K();
            }
            j4 += G * i3;
            i2++;
            M = M;
            M2 = i3;
            j3 = j5;
        }
        if (j != -1 && j != j4) {
            o.h("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new h(jArr, jArr2, X0, j4, aVar.f);
    }

    public long c(long j) {
        return this.a[K.h(this.b, j, true, true)];
    }

    public J.a f(long j) {
        int h = K.h(this.a, j, true, true);
        o3.K k = new o3.K(this.a[h], this.b[h]);
        if (k.a >= j || h == this.a.length - 1) {
            return new J.a(k);
        }
        int i = h + 1;
        return new J.a(k, new o3.K(this.a[i], this.b[i]));
    }

    public long h() {
        return this.d;
    }

    public boolean i() {
        return true;
    }

    public int k() {
        return this.e;
    }

    public long l() {
        return this.c;
    }
}
