package com.google.ads.mediation.applovin;

import Y5.m;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c implements Y5.k, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    public static final String h = "c";
    public b a;
    public AppLovinSdk b;
    public String c;
    public final d d;
    public final com.google.ads.mediation.applovin.a e;
    public final Y5.e f;
    public Y5.l g;

    public class a implements d.b {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Bundle b;
        public final /* synthetic */ AppLovinAdSize c;
        public final /* synthetic */ L5.h d;

        public a(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, L5.h hVar) {
            this.a = context;
            this.b = bundle;
            this.c = appLovinAdSize;
            this.d = hVar;
        }

        public void onInitializeSuccess() {
            c cVar = c.this;
            c.g(cVar, c.c(cVar).c(this.a));
            c.h(c.this, AppLovinUtils.retrieveZoneId(this.b));
            Log.d(c.i(), "Requesting banner of size " + this.c + " for zone: " + c.e(c.this));
            c cVar2 = c.this;
            c.f(cVar2, c.a(cVar2).a(c.d(c.this), this.c, this.d, this.a));
            c.b(c.this).e(c.this);
            c.b(c.this).d(c.this);
            c.b(c.this).f(c.this);
            if (TextUtils.isEmpty(c.e(c.this))) {
                c.d(c.this).getAdService().loadNextAd(this.c, c.this);
            } else {
                c.d(c.this).getAdService().loadNextAdForZoneId(c.e(c.this), c.this);
            }
        }
    }

    public c(Y5.e eVar, d dVar, com.google.ads.mediation.applovin.a aVar) {
        this.f = eVar;
        this.d = dVar;
        this.e = aVar;
    }

    public static /* bridge */ /* synthetic */ com.google.ads.mediation.applovin.a a(c cVar) {
        return cVar.e;
    }

    public static /* bridge */ /* synthetic */ b b(c cVar) {
        return cVar.a;
    }

    public static /* bridge */ /* synthetic */ d c(c cVar) {
        return cVar.d;
    }

    public static /* bridge */ /* synthetic */ AppLovinSdk d(c cVar) {
        return cVar.b;
    }

    public static /* bridge */ /* synthetic */ String e(c cVar) {
        return cVar.c;
    }

    public static /* bridge */ /* synthetic */ void f(c cVar, b bVar) {
        cVar.a = bVar;
    }

    public static /* bridge */ /* synthetic */ void g(c cVar, AppLovinSdk appLovinSdk) {
        cVar.b = appLovinSdk;
    }

    public static /* bridge */ /* synthetic */ void h(c cVar, String str) {
        cVar.c = str;
    }

    public static /* bridge */ /* synthetic */ String i() {
        return h;
    }

    public static c k(Y5.e eVar, d dVar, com.google.ads.mediation.applovin.a aVar) {
        return new c(eVar, dVar, aVar);
    }

    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(h, "Banner clicked.");
        Y5.l lVar = this.g;
        if (lVar != null) {
            lVar.reportAdClicked();
        }
    }

    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(h, "Banner closed fullscreen.");
        Y5.l lVar = this.g;
        if (lVar != null) {
            lVar.onAdClosed();
        }
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(h, "Banner displayed.");
        Y5.l lVar = this.g;
        if (lVar != null) {
            lVar.onAdOpened();
        }
    }

    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(h, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(h, "Banner dismissed.");
    }

    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(h, "Banner left application.");
        Y5.l lVar = this.g;
        if (lVar != null) {
            lVar.onAdLeftApplication();
        }
    }

    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(h, "Banner opened fullscreen.");
        Y5.l lVar = this.g;
        if (lVar != null) {
            lVar.onAdOpened();
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(h, "Banner did load ad for zone: " + this.c);
        this.a.c(appLovinAd);
        this.g = (Y5.l) this.f.onSuccess(this);
    }

    public void failedToReceiveAd(int i) {
        L5.b adError = AppLovinUtils.getAdError(i);
        Log.w(h, "Failed to load banner ad with error: " + i);
        this.f.onFailure(adError);
    }

    public View getView() {
        return this.a.a();
    }

    public void j(m mVar) {
        Context b = mVar.b();
        Bundle d = mVar.d();
        L5.h f = mVar.f();
        String string = d.getString("sdkKey");
        if (TextUtils.isEmpty(string)) {
            L5.b bVar = new L5.b(110, "Missing or invalid SDK Key.", "com.google.ads.mediation.applovin");
            Log.e(h, bVar.c());
            this.f.onFailure(bVar);
            return;
        }
        AppLovinAdSize appLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(b, f);
        if (appLovinAdSizeFromAdMobAdSize != null) {
            this.d.b(b, string, new a(b, d, appLovinAdSizeFromAdMobAdSize, f));
            return;
        }
        L5.b bVar2 = new L5.b(101, "Failed to request banner with unsupported size.", "com.google.ads.mediation.applovin");
        Log.e(h, bVar2.c());
        this.f.onFailure(bVar2);
    }
}
