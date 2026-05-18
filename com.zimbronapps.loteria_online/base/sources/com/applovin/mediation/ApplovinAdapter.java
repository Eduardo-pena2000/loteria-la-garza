package com.applovin.mediation;

import L5.b;
import L5.h;
import Y5.f;
import Y5.n;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ApplovinAdapter extends AppLovinMediationAdapter implements MediationBannerAdapter {
    private static final boolean LOGGING_ENABLED = true;
    private AppLovinAdView adView;
    private FrameLayout adViewWrapper;
    private AppLovinSdk sdk;
    private String zoneId;

    public class 1 implements d.b {
        final /* synthetic */ AppLovinAdSize val$appLovinAdSize;
        final /* synthetic */ Context val$context;
        final /* synthetic */ n val$mediationBannerListener;
        final /* synthetic */ Bundle val$serverParameters;

        public 1(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, n nVar) {
            this.val$context = context;
            this.val$serverParameters = bundle;
            this.val$appLovinAdSize = appLovinAdSize;
            this.val$mediationBannerListener = nVar;
        }

        public void onInitializeSuccess() {
            ApplovinAdapter.f(ApplovinAdapter.this, d.a().c(this.val$context));
            ApplovinAdapter.g(ApplovinAdapter.this, AppLovinUtils.retrieveZoneId(this.val$serverParameters));
            ApplovinAdapter.log(3, "Requesting banner of size " + this.val$appLovinAdSize + " for zone: " + ApplovinAdapter.d(ApplovinAdapter.this));
            ApplovinAdapter.e(ApplovinAdapter.this, new AppLovinAdView(ApplovinAdapter.c(ApplovinAdapter.this), this.val$appLovinAdSize, this.val$context));
            AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(ApplovinAdapter.d(ApplovinAdapter.this), ApplovinAdapter.a(ApplovinAdapter.this), ApplovinAdapter.this, this.val$mediationBannerListener);
            ApplovinAdapter.a(ApplovinAdapter.this).setAdDisplayListener(appLovinBannerAdListener);
            ApplovinAdapter.a(ApplovinAdapter.this).setAdClickListener(appLovinBannerAdListener);
            ApplovinAdapter.a(ApplovinAdapter.this).setAdViewEventListener(appLovinBannerAdListener);
            ApplovinAdapter.b(ApplovinAdapter.this).addView(ApplovinAdapter.a(ApplovinAdapter.this));
            if (TextUtils.isEmpty(ApplovinAdapter.d(ApplovinAdapter.this))) {
                ApplovinAdapter.c(ApplovinAdapter.this).getAdService().loadNextAd(this.val$appLovinAdSize, appLovinBannerAdListener);
            } else {
                ApplovinAdapter.c(ApplovinAdapter.this).getAdService().loadNextAdForZoneId(ApplovinAdapter.d(ApplovinAdapter.this), appLovinBannerAdListener);
            }
        }
    }

    public static /* bridge */ /* synthetic */ AppLovinAdView a(ApplovinAdapter applovinAdapter) {
        return applovinAdapter.adView;
    }

    public static /* bridge */ /* synthetic */ FrameLayout b(ApplovinAdapter applovinAdapter) {
        return applovinAdapter.adViewWrapper;
    }

    public static /* bridge */ /* synthetic */ AppLovinSdk c(ApplovinAdapter applovinAdapter) {
        return applovinAdapter.sdk;
    }

    public static /* bridge */ /* synthetic */ String d(ApplovinAdapter applovinAdapter) {
        return applovinAdapter.zoneId;
    }

    public static /* bridge */ /* synthetic */ void e(ApplovinAdapter applovinAdapter, AppLovinAdView appLovinAdView) {
        applovinAdapter.adView = appLovinAdView;
    }

    public static /* bridge */ /* synthetic */ void f(ApplovinAdapter applovinAdapter, AppLovinSdk appLovinSdk) {
        applovinAdapter.sdk = appLovinSdk;
    }

    public static /* bridge */ /* synthetic */ void g(ApplovinAdapter applovinAdapter, String str) {
        applovinAdapter.zoneId = str;
    }

    public static void log(int i, String str) {
        Log.println(i, "AppLovinAdapter", str);
    }

    public View getBannerView() {
        return this.adViewWrapper;
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        if (AppLovinUtils.isChildUser()) {
            nVar.onAdFailedToLoad(this, AppLovinUtils.getChildUserError());
            return;
        }
        String string = bundle.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            b bVar = new b(110, "Missing or invalid SDK Key.", "com.google.ads.mediation.applovin");
            log(6, bVar.c());
            nVar.onAdFailedToLoad(this, bVar);
            return;
        }
        AppLovinAdSize appLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, hVar);
        if (appLovinAdSizeFromAdMobAdSize == null) {
            b bVar2 = new b(101, "Failed to request banner with unsupported size.", "com.google.ads.mediation.applovin");
            log(6, bVar2.c());
            nVar.onAdFailedToLoad(this, bVar2);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hVar.k(context), hVar.d(context));
            FrameLayout frameLayout = new FrameLayout(context);
            this.adViewWrapper = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            d.a().b(context, string, new 1(context, bundle, appLovinAdSizeFromAdMobAdSize, nVar));
        }
    }
}
