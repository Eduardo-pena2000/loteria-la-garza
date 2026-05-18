package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h0 implements G {
    public final float a;
    public final float b;
    public final Object c;

    public h0(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.a == this.a && h0Var.b == this.b && kotlin.jvm.internal.t.c(h0Var.c, this.c);
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final Object h() {
        return this.c;
    }

    public int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.a)) * 31) + Float.hashCode(this.b);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public G0 a(s0 s0Var) {
        return new G0(this.a, this.b, j.a(s0Var, this.c));
    }

    public /* synthetic */ h0(float f, float f2, Object obj, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
