package androidx.compose.foundation.layout;

import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class AspectRatioElement extends Y {
    public final float b;
    public final boolean c;
    public final l d;

    public AspectRatioElement(float f, boolean z, l lVar) {
        this.b = f;
        this.c = z;
        this.d = lVar;
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return this.b == aspectRatioElement.b && this.c == ((AspectRatioElement) obj).c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public F.d create() {
        return new F.d(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(F.d dVar) {
        dVar.F1(this.b);
        dVar.G1(this.c);
    }

    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        this.d.invoke(n0);
    }
}
