package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final a b = new a(null);
    public static final long c = d(0);
    public static final long d = d(9205357640488583168L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return k.a();
        }

        public final long b() {
            return k.b();
        }

        public a() {
        }
    }

    public /* synthetic */ k(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return c;
    }

    public static final /* synthetic */ k c(long j) {
        return new k(j);
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof k) && j == ((k) obj).k();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        return h.g(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float h(long j) {
        return h.g(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return h.l(h(j)) + " x " + h.l(g(j));
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ long k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    public static long d(long j) {
        return j;
    }
}
