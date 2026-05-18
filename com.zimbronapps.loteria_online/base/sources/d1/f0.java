package d1;

import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f0 implements t {
    public final int a;
    public final L b;
    public final int c;
    public final K.d d;
    public final int e;

    public /* synthetic */ f0(int i, L l, int i2, K.d dVar, int i3, kotlin.jvm.internal.k kVar) {
        this(i, l, i2, dVar, i3);
    }

    public int a() {
        return this.e;
    }

    public L b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final K.d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && kotlin.jvm.internal.t.c(b(), f0Var.b()) && H.f(c(), f0Var.c()) && kotlin.jvm.internal.t.c(this.d, f0Var.d) && F.e(a(), f0Var.a());
    }

    public int hashCode() {
        return (((((((this.a * 31) + b().hashCode()) * 31) + H.g(c())) * 31) + F.f(a())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + b() + ", style=" + H.h(c()) + ", loadingStrategy=" + F.g(a()) + ')';
    }

    public f0(int i, L l, int i2, K.d dVar, int i3) {
        this.a = i;
        this.b = l;
        this.c = i2;
        this.d = dVar;
        this.e = i3;
    }
}
