package T;

import Z0.T0;
import Z0.W0;
import Z0.X0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final a h = new a(null);
    public static final int i = 8;
    public final Z0.e a;
    public final long b;
    public final T0 c;
    public final f1.J d;
    public final I e;
    public long f;
    public Z0.e g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ b(Z0.e eVar, long j, T0 t0, f1.J j2, I i2, kotlin.jvm.internal.k kVar) {
        this(eVar, j, t0, j2, i2);
    }

    public static /* synthetic */ int h(b bVar, T0 t0, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = bVar.W();
        }
        return bVar.g(t0, i2);
    }

    public static /* synthetic */ int k(b bVar, T0 t0, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = bVar.X();
        }
        return bVar.j(t0, i2);
    }

    public static /* synthetic */ int o(b bVar, T0 t0, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = bVar.V();
        }
        return bVar.n(t0, i2);
    }

    public static /* synthetic */ int s(b bVar, T0 t0, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i3 & 1) != 0) {
            i2 = bVar.V();
        }
        return bVar.r(t0, i2);
    }

    public final b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b C() {
        int l;
        v().b();
        if (w().length() > 0 && (l = l()) != -1) {
            T(l);
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b D() {
        v().b();
        if (w().length() > 0) {
            int a2 = N.C.a(w(), W0.k(this.f));
            if (a2 == W0.k(this.f) && a2 != w().length()) {
                a2 = N.C.a(w(), a2 + 1);
            }
            T(a2);
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b E() {
        Integer m;
        v().b();
        if (w().length() > 0 && (m = m()) != null) {
            T(m.intValue());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b F() {
        int q;
        v().b();
        if (w().length() > 0 && (q = q()) != -1) {
            T(q);
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b G() {
        v().b();
        if (w().length() > 0) {
            int b = N.C.b(w(), W0.l(this.f));
            if (b == W0.l(this.f) && b != 0) {
                b = N.C.b(w(), b - 1);
            }
            T(b);
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b H() {
        Integer t;
        v().b();
        if (w().length() > 0 && (t = t()) != null) {
            T(t.intValue());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b M() {
        Integer f;
        v().b();
        if (w().length() > 0 && (f = f()) != null) {
            T(f.intValue());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b P() {
        Integer i2;
        v().b();
        if (w().length() > 0 && (i2 = i()) != null) {
            T(i2.intValue());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b Q() {
        T0 t0;
        if (w().length() > 0 && (t0 = this.c) != null) {
            T(y(t0, -1));
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b S() {
        if (w().length() > 0) {
            this.f = X0.b(W0.n(this.b), W0.i(this.f));
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void T(int i2) {
        U(i2, i2);
    }

    public final void U(int i2, int i3) {
        this.f = X0.b(i2, i3);
    }

    public final int V() {
        return this.d.b(W0.i(this.f));
    }

    public final int W() {
        return this.d.b(W0.k(this.f));
    }

    public final int X() {
        return this.d.b(W0.l(this.f));
    }

    public final int a(int i2) {
        return Wa.n.i(i2, w().length() - 1);
    }

    public final b b(Qa.l lVar) {
        v().b();
        if (w().length() > 0) {
            if (W0.h(this.f)) {
                kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.invoke(this);
            } else if (x()) {
                T(W0.l(this.f));
            } else {
                T(W0.k(this.f));
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b c(Qa.l lVar) {
        v().b();
        if (w().length() > 0) {
            if (W0.h(this.f)) {
                kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.invoke(this);
            } else if (x()) {
                T(W0.k(this.f));
            } else {
                T(W0.l(this.f));
            }
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final b d() {
        v().b();
        if (w().length() > 0) {
            T(W0.i(this.f));
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final Z0.e e() {
        return this.g;
    }

    public final Integer f() {
        T0 t0 = this.c;
        if (t0 != null) {
            return Integer.valueOf(h(this, t0, 0, 1, null));
        }
        return null;
    }

    public final int g(T0 t0, int i2) {
        return this.d.a(t0.o(t0.q(i2), true));
    }

    public final Integer i() {
        T0 t0 = this.c;
        if (t0 != null) {
            return Integer.valueOf(k(this, t0, 0, 1, null));
        }
        return null;
    }

    public final int j(T0 t0, int i2) {
        return this.d.a(t0.u(t0.q(i2)));
    }

    public final int l() {
        return N.D.a(this.g.j(), W0.i(this.f));
    }

    public final Integer m() {
        T0 t0 = this.c;
        if (t0 != null) {
            return Integer.valueOf(o(this, t0, 0, 1, null));
        }
        return null;
    }

    public final int n(T0 t0, int i2) {
        while (i2 < this.a.length()) {
            long C = t0.C(a(i2));
            if (W0.i(C) > i2) {
                return this.d.a(W0.i(C));
            }
            i2++;
        }
        return this.a.length();
    }

    public final f1.J p() {
        return this.d;
    }

    public final int q() {
        return N.D.b(this.g.j(), W0.i(this.f));
    }

    public final int r(T0 t0, int i2) {
        while (i2 > 0) {
            long C = t0.C(a(i2));
            if (W0.n(C) < i2) {
                return this.d.a(W0.n(C));
            }
            i2--;
        }
        return 0;
    }

    public final Integer t() {
        T0 t0 = this.c;
        if (t0 != null) {
            return Integer.valueOf(s(this, t0, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f;
    }

    public final I v() {
        return this.e;
    }

    public final String w() {
        return this.g.j();
    }

    public final boolean x() {
        T0 t0 = this.c;
        return (t0 != null ? t0.y(V()) : null) != l1.i.b;
    }

    public final int y(T0 t0, int i2) {
        int V = V();
        if (this.e.a() == null) {
            this.e.c(Float.valueOf(t0.e(V).i()));
        }
        int q = t0.q(V) + i2;
        if (q < 0) {
            return 0;
        }
        if (q >= t0.n()) {
            return w().length();
        }
        float m = t0.m(q) - 1;
        Float a2 = this.e.a();
        kotlin.jvm.internal.t.d(a2);
        float floatValue = a2.floatValue();
        if ((x() && floatValue >= t0.t(q)) || (!x() && floatValue <= t0.s(q))) {
            return t0.o(q, true);
        }
        return this.d.a(t0.x(u0.g.a(a2.floatValue(), m)));
    }

    public final b z() {
        T0 t0;
        if (w().length() > 0 && (t0 = this.c) != null) {
            T(y(t0, 1));
        }
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public b(Z0.e eVar, long j, T0 t0, f1.J j2, I i2) {
        this.a = eVar;
        this.b = j;
        this.c = t0;
        this.d = j2;
        this.e = i2;
        this.f = j;
        this.g = eVar;
    }
}
