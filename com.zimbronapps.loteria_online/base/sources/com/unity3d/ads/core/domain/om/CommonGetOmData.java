package com.unity3d.ads.core.domain.om;

import Ga.e;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository) {
        t.g(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    public Object invoke(e eVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
