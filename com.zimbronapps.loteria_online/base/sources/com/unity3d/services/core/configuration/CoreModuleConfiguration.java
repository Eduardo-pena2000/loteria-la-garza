package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.api.Broadcast;
import com.unity3d.services.core.api.Cache;
import com.unity3d.services.core.api.ClassDetection;
import com.unity3d.services.core.api.Connectivity;
import com.unity3d.services.core.api.DeviceInfo;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.api.Permissions;
import com.unity3d.services.core.api.Preferences;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.api.Resolve;
import com.unity3d.services.core.api.Sdk;
import com.unity3d.services.core.api.SensorInfo;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.broadcast.BroadcastMonitor;
import com.unity3d.services.core.cache.CacheThread;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CoreModuleConfiguration implements IModuleConfiguration {

    public class 1 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsInitializationError val$error;
        final /* synthetic */ String val$message;

        public 1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            this.val$error = unityAdsInitializationError;
            this.val$message = str;
        }

        public void run() {
            SdkProperties.notifyInitializationFailed(this.val$error, this.val$message);
        }
    }

    public class 2 implements Runnable {
        public 2() {
        }

        public void run() {
            SdkProperties.notifyInitializationComplete();
        }
    }

    public static /* synthetic */ class 3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$configuration$ErrorState;

        static {
            int[] iArr = new int[ErrorState.values().length];
            $SwitchMap$com$unity3d$services$core$configuration$ErrorState = iArr;
            try {
                iArr[ErrorState.CreateWebApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$configuration$ErrorState[ErrorState.InitModules.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void checkForPC(Configuration configuration, SDKMetricsSender sDKMetricsSender) {
        Context applicationContext;
        if (!configuration.getExperiments().isPCCheckEnabled() || (applicationContext = ClientProperties.getApplicationContext()) == null) {
            return;
        }
        if (applicationContext.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
            sDKMetricsSender.sendMetric(new Metric("native_device_is_pc_success"));
        } else {
            sDKMetricsSender.sendMetric(new Metric("native_device_is_pc_failure"));
        }
    }

    private void collectMetrics(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Device.hasX264Decoder()) {
            arrayList.add(new Metric("native_device_decoder_x264_success"));
        } else {
            arrayList.add(new Metric("native_device_decoder_x264_failure"));
        }
        if (Device.hasX265Decoder()) {
            arrayList.add(new Metric("native_device_decoder_x265_success"));
        } else {
            arrayList.add(new Metric("native_device_decoder_x265_failure"));
        }
        if (Device.hasAV1Decoder()) {
            arrayList.add(new Metric("native_device_decoder_av1_success"));
        } else {
            arrayList.add(new Metric("native_device_decoder_av1_failure"));
        }
        SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        sDKMetricsSender.sendMetrics(arrayList);
        checkForPC(configuration, sDKMetricsSender);
    }

    public Class[] getWebAppApiClassList() {
        return new Class[]{Broadcast.class, Cache.class, Connectivity.class, DeviceInfo.class, ClassDetection.class, Storage.class, Sdk.class, Request.class, Resolve.class, Intent.class, Lifecycle.class, Preferences.class, SensorInfo.class, Permissions.class};
    }

    public boolean initCompleteState(Configuration configuration) {
        SDKMetrics.setConfiguration(configuration);
        InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        Utilities.runOnUiThread(new 2());
        collectMetrics(configuration);
        return true;
    }

    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        UnityAds.UnityAdsInitializationError unityAdsInitializationError;
        SDKMetrics.setConfiguration(configuration);
        int i = 3.$SwitchMap$com$unity3d$services$core$configuration$ErrorState[errorState.ordinal()];
        if (i == 1) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
        } else if (i != 2) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
            str = "Unity Ads failed to initialize due to internal error";
        } else {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED;
        }
        InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(str, errorState, 0);
        Utilities.runOnUiThread(new 1(unityAdsInitializationError, str));
        return true;
    }

    public boolean resetState(Configuration configuration) {
        BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        CacheThread.cancel();
        WebRequestThread.cancel();
        ConnectivityMonitor.stopAll();
        StorageManager.init(ClientProperties.getApplicationContext());
        AdvertisingId.init(ClientProperties.getApplicationContext());
        OpenAdvertisingId.init(ClientProperties.getApplicationContext());
        ((VolumeChange) Utilities.getService(VolumeChange.class)).clearAllListeners();
        return true;
    }
}
