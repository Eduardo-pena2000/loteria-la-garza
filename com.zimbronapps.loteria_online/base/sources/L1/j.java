package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final a b = new a(null);
    public static final int c = i(1);
    public static final int d = i(2);
    public static final int e = i(3);
    public static final int f = i(4);
    public static final int g = i(5);
    public static final int h = i(6);
    public static final int i = i(Integer.MIN_VALUE);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return j.a();
        }

        public final int b() {
            return j.b();
        }

        public final int c() {
            return j.c();
        }

        public final int d() {
            return j.d();
        }

        public final int e() {
            return j.e();
        }

        public final int f() {
            return j.f();
        }

        public final int g() {
            return j.g();
        }

        public a() {
        }
    }

    public /* synthetic */ j(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ int a() {
        return e;
    }

    public static final /* synthetic */ int b() {
        return h;
    }

    public static final /* synthetic */ int c() {
        return f;
    }

    public static final /* synthetic */ int d() {
        return c;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static final /* synthetic */ int f() {
        return g;
    }

    public static final /* synthetic */ int g() {
        return i;
    }

    public static final /* synthetic */ j h(int i2) {
        return new j(i2);
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof j) && i2 == ((j) obj).n();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return k(i2, c) ? "Left" : k(i2, d) ? "Right" : k(i2, e) ? "Center" : k(i2, f) ? "Justify" : k(i2, g) ? "Start" : k(i2, h) ? "End" : k(i2, i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.a, obj);
    }

    public int hashCode() {
        return l(this.a);
    }

    public final /* synthetic */ int n() {
        return this.a;
    }

    public String toString() {
        return m(this.a);
    }

    public static int i(int i2) {
        return i2;
    }
}
