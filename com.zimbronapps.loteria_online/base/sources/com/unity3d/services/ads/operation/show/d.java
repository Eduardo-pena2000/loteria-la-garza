package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ ShowOperationState a;
    public final /* synthetic */ UnityAds.UnityAdsShowCompletionState b;

    public /* synthetic */ d(ShowOperationState showOperationState, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.a = showOperationState;
        this.b = unityAdsShowCompletionState;
    }

    public final void run() {
        ShowOperationState.d(this.a, this.b);
    }
}
