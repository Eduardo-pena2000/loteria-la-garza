package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdmw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzdmw(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
    }

    public static zzdmw zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        return new zzdmw(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcma zzcmaVar = (zzcma) this.zza.zzb();
        zzdan zza = ((zzdax) this.zzb).zza();
        zzdhf zza2 = ((zzdia) this.zzc).zza();
        zzdml zza3 = ((zzdmn) this.zzd).zza();
        zzdeg zza4 = ((zzctw) this.zze).zza();
        zzenr zzenrVar = (zzenr) this.zzf.zzb();
        zzcvb zzi = zzcmaVar.zzi();
        zzi.zzl(zza.zze());
        zzi.zzm(zza2);
        zzi.zzd(zza3);
        zzi.zzk(new zzepw(null));
        zzi.zzg(new zzcvx(zza4, null));
        zzi.zze(new zzctu(null));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzey)).booleanValue()) {
            zzi.zzf(zzeoa.zza(zzenrVar));
        }
        zzcwi zzd = zzi.zza().zzd();
        zziko.zzb(zzd);
        return zzd;
    }
}
