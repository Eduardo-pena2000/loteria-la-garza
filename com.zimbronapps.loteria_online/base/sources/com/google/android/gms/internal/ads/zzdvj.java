package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvj {
    private final zzdxz zza;

    public zzdvj(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final boolean zza(zzfyu zzfyuVar) {
        if (zzfyuVar.zzj()) {
            zzdxy zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzfyuVar.zza());
            zza.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
            zza.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
            return zza.zze().equals(W5.u.a);
        }
        zzdxy zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzfyuVar.zza());
        zza2.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
        zza2.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
        zza2.zzc("aq_is_os_kill", String.valueOf(zzfyuVar.zze()));
        return zza2.zze().equals(W5.u.a);
    }
}
