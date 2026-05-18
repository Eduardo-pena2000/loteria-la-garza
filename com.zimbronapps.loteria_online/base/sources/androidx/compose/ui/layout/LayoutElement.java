package androidx.compose.ui.layout;

import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class LayoutElement extends Y {
    public final Qa.q b;

    public LayoutElement(Qa.q qVar) {
        this.b = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && this.b == ((LayoutElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public M0.w create() {
        return new M0.w(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(M0.w wVar) {
        wVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("layout");
        n0.b().c("measure", this.b);
    }
}
