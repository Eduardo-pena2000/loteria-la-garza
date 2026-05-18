package U3;

import M2.q;
import U3.K;
import o3.O;
import o3.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements m {
    public final P2.y a;
    public final P2.z b;
    public final String c;
    public final int d;
    public String e;
    public O f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public M2.q l;
    public int m;
    public long n;

    public f() {
        this(null, 0);
    }

    private boolean b(P2.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.h);
        zVar.l(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    private void g() {
        this.a.p(0);
        c.b d = o3.c.d(this.a);
        M2.q qVar = this.l;
        if (qVar == null || d.c != qVar.B || d.b != qVar.C || !"audio/ac4".equals(qVar.n)) {
            M2.q K = new q.b().a0(this.e).o0("audio/ac4").N(d.c).p0(d.b).e0(this.c).m0(this.d).K();
            this.l = K;
            this.f.b(K);
        }
        this.m = d.d;
        this.k = (d.e * 1000000) / this.l.C;
    }

    private boolean h(P2.z zVar) {
        int G;
        while (true) {
            if (zVar.a() <= 0) {
                return false;
            }
            if (this.i) {
                G = zVar.G();
                this.i = G == 172;
                if (G == 64 || G == 65) {
                    break;
                }
            } else {
                this.i = zVar.G() == 172;
            }
        }
        this.j = G == 65;
        return true;
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    public void c(P2.z zVar) {
        P2.a.h(this.f);
        while (zVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(zVar.a(), this.m - this.h);
                        this.f.f(zVar, min);
                        int i2 = this.h + min;
                        this.h = i2;
                        if (i2 == this.m) {
                            P2.a.f(this.n != -9223372036854775807L);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.k;
                            this.g = 0;
                        }
                    }
                } else if (b(zVar, this.b.e(), 16)) {
                    g();
                    this.b.T(0);
                    this.f.f(this.b, 16);
                    this.g = 2;
                }
            } else if (h(zVar)) {
                this.g = 1;
                this.b.e()[0] = -84;
                this.b.e()[1] = (byte) (this.j ? 65 : 64);
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
        this.n = j;
    }

    public f(String str, int i) {
        P2.y yVar = new P2.y(new byte[16]);
        this.a = yVar;
        this.b = new P2.z(yVar.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    public void e(boolean z) {
    }
}
