package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x5 extends z5 {
    private final k j;

    public x5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar2);
        this.j = kVar;
    }

    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.j.b());
        hashMap.put("adtoken_prefix", this.j.d());
        return hashMap;
    }
}
