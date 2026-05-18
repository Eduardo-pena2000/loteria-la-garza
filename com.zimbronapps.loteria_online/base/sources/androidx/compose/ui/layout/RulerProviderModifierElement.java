package androidx.compose.ui.layout;

import O0.Y;
import android.annotation.SuppressLint;

@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class RulerProviderModifierElement extends Y {
    public final f b;

    public RulerProviderModifierElement(f fVar) {
        this.b = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.b : null) == this.b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x create() {
        return new x(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(x xVar) {
        xVar.I1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
