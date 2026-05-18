package com.applovin.sdk;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    Uri getPrivacyPolicyUri();

    Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);

    void setEnabled(boolean z);

    void setPrivacyPolicyUri(Uri uri);

    void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z);

    void setTermsOfServiceUri(Uri uri);

    boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr();
}
