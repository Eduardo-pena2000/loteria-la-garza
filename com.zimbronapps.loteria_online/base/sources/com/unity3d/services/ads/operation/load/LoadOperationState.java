package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.OperationState;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LoadOperationState extends OperationState {
    public IUnityAdsLoadListener listener;
    public UnityAdsLoadOptions loadOptions;

    public LoadOperationState(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.listener = iUnityAdsLoadListener;
        this.loadOptions = unityAdsLoadOptions;
    }

    public static /* synthetic */ void a(LoadOperationState loadOperationState) {
        loadOperationState.lambda$onUnityAdsAdLoaded$1();
    }

    public static /* synthetic */ void b(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        loadOperationState.lambda$onUnityAdsFailedToLoad$0(unityAdsLoadError, str);
    }

    private /* synthetic */ void lambda$onUnityAdsAdLoaded$1() {
        this.listener.onUnityAdsAdLoaded(this.placementId);
    }

    private /* synthetic */ void lambda$onUnityAdsFailedToLoad$0(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.listener.onUnityAdsFailedToLoad(this.placementId, unityAdsLoadError, str);
    }

    public boolean isBanner() {
        return this instanceof LoadBannerOperationState;
    }

    public boolean isHeaderBidding() {
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null || unityAdsLoadOptions.getData() == null) {
            return false;
        }
        return this.loadOptions.getData().has("adMarkup");
    }

    public void onUnityAdsAdLoaded() {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new b(this));
        }
    }

    public void onUnityAdsFailedToLoad(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        if (this.listener != null) {
            Utilities.wrapCustomerListener(new c(this, unityAdsLoadError, str));
        }
    }
}
