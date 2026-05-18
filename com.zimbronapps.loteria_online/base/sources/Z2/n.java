package Z2;

import T2.u0;
import g3.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements P {
    public final int a;
    public final s b;
    public int c = -1;

    public n(s sVar, int i) {
        this.b = sVar;
        this.a = i;
    }

    public void a() {
        int i = this.c;
        if (i == -2) {
            throw new u(this.b.t().b(this.a).a(0).n);
        }
        if (i == -1) {
            this.b.W();
        } else if (i != -3) {
            this.b.X(i);
        }
    }

    public void b() {
        P2.a.a(this.c == -1);
        this.c = this.b.z(this.a);
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public void d() {
        if (this.c != -1) {
            this.b.r0(this.a);
            this.c = -1;
        }
    }

    public int e(u0 u0Var, S2.f fVar, int i) {
        if (this.c == -3) {
            fVar.e(4);
            return -4;
        }
        if (c()) {
            return this.b.g0(this.c, u0Var, fVar, i);
        }
        return -3;
    }

    public boolean isReady() {
        return this.c == -3 || (c() && this.b.R(this.c));
    }

    public int n(long j) {
        if (c()) {
            return this.b.q0(this.c, j);
        }
        return 0;
    }
}
