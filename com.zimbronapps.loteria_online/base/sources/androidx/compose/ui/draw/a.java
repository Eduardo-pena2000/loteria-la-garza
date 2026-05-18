package androidx.compose.ui.draw;

import Qa.l;
import s0.e;
import s0.f;
import s0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final e a(l lVar) {
        return new f(new g(), lVar);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, l lVar) {
        return eVar.then(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, l lVar) {
        return eVar.then(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, l lVar) {
        return eVar.then(new DrawWithContentElement(lVar));
    }
}
