package androidx.compose.ui.focus;

import M0.c;
import O0.J;
import O0.c0;
import O0.g0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i, Qa.l lVar) {
        e.c cVar;
        M0.c K1;
        int c;
        c0 s0;
        int a = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J n = O0.k.n(focusTargetNode);
        loop0: while (true) {
            if (n == null) {
                cVar = null;
                break;
            }
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & a) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & a) != 0) {
                        cVar = parent$ui_release;
                        d0.c cVar2 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar.getKindSet$ui_release() & a) == 0 || !(cVar instanceof O0.m)) {
                                cVar = O0.k.b(cVar2);
                            } else {
                                int i2 = 0;
                                for (e.c F1 = ((O0.m) cVar).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = F1;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                cVar2.b(cVar);
                                                cVar = null;
                                            }
                                            cVar2.b(F1);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                    cVar = O0.k.b(cVar2);
                                }
                            }
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            n = n.z0();
            parent$ui_release = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
        if ((focusTargetNode2 != null && t.c(focusTargetNode2.K1(), focusTargetNode.K1())) || (K1 = focusTargetNode.K1()) == null) {
            return null;
        }
        c.a aVar = c.b;
        if (c.l(i, aVar.h())) {
            c = c.b.a.a();
        } else if (c.l(i, aVar.a())) {
            c = c.b.a.d();
        } else if (c.l(i, aVar.d())) {
            c = c.b.a.e();
        } else if (c.l(i, aVar.g())) {
            c = c.b.a.f();
        } else if (c.l(i, aVar.e())) {
            c = c.b.a.b();
        } else {
            if (!c.l(i, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            c = c.b.a.c();
        }
        return K1.b(c, lVar);
    }
}
