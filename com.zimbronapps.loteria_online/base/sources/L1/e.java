package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final a b = new a(null);
    public static final int c = e(1);
    public static final int d = e(2);
    public static final int e = e(Integer.MIN_VALUE);
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

        public final int c() {
            return e.c();
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

    public static final /* synthetic */ int c() {
        return e;
    }

    public static final /* synthetic */ e d(int i) {
        return new e(i);
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof e) && i == ((e) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        return g(i, c) ? "Hyphens.None" : g(i, d) ? "Hyphens.Auto" : g(i, e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static int e(int i) {
        return i;
    }
}
