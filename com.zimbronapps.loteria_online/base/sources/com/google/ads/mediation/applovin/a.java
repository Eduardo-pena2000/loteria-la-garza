package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a {
    public b a(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, L5.h hVar, Context context) {
        return b.b(appLovinSdk, appLovinAdSize, hVar, context);
    }

    public AppLovinIncentivizedInterstitial b(AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(appLovinSdk);
    }

    public AppLovinIncentivizedInterstitial c(String str, AppLovinSdk appLovinSdk) {
        return AppLovinIncentivizedInterstitial.create(str, appLovinSdk);
    }

    public AppLovinInterstitialAdDialog d(AppLovinSdk appLovinSdk, Context context) {
        return AppLovinInterstitialAd.create(appLovinSdk, context);
    }

    public MaxAppOpenAd e(String str) {
        return new MaxAppOpenAd(str);
    }
}
