package pa;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import za.Y4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class w {

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ OnInitializationCompleteListener b;

        public a(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
            this.a = context;
            this.b = onInitializationCompleteListener;
        }

        public void run() {
            MobileAds.initialize(this.a, this.b);
        }
    }

    public void a(Context context) {
        MobileAds.disableMediationAdapterInitialization(context);
    }

    public L5.y b() {
        return MobileAds.getRequestConfiguration();
    }

    public String c() {
        return MobileAds.getVersion().toString();
    }

    public void d(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        new Thread(new a(context, onInitializationCompleteListener)).start();
    }

    public void e(Context context, L5.s sVar) {
        MobileAds.openAdInspector(context, sVar);
    }

    public void f(Context context, String str) {
        MobileAds.openDebugMenu(context, str);
    }

    public void g(int i, io.flutter.embedding.engine.a aVar) {
        WebView a2 = Y4.a(aVar, i);
        if (a2 != null) {
            MobileAds.registerWebView(a2);
            return;
        }
        Log.w("FlutterMobileAdsWrapper", "MobileAds.registerWebView unable to find webView with id: " + i);
    }

    public void h(boolean z) {
        MobileAds.setAppMuted(z);
    }

    public void i(double d) {
        MobileAds.setAppVolume((float) d);
    }
}
