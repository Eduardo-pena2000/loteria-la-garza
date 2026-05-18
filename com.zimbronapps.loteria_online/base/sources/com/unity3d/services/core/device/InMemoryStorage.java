package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InMemoryStorage extends Storage {
    public InMemoryStorage() {
        super("", StorageManager.StorageType.MEMORY);
    }

    public synchronized boolean clearStorage() {
        clearData();
        return true;
    }

    public synchronized boolean readStorage() {
        return true;
    }

    public synchronized boolean writeStorage() {
        return true;
    }
}
