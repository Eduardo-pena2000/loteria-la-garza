package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public static final long a(float f, boolean z, boolean z2) {
        return r.b((((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static /* synthetic */ long b(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return a(f, z, z2);
    }

    public static final /* synthetic */ long c(float f, boolean z, boolean z2) {
        return a(f, z, z2);
    }
}
