package t0;

import O0.g0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final void a(l lVar) {
        int a = g0.a(1024);
        if (!lVar.getNode().isAttached()) {
            L0.a.b("visitChildren called on an unattached node");
        }
        d0.c cVar = new d0.c(new e.c[16], 0);
        e.c child$ui_release = lVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar, lVar.getNode(), false);
        } else {
            cVar.b(child$ui_release);
        }
        while (cVar.m() != 0) {
            e.c cVar2 = (e.c) cVar.u(cVar.m() - 1);
            if ((cVar2.getAggregateChildKindSet$ui_release() & a) == 0) {
                O0.k.a(cVar, cVar2, false);
            } else {
                while (true) {
                    if (cVar2 == null) {
                        break;
                    }
                    if ((cVar2.getKindSet$ui_release() & a) != 0) {
                        d0.c cVar3 = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
                                r.a((FocusTargetNode) cVar2);
                            } else if ((cVar2.getKindSet$ui_release() & a) != 0 && (cVar2 instanceof O0.m)) {
                                int i = 0;
                                for (e.c F1 = ((O0.m) cVar2).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar2 = F1;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar2 != null) {
                                                cVar3.b(cVar2);
                                                cVar2 = null;
                                            }
                                            cVar3.b(F1);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar2 = O0.k.b(cVar3);
                        }
                    } else {
                        cVar2 = cVar2.getChild$ui_release();
                    }
                }
            }
        }
    }
}
