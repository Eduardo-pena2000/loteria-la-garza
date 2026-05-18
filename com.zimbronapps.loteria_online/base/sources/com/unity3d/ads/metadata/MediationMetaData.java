package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.StorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    public MediationMetaData(Context context) {
        super(context);
        setCategory("mediation");
    }

    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.MEMORY;
    }

    public void setMissedImpressionOrdinal(int i) {
        set("missedImpressionOrdinal", Integer.valueOf(i));
    }

    public void setName(String str) {
        set("name", str);
    }

    public void setOrdinal(int i) {
        set("ordinal", Integer.valueOf(i));
    }

    public void setVersion(String str) {
        set("version", str);
    }
}
