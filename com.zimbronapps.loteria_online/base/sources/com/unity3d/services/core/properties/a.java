package com.unity3d.services.core.properties;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ IUnityAdsInitializationListener a;
    public final /* synthetic */ UnityAds.UnityAdsInitializationError b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener, UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        this.a = iUnityAdsInitializationListener;
        this.b = unityAdsInitializationError;
        this.c = str;
    }

    public final void run() {
        SdkProperties.a(this.a, this.b, this.c);
    }
}
