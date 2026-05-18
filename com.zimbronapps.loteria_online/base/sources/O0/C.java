package O0;

import androidx.compose.ui.e;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends e.c implements E, t, A0, v0, N0.h, N0.k, s0, D, v, t0.e, t0.l, t0.n, q0, s0.d {
    public e.b a;
    public boolean b;
    public N0.a c;
    public HashSet d;
    public M0.p e;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            c.this.K1();
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            e.b E1 = c.this.E1();
            kotlin.jvm.internal.t.e(E1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((N0.d) E1).a(c.this);
        }
    }

    public c(e.b bVar) {
        setKindSet$ui_release(h0.f(bVar));
        this.a = bVar;
        this.b = true;
        this.d = new HashSet();
    }

    public void C0(t0.p pVar) {
        e.b bVar = this.a;
        L0.a.b("onFocusEvent called on wrong node");
        android.support.v4.media.session.b.a(bVar);
        throw null;
    }

    public final e.b E1() {
        return this.a;
    }

    public final HashSet F1() {
        return this.d;
    }

    public final void G1(boolean z) {
        if (!isAttached()) {
            L0.a.b("initializeModifier called on unattached node");
        }
        e.b bVar = this.a;
        if ((g0.a(32) & getKindSet$ui_release()) != 0) {
            if (bVar instanceof N0.d) {
                sideEffect(new a());
            }
            if (bVar instanceof N0.j) {
                L1((N0.j) bVar);
            }
        }
        if ((g0.a(4) & getKindSet$ui_release()) != 0 && !z) {
            H.a(this);
        }
        if ((g0.a(2) & getKindSet$ui_release()) != 0) {
            if (d.c(this)) {
                e0 coordinator$ui_release = getCoordinator$ui_release();
                kotlin.jvm.internal.t.d(coordinator$ui_release);
                ((F) coordinator$ui_release).O3(this);
                coordinator$ui_release.e3();
            }
            if (!z) {
                H.a(this);
                k.n(this).Q0();
            }
        }
        if (bVar instanceof M0.N) {
            ((M0.N) bVar).d(k.n(this));
        }
        g0.a(128);
        getKindSet$ui_release();
        if ((g0.a(256) & getKindSet$ui_release()) != 0 && (bVar instanceof M0.F) && d.c(this)) {
            k.n(this).Q0();
        }
        if ((g0.a(16) & getKindSet$ui_release()) != 0 && (bVar instanceof I0.J)) {
            ((I0.J) bVar).e().f(getCoordinator$ui_release());
        }
        if ((g0.a(8) & getKindSet$ui_release()) != 0) {
            k.o(this).H();
        }
    }

    public final void H1() {
        this.b = true;
        u.a(this);
    }

    public final void I1(e.b bVar) {
        if (isAttached()) {
            J1();
        }
        this.a = bVar;
        setKindSet$ui_release(h0.f(bVar));
        if (isAttached()) {
            G1(false);
        }
    }

    public void J0(I0.q qVar, I0.s sVar, long j) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((I0.J) bVar).e().e(qVar, sVar, j);
    }

    public final void J1() {
        if (!isAttached()) {
            L0.a.b("unInitializeModifier called on unattached node");
        }
        e.b bVar = this.a;
        if ((g0.a(32) & getKindSet$ui_release()) != 0) {
            if (bVar instanceof N0.j) {
                k.o(this).getModifierLocalManager().d(this, ((N0.j) bVar).getKey());
            }
            if (bVar instanceof N0.d) {
                ((N0.d) bVar).a(d.a());
            }
        }
        if ((g0.a(8) & getKindSet$ui_release()) != 0) {
            k.o(this).H();
        }
    }

    public final void K1() {
        if (isAttached()) {
            this.d.clear();
            k.o(this).getSnapshotObserver().i(this, d.b(), new b());
        }
    }

    public final void L1(N0.j jVar) {
        N0.a aVar = this.c;
        if (aVar != null && aVar.a(jVar.getKey())) {
            aVar.c(jVar);
            k.o(this).getModifierLocalManager().f(this, jVar.getKey());
        } else {
            this.c = new N0.a(jVar);
            if (d.c(this)) {
                k.o(this).getModifierLocalManager().a(this, jVar.getKey());
            }
        }
    }

    public boolean N0() {
        return isAttached();
    }

    public void P0(androidx.compose.ui.focus.h hVar) {
        e.b bVar = this.a;
        L0.a.b("applyFocusProperties called on wrong node");
        android.support.v4.media.session.b.a(bVar);
        new t0.j(hVar);
        throw null;
    }

    public void U0() {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((I0.J) bVar).e().d();
    }

    public boolean Z() {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((I0.J) bVar).e().a();
    }

    public N0.g b0() {
        N0.a aVar = this.c;
        return aVar != null ? aVar : N0.i.a();
    }

    public void draw(x0.c cVar) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((s0.j) bVar).draw(cVar);
    }

    public long e() {
        return n1.s.d(k.i(this, g0.a(128)).a());
    }

    public void g(M0.p pVar) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((M0.F) bVar).g(pVar);
    }

    public void g1(W0.D d) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        W0.m c = ((W0.r) bVar).c();
        kotlin.jvm.internal.t.e(d, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((W0.m) d).b(c);
    }

    public n1.d getDensity() {
        return k.n(this).R();
    }

    public n1.t getLayoutDirection() {
        return k.n(this).getLayoutDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Object j(N0.c cVar) {
        c0 s0;
        this.d.add(cVar);
        int a2 = g0.a(32);
        if (!getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = getNode().getParent$ui_release();
        J n = k.n(this);
        while (n != null) {
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                        m mVar = parent$ui_release;
                        ?? r5 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof N0.h) {
                                N0.h hVar = (N0.h) mVar;
                                if (hVar.b0().a(cVar)) {
                                    return hVar.b0().b(cVar);
                                }
                            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof m)) {
                                e.c F1 = mVar.F1();
                                int i = 0;
                                mVar = mVar;
                                r5 = r5;
                                while (F1 != null) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            mVar = F1;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new d0.c(new e.c[16], 0);
                                            }
                                            if (mVar != 0) {
                                                r5.b(mVar);
                                                mVar = 0;
                                            }
                                            r5.b(F1);
                                        }
                                    }
                                    F1 = F1.getChild$ui_release();
                                    mVar = mVar;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            mVar = k.b(r5);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            n = n.z0();
            parent$ui_release = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
        }
        return cVar.a().invoke();
    }

    public void l0(M0.p pVar) {
        this.e = pVar;
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((M0.v) bVar).maxIntrinsicHeight(mVar, lVar, i);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((M0.v) bVar).maxIntrinsicWidth(mVar, lVar, i);
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((M0.v) bVar).measure-3p2s80s(lVar, a2, j);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((M0.v) bVar).minIntrinsicHeight(mVar, lVar, i);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((M0.v) bVar).minIntrinsicWidth(mVar, lVar, i);
    }

    public void onAttach() {
        G1(true);
    }

    public void onDensityChange() {
        if (this.a instanceof I0.J) {
            U0();
        }
    }

    public void onDetach() {
        J1();
    }

    public void onMeasureResultChanged() {
        this.b = true;
        u.a(this);
    }

    public Object p(n1.d dVar, Object obj) {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((M0.I) bVar).p(dVar, obj);
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean v1() {
        e.b bVar = this.a;
        kotlin.jvm.internal.t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((I0.J) bVar).e().c();
    }

    public void J(long j) {
    }
}
