package androidx.compose.ui.layout;

import O0.T;
import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends q.a {
    public final T b;

    public k(T t) {
        this.b = t;
    }

    public int B() {
        return this.b.U0();
    }

    public float e1() {
        return this.b.e1();
    }

    public float getDensity() {
        return this.b.getDensity();
    }

    public float q(v vVar, float f) {
        return vVar.b() != null ? ((Number) vVar.b().invoke(this, Float.valueOf(f))).floatValue() : this.b.I1(vVar, f);
    }

    public n1.t z() {
        return this.b.getLayoutDirection();
    }
}
