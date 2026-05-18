package com.applovin.mediation.adapters;

import android.os.Bundle;
import com.applovin.impl.l2;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.b;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinAdapterAppOpenListener implements m2, AppLovinAdClickListener, l2 {
    private final MaxAppOpenAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterAppOpenListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxAppOpenAdapterListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad clicked");
        this.listener.onAppOpenAdClicked();
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad shown");
        Bundle bundle = new Bundle(1);
        if (appLovinAd instanceof b) {
            bundle.putBundle("applovin_ad_view_info", ((b) appLovinAd).h());
        }
        this.listener.onAppOpenAdDisplayed(bundle);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad hidden");
        this.listener.onAppOpenAdHidden();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("App open ad loaded");
        this.parentAdapter.loadedAppOpenAd = appLovinAd;
        this.listener.onAppOpenAdLoaded();
    }

    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        this.parentAdapter.log("App open ad failed to load with error: " + appLovinError);
        this.listener.onAppOpenAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    public void onAdDisplayFailed(String str) {
        this.parentAdapter.log("App open ad failed to display with error: " + str);
        this.listener.onAppOpenAdDisplayFailed(new MaxAdapterError(-4205, str));
    }
}
