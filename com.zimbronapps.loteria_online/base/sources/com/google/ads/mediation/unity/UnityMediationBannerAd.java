package com.google.ads.mediation.unity;

import Y5.k;
import Y5.l;
import Y5.m;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.UUID;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class UnityMediationBannerAd implements k, BannerView.IListener {
    static final String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    static final String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private String bannerPlacementId;
    private String gameId;
    private l mediationBannerAdCallback;
    private final Y5.e mediationBannerAdLoadCallback;
    private final b unityAdsLoader;
    private final d unityBannerViewFactory;
    private e unityBannerViewWrapper;
    private final f unityInitializer;

    public class a implements IUnityAdsInitializationListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ UnityBannerSize c;
        public final /* synthetic */ m d;
        public final /* synthetic */ String e;

        public a(Context context, Activity activity, UnityBannerSize unityBannerSize, m mVar, String str) {
            this.a = context;
            this.b = activity;
            this.c = unityBannerSize;
            this.d = mVar;
            this.e = str;
        }

        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", new Object[]{UnityMediationBannerAd.b(UnityMediationBannerAd.this), UnityMediationBannerAd.a(UnityMediationBannerAd.this)}));
            com.google.ads.mediation.unity.a.l(MobileAds.getRequestConfiguration(), new MetaData(this.a));
            if (UnityMediationBannerAd.f(UnityMediationBannerAd.this) == null) {
                UnityMediationBannerAd unityMediationBannerAd = UnityMediationBannerAd.this;
                UnityMediationBannerAd.g(unityMediationBannerAd, UnityMediationBannerAd.e(unityMediationBannerAd).a(this.b, UnityMediationBannerAd.a(UnityMediationBannerAd.this), this.c));
            }
            UnityMediationBannerAd.f(UnityMediationBannerAd.this).c(UnityMediationBannerAd.this);
            UnityAdsLoadOptions a = UnityMediationBannerAd.d(UnityMediationBannerAd.this).a(UUID.randomUUID().toString());
            a.set("watermark", this.d.e());
            String str = this.e;
            if (str != null) {
                a.setAdMarkup(str);
            }
            UnityMediationBannerAd.f(UnityMediationBannerAd.this).b(a);
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            L5.b c = com.google.ads.mediation.unity.a.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{UnityMediationBannerAd.b(UnityMediationBannerAd.this), str}));
            Log.w(UnityMediationAdapter.TAG, c.toString());
            UnityMediationBannerAd.c(UnityMediationBannerAd.this).onFailure(c);
        }
    }

    public UnityMediationBannerAd(Y5.e eVar, f fVar, d dVar, b bVar) {
        this.mediationBannerAdLoadCallback = eVar;
        this.unityBannerViewFactory = dVar;
        this.unityInitializer = fVar;
        this.unityAdsLoader = bVar;
    }

    public static /* bridge */ /* synthetic */ String a(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.bannerPlacementId;
    }

    public static /* bridge */ /* synthetic */ String b(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.gameId;
    }

    public static /* bridge */ /* synthetic */ Y5.e c(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.mediationBannerAdLoadCallback;
    }

    public static /* bridge */ /* synthetic */ b d(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.unityAdsLoader;
    }

    public static /* bridge */ /* synthetic */ d e(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.unityBannerViewFactory;
    }

    public static /* bridge */ /* synthetic */ e f(UnityMediationBannerAd unityMediationBannerAd) {
        return unityMediationBannerAd.unityBannerViewWrapper;
    }

    public static /* bridge */ /* synthetic */ void g(UnityMediationBannerAd unityMediationBannerAd, e eVar) {
        unityMediationBannerAd.unityBannerViewWrapper = eVar;
    }

    public View getView() {
        return this.unityBannerViewWrapper.a();
    }

    public void loadAd(m mVar) {
        Context b = mVar.b();
        Bundle d = mVar.d();
        L5.h f = mVar.f();
        this.gameId = d.getString("gameId");
        String string = d.getString("zoneId");
        this.bannerPlacementId = string;
        if (!com.google.ads.mediation.unity.a.a(this.gameId, string)) {
            L5.b bVar = new L5.b(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            Log.w(UnityMediationAdapter.TAG, bVar.toString());
            this.mediationBannerAdLoadCallback.onFailure(bVar);
            return;
        }
        if (!(b instanceof Activity)) {
            L5.b bVar2 = new L5.b(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
            Log.w(UnityMediationAdapter.TAG, bVar2.toString());
            this.mediationBannerAdLoadCallback.onFailure(bVar2);
            return;
        }
        Activity activity = (Activity) b;
        String a2 = mVar.a();
        UnityBannerSize k = com.google.ads.mediation.unity.a.k(b, f, !TextUtils.isEmpty(a2));
        if (k != null) {
            this.unityInitializer.b(b, this.gameId, new a(b, activity, k, mVar, a2));
            return;
        }
        L5.b bVar3 = new L5.b(110, "There is no matching Unity Ads ad size for Google ad size: " + f, "com.google.ads.mediation.unity");
        Log.w(UnityMediationAdapter.TAG, bVar3.toString());
        this.mediationBannerAdLoadCallback.onFailure(bVar3);
    }

    public void onBannerClick(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was clicked for placement ID: %s", new Object[]{bannerView.getPlacementId()}));
        l lVar = this.mediationBannerAdCallback;
        if (lVar == null) {
            return;
        }
        lVar.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        L5.b b = com.google.ads.mediation.unity.a.b(com.google.ads.mediation.unity.a.j(bannerErrorInfo), bannerErrorInfo.errorMessage);
        Log.w(UnityMediationAdapter.TAG, b.toString());
        this.mediationBannerAdLoadCallback.onFailure(b);
    }

    public void onBannerLeftApplication(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad left application for placement ID: %s", new Object[]{bannerView.getPlacementId()}));
        l lVar = this.mediationBannerAdCallback;
        if (lVar == null) {
            return;
        }
        lVar.onAdLeftApplication();
    }

    public void onBannerLoaded(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads finished loading banner ad for placement ID: %s", new Object[]{bannerView.getPlacementId()}));
        this.mediationBannerAdCallback = (l) this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    public void onBannerShown(BannerView bannerView) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was shown for placement ID: %s", new Object[]{bannerView.getPlacementId()}));
        l lVar = this.mediationBannerAdCallback;
        if (lVar != null) {
            lVar.reportAdImpression();
        }
    }
}
