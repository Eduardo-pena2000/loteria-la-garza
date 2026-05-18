package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import fb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Show {
    e invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, Ga.e eVar);
}
