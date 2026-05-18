package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StorageEventInfo {
    private final StorageEvent eventType;
    private final StorageManager.StorageType storageType;
    private final Object value;

    public StorageEventInfo(StorageEvent eventType, StorageManager.StorageType storageType, Object obj) {
        t.g(eventType, "eventType");
        t.g(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    public static /* synthetic */ StorageEventInfo copy$default(StorageEventInfo storageEventInfo, StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    public final StorageEvent component1() {
        return this.eventType;
    }

    public final StorageManager.StorageType component2() {
        return this.storageType;
    }

    public final Object component3() {
        return this.value;
    }

    public final StorageEventInfo copy(StorageEvent eventType, StorageManager.StorageType storageType, Object obj) {
        t.g(eventType, "eventType");
        t.g(storageType, "storageType");
        return new StorageEventInfo(eventType, storageType, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageEventInfo)) {
            return false;
        }
        StorageEventInfo storageEventInfo = (StorageEventInfo) obj;
        return this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && t.c(this.value, storageEventInfo.value);
    }

    public final StorageEvent getEventType() {
        return this.eventType;
    }

    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }
}
