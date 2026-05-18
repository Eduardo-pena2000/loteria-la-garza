package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {
    private final DeveloperConsentOuterClass.DeveloperConsent developerConsent;

    public AndroidDeveloperConsentRepository(DeveloperConsentDataSource developerConsentDataSource) {
        t.g(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsent = developerConsentDataSource.getDeveloperConsent();
    }

    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        return this.developerConsent;
    }
}
