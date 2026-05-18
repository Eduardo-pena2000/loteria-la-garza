package androidx.compose.ui.focus;

import Ca.I;
import O0.J;
import O0.c0;
import O0.g0;
import O0.k0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.j;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t0.q.values().length];
            try {
                iArr[t0.q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.q.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.q.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t0.q.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ FocusTargetNode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode) {
            super(0);
            this.a = focusTargetNode;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.J1();
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode f = p.f(focusTargetNode);
        if (f != null) {
            return b(f, z, z2);
        }
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = a.a[focusTargetNode.L1().ordinal()];
        if (i == 1) {
            O0.k.o(focusTargetNode).getFocusOwner().r(null);
            if (z2) {
                focusTargetNode.I1(t0.q.a, t0.q.d);
            }
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                O0.k.o(focusTargetNode).getFocusOwner().r(null);
                if (!z2) {
                    return z;
                }
                focusTargetNode.I1(t0.q.c, t0.q.d);
                return z;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new Ca.o();
                }
            } else {
                if (!a(focusTargetNode, z, z2)) {
                    return false;
                }
                if (z2) {
                    focusTargetNode.I1(t0.q.b, t0.q.d);
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean c(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return b(focusTargetNode, z, z2);
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        k0.a(focusTargetNode, new b(focusTargetNode));
        int i = a.a[focusTargetNode.L1().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new Ca.o();
            }
            O0.k.o(focusTargetNode).getFocusOwner().r(focusTargetNode);
        }
        return true;
    }

    public static final t0.b e(FocusTargetNode focusTargetNode, int i) {
        int i2 = a.a[focusTargetNode.L1().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return t0.b.b;
            }
            if (i2 == 3) {
                t0.b e = e(l(focusTargetNode), i);
                if (e == t0.b.a) {
                    e = null;
                }
                return e == null ? g(focusTargetNode, i) : e;
            }
            if (i2 != 4) {
                throw new Ca.o();
            }
        }
        return t0.b.a;
    }

    public static final t0.b f(FocusTargetNode focusTargetNode, int i) {
        if (!FocusTargetNode.E1(focusTargetNode)) {
            FocusTargetNode.G1(focusTargetNode, true);
            try {
                h J1 = focusTargetNode.J1();
                t0.a aVar = new t0.a(i, null);
                t0.k focusOwner = O0.k.o(focusTargetNode).getFocusOwner();
                FocusTargetNode f = focusOwner.f();
                J1.l().invoke(aVar);
                FocusTargetNode f2 = focusOwner.f();
                if (aVar.c()) {
                    j.a aVar2 = j.b;
                    j a2 = aVar2.a();
                    if (a2 == aVar2.a()) {
                        return t0.b.b;
                    }
                    if (a2 == aVar2.c()) {
                        return t0.b.c;
                    }
                    return j.h(a2, 0, 1, null) ? t0.b.c : t0.b.d;
                }
                if (f != f2 && f2 != null) {
                    j.a aVar3 = j.b;
                    j c = aVar3.c();
                    if (c == aVar3.a()) {
                        return t0.b.b;
                    }
                    if (c == aVar3.c()) {
                        return t0.b.c;
                    }
                    return j.h(c, 0, 1, null) ? t0.b.c : t0.b.d;
                }
            } finally {
                FocusTargetNode.G1(focusTargetNode, false);
            }
        }
        return t0.b.a;
    }

    public static final t0.b g(FocusTargetNode focusTargetNode, int i) {
        if (!FocusTargetNode.F1(focusTargetNode)) {
            FocusTargetNode.H1(focusTargetNode, true);
            try {
                h J1 = focusTargetNode.J1();
                t0.a aVar = new t0.a(i, null);
                t0.k focusOwner = O0.k.o(focusTargetNode).getFocusOwner();
                FocusTargetNode f = focusOwner.f();
                J1.n().invoke(aVar);
                FocusTargetNode f2 = focusOwner.f();
                if (aVar.c()) {
                    j.a aVar2 = j.b;
                    j a2 = aVar2.a();
                    if (a2 == aVar2.a()) {
                        return t0.b.b;
                    }
                    if (a2 == aVar2.c()) {
                        return t0.b.c;
                    }
                    return j.h(a2, 0, 1, null) ? t0.b.c : t0.b.d;
                }
                if (f != f2 && f2 != null) {
                    j.a aVar3 = j.b;
                    j c = aVar3.c();
                    if (c == aVar3.a()) {
                        return t0.b.b;
                    }
                    if (c == aVar3.c()) {
                        return t0.b.c;
                    }
                    return j.h(c, 0, 1, null) ? t0.b.c : t0.b.d;
                }
            } finally {
                FocusTargetNode.H1(focusTargetNode, false);
            }
        }
        return t0.b.a;
    }

    public static final t0.b h(FocusTargetNode focusTargetNode, int i) {
        e.c cVar;
        c0 s0;
        int i2 = a.a[focusTargetNode.L1().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return t0.b.a;
        }
        if (i2 == 3) {
            return e(l(focusTargetNode), i);
        }
        if (i2 != 4) {
            throw new Ca.o();
        }
        int a2 = g0.a(1024);
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
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                        cVar = parent$ui_release;
                        d0.c cVar2 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar.getKindSet$ui_release() & a2) == 0 || !(cVar instanceof O0.m)) {
                                cVar = O0.k.b(cVar2);
                            } else {
                                int i3 = 0;
                                for (e.c F1 = ((O0.m) cVar).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 != 1) {
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
        if (focusTargetNode2 == null) {
            return t0.b.a;
        }
        int i4 = a.a[focusTargetNode2.L1().ordinal()];
        if (i4 == 1) {
            return f(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return t0.b.b;
        }
        if (i4 == 3) {
            return h(focusTargetNode2, i);
        }
        if (i4 != 4) {
            throw new Ca.o();
        }
        t0.b h = h(focusTargetNode2, i);
        t0.b bVar = h != t0.b.a ? h : null;
        return bVar == null ? f(focusTargetNode2, i) : bVar;
    }

    public static final boolean i(FocusTargetNode focusTargetNode) {
        d0.c cVar;
        int i;
        c0 s0;
        c0 s02;
        t0.k focusOwner = O0.k.o(focusTargetNode).getFocusOwner();
        FocusTargetNode f = focusOwner.f();
        t0.q L1 = focusTargetNode.L1();
        int i2 = 1;
        if (f == focusTargetNode) {
            focusTargetNode.I1(L1, L1);
            return true;
        }
        d0.c cVar2 = null;
        int i3 = 0;
        if (f == null && !k(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        int i4 = 16;
        if (f != null) {
            cVar = new d0.c(new FocusTargetNode[16], 0);
            int a2 = g0.a(1024);
            if (!f.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = f.getNode().getParent$ui_release();
            J n = O0.k.n(f);
            while (n != null) {
                if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                            d0.c cVar3 = cVar2;
                            e.c cVar4 = parent$ui_release;
                            while (cVar4 != null) {
                                if (cVar4 instanceof FocusTargetNode) {
                                    cVar.b((FocusTargetNode) cVar4);
                                } else if ((cVar4.getKindSet$ui_release() & a2) != 0 && (cVar4 instanceof O0.m)) {
                                    e.c F1 = ((O0.m) cVar4).F1();
                                    int i5 = 0;
                                    while (F1 != null) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i5++;
                                            if (i5 == i2) {
                                                cVar4 = F1;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new d0.c(new e.c[16], 0);
                                                }
                                                if (cVar4 != null) {
                                                    cVar3.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                cVar3.b(F1);
                                            }
                                        }
                                        F1 = F1.getChild$ui_release();
                                        i2 = 1;
                                    }
                                    if (i5 == i2) {
                                    }
                                }
                                cVar4 = O0.k.b(cVar3);
                                i2 = 1;
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                        i2 = 1;
                        cVar2 = null;
                    }
                }
                n = n.z0();
                parent$ui_release = (n == null || (s02 = n.s0()) == null) ? null : s02.o();
                i2 = 1;
                cVar2 = null;
            }
        } else {
            cVar = null;
        }
        d0.c cVar5 = new d0.c(new FocusTargetNode[16], 0);
        int a3 = g0.a(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
        J n2 = O0.k.n(focusTargetNode);
        int i6 = 1;
        while (n2 != null) {
            if ((n2.s0().k().getAggregateChildKindSet$ui_release() & a3) != 0) {
                while (parent$ui_release2 != null) {
                    if ((parent$ui_release2.getKindSet$ui_release() & a3) != 0) {
                        e.c cVar6 = parent$ui_release2;
                        d0.c cVar7 = null;
                        while (cVar6 != null) {
                            if (cVar6 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar6;
                                Boolean valueOf = cVar != null ? Boolean.valueOf(cVar.s(focusTargetNode2)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    cVar5.b(focusTargetNode2);
                                }
                                if (focusTargetNode2 == f) {
                                    i6 = i3;
                                }
                            } else {
                                if ((cVar6.getKindSet$ui_release() & a3) != 0 && (cVar6 instanceof O0.m)) {
                                    e.c F12 = ((O0.m) cVar6).F1();
                                    int i7 = i3;
                                    while (F12 != null) {
                                        if ((F12.getKindSet$ui_release() & a3) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                cVar6 = F12;
                                            } else {
                                                if (cVar7 == null) {
                                                    cVar7 = new d0.c(new e.c[i4], 0);
                                                }
                                                if (cVar6 != null) {
                                                    cVar7.b(cVar6);
                                                    cVar6 = null;
                                                }
                                                cVar7.b(F12);
                                            }
                                        }
                                        F12 = F12.getChild$ui_release();
                                        i4 = 16;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                i3 = 0;
                                i4 = 16;
                            }
                            cVar6 = O0.k.b(cVar7);
                            i3 = 0;
                            i4 = 16;
                        }
                    }
                    parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    i3 = 0;
                    i4 = 16;
                }
            }
            n2 = n2.z0();
            parent$ui_release2 = (n2 == null || (s0 = n2.s0()) == null) ? null : s0.o();
            i3 = 0;
            i4 = 16;
        }
        if (i6 == 0 || f == null) {
            i = 1;
        } else {
            i = 1;
            if (!c(f, false, true, 1, null)) {
                return false;
            }
        }
        d(focusTargetNode);
        if (cVar != null) {
            int m = cVar.m() - i;
            Object[] objArr = cVar.a;
            if (m < objArr.length) {
                while (m >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[m];
                    if (focusOwner.f() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.I1(t0.q.b, t0.q.d);
                    m--;
                }
            }
        }
        int m2 = cVar5.m() - 1;
        Object[] objArr2 = cVar5.a;
        if (m2 < objArr2.length) {
            while (m2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[m2];
                if (focusOwner.f() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.I1(focusTargetNode4 == f ? t0.q.a : t0.q.d, t0.q.b);
                m2--;
            }
        }
        if (focusOwner.f() != focusTargetNode) {
            return false;
        }
        focusTargetNode.I1(L1, t0.q.a);
        if (focusOwner.f() != focusTargetNode) {
            return false;
        }
        if (!o0.h.d || O0.k.n(focusTargetNode).Z() != null) {
            return true;
        }
        j(focusTargetNode, c.i(c.b.e()), null);
        return true;
    }

    public static final boolean j(FocusTargetNode focusTargetNode, c cVar, u0.h hVar) {
        return O0.k.o(focusTargetNode).getFocusOwner().c(cVar, hVar);
    }

    public static /* synthetic */ boolean k(FocusTargetNode focusTargetNode, c cVar, u0.h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            hVar = null;
        }
        return j(focusTargetNode, cVar, hVar);
    }

    public static final FocusTargetNode l(FocusTargetNode focusTargetNode) {
        FocusTargetNode f = p.f(focusTargetNode);
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
