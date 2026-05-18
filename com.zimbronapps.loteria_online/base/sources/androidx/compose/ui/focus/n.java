package androidx.compose.ui.focus;

import Ca.I;
import t0.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.l {
        public a(Object obj) {
            super(1, obj, t.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        public final void b(FocusTargetNode focusTargetNode) {
            ((t) ((kotlin.jvm.internal.f) this).receiver).a(focusTargetNode);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FocusTargetNode) obj);
            return I.a;
        }
    }

    public static final /* synthetic */ m a() {
        return new FocusTargetNode(0, null, new a(t.a), 3, null);
    }
}
