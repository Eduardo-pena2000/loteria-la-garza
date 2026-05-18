package androidx.compose.ui.focus;

import M0.c;
import O0.g0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {

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
        public final /* synthetic */ u0.h c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Qa.l e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, u0.h hVar, int i, Qa.l lVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusTargetNode2;
            this.c = hVar;
            this.d = i;
            this.e = lVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c.a aVar) {
            if (this.a != O0.k.o(this.b).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean a = s.a(this.b, this.c, this.d, this.e);
            Boolean valueOf = Boolean.valueOf(a);
            if (a || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    public static final /* synthetic */ boolean a(FocusTargetNode focusTargetNode, u0.h hVar, int i, Qa.l lVar) {
        return r(focusTargetNode, hVar, i, lVar);
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.L1() != t0.q.b) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode b2 = p.b(focusTargetNode);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean c(u0.h hVar, u0.h hVar2, u0.h hVar3, int i) {
        if (d(hVar3, i, hVar) || !d(hVar2, i, hVar)) {
            return false;
        }
        if (e(hVar3, i, hVar)) {
            c.a aVar = c.b;
            if (!c.l(i, aVar.d()) && !c.l(i, aVar.g()) && f(hVar2, i, hVar) >= g(hVar3, i, hVar)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(u0.h hVar, int i, u0.h hVar2) {
        c.a aVar = c.b;
        if (c.l(i, aVar.d()) || c.l(i, aVar.g())) {
            if (hVar.e() <= hVar2.l() || hVar.l() >= hVar2.e()) {
                return false;
            }
        } else {
            if (!c.l(i, aVar.h()) && !c.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (hVar.j() <= hVar2.i() || hVar.i() >= hVar2.j()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e(u0.h hVar, int i, u0.h hVar2) {
        c.a aVar = c.b;
        if (c.l(i, aVar.d())) {
            if (hVar2.i() < hVar.j()) {
                return false;
            }
        } else if (c.l(i, aVar.g())) {
            if (hVar2.j() > hVar.i()) {
                return false;
            }
        } else if (c.l(i, aVar.h())) {
            if (hVar2.l() < hVar.e()) {
                return false;
            }
        } else {
            if (!c.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (hVar2.e() > hVar.l()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float f(u0.h r2, int r3, u0.h r4) {
        /*
            androidx.compose.ui.focus.c$a r0 = androidx.compose.ui.focus.c.b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.j()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.i()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.e()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.c.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.l()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            r3 = r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.f(u0.h, int, u0.h):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float g(u0.h r2, int r3, u0.h r4) {
        /*
            androidx.compose.ui.focus.c$a r0 = androidx.compose.ui.focus.c.b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.i()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.j()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.l()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.c.l(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.e()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            r3 = r2
        L58:
            return r3
        L59:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.g(u0.h, int, u0.h):float");
    }

    public static final u0.h h(u0.h hVar) {
        return new u0.h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    public static final void i(O0.j jVar, d0.c cVar) {
        int a2 = g0.a(1024);
        if (!jVar.getNode().isAttached()) {
            L0.a.b("visitChildren called on an unattached node");
        }
        d0.c cVar2 = new d0.c(new e.c[16], 0);
        e.c child$ui_release = jVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar2, jVar.getNode(), false);
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVar3;
                                if (focusTargetNode.isAttached() && !O0.k.n(focusTargetNode).z()) {
                                    if (focusTargetNode.J1().i()) {
                                        cVar.b(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, cVar);
                                    }
                                }
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
    }

    public static final FocusTargetNode j(d0.c cVar, u0.h hVar, int i) {
        u0.h s;
        c.a aVar = c.b;
        if (c.l(i, aVar.d())) {
            s = hVar.s((hVar.j() - hVar.i()) + 1, 0.0f);
        } else if (c.l(i, aVar.g())) {
            s = hVar.s(-((hVar.j() - hVar.i()) + 1), 0.0f);
        } else if (c.l(i, aVar.h())) {
            s = hVar.s(0.0f, (hVar.e() - hVar.l()) + 1);
        } else {
            if (!c.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            s = hVar.s(0.0f, -((hVar.e() - hVar.l()) + 1));
        }
        Object[] objArr = cVar.a;
        int m = cVar.m();
        FocusTargetNode focusTargetNode = null;
        for (int i2 = 0; i2 < m; i2++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i2];
            if (p.g(focusTargetNode2)) {
                u0.h d = p.d(focusTargetNode2);
                if (m(d, s, hVar, i)) {
                    focusTargetNode = focusTargetNode2;
                    s = d;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i, Qa.l lVar) {
        u0.h s;
        d0.c cVar = new d0.c(new FocusTargetNode[16], 0);
        i(focusTargetNode, cVar);
        if (cVar.m() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (cVar.m() == 0 ? null : cVar.a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) lVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        c.a aVar = c.b;
        if (c.l(i, aVar.b())) {
            i = aVar.g();
        }
        if (c.l(i, aVar.g()) || c.l(i, aVar.a())) {
            s = s(p.d(focusTargetNode));
        } else {
            if (!c.l(i, aVar.d()) && !c.l(i, aVar.h())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            s = h(p.d(focusTargetNode));
        }
        FocusTargetNode j = j(cVar, s, i);
        if (j != null) {
            return ((Boolean) lVar.invoke(j)).booleanValue();
        }
        return false;
    }

    public static final boolean l(FocusTargetNode focusTargetNode, u0.h hVar, int i, Qa.l lVar) {
        if (r(focusTargetNode, hVar, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new b(O0.k.o(focusTargetNode).getFocusOwner().f(), focusTargetNode, hVar, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(u0.h hVar, u0.h hVar2, u0.h hVar3, int i) {
        if (n(hVar, i, hVar3)) {
            return !n(hVar2, i, hVar3) || c(hVar3, hVar, hVar2, i) || (!c(hVar3, hVar2, hVar, i) && q(i, hVar3, hVar) < q(i, hVar3, hVar2));
        }
        return false;
    }

    public static final boolean n(u0.h hVar, int i, u0.h hVar2) {
        c.a aVar = c.b;
        if (c.l(i, aVar.d())) {
            if ((hVar2.j() <= hVar.j() && hVar2.i() < hVar.j()) || hVar2.i() <= hVar.i()) {
                return false;
            }
        } else if (c.l(i, aVar.g())) {
            if ((hVar2.i() >= hVar.i() && hVar2.j() > hVar.i()) || hVar2.j() >= hVar.j()) {
                return false;
            }
        } else if (c.l(i, aVar.h())) {
            if ((hVar2.e() <= hVar.e() && hVar2.l() < hVar.e()) || hVar2.l() <= hVar.l()) {
                return false;
            }
        } else {
            if (!c.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((hVar2.l() >= hVar.l() && hVar2.e() > hVar.l()) || hVar2.e() >= hVar.e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float o(u0.h r2, int r3, u0.h r4) {
        /*
            androidx.compose.ui.focus.c$a r0 = androidx.compose.ui.focus.c.b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.j()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.i()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.c.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.e()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.c.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.l()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            r3 = r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.o(u0.h, int, u0.h):float");
    }

    public static final float p(u0.h hVar, int i, u0.h hVar2) {
        float f;
        float f2;
        float l;
        float e;
        float l2;
        c.a aVar = c.b;
        if (c.l(i, aVar.d()) || c.l(i, aVar.g())) {
            float l3 = hVar2.l();
            float e2 = hVar2.e() - hVar2.l();
            f = 2;
            f2 = l3 + (e2 / f);
            l = hVar.l();
            e = hVar.e();
            l2 = hVar.l();
        } else {
            if (!c.l(i, aVar.h()) && !c.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float i2 = hVar2.i();
            float j = hVar2.j() - hVar2.i();
            f = 2;
            f2 = i2 + (j / f);
            l = hVar.i();
            e = hVar.j();
            l2 = hVar.i();
        }
        return f2 - (l + ((e - l2) / f));
    }

    public static final long q(int i, u0.h hVar, u0.h hVar2) {
        long o = (long) o(hVar2, i, hVar);
        long p = (long) p(hVar2, i, hVar);
        return (13 * o * o) + (p * p);
    }

    public static final boolean r(FocusTargetNode focusTargetNode, u0.h hVar, int i, Qa.l lVar) {
        FocusTargetNode j;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                if (focusTargetNode2.isAttached()) {
                                    cVar.b(focusTargetNode2);
                                }
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
        while (cVar.m() != 0 && (j = j(cVar, hVar, i)) != null) {
            if (j.J1().i()) {
                return ((Boolean) lVar.invoke(j)).booleanValue();
            }
            if (l(j, hVar, i, lVar)) {
                return true;
            }
            cVar.s(j);
        }
        return false;
    }

    public static final u0.h s(u0.h hVar) {
        return new u0.h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i, u0.h hVar, Qa.l lVar) {
        t0.q L1 = focusTargetNode.L1();
        int[] iArr = a.a;
        int i2 = iArr[L1.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i, lVar));
            }
            if (i2 == 4) {
                return focusTargetNode.J1().i() ? (Boolean) lVar.invoke(focusTargetNode) : hVar == null ? Boolean.valueOf(k(focusTargetNode, i, lVar)) : Boolean.valueOf(r(focusTargetNode, hVar, i, lVar));
            }
            throw new Ca.o();
        }
        FocusTargetNode f = p.f(focusTargetNode);
        if (f == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[f.L1().ordinal()];
        if (i3 == 1) {
            Boolean t = t(f, i, hVar, lVar);
            if (!t.c(t, Boolean.FALSE)) {
                return t;
            }
            if (hVar == null) {
                hVar = p.d(b(f));
            }
            return Boolean.valueOf(l(focusTargetNode, hVar, i, lVar));
        }
        if (i3 == 2 || i3 == 3) {
            if (hVar == null) {
                hVar = p.d(f);
            }
            return Boolean.valueOf(l(focusTargetNode, hVar, i, lVar));
        }
        if (i3 != 4) {
            throw new Ca.o();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
