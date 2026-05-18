package o3;

import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public final a a;
    public final f b;
    public c c;
    public final int d;

    public static class a implements J {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        public static /* synthetic */ long a(a aVar) {
            return aVar.c;
        }

        public static /* synthetic */ long b(a aVar) {
            return aVar.d;
        }

        public static /* synthetic */ long d(a aVar) {
            return aVar.e;
        }

        public static /* synthetic */ long e(a aVar) {
            return aVar.f;
        }

        public static /* synthetic */ long g(a aVar) {
            return aVar.g;
        }

        public J.a f(long j) {
            return new J.a(new K(j, c.h(this.a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        public boolean i() {
            return true;
        }

        public long j(long j) {
            return this.a.a(j);
        }

        public long l() {
            return this.b;
        }
    }

    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        public static /* synthetic */ long a(c cVar) {
            return cVar.l();
        }

        public static /* synthetic */ long b(c cVar) {
            return cVar.j();
        }

        public static /* synthetic */ long c(c cVar) {
            return cVar.i();
        }

        public static /* synthetic */ long d(c cVar) {
            return cVar.k();
        }

        public static /* synthetic */ long e(c cVar) {
            return cVar.m();
        }

        public static /* synthetic */ void f(c cVar, long j, long j2) {
            cVar.o(j, j2);
        }

        public static /* synthetic */ void g(c cVar, long j, long j2) {
            cVar.p(j, j2);
        }

        public static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return P2.K.q(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        public final long i() {
            return this.g;
        }

        public final long j() {
            return this.f;
        }

        public final long k() {
            return this.h;
        }

        public final long l() {
            return this.a;
        }

        public final long m() {
            return this.b;
        }

        public final void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        public final void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        public final void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    public interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static /* synthetic */ int a(e eVar) {
            return eVar.a;
        }

        public static /* synthetic */ long b(e eVar) {
            return eVar.b;
        }

        public static /* synthetic */ long c(e eVar) {
            return eVar.c;
        }

        public static e d(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e e(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        public static e f(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    public e(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    public c a(long j) {
        return new c(j, this.a.j(j), a.a(this.a), a.b(this.a), a.d(this.a), a.e(this.a), a.g(this.a));
    }

    public final J b() {
        return this.a;
    }

    public int c(q qVar, I i) {
        while (true) {
            c cVar = (c) P2.a.h(this.c);
            long b2 = c.b(cVar);
            long c2 = c.c(cVar);
            long d2 = c.d(cVar);
            if (c2 - b2 <= this.d) {
                e(false, b2);
                return g(qVar, b2, i);
            }
            if (!i(qVar, d2)) {
                return g(qVar, d2, i);
            }
            qVar.f();
            e a2 = this.b.a(qVar, c.e(cVar));
            int a3 = e.a(a2);
            if (a3 == -3) {
                e(false, d2);
                return g(qVar, d2, i);
            }
            if (a3 == -2) {
                c.g(cVar, e.b(a2), e.c(a2));
            } else {
                if (a3 != -1) {
                    if (a3 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(qVar, e.c(a2));
                    e(true, e.c(a2));
                    return g(qVar, e.c(a2), i);
                }
                c.f(cVar, e.b(a2), e.c(a2));
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e(boolean z, long j) {
        this.c = null;
        this.b.b();
        f(z, j);
    }

    public final int g(q qVar, long j, I i) {
        if (j == qVar.b()) {
            return 0;
        }
        i.a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar == null || c.a(cVar) != j) {
            this.c = a(j);
        }
    }

    public final boolean i(q qVar, long j) {
        long b2 = j - qVar.b();
        if (b2 < 0 || b2 > 262144) {
            return false;
        }
        qVar.m((int) b2);
        return true;
    }

    public interface f {
        e a(q qVar, long j);

        default void b() {
        }
    }

    public static final class b implements d {
        public long a(long j) {
            return j;
        }
    }

    public void f(boolean z, long j) {
    }
}
