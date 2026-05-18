package androidx.compose.foundation.layout;

import F.C;
import F.E;
import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class IntrinsicHeightElement extends Y {
    public final E b;
    public final boolean c;
    public final l d;

    public IntrinsicHeightElement(E e, boolean z, l lVar) {
        this.b = e;
        this.c = z;
        this.d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.b == intrinsicHeightElement.b && this.c == intrinsicHeightElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C create() {
        return new C(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C c) {
        c.H1(this.b);
        c.G1(this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        this.d.invoke(n0);
    }
}
