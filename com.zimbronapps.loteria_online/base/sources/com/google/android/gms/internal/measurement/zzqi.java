package com.google.android.gms.internal.measurement;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqi implements zzqh {
    public static final zzkm zza;

    static {
        zzkg zzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zzb.zzd("measurement.gmscore_feature_tracking", true);
        zza = zzb.zzd("measurement.gmscore_client_telemetry", false);
    }

    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
