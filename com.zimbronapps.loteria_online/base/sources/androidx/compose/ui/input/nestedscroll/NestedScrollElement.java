package androidx.compose.ui.input.nestedscroll;

import H0.b;
import H0.c;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class NestedScrollElement extends Y {
    public final H0.a b;
    public final b c;

    public NestedScrollElement(H0.a aVar, b bVar) {
        this.b = aVar;
        this.c = bVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return t.c(nestedScrollElement.b, this.b) && t.c(nestedScrollElement.c, this.c);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c cVar) {
        cVar.L1(this.b, this.c);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        b bVar = this.c;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("nestedScroll");
        n0.b().c("connection", this.b);
        n0.b().c("dispatcher", this.c);
    }
}
