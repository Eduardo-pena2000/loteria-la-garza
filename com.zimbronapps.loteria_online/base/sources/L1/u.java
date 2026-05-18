package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public static final a c = new a(null);
    public static final u d;
    public static final u e;
    public final int a;
    public final boolean b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final u a() {
            return u.a();
        }

        public a() {
        }
    }

    static {
        b.a aVar = b.b;
        d = new u(aVar.a(), false, null);
        e = new u(aVar.b(), true, null);
    }

    public /* synthetic */ u(int i, boolean z, kotlin.jvm.internal.k kVar) {
        this(i, z);
    }

    public static final /* synthetic */ u a() {
        return d;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return b.g(this.a, uVar.a) && this.b == uVar.b;
    }

    public int hashCode() {
        return (b.h(this.a) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return kotlin.jvm.internal.t.c(this, d) ? "TextMotion.Static" : kotlin.jvm.internal.t.c(this, e) ? "TextMotion.Animated" : "Invalid";
    }

    public u(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static final class b {
        public static final a b = new a(null);
        public static final int c = e(1);
        public static final int d = e(2);
        public static final int e = e(3);
        public final int a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final int a() {
                return b.a();
            }

            public final int b() {
                return b.b();
            }

            public final int c() {
                return b.c();
            }

            public a() {
            }
        }

        public /* synthetic */ b(int i) {
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

        public static final /* synthetic */ b d(int i) {
            return new b(i);
        }

        public static boolean f(int i, Object obj) {
            return (obj instanceof b) && i == ((b) obj).j();
        }

        public static final boolean g(int i, int i2) {
            return i == i2;
        }

        public static int h(int i) {
            return Integer.hashCode(i);
        }

        public static String i(int i) {
            return g(i, c) ? "Linearity.Linear" : g(i, d) ? "Linearity.FontHinting" : g(i, e) ? "Linearity.None" : "Invalid";
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
}
