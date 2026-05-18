package com.applovin.mediation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MaxAdListener {
    void onAdClicked(MaxAd maxAd);

    void onAdDisplayFailed(MaxAd maxAd, MaxError maxError);

    void onAdDisplayed(MaxAd maxAd);

    void onAdHidden(MaxAd maxAd);

    void onAdLoadFailed(String str, MaxError maxError);

    void onAdLoaded(MaxAd maxAd);
}
