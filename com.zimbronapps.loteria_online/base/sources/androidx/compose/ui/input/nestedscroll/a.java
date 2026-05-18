package androidx.compose.ui.input.nestedscroll;

import H0.b;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final e a(e eVar, H0.a aVar, b bVar) {
        return eVar.then(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ e b(e eVar, H0.a aVar, b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        return a(eVar, aVar, bVar);
    }
}
