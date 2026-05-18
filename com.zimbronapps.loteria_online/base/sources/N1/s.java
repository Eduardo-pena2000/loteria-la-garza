package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static final long a(int i, int i2) {
        return r.c((i2 & 4294967295L) | (i << 32));
    }

    public static final long b(long j) {
        return n.f((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }

    public static final long c(long j) {
        return r.c((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    public static final long d(long j) {
        return u0.l.d((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }
}
