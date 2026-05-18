package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenl extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzepw zzc;
    private final zzdhf zzd;
    private final zzenr zze;
    private final zzekl zzf;

    public zzenl(zzcma zzcmaVar, zzdan zzdanVar, zzepw zzepwVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzepwVar;
        this.zzd = zzdhfVar;
        this.zze = zzenrVar;
        this.zzf = zzeklVar;
    }

    public final x7.e zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zze));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdlt zzm = this.zza.zzm();
        zzm.zze(zzdanVar.zze());
        zzm.zzf(this.zzd);
        zzm.zzd(this.zzc);
        zzcxj zzb = zzm.zzh().zzb();
        return zzb.zzc(zzb.zzb());
    }
}
