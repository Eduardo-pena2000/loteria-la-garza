package androidx.compose.ui.input.pointer;

import I0.w;
import I0.x;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class PointerHoverIconModifierElement extends Y {
    public final x b;
    public final boolean c;

    public PointerHoverIconModifierElement(x xVar, boolean z) {
        this.b = xVar;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return t.c(this.b, pointerHoverIconModifierElement.b) && this.c == pointerHoverIconModifierElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public w create() {
        return new w(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(w wVar) {
        wVar.R1(this.b);
        wVar.S1(this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("pointerHoverIcon");
        n0.b().c("icon", this.b);
        n0.b().c("overrideDescendants", Boolean.valueOf(this.c));
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=" + this.c + ')';
    }
}
