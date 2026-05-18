package androidx.compose.ui.focus;

import M0.c;
import O0.J;
import O0.c0;
import O0.g0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t0.q.values().length];
            try {
                iArr[t0.q.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.q.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.q.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t0.q.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b extends u implements Qa.l {
        public final /* synthetic */ FocusTargetNode a;
        public final /* synthetic */ FocusTargetNode b;
        public final /* synthetic */ FocusTargetNode c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Qa.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, Qa.l lVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusTargetNode2;
            this.c = focusTargetNode3;
            this.d = i;
            this.e = lVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            if (this.a != O0.k.o(this.b).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean a = r.a(this.b, this.c, this.d, this.e);
            Boolean valueOf = Boolean.valueOf(a);
            if (a || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    public static final /* synthetic */ boolean a(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Qa.l lVar) {
        return i(focusTargetNode, focusTargetNode2, i, lVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Qa.l lVar) {
        t0.q L1 = focusTargetNode.L1();
        int[] iArr = a.a;
        int i = iArr[L1.ordinal()];
        if (i == 1) {
            FocusTargetNode f = p.f(focusTargetNode);
            if (f == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int i2 = iArr[f.L1().ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return d(focusTargetNode, f, c.b.f(), lVar);
                }
                if (i2 != 4) {
                    throw new Ca.o();
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (!b(f, lVar) && !d(focusTargetNode, f, c.b.f(), lVar) && (!f.J1().i() || !((Boolean) lVar.invoke(f)).booleanValue())) {
                return false;
            }
        } else {
            if (i == 2 || i == 3) {
                return g(focusTargetNode, lVar);
            }
            if (i != 4) {
                throw new Ca.o();
            }
            if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.J1().i() ? ((Boolean) lVar.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(FocusTargetNode focusTargetNode, Qa.l lVar) {
        int i = a.a[focusTargetNode.L1().ordinal()];
        if (i == 1) {
            FocusTargetNode f = p.f(focusTargetNode);
            if (f != null) {
                return c(f, lVar) || d(focusTargetNode, f, c.b.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i == 2 || i == 3) {
            return h(focusTargetNode, lVar);
        }
        if (i == 4) {
            return focusTargetNode.J1().i() ? ((Boolean) lVar.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, lVar);
        }
        throw new Ca.o();
    }

    public static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Qa.l lVar) {
        if (i(focusTargetNode, focusTargetNode2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new b(O0.k.o(focusTargetNode).getFocusOwner().f(), focusTargetNode, focusTargetNode2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode) {
        e.c cVar;
        c0 s0;
        int a2 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J n = O0.k.n(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (n == null) {
                break;
            }
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                        e.c cVar2 = parent$ui_release;
                        d0.c cVar3 = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
                                cVar = cVar2;
                                break loop0;
                            }
                            if ((cVar2.getKindSet$ui_release() & a2) == 0 || !(cVar2 instanceof O0.m)) {
                                cVar2 = O0.k.b(cVar3);
                            } else {
                                int i = 0;
                                for (e.c F1 = ((O0.m) cVar2).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
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
                                if (i != 1) {
                                    cVar2 = O0.k.b(cVar3);
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i, Qa.l lVar) {
        c.a aVar = c.b;
        if (c.l(i, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (c.l(i, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    public static final boolean g(FocusTargetNode focusTargetNode, Qa.l lVar) {
        d0.c cVar = new d0.c(new FocusTargetNode[16], 0);
        int a2 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitChildren called on an unattached node");
        }
        d0.c cVar2 = new d0.c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.b(child$ui_release);
        }
        while (cVar2.m() != 0) {
            e.c cVar3 = (e.c) cVar2.u(cVar2.m() - 1);
            if ((cVar3.getAggregateChildKindSet$ui_release() & a2) == 0) {
                O0.k.a(cVar2, cVar3, false);
            } else {
                while (true) {
                    if (cVar3 == null) {
                        break;
                    }
                    if ((cVar3.getKindSet$ui_release() & a2) != 0) {
                        d0.c cVar4 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                cVar.b((FocusTargetNode) cVar3);
                            } else if ((cVar3.getKindSet$ui_release() & a2) != 0 && (cVar3 instanceof O0.m)) {
                                int i = 0;
                                for (e.c F1 = ((O0.m) cVar3).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar3 = F1;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                cVar4.b(cVar3);
                                                cVar3 = null;
                                            }
                                            cVar4.b(F1);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar3 = O0.k.b(cVar4);
                        }
                    } else {
                        cVar3 = cVar3.getChild$ui_release();
                    }
                }
            }
        }
        cVar.A(t0.s.a);
        int m = cVar.m() - 1;
        Object[] objArr = cVar.a;
        if (m < objArr.length) {
            while (m >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[m];
                if (p.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                    return true;
                }
                m--;
            }
        }
        return false;
    }

    public static final boolean h(FocusTargetNode focusTargetNode, Qa.l lVar) {
        d0.c cVar = new d0.c(new FocusTargetNode[16], 0);
        int a2 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitChildren called on an unattached node");
        }
        d0.c cVar2 = new d0.c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.b(child$ui_release);
        }
        while (cVar2.m() != 0) {
            e.c cVar3 = (e.c) cVar2.u(cVar2.m() - 1);
            if ((cVar3.getAggregateChildKindSet$ui_release() & a2) == 0) {
                O0.k.a(cVar2, cVar3, false);
            } else {
                while (true) {
                    if (cVar3 == null) {
                        break;
                    }
                    if ((cVar3.getKindSet$ui_release() & a2) != 0) {
                        d0.c cVar4 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                cVar.b((FocusTargetNode) cVar3);
                            } else if ((cVar3.getKindSet$ui_release() & a2) != 0 && (cVar3 instanceof O0.m)) {
                                int i = 0;
                                for (e.c F1 = ((O0.m) cVar3).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar3 = F1;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                cVar4.b(cVar3);
                                                cVar3 = null;
                                            }
                                            cVar4.b(F1);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar3 = O0.k.b(cVar4);
                        }
                    } else {
                        cVar3 = cVar3.getChild$ui_release();
                    }
                }
            }
        }
        cVar.A(t0.s.a);
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i2 = 0; i2 < m; i2++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i2];
            if (p.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, Qa.l lVar) {
        if (focusTargetNode.L1() != t0.q.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        d0.c cVar = new d0.c(new FocusTargetNode[16], 0);
        int a2 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitChildren called on an unattached node");
        }
        d0.c cVar2 = new d0.c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar2, focusTargetNode.getNode(), false);
        } else {
            cVar2.b(child$ui_release);
        }
        while (cVar2.m() != 0) {
            e.c cVar3 = (e.c) cVar2.u(cVar2.m() - 1);
            if ((cVar3.getAggregateChildKindSet$ui_release() & a2) == 0) {
                O0.k.a(cVar2, cVar3, false);
            } else {
                while (true) {
                    if (cVar3 == null) {
                        break;
                    }
                    if ((cVar3.getKindSet$ui_release() & a2) != 0) {
                        d0.c cVar4 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                cVar.b((FocusTargetNode) cVar3);
                            } else if ((cVar3.getKindSet$ui_release() & a2) != 0 && (cVar3 instanceof O0.m)) {
                                int i2 = 0;
                                for (e.c F1 = ((O0.m) cVar3).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar3 = F1;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                cVar4.b(cVar3);
                                                cVar3 = null;
                                            }
                                            cVar4.b(F1);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar3 = O0.k.b(cVar4);
                        }
                    } else {
                        cVar3 = cVar3.getChild$ui_release();
                    }
                }
            }
        }
        cVar.A(t0.s.a);
        c.a aVar = c.b;
        if (c.l(i, aVar.e())) {
            Wa.i w = Wa.n.w(0, cVar.m());
            int f = w.f();
            int g = w.g();
            if (f <= g) {
                boolean z = false;
                while (true) {
                    if (z) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar.a[f];
                        if (p.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (t.c(cVar.a[f], focusTargetNode2)) {
                        z = true;
                    }
                    if (f == g) {
                        break;
                    }
                    f++;
                }
            }
        } else {
            if (!c.l(i, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            Wa.i w2 = Wa.n.w(0, cVar.m());
            int f2 = w2.f();
            int g2 = w2.g();
            if (f2 <= g2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) cVar.a[g2];
                        if (p.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (t.c(cVar.a[g2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (g2 == f2) {
                        break;
                    }
                    g2--;
                }
            }
        }
        if (c.l(i, c.b.e()) || !focusTargetNode.J1().i() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) lVar.invoke(focusTargetNode)).booleanValue();
    }
}
