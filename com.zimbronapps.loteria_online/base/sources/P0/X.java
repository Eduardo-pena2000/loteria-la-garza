package P0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements ViewTranslationCallback {
    public static final x a = new x();

    public boolean onClearTranslation(View view) {
        kotlin.jvm.internal.t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().r();
        return true;
    }

    public boolean onHideTranslation(View view) {
        kotlin.jvm.internal.t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().t();
        return true;
    }

    public boolean onShowTranslation(View view) {
        kotlin.jvm.internal.t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().w();
        return true;
    }
}
