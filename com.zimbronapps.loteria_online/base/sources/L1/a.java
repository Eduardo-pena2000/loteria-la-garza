package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a b = new a(null);
    public static final float c = c(0.5f);
    public static final float d = c(-0.5f);
    public static final float e = c(0.0f);
    public final float a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final float a() {
            return a.a();
        }

        public a() {
        }
    }

    public /* synthetic */ a(float f) {
        this.a = f;
    }

    public static final /* synthetic */ float a() {
        return e;
    }

    public static final /* synthetic */ a b(float f) {
        return new a(f);
    }

    public static boolean d(float f, Object obj) {
        return (obj instanceof a) && Float.compare(f, ((a) obj).h()) == 0;
    }

    public static final boolean e(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int f(float f) {
        return Float.hashCode(f);
    }

    public static String g(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final /* synthetic */ float h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }

    public static float c(float f) {
        return f;
    }
}
