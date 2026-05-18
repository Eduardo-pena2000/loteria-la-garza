package o3;

import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h implements J {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public h(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = d(j, j2, i);
        }
    }

    public static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long a(long j) {
        int i = this.c;
        long j2 = (((j * this.e) / 8000000) / i) * i;
        long j3 = this.d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - i);
        }
        return this.b + Math.max(j2, 0L);
    }

    public long b(long j) {
        return d(j, this.b, this.e);
    }

    public J.a f(long j) {
        if (this.d == -1 && !this.g) {
            return new J.a(new K(0L, this.b));
        }
        long a = a(j);
        long b = b(a);
        K k = new K(b, a);
        if (this.d != -1 && b < j) {
            int i = this.c;
            if (i + a < this.a) {
                long j2 = a + i;
                return new J.a(k, new K(b(j2), j2));
            }
        }
        return new J.a(k);
    }

    public boolean i() {
        return this.d != -1 || this.g;
    }

    public long l() {
        return this.f;
    }
}
