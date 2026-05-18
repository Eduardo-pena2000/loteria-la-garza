package o1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public static final d a = new d();

    public final float a(float f, float f2, float f3, float f4, float f5) {
        return b(f, f2, Math.max(0.0f, Math.min(1.0f, c(f3, f4, f5))));
    }

    public final float b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public final float c(float f, float f2, float f3) {
        if (f == f2) {
            return 0.0f;
        }
        return (f3 - f) / (f2 - f);
    }
}
