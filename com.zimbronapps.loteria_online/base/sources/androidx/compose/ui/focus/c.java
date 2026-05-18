package androidx.compose.ui.focus;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final a b = new a(null);
    public static final int c = j(1);
    public static final int d = j(2);
    public static final int e = j(3);
    public static final int f = j(4);
    public static final int g = j(5);
    public static final int h = j(6);
    public static final int i = j(7);
    public static final int j = j(8);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return c.a();
        }

        public final int b() {
            return c.b();
        }

        public final int c() {
            return c.c();
        }

        public final int d() {
            return c.d();
        }

        public final int e() {
            return c.e();
        }

        public final int f() {
            return c.f();
        }

        public final int g() {
            return c.g();
        }

        public final int h() {
            return c.h();
        }

        public a() {
        }
    }

    public /* synthetic */ c(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ int a() {
        return h;
    }

    public static final /* synthetic */ int b() {
        return i;
    }

    public static final /* synthetic */ int c() {
        return j;
    }

    public static final /* synthetic */ int d() {
        return e;
    }

    public static final /* synthetic */ int e() {
        return c;
    }

    public static final /* synthetic */ int f() {
        return d;
    }

    public static final /* synthetic */ int g() {
        return f;
    }

    public static final /* synthetic */ int h() {
        return g;
    }

    public static final /* synthetic */ c i(int i2) {
        return new c(i2);
    }

    public static int j(int i2) {
        return i2;
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof c) && i2 == ((c) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static int m(int i2) {
        return Integer.hashCode(i2);
    }

    public static String n(int i2) {
        return l(i2, c) ? "Next" : l(i2, d) ? "Previous" : l(i2, e) ? "Left" : l(i2, f) ? "Right" : l(i2, g) ? "Up" : l(i2, h) ? "Down" : l(i2, i) ? "Enter" : l(i2, j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return m(this.a);
    }

    public final /* synthetic */ int o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }
}
