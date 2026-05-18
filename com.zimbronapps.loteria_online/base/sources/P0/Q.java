package P0;

import android.view.accessibility.AccessibilityManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class q implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ androidx.compose.ui.platform.g a;

    public /* synthetic */ q(androidx.compose.ui.platform.g gVar) {
        this.a = gVar;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        androidx.compose.ui.platform.g.n(this.a, z);
    }
}
