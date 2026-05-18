package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzac implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;
    private final zztk zzd;

    private zzac(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
        this.zzd = zztkVar4;
    }

    public static zzac zzc(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        return new zzac(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzz zzb() {
        return new zzz((zze) this.zza.zzb(), ((zzap) this.zzb).zza(), (zzaq) this.zzc.zzb(), (zzcr) this.zzd.zzb());
    }
}
