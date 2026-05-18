package Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public static final a b = new a(null);
    public static final int c = e(0);
    public static final int d = e(1);
    public static final int e = e(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return i.a();
        }

        public final int b() {
            return i.b();
        }

        public final int c() {
            return i.c();
        }

        public a() {
        }
    }

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return e;
    }

    public static final /* synthetic */ int b() {
        return c;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ i d(int i) {
        return new i(i);
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof i) && i == ((i) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        if (i == c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == d) {
            return "EmojiSupportMatch.None";
        }
        if (i == e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i + ')';
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
