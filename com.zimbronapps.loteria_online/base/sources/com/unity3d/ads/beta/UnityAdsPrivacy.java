package com.unity3d.ads.beta;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsPrivacy {
    public static final void set(UnityAdsPrivacyConsent consent, UnityAdsPrivacyConsentValue value) {
        t.g(consent, "consent");
        t.g(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyConsentValue value) {
        t.g(flag, "flag");
        t.g(value, "value");
    }

    public static final void set(UnityAdsPrivacyFlag privacy, UnityAdsPrivacyValue value) {
        t.g(privacy, "privacy");
        t.g(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyValue consent) {
        t.g(flag, "flag");
        t.g(consent, "consent");
    }
}
