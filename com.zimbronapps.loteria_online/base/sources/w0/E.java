package W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final a b = new a(null);
    public static final int c = d(0);
    public static final int d = d(1);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return e.a();
        }

        public final int b() {
            return e.b();
        }

        public a() {
        }
    }

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return c;
    }

    public static final /* synthetic */ e c(int i) {
        return new e(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof e) && i == ((e) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        return f(i, c) ? "Polite" : f(i, d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ int i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }

    public static int d(int i) {
        return i;
    }
}
