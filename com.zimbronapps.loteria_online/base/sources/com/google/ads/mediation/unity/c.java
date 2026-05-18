package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    public MediationMetaData a(Context context) {
        return new MediationMetaData(context);
    }

    public void b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(iUnityAdsTokenListener);
    }

    public void c(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(tokenConfiguration, iUnityAdsTokenListener);
    }

    public String d() {
        return UnityAds.getVersion();
    }

    public void e(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public boolean f() {
        return UnityAds.isInitialized();
    }
}
