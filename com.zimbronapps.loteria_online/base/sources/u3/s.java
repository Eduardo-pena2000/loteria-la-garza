package U3;

import M2.q;
import U3.K;
import java.util.Collections;
import o3.O;
import o3.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements m {
    public final String a;
    public final int b;
    public final P2.z c;
    public final P2.y d;
    public O e;
    public String f;
    public M2.q g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public s(String str, int i) {
        this.a = str;
        this.b = i;
        P2.z zVar = new P2.z(1024);
        this.c = zVar;
        this.d = new P2.y(zVar.e());
        this.l = -9223372036854775807L;
    }

    public static long b(P2.y yVar) {
        return yVar.h((yVar.h(2) + 1) * 8);
    }

    public void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    public void c(P2.z zVar) {
        P2.a.h(this.e);
        while (zVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    int G = zVar.G();
                    if ((G & 224) == 224) {
                        this.k = G;
                        this.h = 2;
                    } else if (G != 86) {
                        this.h = 0;
                    }
                } else if (i == 2) {
                    int G2 = ((this.k & (-225)) << 8) | zVar.G();
                    this.j = G2;
                    if (G2 > this.c.e().length) {
                        m(this.j);
                    }
                    this.i = 0;
                    this.h = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(zVar.a(), this.j - this.i);
                    zVar.l(this.d.a, this.i, min);
                    int i2 = this.i + min;
                    this.i = i2;
                    if (i2 == this.j) {
                        this.d.p(0);
                        g(this.d);
                        this.h = 0;
                    }
                }
            } else if (zVar.G() == 86) {
                this.h = 1;
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.e = rVar.e(dVar.c(), 1);
        this.f = dVar.b();
    }

    public void f(long j, int i) {
        this.l = j;
    }

    public final void g(P2.y yVar) {
        if (!yVar.g()) {
            this.m = true;
            l(yVar);
        } else if (!this.m) {
            return;
        }
        if (this.n != 0) {
            throw M2.z.a(null, null);
        }
        if (this.o != 0) {
            throw M2.z.a(null, null);
        }
        k(yVar, j(yVar));
        if (this.q) {
            yVar.r((int) this.r);
        }
    }

    public final int h(P2.y yVar) {
        int b = yVar.b();
        a.b d = o3.a.d(yVar, true);
        this.v = d.c;
        this.s = d.a;
        this.u = d.b;
        return b - yVar.b();
    }

    public final void i(P2.y yVar) {
        int h = yVar.h(3);
        this.p = h;
        if (h == 0) {
            yVar.r(8);
            return;
        }
        if (h == 1) {
            yVar.r(9);
            return;
        }
        if (h == 3 || h == 4 || h == 5) {
            yVar.r(6);
        } else {
            if (h != 6 && h != 7) {
                throw new IllegalStateException();
            }
            yVar.r(1);
        }
    }

    public final int j(P2.y yVar) {
        int h;
        if (this.p != 0) {
            throw M2.z.a(null, null);
        }
        int i = 0;
        do {
            h = yVar.h(8);
            i += h;
        } while (h == 255);
        return i;
    }

    public final void k(P2.y yVar, int i) {
        int e = yVar.e();
        if ((e & 7) == 0) {
            this.c.T(e >> 3);
        } else {
            yVar.i(this.c.e(), 0, i * 8);
            this.c.T(0);
        }
        this.e.f(this.c, i);
        P2.a.f(this.l != -9223372036854775807L);
        this.e.a(this.l, 1, i, 0, null);
        this.l += this.t;
    }

    public final void l(P2.y yVar) {
        boolean g;
        int h = yVar.h(1);
        int h2 = h == 1 ? yVar.h(1) : 0;
        this.n = h2;
        if (h2 != 0) {
            throw M2.z.a(null, null);
        }
        if (h == 1) {
            b(yVar);
        }
        if (!yVar.g()) {
            throw M2.z.a(null, null);
        }
        this.o = yVar.h(6);
        int h3 = yVar.h(4);
        int h4 = yVar.h(3);
        if (h3 != 0 || h4 != 0) {
            throw M2.z.a(null, null);
        }
        if (h == 0) {
            int e = yVar.e();
            int h5 = h(yVar);
            yVar.p(e);
            byte[] bArr = new byte[(h5 + 7) / 8];
            yVar.i(bArr, 0, h5);
            M2.q K = new q.b().a0(this.f).o0("audio/mp4a-latm").O(this.v).N(this.u).p0(this.s).b0(Collections.singletonList(bArr)).e0(this.a).m0(this.b).K();
            if (!K.equals(this.g)) {
                this.g = K;
                this.t = 1024000000 / K.C;
                this.e.b(K);
            }
        } else {
            yVar.r(((int) b(yVar)) - h(yVar));
        }
        i(yVar);
        boolean g2 = yVar.g();
        this.q = g2;
        this.r = 0L;
        if (g2) {
            if (h == 1) {
                this.r = b(yVar);
            } else {
                do {
                    g = yVar.g();
                    this.r = (this.r << 8) + yVar.h(8);
                } while (g);
            }
        }
        if (yVar.g()) {
            yVar.r(8);
        }
    }

    public final void m(int i) {
        this.c.P(i);
        this.d.n(this.c.e());
    }

    public void e(boolean z) {
    }
}
