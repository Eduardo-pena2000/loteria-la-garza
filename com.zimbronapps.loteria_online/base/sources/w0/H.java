package W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final a b = new a(null);
    public static final int c = k(0);
    public static final int d = k(1);
    public static final int e = k(2);
    public static final int f = k(3);
    public static final int g = k(4);
    public static final int h = k(5);
    public static final int i = k(6);
    public static final int j = k(7);
    public static final int k = k(8);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return h.a();
        }

        public final int b() {
            return h.b();
        }

        public final int c() {
            return h.c();
        }

        public final int d() {
            return h.d();
        }

        public final int e() {
            return h.e();
        }

        public final int f() {
            return h.f();
        }

        public final int g() {
            return h.g();
        }

        public final int h() {
            return h.h();
        }

        public final int i() {
            return h.i();
        }

        public a() {
        }
    }

    public /* synthetic */ h(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ int a() {
        return c;
    }

    public static final /* synthetic */ int b() {
        return k;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ int d() {
        return i;
    }

    public static final /* synthetic */ int e() {
        return h;
    }

    public static final /* synthetic */ int f() {
        return f;
    }

    public static final /* synthetic */ int g() {
        return e;
    }

    public static final /* synthetic */ int h() {
        return g;
    }

    public static final /* synthetic */ int i() {
        return j;
    }

    public static final /* synthetic */ h j(int i2) {
        return new h(i2);
    }

    public static boolean l(int i2, Object obj) {
        return (obj instanceof h) && i2 == ((h) obj).p();
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2) {
        return Integer.hashCode(i2);
    }

    public static String o(int i2) {
        return m(i2, c) ? "Button" : m(i2, d) ? "Checkbox" : m(i2, e) ? "Switch" : m(i2, f) ? "RadioButton" : m(i2, g) ? "Tab" : m(i2, h) ? "Image" : m(i2, i) ? "DropdownList" : m(i2, j) ? "Picker" : m(i2, k) ? "Carousel" : "Unknown";
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
