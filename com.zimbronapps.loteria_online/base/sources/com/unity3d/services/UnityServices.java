package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.Session;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityServices {
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    private UnityServices() {
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        t.f(versionName, "getVersionName()");
        return versionName;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final synchronized void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        synchronized (UnityServices.class) {
            try {
                DeviceLog.entered();
                SdkProperties.addInitializationListener(iUnityAdsInitializationListener);
                SdkProperties.setTestMode(z);
                SdkProperties.setDebugMode(SdkProperties.getDebugMode());
                DeviceLog.info("Initializing Unity Services " + SdkProperties.getVersionName() + " (" + SdkProperties.getVersionCode() + ") with game id " + str + " in " + (z ? "test mode" : "production mode") + ", session " + Session.Default.getId());
                CachedLifecycle.register();
                UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, null), str, null, 2, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }
}
