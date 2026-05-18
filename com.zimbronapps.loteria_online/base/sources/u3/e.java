package U3;

import U3.K;
import o3.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements o3.p {
    public static final o3.u d = new d();
    public final f a = new f();
    public final P2.z b = new P2.z(16384);
    public boolean c;

    public static /* synthetic */ o3.p[] c() {
        return f();
    }

    private static /* synthetic */ o3.p[] f() {
        return new o3.p[]{new e()};
    }

    public void a(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public void b(o3.r rVar) {
        this.a.d(rVar, new K.d(0, 1));
        rVar.s();
        rVar.n(new J.b(-9223372036854775807L));
    }

    public boolean d(o3.q qVar) {
        P2.z zVar = new P2.z(10);
        int i = 0;
        while (true) {
            qVar.p(zVar.e(), 0, 10);
            zVar.T(0);
            if (zVar.J() != 4801587) {
                break;
            }
            zVar.U(3);
            int F = zVar.F();
            i += F + 10;
            qVar.j(F);
        }
        qVar.f();
        qVar.j(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            qVar.p(zVar.e(), 0, 7);
            zVar.T(0);
            int M = zVar.M();
            if (M == 44096 || M == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int e = o3.c.e(zVar.e(), M);
                if (e == -1) {
                    return false;
                }
                qVar.j(e - 7);
            } else {
                qVar.f();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                qVar.j(i3);
                i2 = 0;
            }
        }
    }

    public int e(o3.q qVar, o3.I i) {
        int read = qVar.read(this.b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.b.T(0);
        this.b.S(read);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.c(this.b);
        return 0;
    }

    public void release() {
    }
}
