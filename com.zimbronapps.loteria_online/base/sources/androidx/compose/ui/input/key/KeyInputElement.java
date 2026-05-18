package androidx.compose.ui.input.key;

import G0.f;
import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class KeyInputElement extends Y {
    public final l b;
    public final l c;

    public KeyInputElement(l lVar, l lVar2) {
        this.b = lVar;
        this.c = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.b == keyInputElement.b && this.c == keyInputElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f fVar) {
        fVar.E1(this.b);
        fVar.F1(this.c);
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
            n0.d("onKeyEvent");
            n0.b().c("onKeyEvent", lVar);
        }
        l lVar2 = this.c;
        if (lVar2 != null) {
            n0.d("onPreviewKeyEvent");
            n0.b().c("onPreviewKeyEvent", lVar2);
        }
    }
}
