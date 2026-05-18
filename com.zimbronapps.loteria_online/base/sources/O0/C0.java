package O0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c0 {
    public final J a;
    public final c b;
    public final y c;
    public e0 d;
    public final e.c e;
    public e.c f;
    public d0.c g;
    public d0.c h;
    public final d0.c i;
    public a j;

    public final class a implements q {
        public e.c a;
        public int b;
        public d0.c c;
        public d0.c d;
        public boolean e;

        public a(e.c cVar, int i, d0.c cVar2, d0.c cVar3, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = cVar2;
            this.d = cVar3;
            this.e = z;
        }

        public final void a(d0.c cVar) {
            this.d = cVar;
        }

        public void b(int i, int i2) {
            e.c child$ui_release = this.a.getChild$ui_release();
            kotlin.jvm.internal.t.d(child$ui_release);
            c0.d(c0.this);
            if ((g0.a(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                e0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                kotlin.jvm.internal.t.d(coordinator$ui_release);
                e0 P2 = coordinator$ui_release.P2();
                e0 O2 = coordinator$ui_release.O2();
                kotlin.jvm.internal.t.d(O2);
                if (P2 != null) {
                    P2.v3(O2);
                }
                O2.w3(P2);
                c0.e(c0.this, this.a, O2);
            }
            this.a = c0.b(c0.this, child$ui_release);
        }

        public boolean c(int i, int i2) {
            d0.c cVar = this.c;
            int i3 = this.b;
            return d0.c((e.b) cVar.a[i + i3], (e.b) this.d.a[i3 + i2]) != 0;
        }

        public void d(int i) {
            int i2 = this.b + i;
            this.a = c0.a(c0.this, (e.b) this.d.a[i2], this.a);
            c0.d(c0.this);
            if (!this.e) {
                this.a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            e.c child$ui_release = this.a.getChild$ui_release();
            kotlin.jvm.internal.t.d(child$ui_release);
            e0 coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            kotlin.jvm.internal.t.d(coordinator$ui_release);
            E d = k.d(this.a);
            if (d != null) {
                F f = new F(c0.this.m(), d);
                this.a.updateCoordinator$ui_release(f);
                c0.e(c0.this, this.a, f);
                f.w3(coordinator$ui_release.P2());
                f.v3(coordinator$ui_release);
                coordinator$ui_release.w3(f);
            } else {
                this.a.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.a.markAsAttached$ui_release();
            this.a.runAttachLifecycle$ui_release();
            h0.a(this.a);
        }

        public void e(int i, int i2) {
            e.c child$ui_release = this.a.getChild$ui_release();
            kotlin.jvm.internal.t.d(child$ui_release);
            this.a = child$ui_release;
            d0.c cVar = this.c;
            int i3 = this.b;
            e.b bVar = (e.b) cVar.a[i + i3];
            e.b bVar2 = (e.b) this.d.a[i3 + i2];
            if (kotlin.jvm.internal.t.c(bVar, bVar2)) {
                c0.d(c0.this);
            } else {
                c0.f(c0.this, bVar, bVar2, this.a);
                c0.d(c0.this);
            }
        }

        public final void f(d0.c cVar) {
            this.c = cVar;
        }

        public final void g(e.c cVar) {
            this.a = cVar;
        }

        public final void h(int i) {
            this.b = i;
        }

        public final void i(boolean z) {
            this.e = z;
        }
    }

    public interface b {
    }

    public static final class c extends e.c {
        public String toString() {
            return "<Head>";
        }
    }

    public c0(J j) {
        this.a = j;
        c cVar = new c();
        cVar.setAggregateChildKindSet$ui_release(-1);
        this.b = cVar;
        y yVar = new y(j);
        this.c = yVar;
        this.d = yVar;
        E0 K3 = yVar.K3();
        this.e = K3;
        this.f = K3;
        this.i = new d0.c(new androidx.compose.ui.e[16], 0);
    }

    public static final /* synthetic */ e.c a(c0 c0Var, e.b bVar, e.c cVar) {
        return c0Var.g(bVar, cVar);
    }

    public static final /* synthetic */ e.c b(c0 c0Var, e.c cVar) {
        return c0Var.h(cVar);
    }

    public static final /* synthetic */ int c(c0 c0Var) {
        return c0Var.i();
    }

    public static final /* synthetic */ b d(c0 c0Var) {
        c0Var.getClass();
        return null;
    }

    public static final /* synthetic */ void e(c0 c0Var, e.c cVar, e0 e0Var) {
        c0Var.v(cVar, e0Var);
    }

    public static final /* synthetic */ void f(c0 c0Var, e.b bVar, e.b bVar2, e.c cVar) {
        c0Var.F(bVar, bVar2, cVar);
    }

    public final void A(int i, d0.c cVar, d0.c cVar2, e.c cVar3, boolean z) {
        b0.e(cVar.m() - i, cVar2.m() - i, j(cVar3, i, cVar, cVar2, z));
        B();
    }

    public final void B() {
        int i = 0;
        for (e.c parent$ui_release = this.e.getParent$ui_release(); parent$ui_release != null && parent$ui_release != this.b; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            i |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(i);
        }
    }

    public final void C() {
        e0 f;
        e0 e0Var = this.c;
        for (e.c parent$ui_release = this.e.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            E d = k.d(parent$ui_release);
            if (d != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    e0 coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    kotlin.jvm.internal.t.e(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    f = (F) coordinator$ui_release;
                    E L3 = f.L3();
                    f.O3(d);
                    if (L3 != parent$ui_release) {
                        f.e3();
                    }
                } else {
                    f = new F(this.a, d);
                    parent$ui_release.updateCoordinator$ui_release(f);
                }
                e0Var.w3(f);
                f.v3(e0Var);
                e0Var = f;
            } else {
                parent$ui_release.updateCoordinator$ui_release(e0Var);
            }
        }
        J z0 = this.a.z0();
        e0Var.w3(z0 != null ? z0.X() : null);
        this.d = e0Var;
    }

    public final e.c D(e.c cVar) {
        if (!(cVar == this.b)) {
            L0.a.b("trimChain called on already trimmed chain");
        }
        e.c child$ui_release = this.b.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.e;
        }
        child$ui_release.setParent$ui_release(null);
        this.b.setChild$ui_release(null);
        this.b.setAggregateChildKindSet$ui_release(-1);
        this.b.updateCoordinator$ui_release(null);
        if (!(child$ui_release != this.b)) {
            L0.a.b("trimChain did not update the head");
        }
        return child$ui_release;
    }

    public final void E(androidx.compose.ui.e eVar) {
        e.c u = u();
        d0.c cVar = this.g;
        int i = 0;
        int m = cVar != null ? cVar.m() : 0;
        d0.c cVar2 = this.h;
        if (cVar2 == null) {
            cVar2 = new d0.c(new e.b[16], 0);
        }
        d0.c a2 = d0.a(eVar, cVar2, this.i);
        d0.c cVar3 = null;
        if (a2.m() == m) {
            e.c child$ui_release = u.getChild$ui_release();
            int i2 = 0;
            while (true) {
                if (child$ui_release == null || i2 >= m) {
                    break;
                }
                if (cVar == null) {
                    L0.a.c("expected prior modifier list to be non-empty");
                    throw new Ca.i();
                }
                e.b bVar = (e.b) cVar.a[i2];
                e.b bVar2 = (e.b) a2.a[i2];
                int c2 = d0.c(bVar, bVar2);
                if (c2 == 0) {
                    child$ui_release = child$ui_release.getParent$ui_release();
                    break;
                }
                if (c2 == 1) {
                    F(bVar, bVar2, child$ui_release);
                }
                child$ui_release = child$ui_release.getChild$ui_release();
                i2++;
            }
            e.c cVar4 = child$ui_release;
            if (i2 < m) {
                if (cVar == null) {
                    L0.a.c("expected prior modifier list to be non-empty");
                    throw new Ca.i();
                }
                if (cVar4 == null) {
                    L0.a.c("structuralUpdate requires a non-null tail");
                    throw new Ca.i();
                }
                A(i2, cVar, a2, cVar4, !this.a.L());
                i = 1;
            }
        } else {
            if (this.a.L() && m == 0) {
                e.c cVar5 = u;
                while (i < a2.m()) {
                    cVar5 = g((e.b) a2.a[i], cVar5);
                    i++;
                }
                B();
            } else if (a2.m() != 0) {
                if (cVar == null) {
                    cVar = new d0.c(new e.b[16], 0);
                }
                A(0, cVar, a2, u, !this.a.L());
            } else {
                if (cVar == null) {
                    L0.a.c("expected prior modifier list to be non-empty");
                    throw new Ca.i();
                }
                e.c child$ui_release2 = u.getChild$ui_release();
                for (int i3 = 0; child$ui_release2 != null && i3 < cVar.m(); i3++) {
                    child$ui_release2 = h(child$ui_release2).getChild$ui_release();
                }
                y yVar = this.c;
                J z0 = this.a.z0();
                yVar.w3(z0 != null ? z0.X() : null);
                this.d = this.c;
            }
            i = 1;
        }
        this.g = a2;
        if (cVar != null) {
            cVar.h();
            cVar3 = cVar;
        }
        this.h = cVar3;
        this.f = D(u);
        if (i != 0) {
            C();
        }
    }

    public final void F(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof Y) && (bVar2 instanceof Y)) {
            d0.b((Y) bVar2, cVar);
            if (cVar.isAttached()) {
                h0.e(cVar);
                return;
            } else {
                cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(cVar instanceof O0.c)) {
            L0.a.b("Unknown Modifier.Node type");
            return;
        }
        ((O0.c) cVar).I1(bVar2);
        if (cVar.isAttached()) {
            h0.e(cVar);
        } else {
            cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    public final e.c g(e.b bVar, e.c cVar) {
        e.c cVar2;
        if (bVar instanceof Y) {
            cVar2 = ((Y) bVar).create();
            cVar2.setKindSet$ui_release(h0.h(cVar2));
        } else {
            cVar2 = new O0.c(bVar);
        }
        if (cVar2.isAttached()) {
            L0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar2.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return q(cVar2, cVar);
    }

    public final e.c h(e.c cVar) {
        if (cVar.isAttached()) {
            h0.d(cVar);
            cVar.runDetachLifecycle$ui_release();
            cVar.markAsDetached$ui_release();
        }
        return w(cVar);
    }

    public final int i() {
        return this.f.getAggregateChildKindSet$ui_release();
    }

    public final a j(e.c cVar, int i, d0.c cVar2, d0.c cVar3, boolean z) {
        a aVar = this.j;
        if (aVar == null) {
            a aVar2 = new a(cVar, i, cVar2, cVar3, z);
            this.j = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i);
        aVar.f(cVar2);
        aVar.a(cVar3);
        aVar.i(z);
        return aVar;
    }

    public final e.c k() {
        return this.f;
    }

    public final y l() {
        return this.c;
    }

    public final J m() {
        return this.a;
    }

    public final e0 n() {
        return this.d;
    }

    public final e.c o() {
        return this.e;
    }

    public final boolean p(int i) {
        return (i & i()) != 0;
    }

    public final e.c q(e.c cVar, e.c cVar2) {
        e.c child$ui_release = cVar2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(cVar);
            cVar.setChild$ui_release(child$ui_release);
        }
        cVar2.setChild$ui_release(cVar);
        cVar.setParent$ui_release(cVar2);
        return cVar;
    }

    public final boolean r() {
        return this.b.getChild$ui_release() != null;
    }

    public final void s() {
        for (e.c k = k(); k != null; k = k.getChild$ui_release()) {
            k.markAsAttached$ui_release();
        }
    }

    public final void t() {
        for (e.c o = o(); o != null; o = o.getParent$ui_release()) {
            if (o.isAttached()) {
                o.markAsDetached$ui_release();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f != this.e) {
            e.c k = k();
            while (true) {
                if (k == null || k == o()) {
                    break;
                }
                sb.append(String.valueOf(k));
                if (k.getChild$ui_release() == this.e) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                k = k.getChild$ui_release();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "toString(...)");
        return sb2;
    }

    public final e.c u() {
        if (!(this.f != this.b)) {
            L0.a.b("padChain called on already padded chain");
        }
        e.c cVar = this.f;
        cVar.setParent$ui_release(this.b);
        this.b.setChild$ui_release(cVar);
        return this.b;
    }

    public final void v(e.c cVar, e0 e0Var) {
        for (e.c parent$ui_release = cVar.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == this.b) {
                J z0 = this.a.z0();
                e0Var.w3(z0 != null ? z0.X() : null);
                this.d = e0Var;
                return;
            } else {
                if ((g0.a(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(e0Var);
            }
        }
    }

    public final e.c w(e.c cVar) {
        e.c child$ui_release = cVar.getChild$ui_release();
        e.c parent$ui_release = cVar.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            cVar.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            cVar.setParent$ui_release(null);
        }
        kotlin.jvm.internal.t.d(parent$ui_release);
        return parent$ui_release;
    }

    public final void x() {
        for (e.c o = o(); o != null; o = o.getParent$ui_release()) {
            if (o.isAttached()) {
                o.reset$ui_release();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (e.c k = k(); k != null; k = k.getChild$ui_release()) {
            k.runAttachLifecycle$ui_release();
            if (k.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                h0.a(k);
            }
            if (k.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                h0.e(k);
            }
            k.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            k.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void z() {
        for (e.c o = o(); o != null; o = o.getParent$ui_release()) {
            if (o.isAttached()) {
                o.runDetachLifecycle$ui_release();
            }
        }
    }
}
