package u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public static final a b = new a(null);
    public static final long c = d(0);
    public static final long d = d(9205357640488583168L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return l.a();
        }

        public final long b() {
            return l.b();
        }

        public a() {
        }
    }

    public /* synthetic */ l(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return c;
    }

    public static final /* synthetic */ l c(long j) {
        return new l(j);
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof l) && j == ((l) obj).m();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float h(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int j(long j) {
        return Long.hashCode(j);
    }

    public static final boolean k(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String l(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(Float.intBitsToFloat((int) (j >> 32)), 1) + ", " + c.a(Float.intBitsToFloat((int) (j & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static long d(long j) {
        return j;
    }
}
