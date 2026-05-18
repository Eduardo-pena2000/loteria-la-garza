package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface StorageManager {
    void addStorageLocation(StorageManager.StorageType storageType, String str);

    Storage getStorage(StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(StorageManager.StorageType storageType);

    boolean init(Context context);

    void initStorage(StorageManager.StorageType storageType);

    void removeStorage(StorageManager.StorageType storageType);
}
