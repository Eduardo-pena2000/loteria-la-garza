package com.google.ads.mediation.unity;

import Y5.q;
import Y5.r;
import Y5.s;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MetaData;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g implements q, IUnityAdsLoadListener, IUnityAdsShowListener {
    public String a;
    public final Y5.e b;
    public final f c;
    public final b d;
    public r e;
    public String f;
    public final String g;

    public class a implements IUnityAdsInitializationListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(String str, Context context, String str2) {
            this.a = str;
            this.b = context;
            this.c = str2;
        }

        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", new Object[]{this.a, g.c(g.this)}));
            com.google.ads.mediation.unity.a.l(MobileAds.getRequestConfiguration(), new MetaData(this.b));
            g.e(g.this, UUID.randomUUID().toString());
            UnityAdsLoadOptions a = g.d(g.this).a(g.b(g.this));
            String str = this.c;
            if (str != null) {
                a.setAdMarkup(str);
            }
            g.d(g.this).c(g.c(g.this), a, g.this);
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            L5.b c = com.google.ads.mediation.unity.a.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{this.a, str}));
            Log.w(UnityMediationAdapter.TAG, c.toString());
            g.a(g.this).onFailure(c);
        }
    }

    public g(s sVar, Y5.e eVar, f fVar, b bVar) {
        this.g = sVar.e();
        this.b = eVar;
        this.c = fVar;
        this.d = bVar;
    }

    public static /* bridge */ /* synthetic */ Y5.e a(g gVar) {
        return gVar.b;
    }

    public static /* bridge */ /* synthetic */ String b(g gVar) {
        return gVar.a;
    }

    public static /* bridge */ /* synthetic */ String c(g gVar) {
        return gVar.f;
    }

    public static /* bridge */ /* synthetic */ b d(g gVar) {
        return gVar.d;
    }

    public static /* bridge */ /* synthetic */ void e(g gVar, String str) {
        gVar.a = str;
    }

    public void f(s sVar) {
        Context b = sVar.b();
        Bundle d = sVar.d();
        String string = d.getString("gameId");
        String string2 = d.getString("zoneId");
        this.f = string2;
        if (com.google.ads.mediation.unity.a.a(string, string2)) {
            this.c.b(b, string, new a(string, b, sVar.a()));
        } else {
            this.b.onFailure(new L5.b(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity"));
        }
    }

    public void onUnityAdsAdLoaded(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", new Object[]{str}));
        this.f = str;
        this.e = (r) this.b.onSuccess(this);
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f = str;
        L5.b d = com.google.ads.mediation.unity.a.d(unityAdsLoadError, str2);
        Log.w(UnityMediationAdapter.TAG, d.toString());
        this.b.onFailure(d);
    }

    public void onUnityAdsShowClick(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", new Object[]{str}));
        r rVar = this.e;
        if (rVar == null) {
            return;
        }
        rVar.reportAdClicked();
        this.e.onAdLeftApplication();
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", new Object[]{str}));
        r rVar = this.e;
        if (rVar != null) {
            rVar.onAdClosed();
        }
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        L5.b e = com.google.ads.mediation.unity.a.e(unityAdsShowError, str2);
        Log.w(UnityMediationAdapter.TAG, e.toString());
        r rVar = this.e;
        if (rVar != null) {
            rVar.onAdFailedToShow(e);
        }
    }

    public void onUnityAdsShowStart(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", new Object[]{str}));
        r rVar = this.e;
        if (rVar != null) {
            rVar.onAdOpened();
        }
    }

    public void showAd(Context context) {
        if (this.f == null) {
            Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        UnityAdsShowOptions b = this.d.b(this.a);
        b.set("watermark", this.g);
        this.d.d((Activity) context, this.f, b, this);
    }
}
