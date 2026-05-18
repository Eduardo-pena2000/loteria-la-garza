package androidx.compose.ui;

import O0.e0;
import O0.j;
import O0.k;
import O0.l0;
import Qa.l;
import Qa.p;
import cb.B0;
import cb.E0;
import cb.O;
import cb.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface e {
    public static final a a = a.b;

    public interface b extends e {
        default boolean all(l lVar) {
            return ((Boolean) lVar.invoke(this)).booleanValue();
        }

        default boolean any(l lVar) {
            return ((Boolean) lVar.invoke(this)).booleanValue();
        }

        default Object foldIn(Object obj, p pVar) {
            return pVar.invoke(obj, this);
        }

        default Object foldOut(Object obj, p pVar) {
            return pVar.invoke(this, obj);
        }
    }

    public static abstract class c implements j {
        public static final int $stable = 8;
        private c child;
        private e0 coordinator;
        private Qa.a detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private l0 ownerScope;
        private c parent;
        private O scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private c node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        public final c getChild$ui_release() {
            return this.child;
        }

        public final e0 getCoordinator$ui_release() {
            return this.coordinator;
        }

        public final O getCoroutineScope() {
            O o = this.scope;
            if (o != null) {
                return o;
            }
            O a = P.a(k.o(this).getCoroutineContext().plus(E0.a(k.o(this).getCoroutineContext().get(B0.P8))));
            this.scope = a;
            return a;
        }

        public final Qa.a getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        public final c getNode() {
            return this.node;
        }

        public final l0 getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        public final c getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        public final boolean isKind-H91voCI$ui_release(int i) {
            return (i & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                L0.a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                L0.a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                L0.a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                L0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                L0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            O o = this.scope;
            if (o != null) {
                P.c(o, new o0.j());
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                L0.a.b("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                L0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                L0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                L0.a.b("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                L0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                L0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Qa.a aVar = this.detachedListener;
            if (aVar != null) {
                aVar.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui_release(c cVar) {
            this.node = cVar;
        }

        public final void setChild$ui_release(c cVar) {
            this.child = cVar;
        }

        public final void setDetachedListener$ui_release(Qa.a aVar) {
            this.detachedListener = aVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui_release(l0 l0Var) {
            this.ownerScope = l0Var;
        }

        public final void setParent$ui_release(c cVar) {
            this.parent = cVar;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(Qa.a aVar) {
            k.o(this).i(aVar);
        }

        public void updateCoordinator$ui_release(e0 e0Var) {
            this.coordinator = e0Var;
        }
    }

    boolean all(l lVar);

    Object foldIn(Object obj, p pVar);

    default e then(e eVar) {
        return eVar == a ? this : new androidx.compose.ui.a(this, eVar);
    }

    public static final class a implements e {
        public static final /* synthetic */ a b = new a();

        public boolean all(l lVar) {
            return true;
        }

        public e then(e eVar) {
            return eVar;
        }

        public String toString() {
            return "Modifier";
        }

        public Object foldIn(Object obj, p pVar) {
            return obj;
        }
    }
}
