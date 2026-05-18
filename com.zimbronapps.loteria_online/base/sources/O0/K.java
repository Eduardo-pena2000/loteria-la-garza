package O0;

import androidx.compose.ui.e;
import v0.Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    public static final /* synthetic */ void a(d0.c cVar, e.c cVar2, boolean z) {
        c(cVar, cVar2, z);
    }

    public static final /* synthetic */ e.c b(d0.c cVar) {
        return h(cVar);
    }

    public static final void c(d0.c cVar, e.c cVar2, boolean z) {
        d0.c e = e(n(cVar2), z);
        int m = e.m() - 1;
        Object[] objArr = e.a;
        if (m < objArr.length) {
            while (m >= 0) {
                cVar.b(((J) objArr[m]).s0().k());
                m--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final E d(e.c cVar) {
        if ((g0.a(2) & cVar.getKindSet$ui_release()) != 0) {
            if (cVar instanceof E) {
                return (E) cVar;
            }
            if (cVar instanceof m) {
                e.c F1 = ((m) cVar).F1();
                while (F1 != 0) {
                    if (F1 instanceof E) {
                        return (E) F1;
                    }
                    F1 = (!(F1 instanceof m) || (g0.a(2) & F1.getKindSet$ui_release()) == 0) ? F1.getChild$ui_release() : ((m) F1).F1();
                }
            }
        }
        return null;
    }

    public static final d0.c e(J j, boolean z) {
        return z ? j.G0() : j.H0();
    }

    public static final boolean f(j jVar, int i) {
        return (jVar.getNode().getAggregateChildKindSet$ui_release() & i) != 0;
    }

    public static final boolean g(j jVar) {
        return jVar.getNode() == jVar;
    }

    public static final e.c h(d0.c cVar) {
        if (cVar == null || cVar.m() == 0) {
            return null;
        }
        return (e.c) cVar.u(cVar.m() - 1);
    }

    public static final e0 i(j jVar, int i) {
        e0 coordinator$ui_release = jVar.getNode().getCoordinator$ui_release();
        kotlin.jvm.internal.t.d(coordinator$ui_release);
        if (coordinator$ui_release.N2() != jVar || !h0.i(i)) {
            return coordinator$ui_release;
        }
        e0 O2 = coordinator$ui_release.O2();
        kotlin.jvm.internal.t.d(O2);
        return O2;
    }

    public static final n1.d j(j jVar) {
        return n(jVar).R();
    }

    public static final Z0 k(j jVar) {
        return o(jVar).getGraphicsContext();
    }

    public static final M0.p l(j jVar) {
        if (!jVar.getNode().isAttached()) {
            L0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        M0.p x = i(jVar, g0.a(2)).x();
        if (!x.g()) {
            L0.a.b("LayoutCoordinates is not attached.");
        }
        return x;
    }

    public static final n1.t m(j jVar) {
        return n(jVar).getLayoutDirection();
    }

    public static final J n(j jVar) {
        e0 coordinator$ui_release = jVar.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.L1();
        }
        L0.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new Ca.i();
    }

    public static final p0 o(j jVar) {
        p0 y0 = n(jVar).y0();
        if (y0 != null) {
            return y0;
        }
        L0.a.c("This node does not have an owner.");
        throw new Ca.i();
    }

    public static final W0.o p(j jVar) {
        return n(jVar);
    }
}
