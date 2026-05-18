package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ShowOperationState extends OperationState {
    public WeakReference activity;
    public IUnityAdsShowListener listener;
    public UnityAdsShowOptions showOptions;

    public ShowOperationState(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsShowListener;
        this.activity = new WeakReference(activity);
        this.showOptions = unityAdsShowOptions;
    }

    public static /* synthetic */ void a(ShowOperationState showOperationState) {
        showOperationState.lambda$onUnityAdsShowClick$1();
    }

    public static /* synthetic */ void b(ShowOperationState showOperationState, String str) {
        showOperationState.lambda$onUnityAdsShowStart$2(str);
    }

    public static /* synthetic */ void c(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        showOperationState.lambda$onUnityAdsShowFailure$0(unityAdsShowError, str);
    }

    public static /* synthetic */ void d(ShowOperationState showOperationState, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        showOperationState.lambda$onUnityAdsShowComplete$3(unityAdsShowCompletionState);
    }

    private /* synthetic */ void lambda$onUnityAdsShowClick$1() {
        this.listener.onUnityAdsShowClick(this.placementId);
    }

    private /* synthetic */ void lambda$onUnityAdsShowComplete$3(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.listener.onUnityAdsShowComplete(this.placementId, unityAdsShowCompletionState);
    }

    private /* synthetic */ void lambda$onUnityAdsShowFailure$0(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        this.listener.onUnityAdsShowFailure(this.placementId, unityAdsShowError, str);
    }

    private /* synthetic */ void lambda$onUnityAdsShowStart$2(String str) {
        this.listener.onUnityAdsShowStart(str);
    }

    public void onUnityAdsShowClick() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new b(this));
        }
    }

    public void onUnityAdsShowComplete(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new d(this, unityAdsShowCompletionState));
        }
    }

    public void onUnityAdsShowFailure(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new e(this, unityAdsShowError, str));
        }
    }

    public void onUnityAdsShowStart(String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new c(this, str));
        }
    }
}
