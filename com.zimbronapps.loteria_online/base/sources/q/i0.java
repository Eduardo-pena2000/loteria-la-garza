package Q;

import P0.r1;
import Z0.N0;
import Z0.R0;
import Z0.S0;
import Z0.T0;
import Z0.W0;
import Z0.X0;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import v0.s1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i0 {
    public static final i0 a = new i0();

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.M a;
        public final /* synthetic */ kotlin.jvm.internal.M b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.M m, kotlin.jvm.internal.M m2) {
            super(1);
            this.a = m;
            this.b = m2;
        }

        public final CharSequence invoke(Za.k kVar) {
            kotlin.jvm.internal.M m = this.a;
            if (m.a == -1) {
                m.a = kVar.c().f();
            }
            this.b.a = kVar.c().g() + 1;
            return "";
        }
    }

    private final void A(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        e(x0Var, j0.g(w0Var, s1.f(H.a(deleteGesture)), L(I.a(deleteGesture)), R0.a.h()), P.d.a.a());
    }

    private final void B(N.y yVar, DeleteRangeGesture deleteRangeGesture, T.F f) {
        if (f != null) {
            f.X(j0.h(yVar, s1.f(a0.a(deleteRangeGesture)), s1.f(b0.a(deleteRangeGesture)), L(c0.a(deleteRangeGesture)), R0.a.h()));
        }
    }

    private final void C(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        e(x0Var, j0.i(w0Var, s1.f(a0.a(deleteRangeGesture)), s1.f(b0.a(deleteRangeGesture)), L(c0.a(deleteRangeGesture)), R0.a.h()), P.d.a.a());
    }

    public static final void F(x0 x0Var) {
        x0.b(x0Var);
        x0.a(x0Var);
        R.a aVar = R.a.a;
        throw null;
    }

    public static final void G(T.F f) {
        if (f != null) {
            f.n();
        }
    }

    private final void H(N.y yVar, SelectGesture selectGesture, T.F f) {
        if (f != null) {
            f.g0(j0.f(yVar, s1.f(Q.a(selectGesture)), L(S.a(selectGesture)), R0.a.h()));
        }
    }

    private final void I(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        e(x0Var, j0.g(w0Var, s1.f(Q.a(selectGesture)), L(S.a(selectGesture)), R0.a.h()), P.d.a.b());
    }

    private final void J(N.y yVar, SelectRangeGesture selectRangeGesture, T.F f) {
        if (f != null) {
            f.g0(j0.h(yVar, s1.f(A.a(selectRangeGesture)), s1.f(L.a(selectRangeGesture)), L(X.a(selectRangeGesture)), R0.a.h()));
        }
    }

    private final void K(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        e(x0Var, j0.i(w0Var, s1.f(A.a(selectRangeGesture)), s1.f(L.a(selectRangeGesture)), L(X.a(selectRangeGesture)), R0.a.h()), P.d.a.b());
    }

    private final int L(int i) {
        return i != 1 ? i != 2 ? N0.a.a() : N0.a.a() : N0.a.b();
    }

    public static /* synthetic */ void a(T.F f) {
        G(f);
    }

    public static /* synthetic */ void b(x0 x0Var) {
        F(x0Var);
    }

    private final int c(x0 x0Var, HandwritingGesture handwritingGesture) {
        x0.b(x0Var);
        x0.a(x0Var);
        R.a aVar = R.a.a;
        throw null;
    }

    private final int d(HandwritingGesture handwritingGesture, Qa.l lVar) {
        String a2 = Z.a(handwritingGesture);
        if (a2 == null) {
            return 3;
        }
        lVar.invoke(new f1.a(a2, 1));
        return 5;
    }

    private final int f(N.y yVar, DeleteGesture deleteGesture, Z0.e eVar, Qa.l lVar) {
        int L = L(I.a(deleteGesture));
        long f = j0.f(yVar, s1.f(H.a(deleteGesture)), L, R0.a.h());
        if (W0.h(f)) {
            return a.d(d0.a(deleteGesture), lVar);
        }
        k(f, eVar, N0.d(L, N0.a.b()), lVar);
        return 1;
    }

    private final int g(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        int L = L(I.a(deleteGesture));
        long g = j0.g(w0Var, s1.f(H.a(deleteGesture)), L, R0.a.h());
        if (W0.h(g)) {
            return a.c(x0Var, d0.a(deleteGesture));
        }
        j(x0Var, g, N0.d(L, N0.a.b()));
        return 1;
    }

    private final int h(N.y yVar, DeleteRangeGesture deleteRangeGesture, Z0.e eVar, Qa.l lVar) {
        int L = L(c0.a(deleteRangeGesture));
        long h = j0.h(yVar, s1.f(a0.a(deleteRangeGesture)), s1.f(b0.a(deleteRangeGesture)), L, R0.a.h());
        if (W0.h(h)) {
            return a.d(d0.a(deleteRangeGesture), lVar);
        }
        k(h, eVar, N0.d(L, N0.a.b()), lVar);
        return 1;
    }

    private final int i(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        int L = L(c0.a(deleteRangeGesture));
        long i = j0.i(w0Var, s1.f(a0.a(deleteRangeGesture)), s1.f(b0.a(deleteRangeGesture)), L, R0.a.h());
        if (W0.h(i)) {
            return a.c(x0Var, d0.a(deleteRangeGesture));
        }
        j(x0Var, i, N0.d(L, N0.a.b()));
        return 1;
    }

    private final void j(x0 x0Var, long j, boolean z) {
        if (z) {
            throw null;
        }
        x0.c(x0Var, "", j, null, false, 12, null);
    }

    private final void k(long j, Z0.e eVar, boolean z, Qa.l lVar) {
        if (z) {
            j = j0.a(j, eVar);
        }
        lVar.invoke(j0.b(new f1.Q(W0.i(j), W0.i(j)), new f1.g(W0.j(j), 0)));
    }

    private final int n(N.y yVar, InsertGesture insertGesture, r1 r1Var, Qa.l lVar) {
        N.Z j;
        T0 f;
        if (r1Var == null) {
            return d(d0.a(insertGesture), lVar);
        }
        int c = j0.c(yVar, j0.l(T.a(insertGesture)), r1Var);
        if (c == -1 || !((j = yVar.j()) == null || (f = j.f()) == null || !j0.j(f, c))) {
            return d(d0.a(insertGesture), lVar);
        }
        p(c, U.a(insertGesture), lVar);
        return 1;
    }

    private final int o(x0 x0Var, InsertGesture insertGesture, w0 w0Var, r1 r1Var) {
        int d = j0.d(w0Var, j0.l(T.a(insertGesture)), r1Var);
        if (d == -1) {
            return c(x0Var, d0.a(insertGesture));
        }
        x0.c(x0Var, U.a(insertGesture), X0.a(d), null, false, 12, null);
        return 1;
    }

    private final void p(int i, String str, Qa.l lVar) {
        lVar.invoke(j0.b(new f1.Q(i, i), new f1.a(str, 1)));
    }

    private final int q(N.y yVar, JoinOrSplitGesture joinOrSplitGesture, Z0.e eVar, r1 r1Var, Qa.l lVar) {
        N.Z j;
        T0 f;
        if (r1Var == null) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        int c = j0.c(yVar, j0.l(Y.a(joinOrSplitGesture)), r1Var);
        if (c == -1 || !((j = yVar.j()) == null || (f = j.f()) == null || !j0.j(f, c))) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        long k = j0.k(eVar, c);
        if (W0.h(k)) {
            p(W0.n(k), " ", lVar);
        } else {
            k(k, eVar, false, lVar);
        }
        return 1;
    }

    private final int r(x0 x0Var, JoinOrSplitGesture joinOrSplitGesture, w0 w0Var, r1 r1Var) {
        throw null;
    }

    private final int s(N.y yVar, RemoveSpaceGesture removeSpaceGesture, Z0.e eVar, r1 r1Var, Qa.l lVar) {
        N.Z j = yVar.j();
        long e = j0.e(j != null ? j.f() : null, j0.l(V.a(removeSpaceGesture)), j0.l(W.a(removeSpaceGesture)), yVar.i(), r1Var);
        if (W0.h(e)) {
            return a.d(d0.a(removeSpaceGesture), lVar);
        }
        kotlin.jvm.internal.M m = new kotlin.jvm.internal.M();
        m.a = -1;
        kotlin.jvm.internal.M m2 = new kotlin.jvm.internal.M();
        m2.a = -1;
        String i = new Za.o("\\s+").i(X0.e(eVar, e), new a(m, m2));
        if (m.a == -1 || m2.a == -1) {
            return d(d0.a(removeSpaceGesture), lVar);
        }
        int n = W0.n(e) + m.a;
        int n2 = W0.n(e) + m2.a;
        String substring = i.substring(m.a, i.length() - (W0.j(e) - m2.a));
        kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.invoke(j0.b(new f1.Q(n, n2), new f1.a(substring, 1)));
        return 1;
    }

    private final int t(x0 x0Var, RemoveSpaceGesture removeSpaceGesture, w0 w0Var, r1 r1Var) {
        throw null;
    }

    private final int u(N.y yVar, SelectGesture selectGesture, T.F f, Qa.l lVar) {
        long f2 = j0.f(yVar, s1.f(Q.a(selectGesture)), L(S.a(selectGesture)), R0.a.h());
        if (W0.h(f2)) {
            return a.d(d0.a(selectGesture), lVar);
        }
        y(f2, f, lVar);
        return 1;
    }

    private final int v(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        if (W0.h(j0.g(w0Var, s1.f(Q.a(selectGesture)), L(S.a(selectGesture)), R0.a.h()))) {
            return a.c(x0Var, d0.a(selectGesture));
        }
        throw null;
    }

    private final int w(N.y yVar, SelectRangeGesture selectRangeGesture, T.F f, Qa.l lVar) {
        long h = j0.h(yVar, s1.f(A.a(selectRangeGesture)), s1.f(L.a(selectRangeGesture)), L(X.a(selectRangeGesture)), R0.a.h());
        if (W0.h(h)) {
            return a.d(d0.a(selectRangeGesture), lVar);
        }
        y(h, f, lVar);
        return 1;
    }

    private final int x(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        if (W0.h(j0.i(w0Var, s1.f(A.a(selectRangeGesture)), s1.f(L.a(selectRangeGesture)), L(X.a(selectRangeGesture)), R0.a.h()))) {
            return a.c(x0Var, d0.a(selectRangeGesture));
        }
        throw null;
    }

    private final void y(long j, T.F f, Qa.l lVar) {
        lVar.invoke(new f1.Q(W0.n(j), W0.i(j)));
        if (f != null) {
            f.v(true);
        }
    }

    private final void z(N.y yVar, DeleteGesture deleteGesture, T.F f) {
        if (f != null) {
            f.X(j0.f(yVar, s1.f(H.a(deleteGesture)), L(I.a(deleteGesture)), R0.a.h()));
        }
    }

    public final boolean D(N.y yVar, PreviewableHandwritingGesture previewableHandwritingGesture, T.F f, CancellationSignal cancellationSignal) {
        T0 f2;
        S0 l;
        Z0.e w = yVar.w();
        if (w == null) {
            return false;
        }
        N.Z j = yVar.j();
        if (!kotlin.jvm.internal.t.c(w, (j == null || (f2 = j.f()) == null || (l = f2.l()) == null) ? null : l.j())) {
            return false;
        }
        if (e0.a(previewableHandwritingGesture)) {
            H(yVar, f0.a(previewableHandwritingGesture), f);
        } else if (B.a(previewableHandwritingGesture)) {
            z(yVar, C.a(previewableHandwritingGesture), f);
        } else if (D.a(previewableHandwritingGesture)) {
            J(yVar, E.a(previewableHandwritingGesture), f);
        } else {
            if (!F.a(previewableHandwritingGesture)) {
                return false;
            }
            B(yVar, G.a(previewableHandwritingGesture), f);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new g0(f));
        return true;
    }

    public final boolean E(x0 x0Var, PreviewableHandwritingGesture previewableHandwritingGesture, w0 w0Var, CancellationSignal cancellationSignal) {
        if (e0.a(previewableHandwritingGesture)) {
            I(x0Var, f0.a(previewableHandwritingGesture), w0Var);
        } else if (B.a(previewableHandwritingGesture)) {
            A(x0Var, C.a(previewableHandwritingGesture), w0Var);
        } else if (D.a(previewableHandwritingGesture)) {
            K(x0Var, E.a(previewableHandwritingGesture), w0Var);
        } else {
            if (!F.a(previewableHandwritingGesture)) {
                return false;
            }
            C(x0Var, G.a(previewableHandwritingGesture), w0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new h0(x0Var));
        return true;
    }

    public final void e(x0 x0Var, long j, int i) {
        if (!W0.h(j)) {
            throw null;
        }
        x0.b(x0Var);
        x0.a(x0Var);
        R.a aVar = R.a.a;
        throw null;
    }

    public final int l(N.y yVar, HandwritingGesture handwritingGesture, T.F f, r1 r1Var, Qa.l lVar) {
        T0 f2;
        S0 l;
        Z0.e w = yVar.w();
        if (w == null) {
            return 3;
        }
        N.Z j = yVar.j();
        if (!kotlin.jvm.internal.t.c(w, (j == null || (f2 = j.f()) == null || (l = f2.l()) == null) ? null : l.j())) {
            return 3;
        }
        if (e0.a(handwritingGesture)) {
            return u(yVar, f0.a(handwritingGesture), f, lVar);
        }
        if (B.a(handwritingGesture)) {
            return f(yVar, C.a(handwritingGesture), w, lVar);
        }
        if (D.a(handwritingGesture)) {
            return w(yVar, E.a(handwritingGesture), f, lVar);
        }
        if (F.a(handwritingGesture)) {
            return h(yVar, G.a(handwritingGesture), w, lVar);
        }
        if (O.a(handwritingGesture)) {
            return q(yVar, P.a(handwritingGesture), w, r1Var, lVar);
        }
        if (J.a(handwritingGesture)) {
            return n(yVar, K.a(handwritingGesture), r1Var, lVar);
        }
        if (M.a(handwritingGesture)) {
            return s(yVar, N.a(handwritingGesture), w, r1Var, lVar);
        }
        return 2;
    }

    public final int m(x0 x0Var, HandwritingGesture handwritingGesture, w0 w0Var, r1 r1Var) {
        if (e0.a(handwritingGesture)) {
            return v(x0Var, f0.a(handwritingGesture), w0Var);
        }
        if (B.a(handwritingGesture)) {
            return g(x0Var, C.a(handwritingGesture), w0Var);
        }
        if (D.a(handwritingGesture)) {
            return x(x0Var, E.a(handwritingGesture), w0Var);
        }
        if (F.a(handwritingGesture)) {
            return i(x0Var, G.a(handwritingGesture), w0Var);
        }
        if (O.a(handwritingGesture)) {
            return r(x0Var, P.a(handwritingGesture), w0Var, r1Var);
        }
        if (J.a(handwritingGesture)) {
            return o(x0Var, K.a(handwritingGesture), w0Var, r1Var);
        }
        if (M.a(handwritingGesture)) {
            return t(x0Var, N.a(handwritingGesture), w0Var, r1Var);
        }
        return 2;
    }
}
