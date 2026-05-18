package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ ShowOperationState a;
    public final /* synthetic */ UnityAds.UnityAdsShowError b;
    public final /* synthetic */ String c;

    public /* synthetic */ e(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        this.a = showOperationState;
        this.b = unityAdsShowError;
        this.c = str;
    }

    public final void run() {
        ShowOperationState.c(this.a, this.b, this.c);
    }
}
