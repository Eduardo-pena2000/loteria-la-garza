package J3;

import M2.q;
import P2.K;
import P2.z;
import o3.I;
import o3.J;
import o3.O;
import o3.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public O b;
    public r c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final e a = new e();
    public b j = new b();

    public static class b {
        public q a;
        public g b;
    }

    public static final class c implements g {
        public c() {
        }

        public long a(o3.q qVar) {
            return -1L;
        }

        public J b() {
            return new J.b(-9223372036854775807L);
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public void c(long j) {
        }
    }

    public final void a() {
        P2.a.h(this.b);
        K.i(this.c);
    }

    public long b(long j) {
        return (j * 1000000) / this.i;
    }

    public long c(long j) {
        return (this.i * j) / 1000000;
    }

    public void d(r rVar, O o) {
        this.c = rVar;
        this.b = o;
        l(true);
    }

    public void e(long j) {
        this.g = j;
    }

    public abstract long f(z zVar);

    public final int g(o3.q qVar, I i) {
        a();
        int i2 = this.h;
        if (i2 == 0) {
            return j(qVar);
        }
        if (i2 == 1) {
            qVar.m((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i2 == 2) {
            K.i(this.d);
            return k(qVar, i);
        }
        if (i2 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public abstract boolean h(z zVar, long j, b bVar);

    public final boolean i(o3.q qVar) {
        while (this.a.d(qVar)) {
            this.k = qVar.b() - this.f;
            if (!h(this.a.c(), this.f, this.j)) {
                return true;
            }
            this.f = qVar.b();
        }
        this.h = 3;
        return false;
    }

    public final int j(o3.q qVar) {
        if (!i(qVar)) {
            return -1;
        }
        q qVar2 = this.j.a;
        this.i = qVar2.C;
        if (!this.m) {
            this.b.b(qVar2);
            this.m = true;
        }
        g gVar = this.j.b;
        if (gVar != null) {
            this.d = gVar;
        } else if (qVar.a() == -1) {
            this.d = new c(null);
        } else {
            f b2 = this.a.b();
            this.d = new J3.a(this, this.f, qVar.a(), b2.h + b2.i, b2.c, (b2.b & 4) != 0);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    public final int k(o3.q qVar, I i) {
        long a2 = this.d.a(qVar);
        if (a2 >= 0) {
            i.a = a2;
            return 1;
        }
        if (a2 < -1) {
            e(-(a2 + 2));
        }
        if (!this.l) {
            this.c.n((J) P2.a.h(this.d.b()));
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(qVar)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        z c2 = this.a.c();
        long f = f(c2);
        if (f >= 0) {
            long j = this.g;
            if (j + f >= this.e) {
                long b2 = b(j);
                this.b.f(c2, c2.g());
                this.b.a(b2, 1, c2.g(), 0, null);
                this.e = -1L;
            }
        }
        this.g += f;
        return 0;
    }

    public void l(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public final void m(long j, long j2) {
        this.a.e();
        if (j == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(j2);
            ((g) K.i(this.d)).c(this.e);
            this.h = 2;
        }
    }
}
