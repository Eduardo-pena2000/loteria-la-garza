package com.unity3d.services.core.configuration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IPrivacyConfigurationListener {
    void onError(PrivacyCallError privacyCallError, String str);

    void onSuccess(PrivacyConfig privacyConfig);
}
