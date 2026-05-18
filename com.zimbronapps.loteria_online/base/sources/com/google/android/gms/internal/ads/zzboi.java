package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzboi implements zzboh {
    private final zzebf zza;

    public zzboi(zzebf zzebfVar) {
        com.google.android.gms.common.internal.t.m(zzebfVar, "The Inspector Manager must not be null");
        this.zza = zzebfVar;
    }

    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
