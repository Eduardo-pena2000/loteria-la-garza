package M2;

import M2.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f implements C {
    public final G.c a = new G.c();

    public final boolean E() {
        return S() != -1;
    }

    public final boolean I() {
        G v = v();
        return !v.q() && v.n(L(), this.a).h;
    }

    public final void N(int i, int i2) {
        if (i != i2) {
            O(i, i + 1, i2);
        }
    }

    public final boolean R() {
        G v = v();
        return !v.q() && v.n(L(), this.a).f();
    }

    public final int S() {
        G v = v();
        if (v.q()) {
            return -1;
        }
        return v.l(L(), T(), Q());
    }

    public final int T() {
        int P = P();
        if (P == 1) {
            return 0;
        }
        return P;
    }

    public final void U(int i) {
        W(-1, -9223372036854775807L, i, false);
    }

    public final void V(int i) {
        W(L(), -9223372036854775807L, i, true);
    }

    public abstract void W(int i, long j, int i2, boolean z);

    public final void X(int i, int i2) {
        W(i, -9223372036854775807L, i2, false);
    }

    public final void Y(int i) {
        int b = b();
        if (b == -1) {
            U(i);
        } else if (b == L()) {
            V(i);
        } else {
            X(b, i);
        }
    }

    public final long a() {
        G v = v();
        if (v.q()) {
            return -9223372036854775807L;
        }
        return v.n(L(), this.a).d();
    }

    public final int b() {
        G v = v();
        if (v.q()) {
            return -1;
        }
        return v.e(L(), T(), Q());
    }

    public final int j() {
        return v().p();
    }

    public final void o() {
        Y(8);
    }

    public final boolean q() {
        return b() != -1;
    }

    public final boolean t() {
        G v = v();
        return !v.q() && v.n(L(), this.a).i;
    }

    public final void y(int i, long j) {
        W(i, j, 10, false);
    }
}
