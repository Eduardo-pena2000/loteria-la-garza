package U3;

import M2.h;
import M2.q;
import Q2.d;
import U3.K;
import java.util.Collections;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements m {
    public final F a;
    public String b;
    public O c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final w g = new w(32, 128);
    public final w h = new w(33, 128);
    public final w i = new w(34, 128);
    public final w j = new w(39, 128);
    public final w k = new w(40, 128);
    public long m = -9223372036854775807L;
    public final P2.z n = new P2.z();

    public static final class a {
        public final O a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(O o) {
            this.a = o;
        }

        public static boolean c(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public static boolean d(int i) {
            return i < 32 || i == 40;
        }

        public void a(long j) {
            this.m = this.c;
            e((int) (j - this.b));
            this.k = this.b;
            this.b = j;
            e(0);
            this.i = false;
        }

        public void b(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    e(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public final void e(int i) {
            long j = this.l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.m;
            this.a.a(j, z ? 1 : 0, (int) (this.b - this.k), i, null);
        }

        public void f(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                } else {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void g() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void h(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!d(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        e(i);
                    }
                    this.i = false;
                }
                if (c(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }
    }

    public q(F f) {
        this.a = f;
    }

    private void b() {
        P2.a.h(this.c);
        P2.K.i(this.d);
    }

    private void g(long j, int i, int i2, long j2) {
        this.d.b(j, i, this.e);
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.b(i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i2)) {
            w wVar = this.j;
            this.n.R(this.j.d, Q2.d.r(wVar.d, wVar.e));
            this.n.U(5);
            this.a.a(j2, this.n);
        }
        if (this.k.b(i2)) {
            w wVar2 = this.k;
            this.n.R(this.k.d, Q2.d.r(wVar2.d, wVar2.e));
            this.n.U(5);
            this.a.a(j2, this.n);
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        this.d.f(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public static M2.q i(String str, w wVar, w wVar2, w wVar3) {
        int i = wVar.e;
        byte[] bArr = new byte[wVar2.e + i + wVar3.e];
        System.arraycopy(wVar.d, 0, bArr, 0, i);
        System.arraycopy(wVar2.d, 0, bArr, wVar.e, wVar2.e);
        System.arraycopy(wVar3.d, 0, bArr, wVar.e + wVar2.e, wVar3.e);
        d.a h = Q2.d.h(wVar2.d, 3, wVar2.e);
        return new q.b().a0(str).o0("video/hevc").O(P2.d.c(h.a, h.b, h.c, h.d, h.h, h.i)).v0(h.k).Y(h.l).P(new h.b().d(h.o).c(h.p).e(h.q).g(h.f + 8).b(h.g + 8).a()).k0(h.m).g0(h.n).b0(Collections.singletonList(bArr)).K();
    }

    public void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        Q2.d.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        a aVar = this.d;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void c(P2.z zVar) {
        b();
        while (zVar.a() > 0) {
            int f = zVar.f();
            int g = zVar.g();
            byte[] e = zVar.e();
            this.l += zVar.a();
            this.c.f(zVar, zVar.a());
            while (f < g) {
                int c = Q2.d.c(e, f, g, this.f);
                if (c == g) {
                    h(e, f, g);
                    return;
                }
                int e2 = Q2.d.e(e, c);
                int i = c - f;
                if (i > 0) {
                    h(e, f, c);
                }
                int i2 = g - c;
                long j = this.l - i2;
                g(j, i2, i < 0 ? -i : 0, this.m);
                j(j, i2, e2, this.m);
                f = c + 3;
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.b = dVar.b();
        O e = rVar.e(dVar.c(), 2);
        this.c = e;
        this.d = new a(e);
        this.a.b(rVar, dVar);
    }

    public void e(boolean z) {
        b();
        if (z) {
            this.d.a(this.l);
        }
    }

    public void f(long j, int i) {
        this.m = j;
    }

    public final void j(long j, int i, int i2, long j2) {
        this.d.h(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.e(i2);
            this.h.e(i2);
            this.i.e(i2);
        }
        this.j.e(i2);
        this.k.e(i2);
    }
}
