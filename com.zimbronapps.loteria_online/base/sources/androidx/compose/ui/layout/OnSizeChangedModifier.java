package androidx.compose.ui.layout;

import M0.H;
import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class OnSizeChangedModifier extends Y {
    public final Qa.l b;

    public OnSizeChangedModifier(Qa.l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.b == ((OnSizeChangedModifier) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public H create() {
        return new H(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(H h) {
        h.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("onSizeChanged");
        n0.b().c("onSizeChanged", this.b);
    }
}
