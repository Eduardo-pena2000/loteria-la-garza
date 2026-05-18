package H3;

import P2.K;
import P2.z;
import o3.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public final F.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;

    public i(F.a aVar, long j, long j2, long[] jArr, int i, int i2) {
        this.a = new F.a(aVar);
        this.b = j;
        this.c = j2;
        this.f = jArr;
        this.d = i;
        this.e = i2;
    }

    public static i b(F.a aVar, z zVar) {
        long[] jArr;
        int i;
        int i2;
        int p = zVar.p();
        int K = (p & 1) != 0 ? zVar.K() : -1;
        long I = (p & 2) != 0 ? zVar.I() : -1L;
        if ((p & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zVar.G();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((p & 8) != 0) {
            zVar.U(4);
        }
        if (zVar.a() >= 24) {
            zVar.U(21);
            int J = zVar.J();
            i2 = J & 4095;
            i = (16773120 & J) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new i(aVar, K, I, jArr, i, i2);
    }

    public long a() {
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return K.W0((j * r2.g) - 1, this.a.d);
    }
}
