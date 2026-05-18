package androidx.compose.ui.focus;

import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class FocusRequesterElement extends Y {
    public final j b;

    public FocusRequesterElement(j jVar) {
        this.b = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && t.c(this.b, ((FocusRequesterElement) obj).b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t0.o create() {
        return new t0.o(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(t0.o oVar) {
        oVar.E1().e().s(oVar);
        oVar.F1(this.b);
        oVar.E1().e().b(oVar);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("focusRequester");
        n0.b().c("focusRequester", this.b);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }
}
