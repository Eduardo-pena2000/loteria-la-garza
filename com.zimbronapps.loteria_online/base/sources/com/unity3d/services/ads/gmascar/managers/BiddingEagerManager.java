package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BiddingEagerManager extends BiddingBaseManager {
    public BiddingEagerManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(iScarAdFormatProvider, iUnityAdsTokenListener);
    }

    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
