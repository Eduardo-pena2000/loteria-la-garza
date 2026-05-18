package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LoadModuleDecoratorInitializationBuffer extends LoadModuleDecorator implements IInitializationListener {
    private static final String errorMsgInitializationFailed = "[UnityAds] SDK Initialization Failed";
    private static final String errorMsgInitializationFailure = "[UnityAds] SDK Initialization Failure";
    private ConcurrentHashMap _queuedLoadEvents;

    public class 1 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsLoadError val$error;
        final /* synthetic */ String val$message;
        final /* synthetic */ LoadOperationState val$state;

        public 1(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.val$state = loadOperationState;
            this.val$error = unityAdsLoadError;
            this.val$message = str;
        }

        public void run() {
            LoadOperationState loadOperationState = this.val$state;
            loadOperationState.listener.onUnityAdsFailedToLoad(loadOperationState.placementId, this.val$error, this.val$message);
        }
    }

    public static /* synthetic */ class 2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        static {
            int[] iArr = new int[SdkProperties.InitializationState.values().length];
            $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = iArr;
            try {
                iArr[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LoadModuleDecoratorInitializationBuffer(ILoadModule iLoadModule, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(iLoadModule);
        iInitializationNotificationCenter.addListener(this);
        this._queuedLoadEvents = new ConcurrentHashMap();
    }

    private void sendOnUnityAdsFailedToLoad(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        if (loadOperationState == null || loadOperationState.listener == null) {
            return;
        }
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        Utilities.runOnUiThread(new 1(loadOperationState, unityAdsLoadError, str));
    }

    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        try {
            Iterator it = this._queuedLoadEvents.keySet().iterator();
            while (it.hasNext()) {
                sendOnUnityAdsFailedToLoad((LoadOperationState) it.next(), UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
            }
            this._queuedLoadEvents.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onSdkInitialized() {
        try {
            for (Map.Entry entry : this._queuedLoadEvents.entrySet()) {
                super.executeAdOperation((IWebViewBridgeInvoker) entry.getValue(), (LoadOperationState) entry.getKey());
            }
            this._queuedLoadEvents.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, LoadOperationState loadOperationState) {
        if (loadOperationState == null) {
            return;
        }
        int i = 2.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[SdkProperties.getCurrentInitializationState().ordinal()];
        if (i == 1) {
            super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
        } else if (i != 2) {
            this._queuedLoadEvents.put(loadOperationState, iWebViewBridgeInvoker);
        } else {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
        }
    }
}
