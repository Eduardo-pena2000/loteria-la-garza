package com.unity3d.ads.beta;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String name, String version, String adapterVersion) {
        t.g(name, "name");
        t.g(version, "version");
        t.g(adapterVersion, "adapterVersion");
        this.name = name;
        this.version = version;
        this.adapterVersion = adapterVersion;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
