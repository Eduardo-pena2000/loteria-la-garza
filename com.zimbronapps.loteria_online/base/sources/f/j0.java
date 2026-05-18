package F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j0 {
    public static final a a = new a(null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return j0.a();
        }

        public final int b() {
            return j0.b();
        }

        public final int c() {
            return j0.c();
        }

        public final int d() {
            return j0.d();
        }

        public final int e() {
            return j0.e();
        }

        public final int f() {
            return j0.f();
        }

        public final int g() {
            return j0.g();
        }

        public a() {
        }
    }

    static {
        int h2 = h(8);
        b = h2;
        int h3 = h(4);
        c = h3;
        int h4 = h(2);
        d = h4;
        int h5 = h(1);
        e = h5;
        f = l(h2, h5);
        g = l(h3, h4);
        int h6 = h(16);
        h = h6;
        int h7 = h(32);
        i = h7;
        int l2 = l(h2, h4);
        j = l2;
        int l3 = l(h3, h5);
        k = l3;
        l = l(l2, l3);
        m = l(h6, h7);
    }

    public static final /* synthetic */ int a() {
        return b;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final /* synthetic */ int c() {
        return c;
    }

    public static final /* synthetic */ int d() {
        return e;
    }

    public static final /* synthetic */ int e() {
        return i;
    }

    public static final /* synthetic */ int f() {
        return l;
    }

    public static final /* synthetic */ int g() {
        return h;
    }

    public static final boolean i(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean j(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static final int l(int i2, int i3) {
        return h(i2 | i3);
    }

    public static String m(int i2) {
        return "WindowInsetsSides(" + n(i2) + ')';
    }

    public static final String n(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = f;
        if ((i2 & i3) == i3) {
            o(sb, "Start");
        }
        int i4 = j;
        if ((i2 & i4) == i4) {
            o(sb, "Left");
        }
        int i5 = h;
        if ((i2 & i5) == i5) {
            o(sb, "Top");
        }
        int i6 = g;
        if ((i2 & i6) == i6) {
            o(sb, "End");
        }
        int i7 = k;
        if ((i2 & i7) == i7) {
            o(sb, "Right");
        }
        int i8 = i;
        if ((i2 & i8) == i8) {
            o(sb, "Bottom");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final void o(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static int h(int i2) {
        return i2;
    }
}
