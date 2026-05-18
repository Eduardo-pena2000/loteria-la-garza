package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final b d = new b(null);
    public static final h e = new h(a.b.b(), d.b.a(), c.b.a(), null);
    public final float a;
    public final int b;
    public final int c;

    public static final class a {
        public static final a b = new a(null);
        public static final float c = d(0.0f);
        public static final float d = d(0.5f);
        public static final float e = d(-1.0f);
        public static final float f = d(1.0f);
        public final float a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final float a() {
                return a.a();
            }

            public final float b() {
                return a.b();
            }

            public a() {
            }
        }

        public /* synthetic */ a(float f2) {
            this.a = f2;
        }

        public static final /* synthetic */ float a() {
            return d;
        }

        public static final /* synthetic */ float b() {
            return e;
        }

        public static final /* synthetic */ a c(float f2) {
            return new a(f2);
        }

        public static float d(float f2) {
            if (!((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f)) {
                g1.a.c("topRatio should be in [0..1] range or -1");
            }
            return f2;
        }

        public static boolean e(float f2, Object obj) {
            return (obj instanceof a) && Float.compare(f2, ((a) obj).i()) == 0;
        }

        public static final boolean f(float f2, float f3) {
            return Float.compare(f2, f3) == 0;
        }

        public static int g(float f2) {
            return Float.hashCode(f2);
        }

        public static String h(float f2) {
            if (f2 == c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f2 == d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f2 == e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f2 == f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.a, obj);
        }

        public int hashCode() {
            return g(this.a);
        }

        public final /* synthetic */ float i() {
            return this.a;
        }

        public String toString() {
            return h(this.a);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            return h.a();
        }

        public b() {
        }
    }

    public /* synthetic */ h(float f, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(f, i, i2);
    }

    public static final /* synthetic */ h a() {
        return e;
    }

    public final float b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.f(this.a, hVar.a) && d.f(this.b, hVar.b) && c.f(this.c, hVar.c);
    }

    public int hashCode() {
        return (((a.g(this.a) * 31) + d.g(this.b)) * 31) + c.g(this.c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + a.h(this.a) + ", trim=" + d.j(this.b) + ",mode=" + c.h(this.c) + ')';
    }

    public /* synthetic */ h(float f, int i, kotlin.jvm.internal.k kVar) {
        this(f, i);
    }

    public h(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public h(float f, int i) {
        this(f, i, c.b.a(), null);
    }

    public static final class c {
        public static final a b = new a(null);
        public static final int c = d(0);
        public static final int d = d(1);
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

            public a() {
            }
        }

        public /* synthetic */ c(int i) {
            this.a = i;
        }

        public static final /* synthetic */ int a() {
            return c;
        }

        public static final /* synthetic */ int b() {
            return d;
        }

        public static final /* synthetic */ c c(int i) {
            return new c(i);
        }

        public static boolean e(int i, Object obj) {
            return (obj instanceof c) && i == ((c) obj).i();
        }

        public static final boolean f(int i, int i2) {
            return i == i2;
        }

        public static int g(int i) {
            return Integer.hashCode(i);
        }

        public static String h(int i) {
            return "Mode(value=" + i + ')';
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

    public static final class d {
        public static final a b = new a(null);
        public static final int c = d(1);
        public static final int d = d(16);
        public static final int e = d(17);
        public static final int f = d(0);
        public final int a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final int a() {
                return d.a();
            }

            public final int b() {
                return d.b();
            }

            public a() {
            }
        }

        public /* synthetic */ d(int i) {
            this.a = i;
        }

        public static final /* synthetic */ int a() {
            return e;
        }

        public static final /* synthetic */ int b() {
            return f;
        }

        public static final /* synthetic */ d c(int i) {
            return new d(i);
        }

        public static boolean e(int i, Object obj) {
            return (obj instanceof d) && i == ((d) obj).k();
        }

        public static final boolean f(int i, int i2) {
            return i == i2;
        }

        public static int g(int i) {
            return Integer.hashCode(i);
        }

        public static final boolean h(int i) {
            return (i & 1) > 0;
        }

        public static final boolean i(int i) {
            return (i & 16) > 0;
        }

        public static String j(int i) {
            return i == c ? "LineHeightStyle.Trim.FirstLineTop" : i == d ? "LineHeightStyle.Trim.LastLineBottom" : i == e ? "LineHeightStyle.Trim.Both" : i == f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.a, obj);
        }

        public int hashCode() {
            return g(this.a);
        }

        public final /* synthetic */ int k() {
            return this.a;
        }

        public String toString() {
            return j(this.a);
        }

        public static int d(int i) {
            return i;
        }
    }
}
