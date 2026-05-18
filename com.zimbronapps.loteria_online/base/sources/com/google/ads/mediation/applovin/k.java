package com.google.ads.mediation.applovin;

import Y5.q;
import Y5.s;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k extends e implements q {
    public static final HashMap c = new HashMap();
    public AppLovinSdk a;
    public boolean b;

    public class a implements d.b {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;

        public a(Bundle bundle, Context context) {
            this.a = bundle;
            this.b = context;
        }

        public void onInitializeSuccess() {
            k.this.zoneId = AppLovinUtils.retrieveZoneId(this.a);
            HashMap hashMap = k.c;
            if (hashMap.containsKey(k.this.zoneId) && ((WeakReference) hashMap.get(k.this.zoneId)).get() != null) {
                L5.b bVar = new L5.b(105, " Cannot load multiple interstitial ads with the same Zone ID. Let the first ad finish loading before attempting to load another. ", "com.google.ads.mediation.applovin");
                Log.e(e.TAG, bVar.c());
                k.this.interstitialAdLoadCallback.onFailure(bVar);
                return;
            }
            hashMap.put(k.this.zoneId, new WeakReference(k.this));
            k kVar = k.this;
            k.b(kVar, kVar.appLovinInitializer.c(this.b));
            Log.d(e.TAG, "Requesting interstitial for zone: " + k.this.zoneId);
            if (TextUtils.isEmpty(k.this.zoneId)) {
                k.a(k.this).getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, k.this);
                return;
            }
            AppLovinAdService adService = k.a(k.this).getAdService();
            k kVar2 = k.this;
            adService.loadNextAdForZoneId(kVar2.zoneId, kVar2);
        }
    }

    public k(Y5.e eVar, d dVar, com.google.ads.mediation.applovin.a aVar) {
        super(eVar, dVar, aVar);
        this.b = false;
    }

    public static /* bridge */ /* synthetic */ AppLovinSdk a(k kVar) {
        return kVar.a;
    }

    public static /* bridge */ /* synthetic */ void b(k kVar, AppLovinSdk appLovinSdk) {
        kVar.a = appLovinSdk;
    }

    public void adHidden(AppLovinAd appLovinAd) {
        c();
        super.adHidden(appLovinAd);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (this.b) {
            c();
        }
        super.adReceived(appLovinAd);
    }

    public void c() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap hashMap = c;
        if (hashMap.containsKey(this.zoneId) && equals(((WeakReference) hashMap.get(this.zoneId)).get())) {
            hashMap.remove(this.zoneId);
        }
    }

    public void failedToReceiveAd(int i) {
        c();
        super.failedToReceiveAd(i);
    }

    public void loadAd(s sVar) {
        Context b = sVar.b();
        Bundle d = sVar.d();
        String string = d.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            L5.b bVar = new L5.b(110, "Missing or invalid SDK Key.", "com.applovin.sdk");
            Log.e(e.TAG, bVar.c());
            this.interstitialAdLoadCallback.onFailure(bVar);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.b = true;
            }
            this.networkExtras = sVar.c();
            this.appLovinInitializer.b(b, string, new a(d, b));
        }
    }

    public void showAd(Context context) {
        this.a.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog d = this.appLovinAdFactory.d(this.a, context);
        d.setAdDisplayListener(this);
        d.setAdClickListener(this);
        d.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = e.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                d.show();
                return;
            }
            return;
        }
        Log.d(e.TAG, "Showing interstitial for zone: " + this.zoneId);
        d.showAndRender(this.appLovinInterstitialAd);
    }
}
