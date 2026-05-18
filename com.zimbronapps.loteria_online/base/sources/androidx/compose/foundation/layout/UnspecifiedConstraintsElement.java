package androidx.compose.foundation.layout;

import F.b0;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.k;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class UnspecifiedConstraintsElement extends Y {
    public final float b;
    public final float c;

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, k kVar) {
        this(f, f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return h.i(this.b, unspecifiedConstraintsElement.b) && h.i(this.c, unspecifiedConstraintsElement.c);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b0 create() {
        return new b0(this.b, this.c, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b0 b0Var) {
        b0Var.F1(this.b);
        b0Var.E1(this.c);
    }

    public int hashCode() {
        return (h.k(this.b) * 31) + h.k(this.c);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("defaultMinSize");
        n0.b().c("minWidth", h.d(this.b));
        n0.b().c("minHeight", h.d(this.c));
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.b = f;
        this.c = f2;
    }
}
