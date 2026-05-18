package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenh extends zzeng {
    private final zzcma zza;
    private final zzdan zzb;
    private final zzdhf zzc;
    private final zzenr zzd;
    private final zzekl zze;

    public zzenh(zzcma zzcmaVar, zzdan zzdanVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdanVar;
        this.zzc = zzdhfVar;
        this.zzd = zzenrVar;
        this.zze = zzeklVar;
    }

    public final x7.e zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzb;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zzd));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zze);
        }
        zzctk zzk = this.zza.zzk();
        zzk.zzd(zzdanVar.zze());
        zzk.zze(this.zzc);
        zzcxj zza = zzk.zza().zza();
        return zza.zzc(zza.zzb());
    }
}
