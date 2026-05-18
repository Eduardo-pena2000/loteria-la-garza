package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class L0 extends K {
    public K B(int i, String str) {
        hb.l.a(i);
        return hb.l.b(this, str);
    }

    public abstract L0 E();

    public final String G() {
        L0 l0;
        L0 c = e0.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            l0 = c.E();
        } catch (UnsupportedOperationException unused) {
            l0 = null;
        }
        if (this == l0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
