package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a6 extends y5 {
    private final k j;

    public a6(k kVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar2);
        this.j = kVar;
    }

    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.j.b());
        hashMap.put("adtoken_prefix", this.j.d());
        return hashMap;
    }
}
