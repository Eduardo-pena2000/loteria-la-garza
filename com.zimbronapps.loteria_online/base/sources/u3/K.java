package U3;

import M2.q;
import U3.K;
import java.util.concurrent.atomic.AtomicInteger;
import o3.O;
import o3.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements m {
    public final P2.z a;
    public final String c;
    public final int d;
    public String e;
    public O f;
    public int h;
    public int i;
    public long j;
    public M2.q k;
    public int l;
    public int m;
    public int g = 0;
    public long p = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public k(String str, int i, int i2) {
        this.a = new P2.z(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private boolean b(P2.z zVar, byte[] bArr, int i) {
        int min = Math.min(zVar.a(), i - this.h);
        zVar.l(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    public void c(P2.z zVar) {
        P2.a.h(this.f);
        while (zVar.a() > 0) {
            switch (this.g) {
                case 0:
                    if (!j(zVar)) {
                        break;
                    } else {
                        int i = this.m;
                        if (i != 3 && i != 4) {
                            if (i != 1) {
                                this.g = 2;
                                break;
                            } else {
                                this.g = 1;
                                break;
                            }
                        } else {
                            this.g = 4;
                            break;
                        }
                    }
                case 1:
                    if (!b(zVar, this.a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.a.T(0);
                        this.f.f(this.a, 18);
                        this.g = 6;
                        break;
                    }
                case 2:
                    if (!b(zVar, this.a.e(), 7)) {
                        break;
                    } else {
                        this.n = o3.o.j(this.a.e());
                        this.g = 3;
                        break;
                    }
                case 3:
                    if (!b(zVar, this.a.e(), this.n)) {
                        break;
                    } else {
                        h();
                        this.a.T(0);
                        this.f.f(this.a, this.n);
                        this.g = 6;
                        break;
                    }
                case 4:
                    if (!b(zVar, this.a.e(), 6)) {
                        break;
                    } else {
                        int l = o3.o.l(this.a.e());
                        this.o = l;
                        int i2 = this.h;
                        if (i2 > l) {
                            int i3 = i2 - l;
                            this.h = i2 - i3;
                            zVar.T(zVar.f() - i3);
                        }
                        this.g = 5;
                        break;
                    }
                case 5:
                    if (!b(zVar, this.a.e(), this.o)) {
                        break;
                    } else {
                        i();
                        this.a.T(0);
                        this.f.f(this.a, this.o);
                        this.g = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(zVar.a(), this.l - this.h);
                    this.f.f(zVar, min);
                    int i4 = this.h + min;
                    this.h = i4;
                    if (i4 == this.l) {
                        P2.a.f(this.p != -9223372036854775807L);
                        this.f.a(this.p, this.m == 4 ? 0 : 1, this.l, 0, null);
                        this.p += this.j;
                        this.g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = rVar.e(dVar.c(), 1);
    }

    public void f(long j, int i) {
        this.p = j;
    }

    public final void g() {
        byte[] e = this.a.e();
        if (this.k == null) {
            M2.q h = o3.o.h(e, this.e, this.c, this.d, null);
            this.k = h;
            this.f.b(h);
        }
        this.l = o3.o.b(e);
        this.j = w7.f.d(P2.K.W0(o3.o.g(e), this.k.C));
    }

    public final void h() {
        o.b i = o3.o.i(this.a.e());
        k(i);
        this.l = i.d;
        long j = i.e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.j = j;
    }

    public final void i() {
        o.b k = o3.o.k(this.a.e(), this.b);
        if (this.m == 3) {
            k(k);
        }
        this.l = k.d;
        long j = k.e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.j = j;
    }

    public final boolean j(P2.z zVar) {
        while (zVar.a() > 0) {
            int i = this.i << 8;
            this.i = i;
            int G = i | zVar.G();
            this.i = G;
            int c = o3.o.c(G);
            this.m = c;
            if (c != 0) {
                byte[] e = this.a.e();
                int i2 = this.i;
                e[0] = (byte) ((i2 >> 24) & 255);
                e[1] = (byte) ((i2 >> 16) & 255);
                e[2] = (byte) ((i2 >> 8) & 255);
                e[3] = (byte) (i2 & 255);
                this.h = 4;
                this.i = 0;
                return true;
            }
        }
        return false;
    }

    public final void k(o.b bVar) {
        int i;
        int i2 = bVar.b;
        if (i2 == -2147483647 || (i = bVar.c) == -1) {
            return;
        }
        M2.q qVar = this.k;
        if (qVar != null && i == qVar.B && i2 == qVar.C && P2.K.c(bVar.a, qVar.n)) {
            return;
        }
        M2.q qVar2 = this.k;
        M2.q K = (qVar2 == null ? new q.b() : qVar2.a()).a0(this.e).o0(bVar.a).N(bVar.c).p0(bVar.b).e0(this.c).m0(this.d).K();
        this.k = K;
        this.f.b(K);
    }

    public void e(boolean z) {
    }
}
