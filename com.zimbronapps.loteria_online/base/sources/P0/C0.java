package P0;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c0 implements a0 {
    public static final c0 b = new c0();

    public Rect a(Activity activity) {
        DisplayCutout a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", (Class[]) null).invoke(obj, (Object[]) null);
                kotlin.jvm.internal.t.e(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", (Class[]) null).invoke(obj, (Object[]) null);
                kotlin.jvm.internal.t.e(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            W.c(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int b2 = W.b(activity);
            int i = rect.bottom;
            if (i + b2 == point.y) {
                rect.bottom = i + b2;
            } else {
                int i2 = rect.right;
                if (i2 + b2 == point.x) {
                    rect.right = i2 + b2;
                } else if (rect.left == b2) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (a = W.a(defaultDisplay)) != null) {
            if (rect.left == a.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == a.getSafeInsetRight()) {
                rect.right += a.getSafeInsetRight();
            }
            if (rect.top == a.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == a.getSafeInsetBottom()) {
                rect.bottom += a.getSafeInsetBottom();
            }
        }
        return rect;
    }
}
