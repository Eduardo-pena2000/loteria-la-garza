package v0;

import android.graphics.RenderEffect;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g0 extends u1 {
    public final u1 b;
    public final float c;
    public final float d;
    public final int e;

    public /* synthetic */ g0(u1 u1Var, float f, float f2, int i, kotlin.jvm.internal.k kVar) {
        this(u1Var, f, f2, i);
    }

    public RenderEffect b() {
        return z1.a.a(this.b, this.c, this.d, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.c == g0Var.c && this.d == g0Var.d && I1.f(this.e, g0Var.e) && kotlin.jvm.internal.t.c(this.b, g0Var.b);
    }

    public int hashCode() {
        u1 u1Var = this.b;
        return ((((((u1Var != null ? u1Var.hashCode() : 0) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + I1.g(this.e);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.b + ", radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=" + I1.h(this.e) + ')';
    }

    public g0(u1 u1Var, float f, float f2, int i) {
        super(null);
        this.b = u1Var;
        this.c = f;
        this.d = f2;
        this.e = i;
    }
}
