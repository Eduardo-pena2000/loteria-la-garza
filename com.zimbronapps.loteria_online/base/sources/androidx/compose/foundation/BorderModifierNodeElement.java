package androidx.compose.foundation;

import O0.Y;
import P0.N0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;
import v0.E1;
import v0.F1;
import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class BorderModifierNodeElement extends Y {
    public final float b;
    public final h0 c;
    public final E1 d;

    public /* synthetic */ BorderModifierNodeElement(float f, h0 h0Var, E1 e1, k kVar) {
        this(f, h0Var, e1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return h.i(this.b, borderModifierNodeElement.b) && t.c(this.c, borderModifierNodeElement.c) && t.c(this.d, borderModifierNodeElement.d);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public A.h create() {
        return new A.h(this.b, this.c, this.d, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(A.h hVar) {
        hVar.S1(this.b);
        hVar.R1(this.c);
        hVar.i1(this.d);
    }

    public int hashCode() {
        return (((h.k(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("border");
        n0.b().c("width", h.d(this.b));
        if (this.c instanceof F1) {
            n0.b().c("color", r0.m(((F1) this.c).a()));
            n0.e(r0.m(((F1) this.c).a()));
        } else {
            n0.b().c("brush", this.c);
        }
        n0.b().c("shape", this.d);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + h.l(this.b) + ", brush=" + this.c + ", shape=" + this.d + ')';
    }

    public BorderModifierNodeElement(float f, h0 h0Var, E1 e1) {
        this.b = f;
        this.c = h0Var;
        this.d = e1;
    }
}
