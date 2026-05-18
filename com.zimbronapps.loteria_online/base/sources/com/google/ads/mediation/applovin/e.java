package com.google.ads.mediation.applovin;

import Y5.q;
import Y5.r;
import android.os.Bundle;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e implements q, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener, AppLovinAdLoadListener {
    public static final String ERROR_MSG_MULTIPLE_INTERSTITIAL_AD = " Cannot load multiple interstitial ads with the same Zone ID. Let the first ad finish loading before attempting to load another. ";
    protected static final String TAG = "e";
    protected final a appLovinAdFactory;
    protected final d appLovinInitializer;
    protected AppLovinAd appLovinInterstitialAd;
    private r interstitialAdCallback;
    protected final Y5.e interstitialAdLoadCallback;
    protected Bundle networkExtras;
    protected String zoneId;

    public e(Y5.e eVar, d dVar, a aVar) {
        this.interstitialAdLoadCallback = eVar;
        this.appLovinInitializer = dVar;
        this.appLovinAdFactory = aVar;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial clicked.");
        this.interstitialAdCallback.reportAdClicked();
        this.interstitialAdCallback.onAdLeftApplication();
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial displayed.");
        this.interstitialAdCallback.onAdOpened();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial dismissed.");
        this.interstitialAdCallback.onAdClosed();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial did load ad for zone: " + this.zoneId);
        this.appLovinInterstitialAd = appLovinAd;
        this.interstitialAdCallback = (r) this.interstitialAdLoadCallback.onSuccess(this);
    }

    public void failedToReceiveAd(int i) {
        L5.b adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, adError.c());
        this.interstitialAdLoadCallback.onFailure(adError);
    }

    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Interstitial video playback began.");
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
        Log.d(TAG, "Interstitial video playback ended at playback percent: " + d + "%.");
    }
}
