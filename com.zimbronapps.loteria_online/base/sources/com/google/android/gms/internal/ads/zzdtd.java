package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdtd implements zzgzl {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzcrv zzc;
    final /* synthetic */ zzdtk zzd;

    public zzdtd(zzdtk zzdtkVar, zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        this.zza = zzfirVar;
        this.zzb = zzfiuVar;
        this.zzc = zzcrvVar;
        Objects.requireNonNull(zzdtkVar);
        this.zzd = zzdtkVar;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzfir zzfirVar = this.zza;
        zzcjlVar.zzaD(zzfirVar, this.zzb);
        zzclj zzP = zzcjlVar.zzP();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlC)).booleanValue() && zzP != null) {
            zzcrv zzcrvVar = this.zzc;
            zzdtk zzdtkVar = this.zzd;
            zzP.zzd(zzcrvVar, zzdtkVar.zzm(), zzdtkVar.zzn());
            zzP.zze(zzcrvVar, zzdtkVar.zzm(), zzdtkVar.zzl());
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzoy)).booleanValue() || zzP == null) {
            return;
        }
        zzP.zzb(zzfirVar);
    }
}
