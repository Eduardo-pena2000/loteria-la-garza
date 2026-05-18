package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeml implements zzeki {
    private final zzdvp zza;

    public zzeml(zzdvp zzdvpVar) {
        this.zza = zzdvpVar;
    }

    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        return new zzekj(this.zza.zza(str, jSONObject), new zzelv(), str);
    }
}
