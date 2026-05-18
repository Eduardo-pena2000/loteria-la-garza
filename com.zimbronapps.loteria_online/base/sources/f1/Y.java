package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public static final a b = new a(null);
    public static final int c = g(-1);
    public static final int d = g(0);
    public static final int e = g(1);
    public static final int f = g(2);
    public static final int g = g(3);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return y.a();
        }

        public final int b() {
            return y.b();
        }

        public final int c() {
            return y.c();
        }

        public final int d() {
            return y.d();
        }

        public final int e() {
            return y.e();
        }

        public a() {
        }
    }

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return e;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return g;
    }

    public static final /* synthetic */ int d() {
        return c;
    }

    public static final /* synthetic */ int e() {
        return f;
    }

    public static final /* synthetic */ y f(int i) {
        return new y(i);
    }

    public static boolean h(int i, Object obj) {
        return (obj instanceof y) && i == ((y) obj).l();
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return i(i, c) ? "Unspecified" : i(i, d) ? "None" : i(i, e) ? "Characters" : i(i, f) ? "Words" : i(i, g) ? "Sentences" : "Invalid";
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
