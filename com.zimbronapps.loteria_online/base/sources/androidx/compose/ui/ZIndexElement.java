package androidx.compose.ui;

import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ZIndexElement extends Y {
    public final float b;

    public ZIndexElement(float f) {
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.b, ((ZIndexElement) obj).b) == 0;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f fVar) {
        fVar.F1(this.b);
    }

    public int hashCode() {
        return Float.hashCode(this.b);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("zIndex");
        n0.b().c("zIndex", Float.valueOf(this.b));
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.b + ')';
    }
}
