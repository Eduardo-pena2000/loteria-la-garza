package d1;

import android.content.res.AssetManager;
import d1.K;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final t a(File file, L l, int i, K.d dVar) {
        return new b(file, l, i, dVar, null);
    }

    public static /* synthetic */ t b(File file, L l, int i, K.d dVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = L.b.g();
        }
        if ((i2 & 4) != 0) {
            i = H.b.b();
        }
        if ((i2 & 8) != 0) {
            dVar = K.a.a(l, i, new K.a[0]);
        }
        return a(file, l, i, dVar);
    }

    public static final t c(String str, AssetManager assetManager, L l, int i, K.d dVar) {
        return new a(assetManager, str, l, i, dVar, null);
    }

    public static /* synthetic */ t d(String str, AssetManager assetManager, L l, int i, K.d dVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = L.b.g();
        }
        if ((i2 & 8) != 0) {
            i = H.b.b();
        }
        if ((i2 & 16) != 0) {
            dVar = K.a.a(l, i, new K.a[0]);
        }
        return c(str, assetManager, l, i, dVar);
    }
}
