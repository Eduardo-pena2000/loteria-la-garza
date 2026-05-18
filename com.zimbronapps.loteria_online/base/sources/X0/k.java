package x0;

import kotlin.jvm.internal.t;
import v0.G1;
import v0.H1;
import v0.n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends g {
    public static final a e = new a(null);
    public static final int f = G1.a.a();
    public static final int g = H1.a.b();
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return k.a();
        }

        public a() {
        }
    }

    public /* synthetic */ k(float f2, float f3, int i, int i2, n1 n1Var, kotlin.jvm.internal.k kVar) {
        this(f2, f3, i, i2, n1Var);
    }

    public static final /* synthetic */ int a() {
        return f;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final n1 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a != kVar.a || this.b != kVar.b || !G1.e(this.c, kVar.c) || !H1.e(this.d, kVar.d)) {
            return false;
        }
        kVar.getClass();
        return t.c((Object) null, (Object) null);
    }

    public final float f() {
        return this.a;
    }

    public int hashCode() {
        return ((((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + G1.f(this.c)) * 31) + H1.f(this.d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.a + ", miter=" + this.b + ", cap=" + G1.g(this.c) + ", join=" + H1.g(this.d) + ", pathEffect=" + ((Object) null) + ')';
    }

    public /* synthetic */ k(float f2, float f3, int i, int i2, n1 n1Var, int i3, kotlin.jvm.internal.k kVar) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 4.0f : f3, (i3 & 4) != 0 ? f : i, (i3 & 8) != 0 ? g : i2, (i3 & 16) != 0 ? null : n1Var, null);
    }

    public k(float f2, float f3, int i, int i2, n1 n1Var) {
        super(null);
        this.a = f2;
        this.b = f3;
        this.c = i;
        this.d = i2;
    }
}
