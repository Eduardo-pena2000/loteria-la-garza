package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ IUnityAdsInitializationListener a;

    public /* synthetic */ c(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        this.a = iUnityAdsInitializationListener;
    }

    public final void run() {
        UnityAdsImplementation.c(this.a);
    }
}
