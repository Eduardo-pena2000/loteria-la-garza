package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final long a(float f, float f2) {
        return j.b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final long b(float f, float f2) {
        return k.d((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final float c(float f, float f2, float f3) {
        return h.g(p1.b.b(f, f2, f3));
    }
}
