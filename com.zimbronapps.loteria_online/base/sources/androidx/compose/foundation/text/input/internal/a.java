package androidx.compose.foundation.text.input.internal;

import N.y;
import Q.q0;
import T.F;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final e a(e eVar, q0 q0Var, y yVar, F f) {
        return eVar.then(new LegacyAdaptingPlatformTextInputModifier(q0Var, yVar, f));
    }
}
