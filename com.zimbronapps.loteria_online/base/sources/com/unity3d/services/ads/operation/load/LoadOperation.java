package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LoadOperation extends AdOperation implements ILoadOperation {
    private LoadOperationState _loadOperationState;

    public class 1 implements Runnable {
        public 1() {
        }

        public void run() {
            if (LoadOperation.access$000(LoadOperation.this) != null) {
                LoadOperation.access$000(LoadOperation.this).onUnityAdsAdLoaded();
            }
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsLoadError val$error;
        final /* synthetic */ String val$message;

        public 2(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.val$error = unityAdsLoadError;
            this.val$message = str;
        }

        public void run() {
            if (LoadOperation.access$000(LoadOperation.this) != null) {
                LoadOperation.access$000(LoadOperation.this).onUnityAdsFailedToLoad(this.val$error, this.val$message);
            }
        }
    }

    public LoadOperation(LoadOperationState loadOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "load");
        this._loadOperationState = loadOperationState;
    }

    public static /* synthetic */ LoadOperationState access$000(LoadOperation loadOperation) {
        return loadOperation._loadOperationState;
    }

    public String getId() {
        return this._loadOperationState.id;
    }

    public LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    public void onUnityAdsAdLoaded(String str) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        Utilities.runOnUiThread(new 1());
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        Utilities.runOnUiThread(new 2(unityAdsLoadError, str2));
    }
}
