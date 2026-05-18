package A;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public final float a;
    public final v0.h0 b;

    public /* synthetic */ i(float f, v0.h0 h0Var, kotlin.jvm.internal.k kVar) {
        this(f, h0Var);
    }

    public final v0.h0 a() {
        return this.b;
    }

    public final float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n1.h.i(this.a, iVar.a) && kotlin.jvm.internal.t.c(this.b, iVar.b);
    }

    public int hashCode() {
        return (n1.h.k(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + n1.h.l(this.a) + ", brush=" + this.b + ')';
    }

    public i(float f, v0.h0 h0Var) {
        this.a = f;
        this.b = h0Var;
    }
}
