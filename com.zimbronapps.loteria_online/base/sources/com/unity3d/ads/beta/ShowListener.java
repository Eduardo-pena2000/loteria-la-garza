package com.unity3d.ads.beta;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ShowListener {
    void showClick(Object obj);

    void showComplete(Object obj, ShowFinishState showFinishState);

    void showFailed(Object obj, UnityAdsError unityAdsError);

    void showImpression(Object obj);

    void showStart(Object obj);
}
