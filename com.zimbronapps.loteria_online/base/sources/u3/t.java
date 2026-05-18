package U3;

import M2.q;
import U3.K;
import o3.F;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements m {
    public final P2.z a;
    public final F.a b;
    public final String c;
    public final int d;
    public O e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public t() {
        this(null, 0);
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public final void b(P2.z zVar) {
        byte[] e = zVar.e();
        int g = zVar.g();
        for (int f = zVar.f(); f < g; f++) {
            byte b = e[f];
            boolean z = (b & 255) == 255;
            boolean z2 = this.j && (b & 224) == 224;
            this.j = z;
            if (z2) {
                zVar.T(f + 1);
                this.j = false;
                this.a.e()[1] = e[f];
                this.h = 2;
                this.g = 1;
                return;
            }
        }
        zVar.T(g);
    }

    public void c(P2.z zVar) {
        P2.a.h(this.e);
        while (zVar.a() > 0) {
            int i = this.g;
            if (i == 0) {
                b(zVar);
            } else if (i == 1) {
                h(zVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                g(zVar);
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.f = dVar.b();
        this.e = rVar.e(dVar.c(), 1);
    }

    public void f(long j, int i) {
        this.m = j;
    }

    public final void g(P2.z zVar) {
        int min = Math.min(zVar.a(), this.l - this.h);
        this.e.f(zVar, min);
        int i = this.h + min;
        this.h = i;
        if (i < this.l) {
            return;
        }
        P2.a.f(this.m != -9223372036854775807L);
        this.e.a(this.m, 1, this.l, 0, null);
        this.m += this.k;
        this.h = 0;
        this.g = 0;
    }

    public final void h(P2.z zVar) {
        int min = Math.min(zVar.a(), 4 - this.h);
        zVar.l(this.a.e(), this.h, min);
        int i = this.h + min;
        this.h = i;
        if (i < 4) {
            return;
        }
        this.a.T(0);
        if (!this.b.a(this.a.p())) {
            this.h = 0;
            this.g = 1;
            return;
        }
        this.l = this.b.c;
        if (!this.i) {
            this.k = (r8.g * 1000000) / r8.d;
            this.e.b(new q.b().a0(this.f).o0(this.b.b).f0(4096).N(this.b.e).p0(this.b.d).e0(this.c).m0(this.d).K());
            this.i = true;
        }
        this.a.T(0);
        this.e.f(this.a, 4);
        this.g = 2;
    }

    public t(String str, int i) {
        this.g = 0;
        P2.z zVar = new P2.z(4);
        this.a = zVar;
        zVar.e()[0] = -1;
        this.b = new F.a();
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    public void e(boolean z) {
    }
}
