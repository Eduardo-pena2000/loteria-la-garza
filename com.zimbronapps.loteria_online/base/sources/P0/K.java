package P0;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class k implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ k(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.K(this.a, z);
    }
}
