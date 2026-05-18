package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    private static final String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private final ExperimentsReader _experimentsReader;

    public class 1 implements ITimerListener {
        final /* synthetic */ ShowOperationState val$showOperationState;

        public 1(ShowOperationState showOperationState) {
            this.val$showOperationState = showOperationState;
        }

        public void onTimerFinished() {
            ShowModuleDecoratorTimeout.access$000(ShowModuleDecoratorTimeout.this, this.val$showOperationState, UnityAds.UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + this.val$showOperationState.placementId);
        }
    }

    public ShowModuleDecoratorTimeout(IShowModule iShowModule, ExperimentsReader experimentsReader) {
        super(iShowModule);
        this._experimentsReader = experimentsReader;
    }

    public static /* synthetic */ void a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        lambda$onOperationTimeout$0(showOperationState, unityAdsShowError, str);
    }

    public static /* synthetic */ void access$000(ShowModuleDecoratorTimeout showModuleDecoratorTimeout, ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        showModuleDecoratorTimeout.onOperationTimeout(showOperationState, unityAdsShowError, str);
    }

    private static /* synthetic */ void lambda$onOperationTimeout$0(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
    }

    private void onOperationTimeout(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (showOperationState != null) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowFailure(AdOperationError.timeout, Long.valueOf(showOperationState.duration())));
            remove(showOperationState.id);
            Utilities.runOnUiThread(new a(showOperationState, unityAdsShowError, str));
        }
    }

    private void releaseOperationTimeoutLock(String str) {
        ShowOperationState showOperationState;
        BaseTimer baseTimer;
        IShowOperation iShowOperation = get(str);
        if (iShowOperation == null || (showOperationState = iShowOperation.getShowOperationState()) == null || (baseTimer = showOperationState.timeoutTimer) == null) {
            return;
        }
        baseTimer.kill();
    }

    private void startShowTimeout(ShowOperationState showOperationState) {
        if (showOperationState == null) {
            return;
        }
        BaseTimer baseTimer = new BaseTimer(Integer.valueOf(showOperationState.configuration.getShowTimeout()), new 1(showOperationState));
        showOperationState.timeoutTimer = baseTimer;
        baseTimer.start(Executors.newSingleThreadScheduledExecutor());
    }

    public void onUnityAdsShowConsent(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdShowStart());
        showOperationState.start();
        if (!this._experimentsReader.getCurrentlyActiveExperiments().isNativeShowTimeoutDisabled()) {
            startShowTimeout(showOperationState);
        }
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }
}
