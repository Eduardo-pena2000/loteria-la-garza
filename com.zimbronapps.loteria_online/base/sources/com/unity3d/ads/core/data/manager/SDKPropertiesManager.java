package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface SDKPropertiesManager {
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z);
}
