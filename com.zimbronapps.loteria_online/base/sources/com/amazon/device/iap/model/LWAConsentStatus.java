package com.amazon.device.iap.model;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public enum LWAConsentStatus {
    CONSENTED,
    UNAVAILABLE;

    public static LWAConsentStatus getEnumForValue(String str) {
        for (LWAConsentStatus lWAConsentStatus : values()) {
            if (lWAConsentStatus.toString().equals(str)) {
                return lWAConsentStatus;
            }
        }
        return UNAVAILABLE;
    }
}
