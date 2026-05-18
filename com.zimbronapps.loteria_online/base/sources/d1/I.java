package d1;

import d1.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final L a(L.a aVar) {
        return aVar.l();
    }

    public static final int b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final int c(L l, int i) {
        return b(l.compareTo(a(L.b)) >= 0, H.f(i, H.b.a()));
    }
}
