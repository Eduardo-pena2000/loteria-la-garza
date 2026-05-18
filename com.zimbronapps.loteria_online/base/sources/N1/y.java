package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public static final a b = new a(null);
    public static final long c = c(0);
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return y.a();
        }

        public a() {
        }
    }

    public /* synthetic */ y(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return c;
    }

    public static final /* synthetic */ y b(long j) {
        return new y(j);
    }

    public static final long d(long j, float f, float f2) {
        return c((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static /* synthetic */ long e(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return d(j, f, f2);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof y) && j == ((y) obj).o();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final float h(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int j(long j) {
        return Long.hashCode(j);
    }

    public static final long k(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return c((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final long l(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return c((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final long m(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return c((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static String n(long j) {
        return '(' + h(j) + ", " + i(j) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
