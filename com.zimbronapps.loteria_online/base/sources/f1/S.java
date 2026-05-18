package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public static final a b = new a(null);
    public static final int c = k(-1);
    public static final int d = k(1);
    public static final int e = k(0);
    public static final int f = k(2);
    public static final int g = k(3);
    public static final int h = k(4);
    public static final int i = k(5);
    public static final int j = k(6);
    public static final int k = k(7);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return s.a();
        }

        public final int b() {
            return s.b();
        }

        public final int c() {
            return s.c();
        }

        public final int d() {
            return s.d();
        }

        public final int e() {
            return s.e();
        }

        public final int f() {
            return s.f();
        }

        public final int g() {
            return s.g();
        }

        public final int h() {
            return s.h();
        }

        public final int i() {
            return s.i();
        }

        public a() {
        }
    }

    public /* synthetic */ s(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ int a() {
        return d;
    }

    public static final /* synthetic */ int b() {
        return k;
    }

    public static final /* synthetic */ int c() {
        return f;
    }

    public static final /* synthetic */ int d() {
        return j;
    }

    public static final /* synthetic */ int e() {
        return e;
    }

    public static final /* synthetic */ int f() {
        return i;
    }

    public static final /* synthetic */ int g() {
        return g;
    }

    public static final /* synthetic */ int h() {
        return h;
    }

    public static final /* synthetic */ int i() {
        return c;
    }

    public static final /* synthetic */ s j(int i2) {
        return new s(i2);
    }

    public static boolean l(int i2, Object obj) {
        return (obj instanceof s) && i2 == ((s) obj).p();
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2) {
        return Integer.hashCode(i2);
    }

    public static String o(int i2) {
        return m(i2, c) ? "Unspecified" : m(i2, e) ? "None" : m(i2, d) ? "Default" : m(i2, f) ? "Go" : m(i2, g) ? "Search" : m(i2, h) ? "Send" : m(i2, i) ? "Previous" : m(i2, j) ? "Next" : m(i2, k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.a, obj);
    }

    public int hashCode() {
        return n(this.a);
    }

    public final /* synthetic */ int p() {
        return this.a;
    }

    public String toString() {
        return o(this.a);
    }

    public static int k(int i2) {
        return i2;
    }
}
