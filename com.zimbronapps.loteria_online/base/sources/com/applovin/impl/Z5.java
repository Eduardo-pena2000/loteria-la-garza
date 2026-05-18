package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class z5 extends r5 {
    private final AppLovinNativeAdLoadListener i;

    public z5(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.i = appLovinNativeAdLoadListener;
    }

    public i5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.i, this.a);
    }

    public String e() {
        return r0.d(this.a);
    }

    public String f() {
        return r0.e(this.a);
    }

    public void a(int i, String str) {
        super.a(i, str);
        this.i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
