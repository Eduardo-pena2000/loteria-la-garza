package P0;

import android.view.accessibility.AccessibilityManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class p implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ androidx.compose.ui.platform.g a;

    public /* synthetic */ p(androidx.compose.ui.platform.g gVar) {
        this.a = gVar;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        androidx.compose.ui.platform.g.p(this.a, z);
    }
}
