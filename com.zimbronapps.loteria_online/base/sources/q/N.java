package Q;

import Z0.T0;
import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public static final n a = new n();

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, T0 t0, u0.h hVar) {
        int r;
        int r2;
        if (!hVar.q() && (r = t0.r(hVar.l())) <= (r2 = t0.r(hVar.e()))) {
            while (true) {
                m.a(builder, t0.s(r), t0.v(r), t0.t(r), t0.m(r));
                if (r == r2) {
                    break;
                }
                r++;
            }
        }
        return builder;
    }
}
