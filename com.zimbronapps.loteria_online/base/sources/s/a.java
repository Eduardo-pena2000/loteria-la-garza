package S;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final a a = new a(null);
    public static final long b = b(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final long a() {
            return a.a();
        }

        public a() {
        }
    }

    public static final /* synthetic */ long a() {
        return b;
    }

    public static long b(float f, float f2) {
        return c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static long d(n1.d dVar) {
        return b(dVar.getDensity(), dVar.e1());
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final float f(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float g(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String h(long j) {
        return "InlineDensity(density=" + f(j) + ", fontScale=" + g(j) + ')';
    }

    public static long c(long j) {
        return j;
    }
}
