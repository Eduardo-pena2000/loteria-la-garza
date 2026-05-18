package U3;

import U3.K;
import java.io.EOFException;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements o3.p {
    public static final o3.u m = new g();
    public final int a;
    public final i b;
    public final P2.z c;
    public final P2.z d;
    public final P2.y e;
    public o3.r f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public h() {
        this(0);
    }

    public static /* synthetic */ o3.p[] c() {
        return k();
    }

    private static int h(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private o3.J i(long j, boolean z) {
        return new o3.h(j, this.h, h(this.i, this.b.k()), this.i, z);
    }

    private static /* synthetic */ o3.p[] k() {
        return new o3.p[]{new h()};
    }

    public void a(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    public void b(o3.r rVar) {
        this.f = rVar;
        this.b.d(rVar, new K.d(0, 1));
        rVar.s();
    }

    public boolean d(o3.q qVar) {
        int m2 = m(qVar);
        int i = m2;
        int i2 = 0;
        int i3 = 0;
        do {
            qVar.p(this.d.e(), 0, 2);
            this.d.T(0);
            if (i.m(this.d.M())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                qVar.p(this.d.e(), 0, 4);
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    i++;
                    qVar.f();
                    qVar.j(i);
                } else {
                    qVar.j(h - 6);
                    i3 += h;
                }
            } else {
                i++;
                qVar.f();
                qVar.j(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - m2 < 8192);
        return false;
    }

    public int e(o3.q qVar, o3.I i) {
        P2.a.h(this.f);
        long a = qVar.a();
        int i2 = this.a;
        if ((i2 & 2) != 0 || ((i2 & 1) != 0 && a != -1)) {
            f(qVar);
        }
        int read = qVar.read(this.c.e(), 0, 2048);
        boolean z = read == -1;
        l(a, z);
        if (z) {
            return -1;
        }
        this.c.T(0);
        this.c.S(read);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.c(this.c);
        return 0;
    }

    public final void f(o3.q qVar) {
        if (this.j) {
            return;
        }
        this.i = -1;
        qVar.f();
        long j = 0;
        if (qVar.b() == 0) {
            m(qVar);
        }
        int i = 0;
        int i2 = 0;
        while (qVar.d(this.d.e(), 0, 2, true)) {
            try {
                this.d.T(0);
                if (!i.m(this.d.M())) {
                    break;
                }
                if (!qVar.d(this.d.e(), 0, 4, true)) {
                    break;
                }
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    this.j = true;
                    throw M2.z.a("Malformed ADTS stream", null);
                }
                j += h;
                i2++;
                if (i2 != 1000 && qVar.n(h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i = i2;
        qVar.f();
        if (i > 0) {
            this.i = (int) (j / i);
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    public final void l(long j, boolean z) {
        if (this.l) {
            return;
        }
        boolean z2 = (this.a & 1) != 0 && this.i > 0;
        if (z2 && this.b.k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.b.k() == -9223372036854775807L) {
            this.f.n(new J.b(-9223372036854775807L));
        } else {
            this.f.n(i(j, (this.a & 2) != 0));
        }
        this.l = true;
    }

    public final int m(o3.q qVar) {
        int i = 0;
        while (true) {
            qVar.p(this.d.e(), 0, 10);
            this.d.T(0);
            if (this.d.J() != 4801587) {
                break;
            }
            this.d.U(3);
            int F = this.d.F();
            i += F + 10;
            qVar.j(F);
        }
        qVar.f();
        qVar.j(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    public h(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new i(true);
        this.c = new P2.z(2048);
        this.i = -1;
        this.h = -1L;
        P2.z zVar = new P2.z(10);
        this.d = zVar;
        this.e = new P2.y(zVar.e());
    }

    public void release() {
    }
}
