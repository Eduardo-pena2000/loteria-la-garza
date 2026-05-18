package androidx.compose.ui.draw;

import O0.Y;
import P0.N0;
import Qa.l;
import s0.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class DrawBehindElement extends Y {
    public final l b;

    public DrawBehindElement(l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.b == ((DrawBehindElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i iVar) {
        iVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("drawBehind");
        n0.b().c("onDraw", this.b);
    }
}
