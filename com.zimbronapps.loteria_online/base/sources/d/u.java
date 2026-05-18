package d;

import T1.b1;
import T1.m0;
import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class u extends B {
    public void a(M m, M m2, Window window, View view, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(m, "statusBarStyle");
        kotlin.jvm.internal.t.g(m2, "navigationBarStyle");
        kotlin.jvm.internal.t.g(window, "window");
        kotlin.jvm.internal.t.g(view, "view");
        m0.b(window, false);
        window.setStatusBarColor(m.d(z));
        window.setNavigationBarColor(m2.d(z2));
        b1 b1Var = new b1(window, view);
        b1Var.b(!z);
        b1Var.a(!z2);
    }
}
