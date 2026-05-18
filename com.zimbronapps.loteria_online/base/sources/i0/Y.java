package I0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, x xVar, boolean z) {
        return eVar.then(new PointerHoverIconModifierElement(xVar, z));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, x xVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(eVar, xVar, z);
    }
}
