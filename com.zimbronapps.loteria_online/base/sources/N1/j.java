package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final a b = new a(null);
    public static final long c = b(0);
    public static final long d = b(9205357640488583168L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ j(long j) {
        this.a = j;
    }

    public static final /* synthetic */ j a(long j) {
        return new j(j);
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof j) && j == ((j) obj).h();
    }

    public static final float d(long j) {
        return h.g(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final float e(long j) {
        return h.g(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static int f(long j) {
        return Long.hashCode(j);
    }

    public static String g(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + h.l(d(j)) + ", " + h.l(e(j)) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ long h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }

    public static long b(long j) {
        return j;
    }
}
