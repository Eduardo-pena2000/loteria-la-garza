package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenj extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzepw zzc;
    private final zzdhf zzd;
    private final zzdml zze;
    private final zzdeg zzf;
    private final ViewGroup zzg;
    private final zzdgl zzh;
    private final zzenr zzi;
    private final zzekl zzj;

    public zzenj(zzcma zzcmaVar, zzdan zzdanVar, zzepw zzepwVar, zzdhf zzdhfVar, zzdml zzdmlVar, zzdeg zzdegVar, ViewGroup viewGroup, zzdgl zzdglVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzepwVar;
        this.zzd = zzdhfVar;
        this.zze = zzdmlVar;
        this.zzf = zzdegVar;
        this.zzg = viewGroup;
        this.zzh = zzdglVar;
        this.zzi = zzenrVar;
        this.zzj = zzeklVar;
    }

    public final x7.e zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzi));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzj);
        }
        zzcvb zzi = this.zza.zzi();
        zzi.zzl(zzdanVar.zze());
        zzi.zzm(this.zzd);
        zzi.zzk(this.zzc);
        zzi.zzd(this.zze);
        zzi.zzg(new zzcvx(this.zzf, this.zzh));
        zzi.zze(new zzctu(this.zzg));
        zzcxj zzc = zzi.zza().zzc();
        return zzc.zzc(zzc.zzb());
    }
}
