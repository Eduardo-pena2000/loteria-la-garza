package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage storage;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidMediationDataSource(JsonStorage storage) {
        t.g(storage, "storage");
        this.storage = storage;
    }

    public String getName() {
        return (String) this.storage.get("mediation.name.value");
    }

    public String getVersion() {
        return (String) this.storage.get("mediation.version.value");
    }
}
