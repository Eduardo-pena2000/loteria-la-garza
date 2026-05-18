package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g6 extends i5 {
    private final JSONObject g;
    private final AppLovinNativeAdLoadListener h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.g = jSONObject;
        this.h = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            this.a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.g, this.h, this.a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.k(this.b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.g, this.a);
        this.h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
