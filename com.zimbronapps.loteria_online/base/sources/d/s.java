package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import d.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static C c;

    public static final void a(j jVar, M m, M m2) {
        kotlin.jvm.internal.t.g(jVar, "<this>");
        kotlin.jvm.internal.t.g(m, "statusBarStyle");
        kotlin.jvm.internal.t.g(m2, "navigationBarStyle");
        View decorView = jVar.getWindow().getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window.decorView");
        Qa.l b2 = m.b();
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.t.f(resources, "view.resources");
        boolean booleanValue = ((Boolean) b2.invoke(resources)).booleanValue();
        Qa.l b3 = m2.b();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.t.f(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) b3.invoke(resources2)).booleanValue();
        C c2 = c;
        if (c2 == null) {
            int i = Build.VERSION.SDK_INT;
            c2 = i >= 30 ? new A() : i >= 29 ? new z() : i >= 28 ? new w() : i >= 26 ? new u() : new t();
        }
        Window window = jVar.getWindow();
        kotlin.jvm.internal.t.f(window, "window");
        c2.a(m, m2, window, decorView, booleanValue, booleanValue2);
        Window window2 = jVar.getWindow();
        kotlin.jvm.internal.t.f(window2, "window");
        c2.b(window2);
    }

    public static /* synthetic */ void b(j jVar, M m, M m2, int i, Object obj) {
        if ((i & 1) != 0) {
            m = M.a.b(M.e, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            m2 = M.a.b(M.e, a, b, null, 4, null);
        }
        a(jVar, m, m2);
    }
}
