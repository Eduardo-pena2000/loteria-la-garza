package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {
    public static final a a = new a(null);
    public static final int b = f(1);
    public static final int c = f(2);
    public static final int d = f(3);
    public static final int e = f(4);
    public static final int f = f(5);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return v.a();
        }

        public final int b() {
            return v.b();
        }

        public final int c() {
            return v.c();
        }

        public final int d() {
            return v.d();
        }

        public final int e() {
            return v.e();
        }

        public a() {
        }
    }

    public static final /* synthetic */ int a() {
        return b;
    }

    public static final /* synthetic */ int b() {
        return c;
    }

    public static final /* synthetic */ int c() {
        return f;
    }

    public static final /* synthetic */ int d() {
        return e;
    }

    public static final /* synthetic */ int e() {
        return d;
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        return g(i, b) ? "Clip" : g(i, c) ? "Ellipsis" : g(i, f) ? "MiddleEllipsis" : g(i, d) ? "Visible" : g(i, e) ? "StartEllipsis" : "Invalid";
    }

    public static int f(int i) {
        return i;
    }
}
