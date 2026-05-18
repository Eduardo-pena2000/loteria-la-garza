package V3;

import P2.K;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements J {
    public final c a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e(c cVar, int i, long j, long j2) {
        this.a = cVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / cVar.e;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        return K.X0(j * this.b, 1000000L, this.a.c);
    }

    public J.a f(long j) {
        long q = K.q((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c + (this.a.e * q);
        long a = a(q);
        o3.K k = new o3.K(a, j2);
        if (a >= j || q == this.d - 1) {
            return new J.a(k);
        }
        long j3 = q + 1;
        return new J.a(k, new o3.K(a(j3), this.c + (this.a.e * j3)));
    }

    public boolean i() {
        return true;
    }

    public long l() {
        return this.e;
    }
}
