package com.google.android.gms.ads.mediation.rtb;

import Y5.a;
import Y5.e;
import Y5.j;
import Y5.m;
import Y5.s;
import Y5.u;
import Y5.y;
import a6.b;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(a6.a aVar, b bVar);

    public void loadRtbAppOpenAd(j jVar, e eVar) {
        loadAppOpenAd(jVar, eVar);
    }

    public void loadRtbBannerAd(m mVar, e eVar) {
        loadBannerAd(mVar, eVar);
    }

    public void loadRtbInterstitialAd(s sVar, e eVar) {
        loadInterstitialAd(sVar, eVar);
    }

    @Deprecated
    public void loadRtbNativeAd(u uVar, e eVar) {
        loadNativeAd(uVar, eVar);
    }

    public void loadRtbNativeAdMapper(u uVar, e eVar) throws RemoteException {
        loadNativeAdMapper(uVar, eVar);
    }

    public void loadRtbRewardedAd(y yVar, e eVar) {
        loadRewardedAd(yVar, eVar);
    }

    public void loadRtbRewardedInterstitialAd(y yVar, e eVar) {
        loadRewardedInterstitialAd(yVar, eVar);
    }
}
