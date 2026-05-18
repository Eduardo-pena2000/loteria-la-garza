package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdModule;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.reader.HdrInfoReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
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
public class ShowModule extends AdModule implements IShowModule {
    public static String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";
    private static IShowModule instance;

    public class 1 implements IWebViewBridgeInvocationCallback {
        final /* synthetic */ ShowOperationState val$state;

        public 1(ShowOperationState showOperationState) {
            this.val$state = showOperationState;
        }

        public void onFailure(String str, CallbackStatus callbackStatus) {
            ShowModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.callback_error, Long.valueOf(this.val$state.duration())));
            ShowModule.access$000(ShowModule.this, this.val$state, str, UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            ShowModule.this.remove(this.val$state.id);
        }

        public void onSuccess() {
        }

        public void onTimeout() {
            ShowModule.this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.callback_timeout, Long.valueOf(this.val$state.duration())));
            ShowModule.access$000(ShowModule.this, this.val$state, "[UnityAds] Show Invocation Timeout", UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            ShowModule.this.remove(this.val$state.id);
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsShowError val$error;
        final /* synthetic */ String val$message;
        final /* synthetic */ ShowOperationState val$state;

        public 2(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.val$state = showOperationState;
            this.val$error = unityAdsShowError;
            this.val$message = str;
        }

        public void run() {
            this.val$state.onUnityAdsShowFailure(this.val$error, this.val$message);
        }
    }

    public ShowModule(SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    public static /* synthetic */ void access$000(ShowModule showModule, ShowOperationState showOperationState, String str, UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        showModule.sendOnUnityAdsFailedToShow(showOperationState, str, unityAdsShowError, z);
    }

    public static IShowModule getInstance() {
        if (instance == null) {
            instance = new ShowModuleDecoratorTimeout(new ShowModule((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)), new ExperimentsReader());
        }
        return instance;
    }

    private void sendOnUnityAdsFailedToShow(ShowOperationState showOperationState, String str, UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        if (z) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAdsShowError, Long.valueOf(showOperationState.duration())));
        }
        Utilities.runOnUiThread(new 2(showOperationState, unityAdsShowError, str));
    }

    public void onUnityAdsShowClick(String str) {
        IShowOperation iShowOperation = (IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        iShowOperation.onUnityAdsShowClick(iShowOperation.getShowOperationState().placementId);
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IShowOperation iShowOperation = (IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        ShowOperationState showOperationState = iShowOperation.getShowOperationState();
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowSuccess(Long.valueOf(showOperationState.duration())));
        iShowOperation.onUnityAdsShowComplete(showOperationState.placementId, unityAdsShowCompletionState);
        remove(str);
    }

    public void onUnityAdsShowConsent(String str) {
        IShowOperation iShowOperation = (IShowOperation) get(str);
        if (iShowOperation != null) {
            iShowOperation.getShowOperationState();
        }
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        IShowOperation iShowOperation = (IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        ShowOperationState showOperationState = iShowOperation.getShowOperationState();
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAdsShowError, Long.valueOf(showOperationState.duration())));
        iShowOperation.onUnityAdsShowFailure(showOperationState.placementId, unityAdsShowError, str2);
        remove(str);
    }

    public void onUnityAdsShowStart(String str) {
        IShowOperation iShowOperation = (IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        iShowOperation.onUnityAdsShowStart(iShowOperation.getShowOperationState().placementId);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        if (TextUtils.isEmpty(showOperationState.placementId)) {
            sendOnUnityAdsFailedToShow(showOperationState, errorMsgPlacementIdNull, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        ShowOperation showOperation = new ShowOperation(showOperationState, new WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker, new 1(showOperationState)));
        Activity activity = (Activity) showOperationState.activity.get();
        ClientProperties.setActivity(activity);
        Display defaultDisplay = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("requestedOrientation", activity.getRequestedOrientation());
            jSONObject3.put("rotation", defaultDisplay.getRotation());
            Point point = new Point();
            defaultDisplay.getSize(point);
            jSONObject3.put("width", point.x);
            jSONObject3.put("height", point.y);
            jSONObject2.put("display", jSONObject3);
            jSONObject2.put("headerBiddingOptions", showOperationState.showOptions.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", showOperation.getId());
            jSONObject.put("placementId", showOperationState.placementId);
            jSONObject.put("time", Device.getElapsedRealtime());
            set(showOperation);
            showOperation.invoke(showOperationState.configuration.getWebViewBridgeTimeout(), jSONObject);
            HdrInfoReader.getInstance().captureHDRCapabilityMetrics(activity, new ExperimentsReader());
        } catch (NullPointerException unused) {
            sendOnUnityAdsFailedToShow(showOperationState, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        } catch (JSONException unused2) {
            sendOnUnityAdsFailedToShow(showOperationState, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        }
    }
}
