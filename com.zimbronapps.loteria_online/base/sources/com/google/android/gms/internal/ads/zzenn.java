package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenn extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;
    private final zzfjd zze;
    private final zzekl zzf;

    public zzenn(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, zzfjd zzfjdVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zze = zzfjdVar;
        this.zzd = zzenrVar;
        this.zzf = zzeklVar;
    }

    public final x7.e zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzfjd zzfjdVar;
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeu)).booleanValue() && (zzfjdVar = this.zze) != null) {
            zzdanVar.zzf(zzfjdVar);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdud zzp = this.zza.zzp();
        zzp.zzd(zzdanVar.zze());
        zzp.zze(this.zzc);
        zzcxj zza = zzp.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
