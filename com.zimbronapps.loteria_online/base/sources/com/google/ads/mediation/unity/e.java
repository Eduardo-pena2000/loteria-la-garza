package com.google.ads.mediation.unity;

import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    public final BannerView a;

    public e(BannerView bannerView) {
        this.a = bannerView;
    }

    public BannerView a() {
        return this.a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.a.setListener(iListener);
    }
}
