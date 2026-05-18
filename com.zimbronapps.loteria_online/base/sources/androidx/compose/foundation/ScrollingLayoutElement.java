package androidx.compose.foundation;

import A.k0;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ScrollingLayoutElement extends Y {
    public final f b;
    public final boolean c;
    public final boolean d;

    public ScrollingLayoutElement(f fVar, boolean z, boolean z2) {
        this.b = fVar;
        this.c = z;
        this.d = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return t.c(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c && this.d == scrollingLayoutElement.d;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k0 create() {
        return new k0(this.b, this.c, this.d);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(k0 k0Var) {
        k0Var.I1(this.b);
        k0Var.H1(this.c);
        k0Var.J1(this.d);
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("layoutInScroll");
        n0.b().c("state", this.b);
        n0.b().c("isReversed", Boolean.valueOf(this.c));
        n0.b().c("isVertical", Boolean.valueOf(this.d));
    }
}
