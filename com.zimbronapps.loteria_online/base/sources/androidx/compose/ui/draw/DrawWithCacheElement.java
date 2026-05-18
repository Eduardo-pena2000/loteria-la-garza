package androidx.compose.ui.draw;

import O0.Y;
import P0.N0;
import Qa.l;
import s0.f;
import s0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class DrawWithCacheElement extends Y {
    public final l b;

    public DrawWithCacheElement(l lVar) {
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && this.b == ((DrawWithCacheElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(new g(), this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f fVar) {
        fVar.H1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("drawWithCache");
        n0.b().c("onBuildDrawCache", this.b);
    }
}
