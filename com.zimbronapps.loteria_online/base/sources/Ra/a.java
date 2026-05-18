package ra;

import Y9.a;
import android.content.Context;
import com.unity3d.ads.metadata.MetaData;
import kotlin.jvm.internal.t;
import ra.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements Y9.a, Z9.a, f {
    public Context a;

    public void a(boolean z) {
        Context context = this.a;
        if (context == null) {
            t.v("context");
            context = null;
        }
        MetaData a = b.a(context);
        a.set("gdpr.consent", Boolean.valueOf(z));
        a.commit();
    }

    public void b(boolean z) {
        Context context = this.a;
        if (context == null) {
            t.v("context");
            context = null;
        }
        MetaData a = b.a(context);
        a.set("privacy.consent", Boolean.valueOf(z));
        a.commit();
    }

    public void onAttachedToActivity(Z9.c binding) {
        t.g(binding, "binding");
    }

    public void onAttachedToEngine(a.b flutterPluginBinding) {
        t.g(flutterPluginBinding, "flutterPluginBinding");
        this.a = flutterPluginBinding.a();
        f.a aVar = f.Y8;
        da.b b = flutterPluginBinding.b();
        t.f(b, "getBinaryMessenger(...)");
        f.a.g(aVar, b, this, null, 4, null);
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        f.a aVar = f.Y8;
        da.b b = binding.b();
        t.f(b, "getBinaryMessenger(...)");
        f.a.g(aVar, b, null, null, 4, null);
    }

    public void onReattachedToActivityForConfigChanges(Z9.c binding) {
        t.g(binding, "binding");
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }
}
