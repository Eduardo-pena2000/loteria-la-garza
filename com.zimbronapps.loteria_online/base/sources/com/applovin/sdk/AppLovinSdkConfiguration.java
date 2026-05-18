package com.applovin.sdk;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface AppLovinSdkConfiguration {

    @Deprecated
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    ConsentFlowUserGeography getConsentFlowUserGeography();

    String getCountryCode();

    List getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}
