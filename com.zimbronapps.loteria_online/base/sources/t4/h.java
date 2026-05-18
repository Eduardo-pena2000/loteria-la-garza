package t4;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import u4.w;
import u4.x;
import u4.y;
import u4.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static w a(WebSettings webSettings) {
        try {
            return z.c().c(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new x();
        }
    }

    public static void b(WebSettings webSettings, boolean z) {
        if (!y.x0.c()) {
            throw y.a();
        }
        a(webSettings).a(z);
    }
}
