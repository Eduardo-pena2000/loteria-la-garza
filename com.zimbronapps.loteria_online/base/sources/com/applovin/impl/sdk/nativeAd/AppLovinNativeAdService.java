package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.g6;
import com.applovin.impl.i5;
import com.applovin.impl.k;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t2;
import com.applovin.impl.x5;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final com.applovin.impl.sdk.o logger;
    private final com.applovin.impl.sdk.k sdk;

    public AppLovinNativeAdService(com.applovin.impl.sdk.k kVar) {
        this.sdk = kVar;
        this.logger = kVar.O();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            com.applovin.impl.sdk.o.h("AppLovinNativeAdService", "Empty ad token");
            t2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(trim, this.sdk);
        if (kVar.c() == k.a.REGULAR) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a("AppLovinNativeAdService", "Loading next ad for token: " + kVar);
            }
            this.sdk.q0().a((i5) new x5(kVar, appLovinNativeAdLoadListener, this.sdk), d6.b.CORE);
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            com.applovin.impl.sdk.o.h("AppLovinNativeAdService", "Invalid token type");
            t2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject a = kVar.a();
        if (a == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            com.applovin.impl.sdk.o.h("AppLovinNativeAdService", str2);
            t2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        r0.c(a, this.sdk);
        r0.b(a, this.sdk);
        r0.a(a, this.sdk);
        if (JsonUtils.getJSONArray(a, "ads", new JSONArray()).length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a("AppLovinNativeAdService", "Rendering ad for token: " + kVar);
            }
            this.sdk.q0().a((i5) new g6(a, appLovinNativeAdLoadListener, this.sdk), d6.b.CORE);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.b("AppLovinNativeAdService", "No ad returned from the server for token: " + kVar);
        }
        t2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
