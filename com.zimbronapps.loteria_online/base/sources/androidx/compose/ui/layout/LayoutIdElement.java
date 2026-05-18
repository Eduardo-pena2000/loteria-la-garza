package androidx.compose.ui.layout;

import O0.Y;
import P0.N0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class LayoutIdElement extends Y {
    public final Object b;

    public LayoutIdElement(Object obj) {
        this.b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && kotlin.jvm.internal.t.c(this.b, ((LayoutIdElement) obj).b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public M0.r create() {
        return new M0.r(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(M0.r rVar) {
        rVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("layoutId");
        n0.e(this.b);
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.b + ')';
    }
}
