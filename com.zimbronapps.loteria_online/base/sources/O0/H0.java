package O0;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h0 {
    public static final w.K a = w.U.b();

    public static final void a(e.c cVar) {
        if (!cVar.isAttached()) {
            L0.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(e.c cVar, int i, int i2) {
        if (!(cVar instanceof m)) {
            c(cVar, i & cVar.getKindSet$ui_release(), i2);
            return;
        }
        m mVar = (m) cVar;
        c(cVar, mVar.G1() & i, i2);
        int i3 = (~mVar.G1()) & i;
        for (e.c F1 = mVar.F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            b(F1, i3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(e.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((g0.a(2) & i) != 0 && (cVar instanceof E)) {
                H.b((E) cVar);
                if (i2 == 2) {
                    k.i(cVar, g0.a(2)).j3();
                }
            }
            if ((g0.a(128) & i) != 0 && (cVar instanceof D) && i2 != 2) {
                k.n(cVar).Q0();
            }
            if ((g0.a(256) & i) != 0 && (cVar instanceof v)) {
                if (i2 == 1) {
                    J n = k.n(cVar);
                    n.N1(n.U() + 1);
                } else if (i2 == 2) {
                    k.n(cVar).N1(r1.U() - 1);
                }
                if (i2 != 2) {
                    k.n(cVar).S0();
                }
            }
            if ((g0.a(4) & i) != 0 && (cVar instanceof t)) {
                u.a((t) cVar);
            }
            if ((g0.a(8) & i) != 0 && (cVar instanceof A0)) {
                k.n(cVar).a2(true);
            }
            if ((g0.a(64) & i) != 0 && (cVar instanceof s0)) {
                t0.a((s0) cVar);
            }
            if ((g0.a(2048) & i) != 0 && (cVar instanceof t0.l)) {
                t0.l lVar = (t0.l) cVar;
                if (j(lVar)) {
                    t0.m.a(lVar);
                }
            }
            if ((i & g0.a(4096)) == 0 || !(cVar instanceof t0.e)) {
                return;
            }
            t0.f.a((t0.e) cVar);
        }
    }

    public static final void d(e.c cVar) {
        if (!cVar.isAttached()) {
            L0.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(e.c cVar) {
        if (!cVar.isAttached()) {
            L0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(e.b bVar) {
        int a2 = g0.a(1);
        if (bVar instanceof M0.v) {
            a2 |= g0.a(2);
        }
        if (bVar instanceof s0.j) {
            a2 |= g0.a(4);
        }
        if (bVar instanceof W0.r) {
            a2 |= g0.a(8);
        }
        if (bVar instanceof I0.J) {
            a2 |= g0.a(16);
        }
        if ((bVar instanceof N0.d) || (bVar instanceof N0.j)) {
            a2 |= g0.a(32);
        }
        if (bVar instanceof M0.F) {
            a2 |= g0.a(256);
        }
        if (bVar instanceof M0.I) {
            a2 |= g0.a(64);
        }
        return bVar instanceof T0.a ? a2 | g0.a(524288) : a2;
    }

    public static final int g(e.c cVar) {
        if (cVar.getKindSet$ui_release() != 0) {
            return cVar.getKindSet$ui_release();
        }
        w.K k = a;
        Object b = o0.d.b(cVar);
        int b2 = k.b(b);
        if (b2 >= 0) {
            return k.c[b2];
        }
        int a2 = g0.a(1);
        if (cVar instanceof E) {
            a2 |= g0.a(2);
        }
        if (cVar instanceof t) {
            a2 |= g0.a(4);
        }
        if (cVar instanceof A0) {
            a2 |= g0.a(8);
        }
        if (cVar instanceof v0) {
            a2 |= g0.a(16);
        }
        if (cVar instanceof N0.h) {
            a2 |= g0.a(32);
        }
        if (cVar instanceof s0) {
            a2 |= g0.a(64);
        }
        if (cVar instanceof D) {
            a2 |= g0.a(128);
        }
        if (cVar instanceof v) {
            a2 |= g0.a(256);
        }
        if (cVar instanceof FocusTargetNode) {
            a2 |= g0.a(1024);
        }
        if (cVar instanceof t0.l) {
            a2 |= g0.a(2048);
        }
        if (cVar instanceof t0.e) {
            a2 |= g0.a(4096);
        }
        if (cVar instanceof G0.e) {
            a2 |= g0.a(8192);
        }
        if (cVar instanceof K0.a) {
            a2 |= g0.a(16384);
        }
        if (cVar instanceof h) {
            a2 |= g0.a(32768);
        }
        if (cVar instanceof I0) {
            a2 |= g0.a(262144);
        }
        int a3 = cVar instanceof T0.a ? g0.a(524288) | a2 : a2;
        k.u(b, a3);
        return a3;
    }

    public static final int h(e.c cVar) {
        if (!(cVar instanceof m)) {
            return g(cVar);
        }
        m mVar = (m) cVar;
        int G1 = mVar.G1();
        for (e.c F1 = mVar.F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            G1 |= h(F1);
        }
        return G1;
    }

    public static final boolean i(int i) {
        return (i & g0.a(128)) != 0;
    }

    public static final boolean j(t0.l lVar) {
        e eVar = e.a;
        eVar.p();
        lVar.P0(eVar);
        return eVar.o();
    }
}
