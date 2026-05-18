package com.google.ads.mediation.unity;

import android.app.Activity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d {
    public e a(Activity activity, String str, UnityBannerSize unityBannerSize) {
        return new e(new BannerView(activity, str, unityBannerSize));
    }
}
