package androidx.compose.ui.focus;

import Ca.I;
import O0.J;
import O0.Y;
import O0.c0;
import O0.g0;
import O0.j0;
import O0.k0;
import P0.N0;
import android.os.Trace;
import androidx.compose.ui.e;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class FocusTargetNode extends e.c implements O0.h, m, j0, N0.h {
    public final Qa.p a;
    public final Qa.l b;
    public boolean c;
    public boolean d;
    public t0.q e;
    public final boolean f;
    public int g;

    public static final class FocusTargetElement extends Y {
        public static final FocusTargetElement b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode create() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void update(FocusTargetNode focusTargetNode) {
        }

        public int hashCode() {
            return 1739042953;
        }

        public void inspectableProperties(N0 n0) {
            n0.d("focusTarget");
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[t0.b.values().length];
            try {
                iArr[t0.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.b.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t0.b.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[t0.q.values().length];
            try {
                iArr2[t0.q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t0.q.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[t0.q.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[t0.q.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ O a;
        public final /* synthetic */ FocusTargetNode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O o, FocusTargetNode focusTargetNode) {
            super(0);
            this.a = o;
            this.b = focusTargetNode;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.a = this.b.J1();
        }
    }

    public /* synthetic */ FocusTargetNode(int i, Qa.p pVar, Qa.l lVar, kotlin.jvm.internal.k kVar) {
        this(i, pVar, lVar);
    }

    public static final /* synthetic */ boolean E1(FocusTargetNode focusTargetNode) {
        return focusTargetNode.d;
    }

    public static final /* synthetic */ boolean F1(FocusTargetNode focusTargetNode) {
        return focusTargetNode.c;
    }

    public static final /* synthetic */ void G1(FocusTargetNode focusTargetNode, boolean z) {
        focusTargetNode.d = z;
    }

    public static final /* synthetic */ void H1(FocusTargetNode focusTargetNode, boolean z) {
        focusTargetNode.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void I1(t0.p pVar, t0.p pVar2) {
        c0 s0;
        Qa.p pVar3;
        t0.k focusOwner = O0.k.o(this).getFocusOwner();
        FocusTargetNode f = focusOwner.f();
        if (!t.c(pVar, pVar2) && (pVar3 = this.a) != null) {
            pVar3.invoke(pVar, pVar2);
        }
        int a2 = g0.a(4096);
        int a3 = g0.a(1024);
        e.c node = getNode();
        int i = a2 | a3;
        if (!getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c node2 = getNode();
        J n = O0.k.n(this);
        loop0: while (n != null) {
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & a3) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & a2) != 0) {
                            O0.m mVar = node2;
                            ?? r12 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof t0.e) {
                                    t0.e eVar = (t0.e) mVar;
                                    if (f == focusOwner.f()) {
                                        eVar.C0(pVar2);
                                    }
                                } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                                    e.c F1 = mVar.F1();
                                    int i2 = 0;
                                    mVar = mVar;
                                    r12 = r12;
                                    while (F1 != null) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i2++;
                                            r12 = r12;
                                            if (i2 == 1) {
                                                mVar = F1;
                                            } else {
                                                if (r12 == 0) {
                                                    r12 = new d0.c(new e.c[16], 0);
                                                }
                                                if (mVar != 0) {
                                                    r12.b(mVar);
                                                    mVar = 0;
                                                }
                                                r12.b(F1);
                                            }
                                        }
                                        F1 = F1.getChild$ui_release();
                                        mVar = mVar;
                                        r12 = r12;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mVar = O0.k.b(r12);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            n = n.z0();
            node2 = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
        }
        Qa.l lVar = this.b;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final h J1() {
        c0 s0;
        i iVar = new i();
        iVar.h(q.c(M1(), this));
        int a2 = g0.a(2048);
        int a3 = g0.a(1024);
        e.c node = getNode();
        int i = a2 | a3;
        if (!getNode().isAttached()) {
            L0.a.b("visitAncestors called on an unattached node");
        }
        e.c node2 = getNode();
        J n = O0.k.n(this);
        loop0: while (n != null) {
            if ((n.s0().k().getAggregateChildKindSet$ui_release() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & a3) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & a2) != 0) {
                            O0.m mVar = node2;
                            ?? r9 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof t0.l) {
                                    ((t0.l) mVar).P0(iVar);
                                } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                                    e.c F1 = mVar.F1();
                                    int i2 = 0;
                                    mVar = mVar;
                                    r9 = r9;
                                    while (F1 != null) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                mVar = F1;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new d0.c(new e.c[16], 0);
                                                }
                                                if (mVar != 0) {
                                                    r9.b(mVar);
                                                    mVar = 0;
                                                }
                                                r9.b(F1);
                                            }
                                        }
                                        F1 = F1.getChild$ui_release();
                                        mVar = mVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mVar = O0.k.b(r9);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            n = n.z0();
            node2 = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
        }
        return iVar;
    }

    public final M0.c K1() {
        return (M0.c) j(M0.d.a());
    }

    public t0.q L1() {
        c0 s0;
        if (!isAttached()) {
            return t0.q.d;
        }
        t0.k focusOwner = O0.k.o(this).getFocusOwner();
        FocusTargetNode f = focusOwner.f();
        if (f == null) {
            return t0.q.d;
        }
        if (this == f) {
            return focusOwner.k() ? t0.q.c : t0.q.a;
        }
        if (f.isAttached()) {
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
                            e.c cVar = parent$ui_release;
                            d0.c cVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVar)) {
                                        return t0.q.b;
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
        }
        return t0.q.d;
    }

    public int M1() {
        return this.g;
    }

    public final void N1() {
        h hVar;
        int i = a.b[L1().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new Ca.o();
            }
            return;
        }
        O o = new O();
        k0.a(this, new b(o, this));
        Object obj = o.a;
        if (obj == null) {
            t.v("focusProperties");
            hVar = null;
        } else {
            hVar = (h) obj;
        }
        if (hVar.i()) {
            return;
        }
        O0.k.o(this).getFocusOwner().v(true);
    }

    public boolean getShouldAutoInvalidate() {
        return this.f;
    }

    public void onDetach() {
        int i = a.b[L1().ordinal()];
        if (i == 1 || i == 2) {
            t0.k focusOwner = O0.k.o(this).getFocusOwner();
            focusOwner.m(true, true, false, c.b.c());
            focusOwner.h();
        } else if (i != 3 && i != 4) {
            throw new Ca.o();
        }
        this.e = null;
    }

    public void onReset() {
        if (o0.h.i && L1().a()) {
            O0.k.o(this).getFocusOwner().m(true, true, true, c.b.c());
        }
    }

    public boolean q(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z = false;
            if (!J1().i()) {
                Trace.endSection();
                return false;
            }
            int i2 = a.a[o.h(this, i).ordinal()];
            if (i2 == 1) {
                z = o.i(this);
            } else if (i2 == 2) {
                z = true;
            } else if (i2 != 3 && i2 != 4) {
                throw new Ca.o();
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    public void q0() {
        N1();
    }

    public /* synthetic */ FocusTargetNode(int i, Qa.p pVar, Qa.l lVar, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? q.a.a() : i, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : lVar, null);
    }

    public FocusTargetNode(int i, Qa.p pVar, Qa.l lVar) {
        this.a = pVar;
        this.b = lVar;
        this.g = i;
    }
}
