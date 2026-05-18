package com.unity3d.ads.beta;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum UnityAdsPrivacyConsent {
    GDPR_CONSENT(0),
    PRIVACY_CONSENT(1),
    PIPL_CONSENT(2);

    private final int value;

    UnityAdsPrivacyConsent(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
