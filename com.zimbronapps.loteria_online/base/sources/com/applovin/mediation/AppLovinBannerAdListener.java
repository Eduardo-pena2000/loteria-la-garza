package com.applovin.mediation;

import L5.b;
import Y5.n;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class AppLovinBannerAdListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private final AppLovinAdView adView;
    private final ApplovinAdapter adapter;
    private final n mediationBannerListener;
    private final String zoneId;

    public class 1 implements Runnable {
        public 1() {
        }

        public void run() {
            AppLovinBannerAdListener.b(AppLovinBannerAdListener.this).onAdLoaded(AppLovinBannerAdListener.a(AppLovinBannerAdListener.this));
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ b val$error;

        public 2(b bVar) {
            this.val$error = bVar;
        }

        public void run() {
            AppLovinBannerAdListener.b(AppLovinBannerAdListener.this).onAdFailedToLoad(AppLovinBannerAdListener.a(AppLovinBannerAdListener.this), this.val$error);
        }
    }

    public AppLovinBannerAdListener(String str, AppLovinAdView appLovinAdView, ApplovinAdapter applovinAdapter, n nVar) {
        this.adapter = applovinAdapter;
        this.mediationBannerListener = nVar;
        this.adView = appLovinAdView;
        this.zoneId = str;
    }

    public static /* bridge */ /* synthetic */ ApplovinAdapter a(AppLovinBannerAdListener appLovinBannerAdListener) {
        return appLovinBannerAdListener.adapter;
    }

    public static /* bridge */ /* synthetic */ n b(AppLovinBannerAdListener appLovinBannerAdListener) {
        return appLovinBannerAdListener.mediationBannerListener;
    }

    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner clicked.");
        this.mediationBannerListener.onAdClicked(this.adapter);
    }

    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner closed fullscreen.");
        this.mediationBannerListener.onAdClosed(this.adapter);
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner displayed.");
    }

    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner dismissed.");
    }

    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner left application.");
        this.mediationBannerListener.onAdLeftApplication(this.adapter);
    }

    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner opened fullscreen.");
        this.mediationBannerListener.onAdOpened(this.adapter);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner did load ad for zone: " + this.zoneId);
        this.adView.renderAd(appLovinAd);
        AppLovinSdkUtils.runOnUiThread(new 1());
    }

    public void failedToReceiveAd(int i) {
        b adError = AppLovinUtils.getAdError(i);
        ApplovinAdapter.log(5, "Failed to load banner ad with error: " + i);
        AppLovinSdkUtils.runOnUiThread(new 2(adError));
    }
}
