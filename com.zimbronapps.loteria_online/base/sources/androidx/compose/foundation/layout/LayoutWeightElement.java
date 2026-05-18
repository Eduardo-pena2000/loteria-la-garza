package androidx.compose.foundation.layout;

import F.H;
import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class LayoutWeightElement extends Y {
    public final float b;
    public final boolean c;

    public LayoutWeightElement(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.b == layoutWeightElement.b && this.c == layoutWeightElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public H create() {
        return new H(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(H h) {
        h.G1(this.b);
        h.F1(this.c);
    }

    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("weight");
        n0.e(Float.valueOf(this.b));
        n0.b().c("weight", Float.valueOf(this.b));
        n0.b().c("fill", Boolean.valueOf(this.c));
    }
}
