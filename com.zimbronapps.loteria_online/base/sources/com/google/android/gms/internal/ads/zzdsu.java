package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzdsu(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzdsu zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzdsu(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdst(((zzcmj) this.zza).zza(), ((zzdoz) this.zzb).zza(), ((zzdph) this.zzc).zzb(), (zzdoc) this.zzd.zzb());
    }
}
