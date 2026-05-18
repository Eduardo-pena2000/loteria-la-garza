package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ MaxNativeAd a;

    public /* synthetic */ b(MaxNativeAd maxNativeAd) {
        this.a = maxNativeAd;
    }

    public final void onClick(View view) {
        MaxNativeAdView.b(this.a, view);
    }
}
