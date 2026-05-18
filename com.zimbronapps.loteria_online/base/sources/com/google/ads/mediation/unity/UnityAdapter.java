package com.google.ads.mediation.unity;

import Y5.t;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MetaData;
import java.lang.ref.WeakReference;
import java.util.UUID;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter {
    private WeakReference activityWeakReference;
    private u5.a eventAdapter;
    private t mediationInterstitialListener;
    private String objectId;
    private String placementId;
    private final IUnityAdsLoadListener unityLoadListener = new a();
    private final IUnityAdsShowListener unityShowListener = new c();

    public class a implements IUnityAdsLoadListener {
        public a() {
        }

        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", new Object[]{str}));
            UnityAdapter.h(UnityAdapter.this, str);
            UnityAdapter.e(UnityAdapter.this).a(a.b.a);
        }

        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityAdapter.h(UnityAdapter.this, str);
            L5.b d = com.google.ads.mediation.unity.a.d(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, d.toString());
            if (UnityAdapter.f(UnityAdapter.this) != null) {
                UnityAdapter.f(UnityAdapter.this).onAdFailedToLoad(UnityAdapter.this, d);
            }
        }
    }

    public class b implements IUnityAdsInitializationListener {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", new Object[]{this.a, UnityAdapter.g(UnityAdapter.this)}));
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            L5.b c = com.google.ads.mediation.unity.a.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{this.a, str}));
            Log.w(UnityMediationAdapter.TAG, c.toString());
            if (UnityAdapter.f(UnityAdapter.this) != null) {
                UnityAdapter.f(UnityAdapter.this).onAdFailedToLoad(UnityAdapter.this, c);
            }
        }
    }

    public class c implements IUnityAdsShowListener {
        public c() {
        }

        public void onUnityAdsShowClick(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", new Object[]{UnityAdapter.g(UnityAdapter.this)}));
            UnityAdapter.e(UnityAdapter.this).a(a.b.c);
            UnityAdapter.e(UnityAdapter.this).a(a.b.e);
        }

        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", new Object[]{UnityAdapter.g(UnityAdapter.this)}));
            UnityAdapter.e(UnityAdapter.this).a(a.b.d);
        }

        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Log.w(UnityMediationAdapter.TAG, com.google.ads.mediation.unity.a.e(unityAdsShowError, str2).toString());
            UnityAdapter.e(UnityAdapter.this).a(a.b.b);
            UnityAdapter.e(UnityAdapter.this).a(a.b.d);
        }

        public void onUnityAdsShowStart(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", new Object[]{UnityAdapter.g(UnityAdapter.this)}));
            UnityAdapter.e(UnityAdapter.this).a(a.b.b);
        }
    }

    public static /* bridge */ /* synthetic */ u5.a e(UnityAdapter unityAdapter) {
        return unityAdapter.eventAdapter;
    }

    public static /* bridge */ /* synthetic */ t f(UnityAdapter unityAdapter) {
        return unityAdapter.mediationInterstitialListener;
    }

    public static /* bridge */ /* synthetic */ String g(UnityAdapter unityAdapter) {
        return unityAdapter.placementId;
    }

    public static /* bridge */ /* synthetic */ void h(UnityAdapter unityAdapter, String str) {
        unityAdapter.placementId = str;
    }

    private void sendAdFailedToLoad(int i, String str) {
        L5.b b2 = com.google.ads.mediation.unity.a.b(i, str);
        Log.w(UnityMediationAdapter.TAG, b2.toString());
        t tVar = this.mediationInterstitialListener;
        if (tVar != null) {
            tVar.onAdFailedToLoad(this, b2);
        }
    }

    public void onDestroy() {
        this.mediationInterstitialListener = null;
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void requestInterstitialAd(Context context, t tVar, Bundle bundle, Y5.f fVar, Bundle bundle2) {
        this.mediationInterstitialListener = tVar;
        this.eventAdapter = new u5.a(tVar, this);
        String string = bundle.getString("gameId");
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!com.google.ads.mediation.unity.a.a(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        if (!(context instanceof Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
            return;
        }
        this.activityWeakReference = new WeakReference((Activity) context);
        f.a().b(context, string, new b(string));
        com.google.ads.mediation.unity.a.l(MobileAds.getRequestConfiguration(), new MetaData(context));
        this.objectId = UUID.randomUUID().toString();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(this.objectId);
        UnityAds.load(this.placementId, unityAdsLoadOptions, this.unityLoadListener);
    }

    public void showInterstitial() {
        WeakReference weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null) {
            if (this.placementId == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(this.objectId);
            UnityAds.show(activity, this.placementId, unityAdsShowOptions, this.unityShowListener);
            return;
        }
        Log.w(UnityMediationAdapter.TAG, "Failed to show interstitial ad for placement ID '" + this.placementId + "' from Unity Ads: Activity context is null.");
        this.eventAdapter.a(a.b.d);
    }
}
