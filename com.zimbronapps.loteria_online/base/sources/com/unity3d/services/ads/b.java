package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsTokenListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ IUnityAdsTokenListener a;

    public /* synthetic */ b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.a = iUnityAdsTokenListener;
    }

    public final void run() {
        UnityAdsImplementation.b(this.a);
    }
}
