package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g0 {
    public static final float a = Float.MAX_VALUE;

    public static final long a(float f, float f2) {
        return U.a((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final float b() {
        return a;
    }
}
