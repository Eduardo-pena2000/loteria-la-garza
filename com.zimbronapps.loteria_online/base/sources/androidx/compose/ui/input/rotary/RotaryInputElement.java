package androidx.compose.ui.input.rotary;

import K0.b;
import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class RotaryInputElement extends Y {
    public final l b;
    public final l c;

    public RotaryInputElement(l lVar, l lVar2) {
        this.b = lVar;
        this.c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return this.b == rotaryInputElement.b && this.c == rotaryInputElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b bVar) {
        bVar.E1(this.b);
        bVar.F1(this.c);
    }

    public int hashCode() {
        l lVar = this.b;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l lVar2 = this.c;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public void inspectableProperties(N0 n0) {
        l lVar = this.b;
        if (lVar != null) {
            n0.d("onRotaryScrollEvent");
            n0.b().c("onRotaryScrollEvent", lVar);
        }
        l lVar2 = this.c;
        if (lVar2 != null) {
            n0.d("onPreRotaryScrollEvent");
            n0.b().c("onPreRotaryScrollEvent", lVar2);
        }
    }
}
