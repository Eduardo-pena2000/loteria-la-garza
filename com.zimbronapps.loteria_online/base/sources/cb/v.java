package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class V {
    public static final boolean a = hb.E.f("kotlinx.coroutines.main.delay", false);
    public static final Y b = b();

    public static final Y a() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Y b() {
        if (!a) {
            return U.h;
        }
        L0 c = e0.c();
        return (hb.t.c(c) || !(c instanceof Y)) ? U.h : (Y) c;
    }
}
