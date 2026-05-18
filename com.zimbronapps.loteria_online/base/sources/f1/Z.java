package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public static final a b = new a(null);
    public static final int c = l(0);
    public static final int d = l(1);
    public static final int e = l(2);
    public static final int f = l(3);
    public static final int g = l(4);
    public static final int h = l(5);
    public static final int i = l(6);
    public static final int j = l(7);
    public static final int k = l(8);
    public static final int l = l(9);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return z.a();
        }

        public final int b() {
            return z.b();
        }

        public final int c() {
            return z.c();
        }

        public final int d() {
            return z.d();
        }

        public final int e() {
            return z.e();
        }

        public final int f() {
            return z.f();
        }

        public final int g() {
            return z.g();
        }

        public final int h() {
            return z.h();
        }

        public final int i() {
            return z.i();
        }

        public final int j() {
            return z.j();
        }

        public a() {
        }
    }

    public /* synthetic */ z(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ int a() {
        return e;
    }

    public static final /* synthetic */ int b() {
        return l;
    }

    public static final /* synthetic */ int c() {
        return i;
    }

    public static final /* synthetic */ int d() {
        return f;
    }

    public static final /* synthetic */ int e() {
        return k;
    }

    public static final /* synthetic */ int f() {
        return j;
    }

    public static final /* synthetic */ int g() {
        return g;
    }

    public static final /* synthetic */ int h() {
        return d;
    }

    public static final /* synthetic */ int i() {
        return c;
    }

    public static final /* synthetic */ int j() {
        return h;
    }

    public static final /* synthetic */ z k(int i2) {
        return new z(i2);
    }

    public static boolean m(int i2, Object obj) {
        return (obj instanceof z) && i2 == ((z) obj).q();
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static int o(int i2) {
        return Integer.hashCode(i2);
    }

    public static String p(int i2) {
        return n(i2, c) ? "Unspecified" : n(i2, d) ? "Text" : n(i2, e) ? "Ascii" : n(i2, f) ? "Number" : n(i2, g) ? "Phone" : n(i2, h) ? "Uri" : n(i2, i) ? "Email" : n(i2, j) ? "Password" : n(i2, k) ? "NumberPassword" : n(i2, l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.a, obj);
    }

    public int hashCode() {
        return o(this.a);
    }

    public final /* synthetic */ int q() {
        return this.a;
    }

    public String toString() {
        return p(this.a);
    }

    public static int l(int i2) {
        return i2;
    }
}
