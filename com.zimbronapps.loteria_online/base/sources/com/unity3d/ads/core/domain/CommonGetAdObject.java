package com.unity3d.ads.core.domain;

import Ca.e;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.jvm.internal.t;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        t.g(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    public AdObject invoke(String opportunityId) {
        t.g(opportunityId, "opportunityId");
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(opportunityId));
    }
}
