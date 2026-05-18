package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.l2;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.b;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinAdapterInterstitialListener implements m2, AppLovinAdClickListener, l2 {
    private final MaxInterstitialAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterInterstitialListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxInterstitialAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad clicked");
        this.listener.onInterstitialAdClicked();
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof b) {
            bundle.putBundle("applovin_ad_view_info", ((b) appLovinAd).h());
        }
        this.listener.onInterstitialAdDisplayed(bundle);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad hidden");
        this.listener.onInterstitialAdHidden();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Interstitial ad loaded");
        this.parentAdapter.loadedInterstitialAd = appLovinAd;
        this.listener.onInterstitialAdLoaded();
    }

    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        this.parentAdapter.log("Interstitial ad failed to load with error: " + appLovinError);
        this.listener.onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    public void onAdDisplayFailed(String str) {
        this.parentAdapter.log("Interstitial ad failed to display with error: " + str);
        this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(-5200, str));
    }
}
