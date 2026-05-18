package n1;

import n1.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class v {
    public static final a b = new a(null);
    public static final x[] c;
    public static final long d;
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return v.a();
        }

        public a() {
        }
    }

    static {
        x.a aVar = x.b;
        c = new x[]{x.d(aVar.c()), x.d(aVar.b()), x.d(aVar.a())};
        d = w.i(0L, Float.NaN);
    }

    public /* synthetic */ v(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return d;
    }

    public static final /* synthetic */ v b(long j) {
        return new v(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof v) && j == ((v) obj).k();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return c[(int) (f(j) >>> 32)].j();
    }

    public static final float h(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        long g = g(j);
        x.a aVar = x.b;
        if (x.g(g, aVar.c())) {
            return "Unspecified";
        }
        if (x.g(g, aVar.b())) {
            return h(j) + ".sp";
        }
        if (!x.g(g, aVar.a())) {
            return "Invalid";
        }
        return h(j) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
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

    public static long c(long j) {
        return j;
    }
}
