package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ShowOperation extends AdOperation implements IShowOperation {
    private ShowOperationState showOperationState;

    public class 1 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsShowError val$error;
        final /* synthetic */ String val$message;

        public 1(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.val$error = unityAdsShowError;
            this.val$message = str;
        }

        public void run() {
            if (ShowOperation.access$000(ShowOperation.this) != null) {
                ShowOperation.access$000(ShowOperation.this).onUnityAdsShowFailure(this.val$error, this.val$message);
            }
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ String val$placementId;

        public 2(String str) {
            this.val$placementId = str;
        }

        public void run() {
            if (ShowOperation.access$000(ShowOperation.this) != null) {
                ShowOperation.access$000(ShowOperation.this).onUnityAdsShowStart(this.val$placementId);
            }
        }
    }

    public class 3 implements Runnable {
        public 3() {
        }

        public void run() {
            if (ShowOperation.access$000(ShowOperation.this) != null) {
                ShowOperation.access$000(ShowOperation.this).onUnityAdsShowClick();
            }
        }
    }

    public class 4 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsShowCompletionState val$state;

        public 4(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            this.val$state = unityAdsShowCompletionState;
        }

        public void run() {
            if (ShowOperation.access$000(ShowOperation.this) != null) {
                ShowOperation.access$000(ShowOperation.this).onUnityAdsShowComplete(this.val$state);
            }
        }
    }

    public ShowOperation(ShowOperationState showOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "show");
        this.showOperationState = showOperationState;
    }

    public static /* synthetic */ ShowOperationState access$000(ShowOperation showOperation) {
        return showOperation.showOperationState;
    }

    public String getId() {
        return this.showOperationState.id;
    }

    public ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    public void onUnityAdsShowClick(String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new 3());
    }

    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new 4(unityAdsShowCompletionState));
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new 1(unityAdsShowError, str2));
    }

    public void onUnityAdsShowStart(String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new 2(str));
    }
}
