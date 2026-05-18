package d1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q0 {
    public final u a;
    public final L b;
    public final int c;
    public final int d;
    public final Object e;

    public /* synthetic */ q0(u uVar, L l, int i, int i2, Object obj, kotlin.jvm.internal.k kVar) {
        this(uVar, l, i, i2, obj);
    }

    public static /* synthetic */ q0 b(q0 q0Var, u uVar, L l, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            uVar = q0Var.a;
        }
        if ((i3 & 2) != 0) {
            l = q0Var.b;
        }
        L l2 = l;
        if ((i3 & 4) != 0) {
            i = q0Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = q0Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = q0Var.e;
        }
        return q0Var.a(uVar, l2, i4, i5, obj);
    }

    public final q0 a(u uVar, L l, int i, int i2, Object obj) {
        return new q0(uVar, l, i, i2, obj, null);
    }

    public final u c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.t.c(this.a, q0Var.a) && kotlin.jvm.internal.t.c(this.b, q0Var.b) && H.f(this.c, q0Var.c) && I.h(this.d, q0Var.d) && kotlin.jvm.internal.t.c(this.e, q0Var.e);
    }

    public final L f() {
        return this.b;
    }

    public int hashCode() {
        u uVar = this.a;
        int hashCode = (((((((uVar == null ? 0 : uVar.hashCode()) * 31) + this.b.hashCode()) * 31) + H.g(this.c)) * 31) + I.i(this.d)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + H.h(this.c) + ", fontSynthesis=" + I.l(this.d) + ", resourceLoaderCacheKey=" + this.e + ')';
    }

    public q0(u uVar, L l, int i, int i2, Object obj) {
        this.a = uVar;
        this.b = l;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }
}
