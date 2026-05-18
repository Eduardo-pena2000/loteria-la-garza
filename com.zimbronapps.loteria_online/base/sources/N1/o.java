package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static final long a(int i, int i2) {
        return n.f((i2 & 4294967295L) | (i << 32));
    }

    public static final long b(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - n.k(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - n.l(j2);
        return u0.f.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final long c(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + n.k(j2);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + n.l(j2);
        return u0.f.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public static final long d(long j) {
        return n.f((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }
}
