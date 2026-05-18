package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzql implements zzqk {
    public static final zzkm zza;

    static {
        zzkg zzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb.zzd("measurement.sdk.collection.enable_extend_user_property_size", true);
        zza = zzb.zzd("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzb.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
