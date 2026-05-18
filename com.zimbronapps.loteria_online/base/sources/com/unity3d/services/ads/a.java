package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsLoadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ IUnityAdsLoadListener a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        this.a = iUnityAdsLoadListener;
        this.b = str;
    }

    public final void run() {
        UnityAdsImplementation.a(this.a, this.b);
    }
}
