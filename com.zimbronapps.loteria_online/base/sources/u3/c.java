package U3;

import M2.q;
import U3.K;
import o3.O;
import o3.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements m {
    public final P2.y a;
    public final P2.z b;
    public final String c;
    public final int d;
    public String e;
    public O f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public M2.q k;
    public int l;
    public long m;

    public c() {
        this(null, 0);
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    public final boolean b(P2.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.h);
        zVar.l(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    public void c(P2.z zVar) {
        P2.a.h(this.f);
        while (zVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(zVar.a(), this.l - this.h);
                        this.f.f(zVar, min);
                        int i2 = this.h + min;
                        this.h = i2;
                        if (i2 == this.l) {
                            P2.a.f(this.m != -9223372036854775807L);
                            this.f.a(this.m, 1, this.l, 0, null);
                            this.m += this.j;
                            this.g = 0;
                        }
                    }
                } else if (b(zVar, this.b.e(), 128)) {
                    g();
                    this.b.T(0);
                    this.f.f(this.b, 128);
                    this.g = 2;
                }
            } else if (h(zVar)) {
                this.g = 1;
                this.b.e()[0] = 11;
                this.b.e()[1] = 119;
                this.h = 2;
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = rVar.e(dVar.c(), 1);
    }

    public void f(long j, int i) {
        this.m = j;
    }

    public final void g() {
        this.a.p(0);
        b.b f = o3.b.f(this.a);
        M2.q qVar = this.k;
        if (qVar == null || f.d != qVar.B || f.c != qVar.C || !P2.K.c(f.a, qVar.n)) {
            q.b j0 = new q.b().a0(this.e).o0(f.a).N(f.d).p0(f.c).e0(this.c).m0(this.d).j0(f.g);
            if ("audio/ac3".equals(f.a)) {
                j0.M(f.g);
            }
            M2.q K = j0.K();
            this.k = K;
            this.f.b(K);
        }
        this.l = f.e;
        this.j = (f.f * 1000000) / this.k.C;
    }

    public final boolean h(P2.z zVar) {
        while (true) {
            if (zVar.a() <= 0) {
                return false;
            }
            if (this.i) {
                int G = zVar.G();
                if (G == 119) {
                    this.i = false;
                    return true;
                }
                this.i = G == 11;
            } else {
                this.i = zVar.G() == 11;
            }
        }
    }

    public c(String str, int i) {
        P2.y yVar = new P2.y(new byte[128]);
        this.a = yVar;
        this.b = new P2.z(yVar.a);
        this.g = 0;
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    public void e(boolean z) {
    }
}
