package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzk implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;
    private final zztk zzd;

    private zzk(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
        this.zzd = zztkVar4;
    }

    public static zzk zza(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        return new zzk(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzj((zzaq) this.zza.zzb(), ((zzx) this.zzb).zza(), (zzbq) this.zzc.zzb(), (zzcr) this.zzd.zzb());
    }
}
