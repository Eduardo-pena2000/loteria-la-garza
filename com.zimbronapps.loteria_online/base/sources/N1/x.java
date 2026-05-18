package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public static final a b = new a(null);
    public static final long c = e(0);
    public static final long d = e(4294967296L);
    public static final long e = e(8589934592L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return x.a();
        }

        public final long b() {
            return x.b();
        }

        public final long c() {
            return x.c();
        }

        public a() {
        }
    }

    public /* synthetic */ x(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return e;
    }

    public static final /* synthetic */ long b() {
        return d;
    }

    public static final /* synthetic */ long c() {
        return c;
    }

    public static final /* synthetic */ x d(long j) {
        return new x(j);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof x) && j == ((x) obj).j();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return g(j, c) ? "Unspecified" : g(j, d) ? "Sp" : g(j, e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static long e(long j) {
        return j;
    }
}
