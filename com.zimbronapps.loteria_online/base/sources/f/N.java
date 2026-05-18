package F;

import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface n {
    static /* synthetic */ androidx.compose.ui.e b(n nVar, androidx.compose.ui.e eVar, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nVar.a(eVar, f, z);
    }

    androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f, boolean z);

    androidx.compose.ui.e c(androidx.compose.ui.e eVar, e.b bVar);
}
