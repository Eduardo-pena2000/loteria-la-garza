package com.unity3d.ads.beta;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum UnityAdsPrivacyConsentValue {
    NOT_SET(0),
    CONSENT(1),
    NO_CONSENT(2);

    private final int value;

    UnityAdsPrivacyConsentValue(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
