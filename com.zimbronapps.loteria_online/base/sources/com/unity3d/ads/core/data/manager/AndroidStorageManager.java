package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public void addStorageLocation(StorageManager.StorageType type, String fileName) {
        t.g(type, "type");
        t.g(fileName, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    public Storage getStorage(StorageManager.StorageType type) {
        t.g(type, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        t.f(storage, "getStorage(type)");
        return storage;
    }

    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set("configuration.hasInitialized", Boolean.TRUE);
        storage.writeStorage();
    }

    public boolean hasStorage(StorageManager.StorageType type) {
        t.g(type, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    public boolean init(Context context) {
        t.g(context, "context");
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    public void initStorage(StorageManager.StorageType type) {
        t.g(type, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    public void removeStorage(StorageManager.StorageType type) {
        t.g(type, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }
}
