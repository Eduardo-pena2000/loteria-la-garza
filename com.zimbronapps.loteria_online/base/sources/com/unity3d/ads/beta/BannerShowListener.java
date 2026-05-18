package com.unity3d.ads.beta;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface BannerShowListener {
    void unityAdsBannerDidClick(BannerAd bannerAd);

    void unityAdsBannerDidFailShow(BannerAd bannerAd, UnityAdsError unityAdsError);

    void unityAdsBannerImpression(BannerAd bannerAd);
}
