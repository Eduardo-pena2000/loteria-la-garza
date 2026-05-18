package com.google.ads.mediation.unity;

import L5.A;
import Y5.m;
import Y5.o;
import Y5.s;
import Y5.y;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class UnityMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    static final int ERROR_AD_NOT_READY = 106;
    static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    static final int ERROR_FINISH = 109;
    static final int ERROR_INITIALIZATION_FAILURE = 111;
    static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    static final String ERROR_MSG_CONTEXT_NULL = "Activity context is null.";
    static final String ERROR_MSG_INITIALIZATION_FAILURE = "Unity Ads initialization failed: [%s] %s";
    static final String ERROR_MSG_MISSING_PARAMETERS = "Missing or invalid server parameters.";
    static final String ERROR_MSG_NON_ACTIVITY = "Unity Ads requires an Activity context to load ads.";
    static final int ERROR_NULL_CONTEXT = 104;
    static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    static final String KEY_GAME_ID = "gameId";
    static final String KEY_PLACEMENT_ID = "zoneId";
    static final String KEY_WATERMARK = "watermark";
    public static final String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    static final String TAG = "UnityMediationAdapter";
    private UnityMediationBannerAd bannerAd;
    private UnityMediationBannerAd bannerRtbAd;
    private g interstitialAd;
    private g interstitialRtbAd;
    private j rewardedAd;
    private j rewardedRtbAd;
    private final f unityInitializer = f.a();
    private final c unityAdsWrapper = new c();
    private final d unityBannerViewFactory = new d();
    private final b unityAdsLoader = new b();

    public class a implements IUnityAdsInitializationListener {
        public final /* synthetic */ Y5.b a;

        public a(Y5.b bVar) {
            this.a = bVar;
        }

        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, "Unity Ads initialized successfully.");
            this.a.onInitializationSucceeded();
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            L5.b c = com.google.ads.mediation.unity.a.c(unityAdsInitializationError, String.format("Unity Ads initialization failed: [%s] %s", new Object[]{unityAdsInitializationError, str}));
            Log.d(UnityMediationAdapter.TAG, c.toString());
            this.a.onInitializationFailed(c.toString());
        }
    }

    public static /* synthetic */ void a(a6.b bVar, String str) {
        d(bVar, str);
    }

    public static /* synthetic */ void b(a6.b bVar, String str) {
        c(bVar, str);
    }

    public static /* synthetic */ void c(a6.b bVar, String str) {
        if (str == null) {
            str = "";
        }
        bVar.onSuccess(str);
    }

    public static /* synthetic */ void d(a6.b bVar, String str) {
        if (str == null) {
            str = "";
        }
        bVar.onSuccess(str);
    }

    public void collectSignals(a6.a aVar, a6.b bVar) {
        AdFormat adFormat;
        L5.c f = com.google.ads.mediation.unity.a.f(aVar);
        L5.c cVar = L5.c.b;
        if (f == cVar && !(aVar.b() instanceof Activity)) {
            bVar.onFailure(new L5.b(105, "Unity Ads RTB Banner ads require activity context", "com.google.ads.mediation.unity"));
            return;
        }
        if (f == cVar) {
            adFormat = AdFormat.BANNER;
        } else if (f == L5.c.d || f == L5.c.e) {
            adFormat = AdFormat.REWARDED;
        } else if (f == L5.c.c) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            Log.w(TAG, "Unsupported ad format for Unity Ads: " + f);
            adFormat = null;
        }
        if (adFormat == null) {
            this.unityAdsWrapper.b(new i(bVar));
        } else {
            this.unityAdsWrapper.c(new TokenConfiguration(adFormat), new h(bVar));
        }
    }

    public A getSDKVersionInfo() {
        String version = UnityAds.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new A(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", new Object[]{version}));
        return new A(0, 0, 0);
    }

    public A getVersionInfo() {
        String[] split = "4.16.6.0".split("\\.");
        if (split.length >= 4) {
            return new A(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", new Object[]{"4.16.6.0"}));
        return new A(0, 0, 0);
    }

    public void initialize(Context context, Y5.b bVar, List list) {
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((o) it.next()).b().getString("gameId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", new Object[]{"gameId", hashSet, str}));
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            bVar.onInitializationFailed(new L5.b(101, "Missing or invalid Game ID.", "com.google.ads.mediation.unity").toString());
        } else {
            this.unityInitializer.b(context, str, new a(bVar));
        }
    }

    public void loadBannerAd(m mVar, Y5.e eVar) {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(eVar, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mVar);
    }

    public void loadInterstitialAd(s sVar, Y5.e eVar) {
        g gVar = new g(sVar, eVar, this.unityInitializer, this.unityAdsLoader);
        this.interstitialAd = gVar;
        gVar.f(sVar);
    }

    public void loadRewardedAd(y yVar, Y5.e eVar) {
        j jVar = new j(yVar, eVar, this.unityInitializer, this.unityAdsLoader);
        this.rewardedAd = jVar;
        jVar.h(yVar);
    }

    public void loadRtbBannerAd(m mVar, Y5.e eVar) {
        UnityMediationBannerAd unityMediationBannerAd = new UnityMediationBannerAd(eVar, this.unityInitializer, this.unityBannerViewFactory, this.unityAdsLoader);
        this.bannerRtbAd = unityMediationBannerAd;
        unityMediationBannerAd.loadAd(mVar);
    }

    public final void loadRtbInterstitialAd(s sVar, Y5.e eVar) {
        g gVar = new g(sVar, eVar, this.unityInitializer, this.unityAdsLoader);
        this.interstitialRtbAd = gVar;
        gVar.f(sVar);
    }

    public void loadRtbRewardedAd(y yVar, Y5.e eVar) {
        j jVar = new j(yVar, eVar, this.unityInitializer, this.unityAdsLoader);
        this.rewardedRtbAd = jVar;
        jVar.h(yVar);
    }
}
