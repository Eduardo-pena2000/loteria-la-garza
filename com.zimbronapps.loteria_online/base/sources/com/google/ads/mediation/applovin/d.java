package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d {
    public static d b;
    public final h a = new h();

    public class a implements AppLovinSdk.SdkInitializationListener {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.a.onInitializeSuccess();
        }
    }

    public interface b {
        void onInitializeSuccess();
    }

    public static d a() {
        if (b == null) {
            b = new d();
        }
        return b;
    }

    public void b(Context context, String str, b bVar) {
        this.a.a(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider("admob").setPluginVersion("13.5.1.0").build(), new a(bVar));
    }

    public AppLovinSdk c(Context context) {
        return this.a.a(context);
    }
}
