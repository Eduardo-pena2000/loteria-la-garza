package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface z0 extends c0, C0 {
    float b();

    default void n(float f) {
        q(f);
    }

    void q(float f);

    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        n(((Number) obj).floatValue());
    }

    default Float getValue() {
        return Float.valueOf(b());
    }
}
