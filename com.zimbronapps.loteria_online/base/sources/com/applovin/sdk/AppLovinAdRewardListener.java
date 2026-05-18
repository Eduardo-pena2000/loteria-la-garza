package com.applovin.sdk;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface AppLovinAdRewardListener {
    void userOverQuota(AppLovinAd appLovinAd, Map map);

    void userRewardRejected(AppLovinAd appLovinAd, Map map);

    void userRewardVerified(AppLovinAd appLovinAd, Map map);

    void validationRequestFailed(AppLovinAd appLovinAd, int i);
}
