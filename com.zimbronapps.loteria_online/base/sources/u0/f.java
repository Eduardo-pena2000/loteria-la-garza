package U0;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final String a(int i, m mVar, int i2) {
        if (w.L()) {
            w.U(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) mVar.x(AndroidCompositionLocals_androidKt.j())).getString(i);
        if (w.L()) {
            w.T();
        }
        return string;
    }
}
