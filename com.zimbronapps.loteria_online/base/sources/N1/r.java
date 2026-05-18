package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public static final a b = new a(null);
    public static final long c = c(0);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return r.a();
        }

        public a() {
        }
    }

    public /* synthetic */ r(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return c;
    }

    public static final /* synthetic */ r b(long j) {
        return new r(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof r) && j == ((r) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int g(long j) {
        return (int) (j >> 32);
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
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

    public static long c(long j) {
        return j;
    }
}
