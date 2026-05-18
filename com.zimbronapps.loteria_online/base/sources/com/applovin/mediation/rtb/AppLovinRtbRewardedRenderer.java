package com.applovin.mediation.rtb;

import Y5.e;
import Y5.y;
import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.d;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AppLovinRtbRewardedRenderer extends f {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(e eVar, d dVar, a aVar, g gVar) {
        super(eVar, dVar, aVar, gVar);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    public void loadAd(y yVar) {
        AppLovinSdk c = this.appLovinInitializer.c(yVar.b());
        this.appLovinSdk = c;
        AppLovinIncentivizedInterstitial b = this.appLovinAdFactory.b(c);
        this.incentivizedInterstitial = b;
        b.setExtraInfo("google_watermark", yVar.e());
        this.networkExtras = yVar.c();
        this.appLovinSdk.getAdService().loadNextAdForAdToken(yVar.a(), this);
    }

    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
