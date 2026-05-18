package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    public SdkProperties.InitializationState getCurrentInitializationState() {
        SdkProperties.InitializationState currentInitializationState = SdkProperties.getCurrentInitializationState();
        t.f(currentInitializationState, "getCurrentInitializationState()");
        return currentInitializationState;
    }

    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    public void setInitializeState(SdkProperties.InitializationState initializeState) {
        t.g(initializeState, "initializeState");
        SdkProperties.setInitializeState(initializeState);
    }

    public void setInitialized(boolean z) {
        SdkProperties.setInitialized(z);
    }
}
