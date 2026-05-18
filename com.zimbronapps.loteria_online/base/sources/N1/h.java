package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements Comparable {
    public static final a b = new a(null);
    public static final float c = g(0.0f);
    public static final float d = g(Float.POSITIVE_INFINITY);
    public static final float e = g(Float.NaN);
    public final float a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final float a() {
            return h.a();
        }

        public final float b() {
            return h.b();
        }

        public final float c() {
            return h.c();
        }

        public a() {
        }
    }

    public /* synthetic */ h(float f) {
        this.a = f;
    }

    public static final /* synthetic */ float a() {
        return c;
    }

    public static final /* synthetic */ float b() {
        return d;
    }

    public static final /* synthetic */ float c() {
        return e;
    }

    public static final /* synthetic */ h d(float f) {
        return new h(f);
    }

    public static int f(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static boolean h(float f, Object obj) {
        return (obj instanceof h) && Float.compare(f, ((h) obj).m()) == 0;
    }

    public static final boolean i(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int k(float f) {
        return Float.hashCode(f);
    }

    public static String l(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return e(((h) obj).m());
    }

    public int e(float f) {
        return f(this.a, f);
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ float m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static float g(float f) {
        return f;
    }
}
