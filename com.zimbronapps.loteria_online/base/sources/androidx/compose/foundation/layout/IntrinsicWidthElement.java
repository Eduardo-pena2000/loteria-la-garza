package androidx.compose.foundation.layout;

import F.E;
import F.G;
import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class IntrinsicWidthElement extends Y {
    public final E b;
    public final boolean c;
    public final l d;

    public IntrinsicWidthElement(E e, boolean z, l lVar) {
        this.b = e;
        this.c = z;
        this.d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.b == intrinsicWidthElement.b && this.c == intrinsicWidthElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public G create() {
        return new G(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(G g) {
        g.H1(this.b);
        g.G1(this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        this.d.invoke(n0);
    }
}
