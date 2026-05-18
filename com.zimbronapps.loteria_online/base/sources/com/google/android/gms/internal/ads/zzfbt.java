package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzfbt(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar4;
        this.zzd = zzikpVar5;
        this.zze = zzikpVar6;
        this.zzf = zzikpVar7;
    }

    public static zzfbt zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7) {
        return new zzfbt(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbr(((zzcmd) this.zza).zza(), ((zzcmj) this.zzb).zza(), zzfmk.zzc(), (ScheduledExecutorService) this.zzc.zzb(), ((zzekf) this.zzd).zza(), ((zzdaw) this.zze).zza(), ((zzcna) this.zzf).zza());
    }
}
