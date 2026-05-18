package r1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class r implements o {
    public void a(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    public void b(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    public void c(View view, int i, int i2) {
    }
}
