package com.google.android.gms.ads.internal.adaptersettings;

import S5.D;
import com.google.android.gms.internal.ads.zzbgn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbgn adapterSettingsInternal = D.d();

    private boolean getBoolean(String str, boolean z) {
        return this.adapterSettingsInternal.zzf(str, z);
    }

    private float getFloat(String str, float f) {
        return this.adapterSettingsInternal.zze(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        return this.adapterSettingsInternal.zzd(str, i);
    }

    private long getLong(String str, long j) {
        return this.adapterSettingsInternal.zzc(str, j);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
