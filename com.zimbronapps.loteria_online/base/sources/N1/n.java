package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public static final a b = new a(null);
    public static final long c = f(0);
    public static final long d = f(9223372034707292159L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return n.a();
        }

        public final long b() {
            return n.b();
        }

        public a() {
        }
    }

    public /* synthetic */ n(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ long b() {
        return c;
    }

    public static final /* synthetic */ n c(long j) {
        return new n(j);
    }

    public static final int d(long j) {
        return k(j);
    }

    public static final int e(long j) {
        return l(j);
    }

    public static final long g(long j, int i, int i2) {
        return f((i << 32) | (i2 & 4294967295L));
    }

    public static /* synthetic */ long h(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return g(j, i, i2);
    }

    public static boolean i(long j, Object obj) {
        return (obj instanceof n) && j == ((n) obj).q();
    }

    public static final boolean j(long j, long j2) {
        return j == j2;
    }

    public static final int k(long j) {
        return (int) (j >> 32);
    }

    public static final int l(long j) {
        return (int) (j & 4294967295L);
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static final long n(long j, long j2) {
        return f(((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    public static final long o(long j, long j2) {
        return f(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L));
    }

    public static String p(long j) {
        return '(' + k(j) + ", " + l(j) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return m(this.a);
    }

    public final /* synthetic */ long q() {
        return this.a;
    }

    public String toString() {
        return p(this.a);
    }

    public static long f(long j) {
        return j;
    }
}
