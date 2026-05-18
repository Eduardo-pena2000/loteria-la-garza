package androidx.compose.ui.draw;

import O0.Y;
import P0.N0;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class DrawWithContentElement extends Y {
    public final l b;

    public DrawWithContentElement(l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && this.b == ((DrawWithContentElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public s0.l create() {
        return new s0.l(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(s0.l lVar) {
        lVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("drawWithContent");
        n0.b().c("onDraw", this.b);
    }
}
