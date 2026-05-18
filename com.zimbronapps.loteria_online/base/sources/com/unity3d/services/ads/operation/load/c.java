package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ LoadOperationState a;
    public final /* synthetic */ UnityAds.UnityAdsLoadError b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.a = loadOperationState;
        this.b = unityAdsLoadError;
        this.c = str;
    }

    public final void run() {
        LoadOperationState.b(this.a, this.b, this.c);
    }
}
