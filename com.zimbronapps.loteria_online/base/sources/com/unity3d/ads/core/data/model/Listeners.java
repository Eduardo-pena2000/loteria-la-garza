package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Listeners {

    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String placementId) {
            t.g(placementId, "placementId");
        }

        public static void onComplete(Listeners listeners, String placementId, UnityAds.UnityAdsShowCompletionState state) {
            t.g(placementId, "placementId");
            t.g(state, "state");
        }

        public static void onError(Listeners listeners, String placementId, UnityAds.UnityAdsShowError error, String message) {
            t.g(placementId, "placementId");
            t.g(error, "error");
            t.g(message, "message");
        }

        public static void onLeftApplication(Listeners listeners, String placementId) {
            t.g(placementId, "placementId");
        }

        public static void onStart(Listeners listeners, String placementId) {
            t.g(placementId, "placementId");
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
