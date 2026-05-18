package qa;

import Y9.a;
import android.content.Context;
import com.applovin.sdk.AppLovinPrivacySettings;
import kotlin.jvm.internal.t;
import qa.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class g implements Y9.a, Z9.a, d {
    public Context a;

    public void a(boolean z) {
        Context context = this.a;
        if (context == null) {
            t.v("context");
            context = null;
        }
        AppLovinPrivacySettings.setDoNotSell(z, context);
    }

    public void b(boolean z) {
        Context context = this.a;
        if (context == null) {
            t.v("context");
            context = null;
        }
        AppLovinPrivacySettings.setHasUserConsent(z, context);
    }

    public void onAttachedToActivity(Z9.c binding) {
        t.g(binding, "binding");
    }

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        t.g(flutterPluginBinding, "flutterPluginBinding");
        this.a = flutterPluginBinding.a();
        d.a aVar = d.X8;
        da.b b = flutterPluginBinding.b();
        t.f(b, "getBinaryMessenger(...)");
        d.a.g(aVar, b, this, null, 4, null);
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        d.a aVar = d.X8;
        da.b b = binding.b();
        t.f(b, "getBinaryMessenger(...)");
        d.a.g(aVar, b, null, null, 4, null);
    }

    public void onReattachedToActivityForConfigChanges(Z9.c binding) {
        t.g(binding, "binding");
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }
}
