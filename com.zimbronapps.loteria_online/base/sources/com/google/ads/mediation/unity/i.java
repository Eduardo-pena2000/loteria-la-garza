package com.google.ads.mediation.unity;

import com.unity3d.ads.IUnityAdsTokenListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class i implements IUnityAdsTokenListener {
    public final /* synthetic */ a6.b a;

    public /* synthetic */ i(a6.b bVar) {
        this.a = bVar;
    }

    public final void onUnityAdsTokenReady(String str) {
        UnityMediationAdapter.a(this.a, str);
    }
}
