package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.Configuration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LoadBannerOperationState extends LoadOperationState {
    private v9.c _scarAdMetadata;
    private UnityBannerSize _size;

    public LoadBannerOperationState(String str, String str2, UnityBannerSize unityBannerSize, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration);
        this.id = str2;
        this._size = unityBannerSize;
    }

    public v9.c getScarAdMetadata() {
        return this._scarAdMetadata;
    }

    public UnityBannerSize getSize() {
        return this._size;
    }

    public boolean isScarAd() {
        return this._scarAdMetadata != null;
    }

    public void setScarAdMetadata(v9.c cVar) {
        this._scarAdMetadata = cVar;
    }

    public void setSize(UnityBannerSize unityBannerSize) {
        this._size = unityBannerSize;
    }
}
