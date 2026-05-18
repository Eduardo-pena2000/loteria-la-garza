package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r0 implements C {
    public final int a;
    public final int b;
    public final D c;

    public r0(int i, int i2, D d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.a == this.a && r0Var.b == this.b && kotlin.jvm.internal.t.c(r0Var.c, this.c);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public H0 a(s0 s0Var) {
        return new H0(this.a, this.b, this.c);
    }

    public int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public /* synthetic */ r0(int i, int i2, D d, int i3, kotlin.jvm.internal.k kVar) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? F.d() : d);
    }
}
