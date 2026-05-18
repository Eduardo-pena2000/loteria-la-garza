package T1;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m0 {

    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static class b {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static class c {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static b1 a(Window window, View view) {
        return new b1(window, view);
    }

    public static void b(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c.a(window, z);
        } else if (i >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
