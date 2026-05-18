package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdtp {
    private final zzdbd zza;
    private final zzdcm zzb;
    private final zzdcz zzc;
    private final zzddq zzd;
    private final zzdgj zze;
    private final zzdjk zzf;
    private final zzdxz zzg;
    private final zzfqk zzh;
    private final zzeiu zzi;
    private final zzcrv zzj;

    public zzdtp(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, zzdjk zzdjkVar, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzcrv zzcrvVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdcmVar;
        this.zzc = zzdczVar;
        this.zzd = zzddqVar;
        this.zze = zzdgjVar;
        this.zzf = zzdjkVar;
        this.zzg = zzdxzVar;
        this.zzh = zzfqkVar;
        this.zzi = zzeiuVar;
        this.zzj = zzcrvVar;
    }

    public final void zza(zzdtq zzdtqVar, zzcjl zzcjlVar) {
        zzdtn zzb = zzdtqVar.zzb();
        zzdcm zzdcmVar = this.zzb;
        Objects.requireNonNull(zzdcmVar);
        zzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new zzdto(zzdcmVar), this.zzf);
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlE)).booleanValue() || zzcjlVar == null || zzcjlVar.zzP() == null) {
            return;
        }
        zzclj zzP = zzcjlVar.zzP();
        zzcrv zzcrvVar = this.zzj;
        zzeiu zzeiuVar = this.zzi;
        zzP.zzd(zzcrvVar, zzeiuVar, this.zzh);
        zzP.zze(zzcrvVar, zzeiuVar, this.zzg);
    }
}
