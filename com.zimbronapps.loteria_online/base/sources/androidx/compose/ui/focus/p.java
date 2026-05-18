package androidx.compose.ui.focus;

import O0.J;
import O0.c0;
import O0.e0;
import O0.g0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[t0.q.values().length];
            try {
                iArr2[t0.q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[t0.q.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[t0.q.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t0.q.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public static final j a(FocusTargetNode focusTargetNode, int i, t tVar) {
        j f;
        j b;
        h J1 = focusTargetNode.J1();
        c.a aVar = c.b;
        if (c.l(i, aVar.e())) {
            return J1.m();
        }
        if (c.l(i, aVar.f())) {
            return J1.k();
        }
        if (c.l(i, aVar.h())) {
            return J1.e();
        }
        if (c.l(i, aVar.a())) {
            return J1.g();
        }
        if (c.l(i, aVar.d())) {
            int i2 = a.a[tVar.ordinal()];
            if (i2 == 1) {
                b = J1.b();
            } else {
                if (i2 != 2) {
                    throw new Ca.o();
                }
                b = J1.f();
            }
            if (b == j.b.b()) {
                b = null;
            }
            return b == null ? J1.a() : b;
        }
        if (c.l(i, aVar.g())) {
            int i3 = a.a[tVar.ordinal()];
            if (i3 == 1) {
                f = J1.f();
            } else {
                if (i3 != 2) {
                    throw new Ca.o();
                }
                f = J1.b();
            }
            if (f == j.b.b()) {
                f = null;
            }
            return f == null ? J1.c() : f;
        }
        if (!c.l(i, aVar.b()) && !c.l(i, aVar.c())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        t0.a aVar2 = new t0.a(i, null);
        t0.k focusOwner = O0.k.o(focusTargetNode).getFocusOwner();
        FocusTargetNode f2 = focusOwner.f();
        if (c.l(i, aVar.b())) {
            J1.l().invoke(aVar2);
        } else {
            J1.n().invoke(aVar2);
        }
        return aVar2.c() ? j.b.a() : f2 != focusOwner.f() ? j.b.c() : j.b.b();
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        FocusTargetNode f = O0.k.o(focusTargetNode).getFocusOwner().f();
        if (f == null || !f.isAttached()) {
            return null;
        }
        return f;
    }

    public static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        c0 s0;
        int a2 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J n = O0.k.n(focusTargetNode);
        while (n != null) {
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                        e.c cVar = parent$ui_release;
                        d0.c cVar2 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                if (focusTargetNode2.J1().i()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVar.getKindSet$ui_release() & a2) != 0 && (cVar instanceof O0.m)) {
                                int i = 0;
                                for (e.c F1 = ((O0.m) cVar).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            cVar = O0.k.b(cVar2);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            n = n.z0();
            parent$ui_release = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
        }
        return null;
    }

    public static final u0.h d(FocusTargetNode focusTargetNode) {
        u0.h b0;
        e0 coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release == null || (b0 = M0.q.d(coordinator$ui_release).b0(coordinator$ui_release, false)) == null) ? u0.h.e.a() : b0;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i, t tVar, u0.h hVar, Qa.l lVar) {
        int g;
        c.a aVar = c.b;
        if (c.l(i, aVar.e()) || c.l(i, aVar.f())) {
            return Boolean.valueOf(r.f(focusTargetNode, i, lVar));
        }
        if (c.l(i, aVar.d()) || c.l(i, aVar.g()) || c.l(i, aVar.h()) || c.l(i, aVar.a())) {
            return s.t(focusTargetNode, i, hVar, lVar);
        }
        if (!c.l(i, aVar.b())) {
            if (c.l(i, aVar.c())) {
                FocusTargetNode b = b(focusTargetNode);
                FocusTargetNode c = b != null ? c(b) : null;
                return Boolean.valueOf((c == null || kotlin.jvm.internal.t.c(c, focusTargetNode)) ? false : ((Boolean) lVar.invoke(c)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + c.n(i)).toString());
        }
        int i2 = a.a[tVar.ordinal()];
        if (i2 == 1) {
            g = aVar.g();
        } else {
            if (i2 != 2) {
                throw new Ca.o();
            }
            g = aVar.d();
        }
        FocusTargetNode b2 = b(focusTargetNode);
        if (b2 != null) {
            return s.t(b2, g, hVar, lVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.e$c r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = O0.g0.a(r0)
            androidx.compose.ui.e$c r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 != 0) goto L21
            java.lang.String r2 = "visitChildren called on an unattached node"
            L0.a.b(r2)
        L21:
            d0.c r2 = new d0.c
            r3 = 16
            androidx.compose.ui.e$c[] r4 = new androidx.compose.ui.e.c[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.e$c r4 = r10.getNode()
            androidx.compose.ui.e$c r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3d
            androidx.compose.ui.e$c r10 = r10.getNode()
            O0.k.a(r2, r10, r5)
            goto L40
        L3d:
            r2.b(r4)
        L40:
            int r10 = r2.m()
            if (r10 == 0) goto Ldf
            int r10 = r2.m()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.u(r10)
            androidx.compose.ui.e$c r10 = (androidx.compose.ui.e.c) r10
            int r6 = r10.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            O0.k.a(r2, r10, r5)
            goto L40
        L5d:
            if (r10 == 0) goto L40
            int r6 = r10.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld9
            r6 = r1
        L67:
            if (r10 == 0) goto L40
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L98
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.e$c r7 = r10.getNode()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto Ld4
            t0.q r7 = r10.L1()
            int[] r8 = androidx.compose.ui.focus.p.a.b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L97
            r8 = 2
            if (r7 == r8) goto L97
            r8 = 3
            if (r7 == r8) goto L97
            r10 = 4
            if (r7 != r10) goto L91
            goto Ld4
        L91:
            Ca.o r10 = new Ca.o
            r10.<init>()
            throw r10
        L97:
            return r10
        L98:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Ld4
            boolean r7 = r10 instanceof O0.m
            if (r7 == 0) goto Ld4
            r7 = r10
            O0.m r7 = (O0.m) r7
            androidx.compose.ui.e$c r7 = r7.F1()
            r8 = r5
        Lab:
            if (r7 == 0) goto Ld1
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lcc
            int r8 = r8 + 1
            if (r8 != r4) goto Lba
            r10 = r7
            goto Lcc
        Lba:
            if (r6 != 0) goto Lc3
            d0.c r6 = new d0.c
            androidx.compose.ui.e$c[] r9 = new androidx.compose.ui.e.c[r3]
            r6.<init>(r9, r5)
        Lc3:
            if (r10 == 0) goto Lc9
            r6.b(r10)
            r10 = r1
        Lc9:
            r6.b(r7)
        Lcc:
            androidx.compose.ui.e$c r7 = r7.getChild$ui_release()
            goto Lab
        Ld1:
            if (r8 != r4) goto Ld4
            goto L67
        Ld4:
            androidx.compose.ui.e$c r10 = O0.k.b(r6)
            goto L67
        Ld9:
            androidx.compose.ui.e$c r10 = r10.getChild$ui_release()
            goto L5d
        Ldf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.p.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        J L1;
        e0 coordinator$ui_release;
        J L12;
        e0 coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (L1 = coordinator$ui_release2.L1()) == null || !L1.p() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (L12 = coordinator$ui_release.L1()) == null || !L12.g()) ? false : true;
    }
}
