package U3;

import M2.q;
import U3.K;
import java.util.Arrays;
import java.util.Collections;
import o3.O;
import o3.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements m {
    public static final byte[] w = {73, 68, 51};
    public final boolean a;
    public final P2.y b;
    public final P2.z c;
    public final String d;
    public final int e;
    public String f;
    public O g;
    public O h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public O u;
    public long v;

    public i(boolean z) {
        this(z, null, 0);
    }

    private boolean i(P2.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.j);
        zVar.l(bArr, this.j, min);
        int i2 = this.j + min;
        this.j = i2;
        return i2 == i;
    }

    public static boolean m(int i) {
        return (i & 65526) == 65520;
    }

    public void a() {
        this.t = -9223372036854775807L;
        q();
    }

    public final void b() {
        P2.a.e(this.g);
        P2.K.i(this.u);
        P2.K.i(this.h);
    }

    public void c(P2.z zVar) {
        b();
        while (zVar.a() > 0) {
            int i = this.i;
            if (i == 0) {
                j(zVar);
            } else if (i == 1) {
                g(zVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (i(zVar, this.b.a, this.l ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    p(zVar);
                }
            } else if (i(zVar, this.c.e(), 10)) {
                o();
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.f = dVar.b();
        O e = rVar.e(dVar.c(), 1);
        this.g = e;
        this.u = e;
        if (!this.a) {
            this.h = new o3.m();
            return;
        }
        dVar.a();
        O e2 = rVar.e(dVar.c(), 5);
        this.h = e2;
        e2.b(new q.b().a0(dVar.b()).o0("application/id3").K());
    }

    public void f(long j, int i) {
        this.t = j;
    }

    public final void g(P2.z zVar) {
        if (zVar.a() == 0) {
            return;
        }
        this.b.a[0] = zVar.e()[zVar.f()];
        this.b.p(2);
        int h = this.b.h(4);
        int i = this.o;
        if (i != -1 && h != i) {
            q();
            return;
        }
        if (!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = h;
        }
        t();
    }

    public final boolean h(P2.z zVar, int i) {
        zVar.T(i + 1);
        if (!w(zVar, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        int h = this.b.h(1);
        int i2 = this.n;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.o != -1) {
            if (!w(zVar, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.o) {
                return false;
            }
            zVar.T(i + 2);
        }
        if (!w(zVar, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        int h2 = this.b.h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] e = zVar.e();
        int g = zVar.g();
        int i3 = i + h2;
        if (i3 >= g) {
            return true;
        }
        byte b = e[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == g) {
                return true;
            }
            return l((byte) -1, e[i4]) && ((e[i4] & 8) >> 3) == h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == g) {
            return true;
        }
        if (e[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == g || e[i6] == 51;
    }

    public final void j(P2.z zVar) {
        byte[] e = zVar.e();
        int f = zVar.f();
        int g = zVar.g();
        while (f < g) {
            int i = f + 1;
            byte b = e[f];
            int i2 = b & 255;
            if (this.k == 512 && l((byte) -1, (byte) i2) && (this.m || h(zVar, f - 1))) {
                this.p = (b & 8) >> 3;
                this.l = (b & 1) == 0;
                if (this.m) {
                    t();
                } else {
                    r();
                }
                zVar.T(i);
                return;
            }
            int i3 = this.k;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.k = 768;
            } else if (i4 == 511) {
                this.k = 512;
            } else if (i4 == 836) {
                this.k = 1024;
            } else if (i4 == 1075) {
                u();
                zVar.T(i);
                return;
            } else if (i3 != 256) {
                this.k = 256;
            }
            f = i;
        }
        zVar.T(f);
    }

    public long k() {
        return this.r;
    }

    public final boolean l(byte b, byte b2) {
        return m(((b & 255) << 8) | (b2 & 255));
    }

    public final void n() {
        this.b.p(0);
        if (this.q) {
            this.b.r(10);
        } else {
            int i = 2;
            int h = this.b.h(2) + 1;
            if (h != 2) {
                P2.o.h("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
            } else {
                i = h;
            }
            this.b.r(5);
            byte[] a = o3.a.a(i, this.o, this.b.h(3));
            a.b e = o3.a.e(a);
            M2.q K = new q.b().a0(this.f).o0("audio/mp4a-latm").O(e.c).N(e.b).p0(e.a).b0(Collections.singletonList(a)).e0(this.d).m0(this.e).K();
            this.r = 1024000000 / K.C;
            this.g.b(K);
            this.q = true;
        }
        this.b.r(4);
        int h2 = this.b.h(13);
        int i2 = h2 - 7;
        if (this.l) {
            i2 = h2 - 9;
        }
        v(this.g, this.r, 0, i2);
    }

    public final void o() {
        this.h.f(this.c, 10);
        this.c.T(6);
        v(this.h, 0L, 10, this.c.F() + 10);
    }

    public final void p(P2.z zVar) {
        int min = Math.min(zVar.a(), this.s - this.j);
        this.u.f(zVar, min);
        int i = this.j + min;
        this.j = i;
        if (i == this.s) {
            P2.a.f(this.t != -9223372036854775807L);
            this.u.a(this.t, 1, this.s, 0, null);
            this.t += this.v;
            s();
        }
    }

    public final void q() {
        this.m = false;
        s();
    }

    public final void r() {
        this.i = 1;
        this.j = 0;
    }

    public final void s() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    public final void t() {
        this.i = 3;
        this.j = 0;
    }

    public final void u() {
        this.i = 2;
        this.j = w.length;
        this.s = 0;
        this.c.T(0);
    }

    public final void v(O o, long j, int i, int i2) {
        this.i = 4;
        this.j = i;
        this.u = o;
        this.v = j;
        this.s = i2;
    }

    public final boolean w(P2.z zVar, byte[] bArr, int i) {
        if (zVar.a() < i) {
            return false;
        }
        zVar.l(bArr, 0, i);
        return true;
    }

    public i(boolean z, String str, int i) {
        this.b = new P2.y(new byte[7]);
        this.c = new P2.z(Arrays.copyOf(w, 10));
        s();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.a = z;
        this.d = str;
        this.e = i;
    }

    public void e(boolean z) {
    }
}
