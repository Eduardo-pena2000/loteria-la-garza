package P0;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b0 implements a0 {
    public static final b0 b = new b0();

    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int b2 = W.b(activity);
            int i = rect.bottom;
            if (i + b2 == point.y) {
                rect.bottom = i + b2;
            } else {
                int i2 = rect.right;
                if (i2 + b2 == point.x) {
                    rect.right = i2 + b2;
                }
            }
        }
        return rect;
    }
}
