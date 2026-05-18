package androidx.compose.ui.input.key;

import Qa.l;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final e a(e eVar, l lVar) {
        return eVar.then(new KeyInputElement(lVar, null));
    }

    public static final e b(e eVar, l lVar) {
        return eVar.then(new KeyInputElement(null, lVar));
    }
}
