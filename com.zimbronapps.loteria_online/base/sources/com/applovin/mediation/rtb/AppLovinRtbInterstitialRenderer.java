package com.applovin.mediation.rtb;

import Y5.q;
import Y5.s;
import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.d;
import com.google.ads.mediation.applovin.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AppLovinRtbInterstitialRenderer extends e implements q {
    private AppLovinInterstitialAdDialog interstitialAd;
    private AppLovinSdk sdk;

    public AppLovinRtbInterstitialRenderer(Y5.e eVar, d dVar, a aVar) {
        super(eVar, dVar, aVar);
    }

    public void loadAd(s sVar) {
        AppLovinSdk c = this.appLovinInitializer.c(sVar.b());
        this.sdk = c;
        AppLovinInterstitialAdDialog d = this.appLovinAdFactory.d(c, sVar.b());
        this.interstitialAd = d;
        d.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo("google_watermark", sVar.e());
        this.networkExtras = sVar.c();
        this.sdk.getAdService().loadNextAdForAdToken(sVar.a(), this);
    }

    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }
}
