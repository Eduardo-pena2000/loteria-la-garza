package androidx.compose.foundation;

import E.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, m mVar, boolean z) {
        return eVar.then(z ? new HoverableElement(mVar) : androidx.compose.ui.e.a);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, m mVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(eVar, mVar, z);
    }
}
