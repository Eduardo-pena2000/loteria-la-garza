package com.google.ads.mediation;

import L5.g;
import L5.h;
import L5.j;
import S5.g1;
import Y5.A;
import Y5.B;
import Y5.D;
import Y5.f;
import Y5.n;
import Y5.t;
import Y5.v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, B, D {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private g adLoader;
    protected j mAdView;
    protected X5.a mInterstitialAd;

    public AdRequest buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Set keywords = fVar.getKeywords();
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                builder.c((String) it.next());
            }
        }
        if (fVar.isTesting()) {
            S5.B.a();
            builder.l(W5.g.d(context));
        }
        if (fVar.taggedForChildDirectedTreatment() != -1) {
            builder.m(fVar.taggedForChildDirectedTreatment() == 1);
        }
        builder.n(fVar.isDesignedForFamilies());
        builder.d(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.o();
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    public View getBannerView() {
        return this.mAdView;
    }

    public X5.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public g1 getVideoController() {
        j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.e().c();
        }
        return null;
    }

    public g.a newAdLoader(Context context, String str) {
        return new g.a(context, str);
    }

    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        X5.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z);
        }
    }

    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.d();
        }
    }

    public void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new h(hVar.j(), hVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, nVar));
        this.mAdView.b(buildAdRequest(context, fVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, t tVar, Bundle bundle, f fVar, Bundle bundle2) {
        X5.a.load(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, tVar));
    }

    public void requestNativeAd(Context context, v vVar, Bundle bundle, A a, Bundle bundle2) {
        e eVar = new e(this, vVar);
        g.a newAdLoader = newAdLoader(context, bundle.getString("pubid"));
        newAdLoader.c(eVar);
        newAdLoader.g(a.getNativeAdOptions());
        newAdLoader.d(a.getNativeAdRequestOptions());
        if (a.isUnifiedNativeAdRequested()) {
            newAdLoader.e(eVar);
        }
        if (a.zza()) {
            for (String str : a.zzb().keySet()) {
                newAdLoader.f(str, eVar, true != ((Boolean) a.zzb().get(str)).booleanValue() ? null : eVar);
            }
        }
        g a2 = newAdLoader.a();
        this.adLoader = a2;
        a2.b(buildAdRequest(context, a, bundle2, bundle));
    }

    public void showInterstitial() {
        X5.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
