package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonIsOMActivated implements IsOMActivated {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(OpenMeasurementRepository openMeasurementRepository) {
        t.g(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
