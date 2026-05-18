package A;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final boolean a(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-882615028, i, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z = (((Configuration) mVar.x(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (b0.w.L()) {
            b0.w.T();
        }
        return z;
    }
}
