package r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final long a(b bVar) {
        float x = bVar.a().getX();
        float y = bVar.a().getY();
        return u0.f.e((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
    }
}
