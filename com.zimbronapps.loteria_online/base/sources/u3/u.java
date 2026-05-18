package U3;

import M2.q;
import U3.K;
import U3.v;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements m {
    public String e;
    public O f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final P2.z a = new P2.z(new byte[15], 2);
    public final P2.y b = new P2.y();
    public final P2.z c = new P2.z();
    public v.b p = new v.b();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    private boolean k(P2.z zVar) {
        int i = this.k;
        if ((i & 2) == 0) {
            zVar.T(zVar.g());
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        while (zVar.a() > 0) {
            int i2 = this.l << 8;
            this.l = i2;
            int G = i2 | zVar.G();
            this.l = G;
            if (v.e(G)) {
                zVar.T(zVar.f() - 3);
                this.l = 0;
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.d = 0;
        this.l = 0;
        this.a.P(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    public final void b(P2.z zVar, P2.z zVar2, boolean z) {
        int f = zVar.f();
        int min = Math.min(zVar.a(), zVar2.a());
        zVar.l(zVar2.e(), zVar2.f(), min);
        zVar2.U(min);
        if (z) {
            zVar.T(f);
        }
    }

    public void c(P2.z zVar) {
        P2.a.h(this.f);
        while (zVar.a() > 0) {
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    b(zVar, this.a, false);
                    if (this.a.a() != 0) {
                        this.m = false;
                    } else if (i()) {
                        this.a.T(0);
                        O o = this.f;
                        P2.z zVar2 = this.a;
                        o.f(zVar2, zVar2.g());
                        this.a.P(2);
                        this.c.P(this.p.c);
                        this.m = true;
                        this.d = 2;
                    } else if (this.a.g() < 15) {
                        P2.z zVar3 = this.a;
                        zVar3.S(zVar3.g() + 1);
                        this.m = false;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.p.a)) {
                        b(zVar, this.c, true);
                    }
                    l(zVar);
                    int i2 = this.n;
                    v.b bVar = this.p;
                    if (i2 == bVar.c) {
                        int i3 = bVar.a;
                        if (i3 == 1) {
                            h(new P2.y(this.c.e()));
                        } else if (i3 == 17) {
                            this.s = v.f(new P2.y(this.c.e()));
                        } else if (i3 == 2) {
                            g();
                        }
                        this.d = 1;
                    }
                }
            } else if (k(zVar)) {
                this.d = 1;
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = rVar.e(dVar.c(), 1);
    }

    public void f(long j, int i) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    public final void g() {
        int i;
        if (this.u) {
            this.j = false;
            i = 1;
        } else {
            i = 0;
        }
        double d = ((this.r - this.s) * 1000000.0d) / this.q;
        long round = Math.round(this.g);
        if (this.i) {
            this.i = false;
            this.g = this.h;
        } else {
            this.g += d;
        }
        this.f.a(round, i, this.o, 0, null);
        this.u = false;
        this.s = 0;
        this.o = 0;
    }

    public final void h(P2.y yVar) {
        v.c h = v.h(yVar);
        this.q = h.b;
        this.r = h.c;
        long j = this.t;
        long j2 = this.p.b;
        if (j != j2) {
            this.t = j2;
            String str = "mhm1";
            if (h.a != -1) {
                str = "mhm1" + String.format(".%02X", new Object[]{Integer.valueOf(h.a)});
            }
            byte[] bArr = h.d;
            this.f.b(new q.b().a0(this.e).o0("audio/mhm1").p0(this.q).O(str).b0((bArr == null || bArr.length <= 0) ? null : t7.r.u(P2.K.f, bArr)).K());
        }
        this.u = true;
    }

    public final boolean i() {
        int g = this.a.g();
        this.b.o(this.a.e(), g);
        boolean g2 = v.g(this.b, this.p);
        if (g2) {
            this.n = 0;
            this.o += this.p.c + g;
        }
        return g2;
    }

    public final boolean j(int i) {
        return i == 1 || i == 17;
    }

    public final void l(P2.z zVar) {
        int min = Math.min(zVar.a(), this.p.c - this.n);
        this.f.f(zVar, min);
        this.n += min;
    }

    public void e(boolean z) {
    }
}
