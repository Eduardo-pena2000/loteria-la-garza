package d1;

import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final t a(String str, L l, int i, K.d dVar) {
        return new q(str, l, i, dVar, null);
    }

    public static /* synthetic */ t b(String str, L l, int i, K.d dVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = L.b.g();
        }
        if ((i2 & 4) != 0) {
            i = H.b.b();
        }
        if ((i2 & 8) != 0) {
            dVar = new K.d(new K.a[0]);
        }
        return a(str, l, i, dVar);
    }
}
