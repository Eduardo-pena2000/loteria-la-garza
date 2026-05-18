package androidx.compose.ui.focus;

import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class FocusChangedElement extends Y {
    public final Qa.l b;

    public FocusChangedElement(Qa.l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && this.b == ((FocusChangedElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t0.c create() {
        return new t0.c(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(t0.c cVar) {
        cVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("onFocusChanged");
        n0.b().c("onFocusChanged", this.b);
    }
}
