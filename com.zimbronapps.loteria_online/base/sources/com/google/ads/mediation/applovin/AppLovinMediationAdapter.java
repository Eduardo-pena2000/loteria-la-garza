package com.google.ads.mediation.applovin;

import L5.A;
import Y5.m;
import Y5.o;
import Y5.s;
import Y5.y;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final int ERROR_CHILD_USER = 112;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_MISSING_AD_UNIT_ID = 113;
    public static final int ERROR_MISSING_SDK_KEY = 110;
    static final String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    static final String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATION_AD_NOT_READY = 106;
    private static final String TAG = "AppLovinMediationAdapter";
    private c bannerAd;
    private l rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private k waterfallInterstitialAd;
    private final d appLovinInitializer = d.a();
    private final com.google.ads.mediation.applovin.a appLovinAdFactory = new com.google.ads.mediation.applovin.a();
    private final h appLovinSdkWrapper = new h();
    private final g appLovinSdkUtilsWrapper = new g();

    public class a implements d.b {
        public final /* synthetic */ Y5.b a;

        public a(Y5.b bVar) {
            this.a = bVar;
        }

        public void onInitializeSuccess() {
            this.a.onInitializationSucceeded();
        }
    }

    public static AppLovinSdkSettings getSdkSettings(Context context) {
        return AppLovinSdk.getInstance(context).getSettings();
    }

    public void collectSignals(a6.a aVar, a6.b bVar) {
        if (AppLovinUtils.isChildUser()) {
            bVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        List a2 = aVar.a();
        if (!a2.isEmpty() && ((o) a2.get(0)).a() == L5.c.NATIVE) {
            L5.b bVar2 = new L5.b(108, "Requested to collect signal for unsupported native ad format. Ignoring...", "com.google.ads.mediation.applovin");
            Log.e(TAG, bVar2.c());
            bVar.onFailure(bVar2);
            return;
        }
        String str = TAG;
        Log.i(str, "Extras for signal collection: " + aVar.c());
        String bidToken = this.appLovinInitializer.c(aVar.b()).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            L5.b bVar3 = new L5.b(104, "Failed to generate bid token.", "com.google.ads.mediation.applovin");
            Log.e(str, bVar3.c());
            bVar.onFailure(bVar3);
        } else {
            Log.i(str, "Generated bid token: " + bidToken);
            bVar.onSuccess(bidToken);
        }
    }

    public A getSDKVersionInfo() {
        String b = this.appLovinSdkWrapper.b();
        String[] split = b.split("\\.");
        if (split.length >= 3) {
            return new A(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", new Object[]{b}));
        return new A(0, 0, 0);
    }

    public A getVersionInfo() {
        return getVersionInfo("13.5.1.0");
    }

    public void initialize(Context context, Y5.b bVar, List list) {
        if (AppLovinUtils.isChildUser()) {
            bVar.onInitializationFailed("MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((o) it.next()).b().getString("sdkKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            L5.b bVar2 = new L5.b(110, "Missing or invalid SDK Key.", "com.google.ads.mediation.applovin");
            Log.w(TAG, bVar2.c());
            bVar.onInitializationFailed(bVar2.c());
        } else {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                Log.w(TAG, String.format("Found more than one AppLovin SDK key. Using %s. Please update your app's ad unit mappings on Admob/GAM UI to use a single SDK key for ad serving to work as expected.", new Object[]{str}));
            }
            this.appLovinInitializer.b(context, str, new a(bVar));
        }
    }

    public void loadAppOpenAd(Y5.j jVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
        } else {
            new j(eVar, this.appLovinInitializer, this.appLovinAdFactory).b(jVar);
        }
    }

    public void loadBannerAd(m mVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        c k = c.k(eVar, this.appLovinInitializer, this.appLovinAdFactory);
        this.bannerAd = k;
        k.j(mVar);
    }

    public void loadInterstitialAd(s sVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        k kVar = new k(eVar, this.appLovinInitializer, this.appLovinAdFactory);
        this.waterfallInterstitialAd = kVar;
        kVar.loadAd(sVar);
    }

    public void loadRewardedAd(y yVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        l lVar = new l(eVar, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rewardedRenderer = lVar;
        lVar.loadAd(yVar);
    }

    public void loadRtbInterstitialAd(s sVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(eVar, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd(sVar);
    }

    public void loadRtbRewardedAd(y yVar, Y5.e eVar) {
        if (AppLovinUtils.isChildUser()) {
            eVar.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(eVar, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd(yVar);
    }

    public A getVersionInfo(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 4) {
            return new A(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", new Object[]{str}));
        return new A(0, 0, 0);
    }
}
