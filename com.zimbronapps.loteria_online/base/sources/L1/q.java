package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public static final a c = new a(null);
    public static final q d = new q(1.0f, 0.0f);
    public final float a;
    public final float b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final q a() {
            return q.a();
        }

        public a() {
        }
    }

    public q(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final /* synthetic */ q a() {
        return d;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}
