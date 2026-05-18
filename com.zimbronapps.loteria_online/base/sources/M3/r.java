package m3;

import M2.N;
import m3.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public final a a;
    public final o b;
    public N g;
    public long i;
    public final o.a c = new o.a();
    public final P2.D d = new P2.D();
    public final P2.D e = new P2.D();
    public final P2.q f = new P2.q();
    public N h = N.e;
    public long j = -9223372036854775807L;

    public interface a {
        void a();

        void b(long j, long j2, long j3, boolean z);

        void c(N n);
    }

    public r(a aVar, o oVar) {
        this.a = aVar;
        this.b = oVar;
    }

    public static Object c(P2.D d) {
        P2.a.a(d.k() > 0);
        while (d.k() > 1) {
            d.h();
        }
        return P2.a.e(d.h());
    }

    public final void a() {
        P2.a.h(Long.valueOf(this.f.d()));
        this.a.a();
    }

    public void b() {
        this.f.a();
        this.j = -9223372036854775807L;
        if (this.e.k() > 0) {
            Long l = (Long) c(this.e);
            l.longValue();
            this.e.a(0L, l);
        }
        if (this.g != null) {
            this.d.c();
        } else if (this.d.k() > 0) {
            this.g = (N) c(this.d);
        }
    }

    public boolean d(long j) {
        long j2 = this.j;
        return j2 != -9223372036854775807L && j2 >= j;
    }

    public boolean e() {
        return this.b.d(true);
    }

    public final boolean f(long j) {
        Long l = (Long) this.e.i(j);
        if (l == null || l.longValue() == this.i) {
            return false;
        }
        this.i = l.longValue();
        return true;
    }

    public final boolean g(long j) {
        N n = (N) this.d.i(j);
        if (n == null || n.equals(N.e) || n.equals(this.h)) {
            return false;
        }
        this.h = n;
        return true;
    }

    public void h(long j, long j2) {
        while (!this.f.c()) {
            long b = this.f.b();
            if (f(b)) {
                this.b.j();
            }
            int c = this.b.c(b, j, j2, this.i, false, this.c);
            if (c == 0 || c == 1) {
                this.j = b;
                i(c == 0);
            } else if (c != 2 && c != 3 && c != 4) {
                if (c != 5) {
                    throw new IllegalStateException(String.valueOf(c));
                }
                return;
            } else {
                this.j = b;
                a();
            }
        }
    }

    public final void i(boolean z) {
        long longValue = ((Long) P2.a.h(Long.valueOf(this.f.d()))).longValue();
        if (g(longValue)) {
            this.a.c(this.h);
        }
        this.a.b(z ? -1L : this.c.g(), longValue, this.i, this.b.i());
    }

    public void j(float f) {
        P2.a.a(f > 0.0f);
        this.b.r(f);
    }
}
