package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzrg implements zzrf {
    public static final zzkm zza;

    static {
        zzkg zzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzb.zzd("measurement.client.sessions.enable_fix_background_engagement", false);
        zzb.zzd("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzb.zzc("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
