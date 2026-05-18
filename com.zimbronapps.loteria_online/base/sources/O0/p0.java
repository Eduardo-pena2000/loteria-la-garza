package O0;

import P0.g1;
import P0.j1;
import P0.r1;
import P0.u1;
import android.view.View;
import androidx.compose.ui.layout.q;
import d1.t;
import d1.u;
import v0.Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface p0 extends I0.S {
    public static final a F8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static boolean b;

        public final boolean a() {
            return b;
        }
    }

    public interface b {
        void j();
    }

    static /* synthetic */ void f(p0 p0Var, J j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        p0Var.J(j, z);
    }

    static /* synthetic */ void j(p0 p0Var, J j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        p0Var.E(j, z, z2, z3);
    }

    static /* synthetic */ o0 l(p0 p0Var, Qa.p pVar, Qa.a aVar, y0.c cVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            cVar = null;
        }
        return p0Var.o(pVar, aVar, cVar);
    }

    static /* synthetic */ void m(p0 p0Var, J j, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        p0Var.F(j, z, z2);
    }

    static /* synthetic */ void p(p0 p0Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        p0Var.d(z);
    }

    void A(float f);

    void C(J j, int i);

    void D(J j);

    void E(J j, boolean z, boolean z2, boolean z3);

    void F(J j, boolean z, boolean z2);

    void G();

    void H();

    void I(J j, long j2);

    void J(J j, boolean z);

    void d(boolean z);

    long g(long j);

    P0.c getAccessibilityManager();

    p0.k getAutofill();

    p0.G getAutofillManager();

    p0.H getAutofillTree();

    P0.l0 getClipboard();

    P0.m0 getClipboardManager();

    Ga.i getCoroutineContext();

    n1.d getDensity();

    r0.c getDragAndDropManager();

    t0.k getFocusOwner();

    u.b getFontFamilyResolver();

    t.a getFontLoader();

    Z0 getGraphicsContext();

    D0.a getHapticFeedBack();

    E0.b getInputModeManager();

    n1.t getLayoutDirection();

    N0.f getModifierLocalManager();

    n0 getOutOfFrameExecutor();

    q.a getPlacementScope();

    I0.z getPointerIconService();

    X0.b getRectManager();

    J getRoot();

    W0.w getSemanticsOwner();

    L getSharedDrawScope();

    boolean getShowLayoutBounds();

    r0 getSnapshotObserver();

    g1 getSoftwareKeyboardController();

    f1.W getTextInputService();

    j1 getTextToolbar();

    r1 getViewConfiguration();

    u1 getWindowInfo();

    void h(View view);

    void i(Qa.a aVar);

    void k(J j, int i);

    o0 o(Qa.p pVar, Qa.a aVar, y0.c cVar);

    void r(J j);

    Object s(Qa.p pVar, Ga.e eVar);

    void setShowLayoutBounds(boolean z);

    void t(J j);

    void v(J j);

    void w(J j);

    long y(long j);

    void z(J j);
}
