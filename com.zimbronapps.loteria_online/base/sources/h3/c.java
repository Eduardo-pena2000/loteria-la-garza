package H3;

import C3.l;
import P2.K;
import android.util.Pair;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements g {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? K.K0(jArr2[jArr2.length - 1]) : j;
    }

    public static c a(long j, l lVar, long j2) {
        int length = lVar.e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += lVar.c + lVar.e[i3];
            j3 += lVar.d + lVar.f[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new c(jArr, jArr2, j2);
    }

    public static Pair b(long j, long[] jArr, long[] jArr2) {
        int h = K.h(jArr, j, true, true);
        long j2 = jArr[h];
        long j3 = jArr2[h];
        int i = h + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    public long c(long j) {
        return K.K0(((Long) b(j, this.a, this.b).second).longValue());
    }

    public J.a f(long j) {
        Pair b = b(K.j1(K.q(j, 0L, this.c)), this.b, this.a);
        return new J.a(new o3.K(K.K0(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    public long h() {
        return -1L;
    }

    public boolean i() {
        return true;
    }

    public int k() {
        return -2147483647;
    }

    public long l() {
        return this.c;
    }
}
