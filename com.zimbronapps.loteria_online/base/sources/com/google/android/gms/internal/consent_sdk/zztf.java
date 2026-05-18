package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztf implements zzth {
    private zztk zza;

    public static void zza(zztk zztkVar, zztk zztkVar2) {
        zztf zztfVar = (zztf) zztkVar;
        if (zztfVar.zza != null) {
            throw new IllegalStateException();
        }
        zztfVar.zza = zztkVar2;
    }

    public final Object zzb() {
        zztk zztkVar = this.zza;
        if (zztkVar != null) {
            return zztkVar.zzb();
        }
        throw new IllegalStateException();
    }
}
