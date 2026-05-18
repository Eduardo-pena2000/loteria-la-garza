package P0;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class i implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ i(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.O(this.a);
    }
}
