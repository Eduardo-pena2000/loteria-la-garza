package com.unity3d.ads.core.data.repository;

import Qa.a;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource) {
        t.g(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    public a getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    public String getName() {
        return this.mediationDataSource.getName();
    }

    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
