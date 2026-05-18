package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c1 {
    public static final a b = new a(null);
    public static final int c = g(0);
    public static final int d = g(1);
    public static final int e = g(2);
    public static final int f = g(3);
    public static final int g = g(4);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return c1.a();
        }

        public final int b() {
            return c1.b();
        }

        public final int c() {
            return c1.c();
        }

        public final int d() {
            return c1.d();
        }

        public final int e() {
            return c1.e();
        }

        public a() {
        }
    }

    public /* synthetic */ c1(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return c;
    }

    public static final /* synthetic */ int c() {
        return f;
    }

    public static final /* synthetic */ int d() {
        return g;
    }

    public static final /* synthetic */ int e() {
        return e;
    }

    public static final /* synthetic */ c1 f(int i) {
        return new c1(i);
    }

    public static boolean h(int i, Object obj) {
        return (obj instanceof c1) && i == ((c1) obj).l();
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return i(i, c) ? "Argb8888" : i(i, d) ? "Alpha8" : i(i, e) ? "Rgb565" : i(i, f) ? "F16" : i(i, g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static int g(int i) {
        return i;
    }
}
