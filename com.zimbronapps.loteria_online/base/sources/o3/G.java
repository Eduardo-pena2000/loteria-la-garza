package o3;

import java.util.Arrays;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements J {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return P2.K.h(this.e, j, true, true);
    }

    public J.a f(long j) {
        int a = a(j);
        K k = new K(this.e[a], this.c[a]);
        if (k.a >= j || a == this.a - 1) {
            return new J.a(k);
        }
        int i = a + 1;
        return new J.a(k, new K(this.e[i], this.c[i]));
    }

    public boolean i() {
        return true;
    }

    public long l() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
