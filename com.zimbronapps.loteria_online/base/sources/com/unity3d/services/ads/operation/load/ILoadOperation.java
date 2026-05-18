package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.services.ads.operation.IAdOperation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ILoadOperation extends IAdOperation, IUnityAdsLoadListener {
    LoadOperationState getLoadOperationState();
}
