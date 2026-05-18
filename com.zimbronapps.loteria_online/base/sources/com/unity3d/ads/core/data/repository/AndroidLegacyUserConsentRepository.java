package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(LegacyUserConsentDataSource legacyUserConsentDataSource) {
        t.g(legacyUserConsentDataSource, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource;
    }

    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
