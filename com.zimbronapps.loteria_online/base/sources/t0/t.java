package t0;

import O0.A0;
import O0.B0;
import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public static final t a = new t();

    public final void a(FocusTargetNode focusTargetNode) {
        O0.j node = focusTargetNode.getNode();
        A0 a0 = node instanceof A0 ? (A0) node : null;
        if (a0 != null) {
            B0.b(a0);
        }
    }
}
