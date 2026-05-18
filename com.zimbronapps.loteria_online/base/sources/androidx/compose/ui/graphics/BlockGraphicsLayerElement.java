package androidx.compose.ui.graphics;

import O0.Y;
import P0.N0;
import Qa.l;
import v0.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class BlockGraphicsLayerElement extends Y {
    public final l b;

    public BlockGraphicsLayerElement(l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.b == ((BlockGraphicsLayerElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 create() {
        return new f0(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f0 f0Var) {
        f0Var.G1(this.b);
        f0Var.F1();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("graphicsLayer");
        n0.b().c("block", this.b);
    }
}
