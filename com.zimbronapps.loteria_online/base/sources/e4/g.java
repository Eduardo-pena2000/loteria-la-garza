package E4;

import T1.A0;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public static final g a = new g();

    public final Rect a(Context context) {
        t.g(context, "context");
        Rect a2 = d.a(c.a((WindowManager) context.getSystemService(WindowManager.class)));
        t.f(a2, "wm.currentWindowMetrics.bounds");
        return a2;
    }

    public final A0 b(Context context) {
        t.g(context, "context");
        WindowInsets a2 = e.a(c.a((WindowManager) context.getSystemService(WindowManager.class)));
        t.f(a2, "context.getSystemService…indowMetrics.windowInsets");
        A0 x = A0.x(a2);
        t.f(x, "toWindowInsetsCompat(platformInsets)");
        return x;
    }

    public final A4.l c(Context context) {
        t.g(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        A0 x = A0.x(e.a(c.a(windowManager)));
        t.f(x, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect a2 = d.a(c.a(windowManager));
        t.f(a2, "wm.currentWindowMetrics.bounds");
        return new A4.l(a2, x);
    }

    public final Rect d(Context context) {
        t.g(context, "context");
        Rect a2 = d.a(f.a((WindowManager) context.getSystemService(WindowManager.class)));
        t.f(a2, "wm.maximumWindowMetrics.bounds");
        return a2;
    }
}
