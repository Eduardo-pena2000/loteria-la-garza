package androidx.compose.ui.focus;

import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class FocusOwnerImpl$modifier$1 extends Y {
    public final /* synthetic */ FocusOwnerImpl b;

    public FocusOwnerImpl$modifier$1(FocusOwnerImpl focusOwnerImpl) {
        this.b = focusOwnerImpl;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FocusTargetNode create() {
        return this.b.y();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(FocusTargetNode focusTargetNode) {
    }

    public int hashCode() {
        return this.b.y().hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("RootFocusTarget");
    }
}
