package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdModule;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback;
import com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocation;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class BaseLoadModule extends AdModule implements ILoadModule {
    static final String errorMsgFailedToCreateLoadRequest = "[UnityAds] Failed to create load request";
    static final String errorMsgInternalCommunicationFailure = "[UnityAds] Internal communication failure";
    static final String errorMsgInternalCommunicationTimeout = "[UnityAds] Internal communication timeout";
    static final String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";

    public class 1 implements IWebViewBridgeInvocationCallback {
        final /* synthetic */ LoadOperationState val$state;

        public 1(LoadOperationState loadOperationState) {
            this.val$state = loadOperationState;
        }

        public void onFailure(String str, CallbackStatus callbackStatus) {
            BaseLoadModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.callback_error, Long.valueOf(this.val$state.duration()), this.val$state.isBanner(), this.val$state.isHeaderBidding()));
            BaseLoadModule.access$000(BaseLoadModule.this, this.val$state, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
            BaseLoadModule.this.remove(this.val$state.getId());
        }

        public void onSuccess() {
        }

        public void onTimeout() {
            BaseLoadModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.callback_timeout, Long.valueOf(this.val$state.duration()), this.val$state.isBanner(), this.val$state.isHeaderBidding()));
            BaseLoadModule.access$000(BaseLoadModule.this, this.val$state, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
            BaseLoadModule.this.remove(this.val$state.getId());
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsLoadError val$error;
        final /* synthetic */ String val$message;
        final /* synthetic */ LoadOperationState val$state;

        public 2(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.val$state = loadOperationState;
            this.val$error = unityAdsLoadError;
            this.val$message = str;
        }

        public void run() {
            this.val$state.onUnityAdsFailedToLoad(this.val$error, this.val$message);
        }
    }

    public BaseLoadModule(SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    public static /* synthetic */ void access$000(BaseLoadModule baseLoadModule, LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, boolean z) {
        baseLoadModule.sendOnUnityAdsFailedToLoad(loadOperationState, unityAdsLoadError, str, z);
    }

    private void sendOnUnityAdsFailedToLoad(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, boolean z) {
        if (loadOperationState == null || loadOperationState.listener == null) {
            return;
        }
        if (z) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        }
        Utilities.runOnUiThread(new 2(loadOperationState, unityAdsLoadError, str));
    }

    public abstract void addOptionalParameters(LoadOperationState loadOperationState, JSONObject jSONObject) throws JSONException;

    public JSONObject buildBaseOptions(LoadOperationState loadOperationState) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        return jSONObject;
    }

    public JSONObject buildBaseParameters(LoadOperationState loadOperationState, LoadOperation loadOperation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject buildBaseOptions = buildBaseOptions(loadOperationState);
        buildBaseOptions.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        jSONObject.put("options", buildBaseOptions);
        jSONObject.put("listenerId", loadOperation.getId());
        jSONObject.put("placementId", loadOperationState.placementId);
        jSONObject.put("time", Device.getElapsedRealtime());
        addOptionalParameters(loadOperationState, jSONObject);
        return jSONObject;
    }

    public void onUnityAdsAdLoaded(String str) {
        ILoadOperation iLoadOperation = (ILoadOperation) get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            return;
        }
        LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadSuccess(Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        iLoadOperation.onUnityAdsAdLoaded(loadOperationState.placementId);
        remove(str);
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        ILoadOperation iLoadOperation = (ILoadOperation) get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            return;
        }
        LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAdsLoadError, Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        iLoadOperation.onUnityAdsFailedToLoad(loadOperationState.placementId, unityAdsLoadError, str2);
        remove(str);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, LoadOperationState loadOperationState) {
        if (TextUtils.isEmpty(loadOperationState.placementId)) {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        LoadOperation loadOperation = new LoadOperation(loadOperationState, new WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker, new 1(loadOperationState)));
        try {
            JSONObject buildBaseParameters = buildBaseParameters(loadOperationState, loadOperation);
            set(loadOperation);
            loadOperation.invoke(loadOperationState.configuration.getWebViewBridgeTimeout(), buildBaseParameters);
        } catch (JSONException | NullPointerException unused) {
            sendOnUnityAdsFailedToLoad(loadOperationState, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }
}
