package l1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public static final a b = new a(null);
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return f.a();
        }

        public final int b() {
            return f.b();
        }

        public a() {
        }
    }

    static {
        b.a aVar = b.a;
        int c2 = aVar.c();
        c.a aVar2 = c.a;
        int c3 = aVar2.c();
        d.a aVar3 = d.a;
        c = d(g.a(c2, c3, aVar3.a()));
        d = d(g.a(aVar.a(), aVar2.b(), aVar3.b()));
        e = d(g.a(aVar.b(), aVar2.d(), aVar3.a()));
        f = d(0);
    }

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return c;
    }

    public static final /* synthetic */ int b() {
        return f;
    }

    public static final /* synthetic */ f c(int i) {
        return new f(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof f) && i == ((f) obj).l();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static final int g(int i) {
        return b.d(g.b(i));
    }

    public static final int h(int i) {
        return c.e(g.c(i));
    }

    public static final int i(int i) {
        return d.c(g.d(i));
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return "LineBreak(strategy=" + b.f(g(i)) + ", strictness=" + c.g(h(i)) + ", wordBreak=" + d.e(i(i)) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static final class b {
        public static final a a = new a(null);
        public static final int b = d(1);
        public static final int c = d(2);
        public static final int d = d(3);
        public static final int e = d(0);

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

        public static final /* synthetic */ int a() {
            return d;
        }

        public static final /* synthetic */ int b() {
            return c;
        }

        public static final /* synthetic */ int c() {
            return b;
        }

        public static final boolean e(int i, int i2) {
            return i == i2;
        }

        public static String f(int i) {
            return e(i, b) ? "Strategy.Simple" : e(i, c) ? "Strategy.HighQuality" : e(i, d) ? "Strategy.Balanced" : e(i, e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i) {
            return i;
        }
    }

    public static final class c {
        public static final a a = new a(null);
        public static final int b = e(1);
        public static final int c = e(2);
        public static final int d = e(3);
        public static final int e = e(4);
        public static final int f = e(0);

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
            return d;
        }

        public static final /* synthetic */ int d() {
            return e;
        }

        public static final boolean f(int i, int i2) {
            return i == i2;
        }

        public static String g(int i) {
            return f(i, b) ? "Strictness.None" : f(i, c) ? "Strictness.Loose" : f(i, d) ? "Strictness.Normal" : f(i, e) ? "Strictness.Strict" : f(i, f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i) {
            return i;
        }
    }

    public static final class d {
        public static final a a = new a(null);
        public static final int b = c(1);
        public static final int c = c(2);
        public static final int d = c(0);

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

        public static final /* synthetic */ int a() {
            return b;
        }

        public static final /* synthetic */ int b() {
            return c;
        }

        public static final boolean d(int i, int i2) {
            return i == i2;
        }

        public static String e(int i) {
            return d(i, b) ? "WordBreak.None" : d(i, c) ? "WordBreak.Phrase" : d(i, d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i) {
            return i;
        }
    }

    public static int d(int i) {
        return i;
    }
}
