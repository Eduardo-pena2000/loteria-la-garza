package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnf implements zzikg {
    private final zzdnd zza;

    private zzdnf(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    public static zzdnf zzc(zzdnd zzdndVar) {
        return new zzdnf(zzdndVar);
    }

    public static JSONObject zzd(zzdnd zzdndVar) {
        JSONObject zzc = zzdndVar.zzc();
        zziko.zzb(zzc);
        return zzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
