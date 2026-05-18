package com.google.ads.mediation.unity;

import Y5.w;
import Y5.x;
import Y5.y;
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
public class j implements w {
    public final Y5.e a;
    public final f b;
    public final com.google.ads.mediation.unity.b c;
    public x d;
    public String e;
    public String f;
    public final String g;
    public final IUnityAdsLoadListener h = new a();
    public final IUnityAdsShowListener i = new b();

    public class a implements IUnityAdsLoadListener {
        public a() {
        }

        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", new Object[]{str}));
            j.g(j.this, str);
            j jVar = j.this;
            j.e(jVar, (x) j.a(jVar).onSuccess(j.this));
        }

        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            j.g(j.this, str);
            L5.b d = com.google.ads.mediation.unity.a.d(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, d.toString());
            j.a(j.this).onFailure(d);
        }
    }

    public class b implements IUnityAdsShowListener {
        public b() {
        }

        public void onUnityAdsShowClick(String str) {
            if (j.b(j.this) != null) {
                j.b(j.this).reportAdClicked();
            }
        }

        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (j.b(j.this) == null) {
                return;
            }
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                j.b(j.this).onVideoComplete();
                j.b(j.this).onUserEarnedReward();
            }
            j.b(j.this).onAdClosed();
        }

        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (j.b(j.this) != null) {
                j.b(j.this).onAdFailedToShow(com.google.ads.mediation.unity.a.e(unityAdsShowError, str2));
            }
        }

        public void onUnityAdsShowStart(String str) {
            if (j.b(j.this) == null) {
                return;
            }
            j.b(j.this).onAdOpened();
            j.b(j.this).reportAdImpression();
            j.b(j.this).onVideoStart();
        }
    }

    public class c implements IUnityAdsInitializationListener {
        public final Context a;
        public final String b;
        public final String c;
        public final String d;

        public c(Context context, String str, String str2, String str3) {
            this.a = context;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", new Object[]{this.b, this.c}));
            com.google.ads.mediation.unity.a.l(MobileAds.getRequestConfiguration(), new MetaData(this.a));
            j.f(j.this, UUID.randomUUID().toString());
            UnityAdsLoadOptions a = j.d(j.this).a(j.c(j.this));
            String str = this.d;
            if (str != null) {
                a.setAdMarkup(str);
            }
            j.d(j.this).c(this.c, a, j.this.h);
        }

        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            L5.b c = com.google.ads.mediation.unity.a.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{this.b, str}));
            Log.w(UnityMediationAdapter.TAG, c.toString());
            j.a(j.this).onFailure(c);
        }
    }

    public j(y yVar, Y5.e eVar, f fVar, com.google.ads.mediation.unity.b bVar) {
        this.g = yVar.e();
        this.a = eVar;
        this.b = fVar;
        this.c = bVar;
    }

    public static /* bridge */ /* synthetic */ Y5.e a(j jVar) {
        return jVar.a;
    }

    public static /* bridge */ /* synthetic */ x b(j jVar) {
        return jVar.d;
    }

    public static /* bridge */ /* synthetic */ String c(j jVar) {
        return jVar.f;
    }

    public static /* bridge */ /* synthetic */ com.google.ads.mediation.unity.b d(j jVar) {
        return jVar.c;
    }

    public static /* bridge */ /* synthetic */ void e(j jVar, x xVar) {
        jVar.d = xVar;
    }

    public static /* bridge */ /* synthetic */ void f(j jVar, String str) {
        jVar.f = str;
    }

    public static /* bridge */ /* synthetic */ void g(j jVar, String str) {
        jVar.e = str;
    }

    public void h(y yVar) {
        Context b2 = yVar.b();
        Bundle d = yVar.d();
        String string = d.getString("gameId");
        String string2 = d.getString("zoneId");
        if (com.google.ads.mediation.unity.a.a(string, string2)) {
            this.b.b(b2, string, new c(b2, string, string2, yVar.a()));
        } else {
            L5.b bVar = new L5.b(101, "Missing or invalid server parameters.", "com.google.ads.mediation.unity");
            Log.w(UnityMediationAdapter.TAG, bVar.toString());
            this.a.onFailure(bVar);
        }
    }

    public void showAd(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.e == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAdsShowOptions b2 = this.c.b(this.f);
            b2.set("watermark", this.g);
            this.c.d(activity, this.e, b2, this.i);
            return;
        }
        L5.b bVar = new L5.b(105, "Unity Ads requires an Activity context to load ads.", "com.google.ads.mediation.unity");
        Log.e(UnityMediationAdapter.TAG, bVar.toString());
        x xVar = this.d;
        if (xVar != null) {
            xVar.onAdFailedToShow(bVar);
        }
    }
}
