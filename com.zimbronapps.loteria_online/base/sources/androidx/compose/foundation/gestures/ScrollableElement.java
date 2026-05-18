package androidx.compose.foundation.gestures;

import A.b0;
import C.n;
import C.q;
import C.y;
import E.m;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class ScrollableElement extends Y {
    public final y b;
    public final q c;
    public final b0 d;
    public final boolean e;
    public final boolean f;
    public final n g;
    public final m h;
    public final C.d i;

    public ScrollableElement(y yVar, q qVar, b0 b0Var, boolean z, boolean z2, n nVar, m mVar, C.d dVar) {
        this.b = yVar;
        this.c = qVar;
        this.d = b0Var;
        this.e = z;
        this.f = z2;
        this.g = nVar;
        this.h = mVar;
        this.i = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return t.c(this.b, scrollableElement.b) && this.c == scrollableElement.c && t.c(this.d, scrollableElement.d) && this.e == scrollableElement.e && this.f == scrollableElement.f && t.c(this.g, scrollableElement.g) && t.c(this.h, scrollableElement.h) && t.c(this.i, scrollableElement.i);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e create() {
        return new e(this.b, this.d, this.g, this.c, this.e, this.f, this.h, this.i);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(e eVar) {
        eVar.l2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
        b0 b0Var = this.d;
        int hashCode2 = (((((hashCode + (b0Var != null ? b0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31;
        n nVar = this.g;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        m mVar = this.h;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C.d dVar = this.i;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("scrollable");
        n0.b().c("orientation", this.c);
        n0.b().c("state", this.b);
        n0.b().c("overscrollEffect", this.d);
        n0.b().c("enabled", Boolean.valueOf(this.e));
        n0.b().c("reverseDirection", Boolean.valueOf(this.f));
        n0.b().c("flingBehavior", this.g);
        n0.b().c("interactionSource", this.h);
        n0.b().c("bringIntoViewSpec", this.i);
    }
}
