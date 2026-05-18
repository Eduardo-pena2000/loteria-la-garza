package androidx.compose.foundation.relocation;

import K.b;
import K.c;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class a {
    public static final b a() {
        return new c();
    }

    public static final e b(e eVar, b bVar) {
        return eVar.then(new BringIntoViewRequesterElement(bVar));
    }
}
