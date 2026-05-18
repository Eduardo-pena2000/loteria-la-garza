package d;

import T1.b1;
import T1.m0;
import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class z extends w {
    public void a(M m, M m2, Window window, View view, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(m, "statusBarStyle");
        kotlin.jvm.internal.t.g(m2, "navigationBarStyle");
        kotlin.jvm.internal.t.g(window, "window");
        kotlin.jvm.internal.t.g(view, "view");
        m0.b(window, false);
        window.setStatusBarColor(m.e(z));
        window.setNavigationBarColor(m2.e(z2));
        x.a(window, false);
        y.a(window, m2.c() == 0);
        b1 b1Var = new b1(window, view);
        b1Var.b(!z);
        b1Var.a(true ^ z2);
    }
}
