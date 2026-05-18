package com.google.ads.mediation.applovin;

import Y5.w;
import Y5.x;
import android.os.Bundle;
import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class f implements w, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.";
    protected static final String TAG = "f";
    protected final Y5.e adLoadCallback;
    protected final com.google.ads.mediation.applovin.a appLovinAdFactory;
    protected final d appLovinInitializer;
    protected AppLovinSdk appLovinSdk;
    protected final g appLovinSdkUtilsWrapper;
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    protected Bundle networkExtras;
    protected x rewardedAdCallback;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f fVar = f.this;
            fVar.rewardedAdCallback = (x) fVar.adLoadCallback.onSuccess(fVar);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ L5.b a;

        public b(L5.b bVar) {
            this.a = bVar;
        }

        public void run() {
            f.this.adLoadCallback.onFailure(this.a);
        }
    }

    public f(Y5.e eVar, d dVar, com.google.ads.mediation.applovin.a aVar, g gVar) {
        this.adLoadCallback = eVar;
        this.appLovinInitializer = dVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkUtilsWrapper = gVar;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.reportAdClicked();
        }
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        x xVar = this.rewardedAdCallback;
        if (xVar == null) {
            return;
        }
        xVar.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.onAdClosed();
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad.");
        this.appLovinSdkUtilsWrapper.a(new a());
    }

    public void failedToReceiveAd(int i) {
        L5.b adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, adError.toString());
        this.appLovinSdkUtilsWrapper.a(new b(adError));
    }

    public void userOverQuota(AppLovinAd appLovinAd, Map map) {
        Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
        Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
        String str = (String) map.get("currency");
        int parseDouble = (int) Double.parseDouble((String) map.get("amount"));
        Log.d(TAG, "Rewarded " + parseDouble + " " + str);
    }

    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i);
    }

    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.onVideoStart();
        }
    }

    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d + "%.");
        x xVar = this.rewardedAdCallback;
        if (xVar == null || !z) {
            return;
        }
        xVar.onUserEarnedReward();
        this.rewardedAdCallback.onVideoComplete();
    }
}
