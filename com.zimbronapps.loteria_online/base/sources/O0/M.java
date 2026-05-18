package O0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m extends e.c {
    public final int a = h0.g(this);
    public e.c b;

    public final j E1(j jVar) {
        e.c node = jVar.getNode();
        if (node != jVar) {
            e.c cVar = jVar instanceof e.c ? (e.c) jVar : null;
            e.c parent$ui_release = cVar != null ? cVar.getParent$ui_release() : null;
            if (node == getNode() && kotlin.jvm.internal.t.c(parent$ui_release, this)) {
                return jVar;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.isAttached()) {
            L0.a.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int h = h0.h(node);
        node.setKindSet$ui_release(h);
        J1(h, node);
        node.setChild$ui_release(this.b);
        this.b = node;
        node.setParent$ui_release(this);
        I1(getKindSet$ui_release() | h, false);
        if (isAttached()) {
            if ((h & g0.a(2)) == 0 || (kindSet$ui_release & g0.a(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                c0 s0 = k.n(this).s0();
                getNode().updateCoordinator$ui_release(null);
                s0.C();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            h0.a(node);
        }
        return jVar;
    }

    public final e.c F1() {
        return this.b;
    }

    public final int G1() {
        return this.a;
    }

    public final void H1(j jVar) {
        e.c cVar = null;
        for (e.c cVar2 = this.b; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
            if (cVar2 == jVar) {
                if (cVar2.isAttached()) {
                    h0.d(cVar2);
                    cVar2.runDetachLifecycle$ui_release();
                    cVar2.markAsDetached$ui_release();
                }
                cVar2.setAsDelegateTo$ui_release(cVar2);
                cVar2.setAggregateChildKindSet$ui_release(0);
                if (cVar == null) {
                    this.b = cVar2.getChild$ui_release();
                } else {
                    cVar.setChild$ui_release(cVar2.getChild$ui_release());
                }
                cVar2.setChild$ui_release(null);
                cVar2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int h = h0.h(this);
                I1(h, true);
                if (isAttached() && (kindSet$ui_release & g0.a(2)) != 0 && (g0.a(2) & h) == 0) {
                    c0 s0 = k.n(this).s0();
                    getNode().updateCoordinator$ui_release(null);
                    s0.C();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }

    public final void I1(int i, boolean z) {
        e.c child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i);
        if (kindSet$ui_release != i) {
            if (k.g(this)) {
                setAggregateChildKindSet$ui_release(i);
            }
            if (isAttached()) {
                e.c node = getNode();
                e.c cVar = this;
                while (cVar != null) {
                    i |= cVar.getKindSet$ui_release();
                    cVar.setKindSet$ui_release(i);
                    if (cVar == node) {
                        break;
                    } else {
                        cVar = cVar.getParent$ui_release();
                    }
                }
                if (z && cVar == node) {
                    i = h0.h(node);
                    node.setKindSet$ui_release(i);
                }
                int aggregateChildKindSet$ui_release = i | ((cVar == null || (child$ui_release = cVar.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (cVar != null) {
                    aggregateChildKindSet$ui_release |= cVar.getKindSet$ui_release();
                    cVar.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    cVar = cVar.getParent$ui_release();
                }
            }
        }
    }

    public final void J1(int i, e.c cVar) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i & g0.a(2)) == 0 || (g0.a(2) & kindSet$ui_release) == 0 || (this instanceof E)) {
            return;
        }
        L0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
    }

    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!F1.isAttached()) {
                F1.markAsAttached$ui_release();
            }
        }
    }

    public void markAsDetached$ui_release() {
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    public void reset$ui_release() {
        super.reset$ui_release();
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.reset$ui_release();
        }
    }

    public void runAttachLifecycle$ui_release() {
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.runDetachLifecycle$ui_release();
        }
    }

    public void setAsDelegateTo$ui_release(e.c cVar) {
        super.setAsDelegateTo$ui_release(cVar);
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.setAsDelegateTo$ui_release(cVar);
        }
    }

    public void updateCoordinator$ui_release(e0 e0Var) {
        super.updateCoordinator$ui_release(e0Var);
        for (e.c F1 = F1(); F1 != null; F1 = F1.getChild$ui_release()) {
            F1.updateCoordinator$ui_release(e0Var);
        }
    }
}
