package androidx.compose.ui.layout;

import M0.G;
import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class OnGloballyPositionedElement extends Y {
    public final Qa.l b;

    public OnGloballyPositionedElement(Qa.l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.b == ((OnGloballyPositionedElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public G create() {
        return new G(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(G g) {
        g.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("onGloballyPositioned");
        n0.b().c("onGloballyPositioned", this.b);
    }
}
