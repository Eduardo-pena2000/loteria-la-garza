package T2;

import M2.u;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements v0 {
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public long s;

    public static final class b {
        public float a = 0.97f;
        public float b = 1.03f;
        public long c = 1000;
        public float d = 1.0E-7f;
        public long e = P2.K.K0(20);
        public long f = P2.K.K0(500);
        public float g = 0.999f;

        public q a() {
            return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        public b b(float f) {
            P2.a.a(f >= 1.0f);
            this.b = f;
            return this;
        }

        public b c(float f) {
            P2.a.a(0.0f < f && f <= 1.0f);
            this.a = f;
            return this;
        }

        public b d(long j) {
            P2.a.a(j > 0);
            this.e = P2.K.K0(j);
            return this;
        }

        public b e(float f) {
            P2.a.a(f >= 0.0f && f < 1.0f);
            this.g = f;
            return this;
        }

        public b f(long j) {
            P2.a.a(j > 0);
            this.c = j;
            return this;
        }

        public b g(float f) {
            P2.a.a(f > 0.0f);
            this.d = f / 1000000.0f;
            return this;
        }

        public b h(long j) {
            P2.a.a(j >= 0);
            this.f = P2.K.K0(j);
            return this;
        }
    }

    public /* synthetic */ q(float f, float f2, long j, float f3, long j2, long j3, float f4, a aVar) {
        this(f, f2, j, f3, j2, j3, f4);
    }

    public static long h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    public void a(u.g gVar) {
        this.h = P2.K.K0(gVar.a);
        this.k = P2.K.K0(gVar.b);
        this.l = P2.K.K0(gVar.c);
        float f = gVar.d;
        if (f == -3.4028235E38f) {
            f = this.a;
        }
        this.o = f;
        float f2 = gVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.h = -9223372036854775807L;
        }
        g();
    }

    public float b(long j, long j2) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j, j2);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        f(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = P2.K.o((this.d * j3) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    public long c() {
        return this.m;
    }

    public void d() {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.m = j3;
        }
        this.q = -9223372036854775807L;
    }

    public void e(long j) {
        this.i = j;
        g();
    }

    public final void f(long j) {
        long j2 = this.r + (this.s * 3);
        if (this.m > j2) {
            float K0 = P2.K.K0(this.c);
            this.m = w7.h.c(new long[]{j2, this.j, this.m - (((long) ((this.p - 1.0f) * K0)) + ((long) ((this.n - 1.0f) * K0)))});
            return;
        }
        long q = P2.K.q(j - ((long) (Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j2);
        this.m = q;
        long j3 = this.l;
        if (j3 == -9223372036854775807L || q <= j3) {
            return;
        }
        this.m = j3;
    }

    public final void g() {
        long j;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            j = this.i;
            if (j == -9223372036854775807L) {
                long j3 = this.k;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.l;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    public final void i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == -9223372036854775807L) {
            this.r = j3;
            this.s = 0L;
        } else {
            long max = Math.max(j3, h(j4, j3, this.g));
            this.r = max;
            this.s = h(this.s, Math.abs(j3 - max), this.g);
        }
    }

    public q(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }
}
