package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public static final a b = new a(null);
    public static final int c = h(1);
    public static final int d = h(2);
    public static final int e = h(3);
    public static final int f = h(4);
    public static final int g = h(5);
    public static final int h = h(Integer.MIN_VALUE);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return l.a();
        }

        public final int b() {
            return l.b();
        }

        public final int c() {
            return l.c();
        }

        public final int d() {
            return l.d();
        }

        public final int e() {
            return l.e();
        }

        public final int f() {
            return l.f();
        }

        public a() {
        }
    }

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return e;
    }

    public static final /* synthetic */ int b() {
        return f;
    }

    public static final /* synthetic */ int c() {
        return g;
    }

    public static final /* synthetic */ int d() {
        return c;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static final /* synthetic */ int f() {
        return h;
    }

    public static final /* synthetic */ l g(int i) {
        return new l(i);
    }

    public static boolean i(int i, Object obj) {
        return (obj instanceof l) && i == ((l) obj).m();
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static int k(int i) {
        return Integer.hashCode(i);
    }

    public static String l(int i) {
        return j(i, c) ? "Ltr" : j(i, d) ? "Rtl" : j(i, e) ? "Content" : j(i, f) ? "ContentOrLtr" : j(i, g) ? "ContentOrRtl" : j(i, h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ int m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static int h(int i) {
        return i;
    }
}
