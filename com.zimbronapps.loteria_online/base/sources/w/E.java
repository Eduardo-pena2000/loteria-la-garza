package W;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.h2;
import b0.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends f {
    public /* synthetic */ e(boolean z, float f, h2 h2Var, kotlin.jvm.internal.k kVar) {
        this(z, f, h2Var);
    }

    public o c(E.k kVar, boolean z, float f, h2 h2Var, h2 h2Var2, b0.m mVar, int i) {
        mVar.V(331259447);
        if (w.L()) {
            w.U(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup b = t.b((View) mVar.x(AndroidCompositionLocals_androidKt.k()));
        boolean U = ((((i & 14) ^ 6) > 4 && mVar.U(kVar)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && mVar.U(this)) || (i & 196608) == 131072) | mVar.U(b);
        Object C = mVar.C();
        if (U || C == b0.m.a.a()) {
            C = new a(z, f, h2Var, h2Var2, b, null);
            mVar.t(C);
        }
        a aVar = (a) C;
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return aVar;
    }

    public e(boolean z, float f, h2 h2Var) {
        super(z, f, h2Var, null);
    }
}
