package androidx.compose.foundation;

import A.i0;
import C.n;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class ScrollSemanticsElement extends Y {
    public final f b;
    public final boolean c;
    public final n d;
    public final boolean e;
    public final boolean f;

    public ScrollSemanticsElement(f fVar, boolean z, n nVar, boolean z2, boolean z3) {
        this.b = fVar;
        this.c = z;
        this.d = nVar;
        this.e = z2;
        this.f = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return t.c(this.b, scrollSemanticsElement.b) && this.c == scrollSemanticsElement.c && t.c(this.d, scrollSemanticsElement.d) && this.e == scrollSemanticsElement.e && this.f == scrollSemanticsElement.f;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i0 create() {
        return new i0(this.b, this.c, this.d, this.e, this.f);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i0 i0Var) {
        i0Var.I1(this.b);
        i0Var.G1(this.c);
        i0Var.F1(this.d);
        i0Var.H1(this.e);
        i0Var.J1(this.f);
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31;
        n nVar = this.d;
        return ((((hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.b + ", reverseScrolling=" + this.c + ", flingBehavior=" + this.d + ", isScrollable=" + this.e + ", isVertical=" + this.f + ')';
    }

    public void inspectableProperties(N0 n0) {
    }
}
