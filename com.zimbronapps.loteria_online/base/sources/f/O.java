package F;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements n {
    public static final o a = new o();

    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f, boolean z) {
        if (f > 0.0d) {
            return eVar.then(new LayoutWeightElement(Wa.n.h(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, e.b bVar) {
        return eVar.then(new HorizontalAlignElement(bVar));
    }
}
