package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdtf {
    private final zzdbd zza;
    private final zzdcm zzb;
    private final zzdcz zzc;
    private final zzddq zzd;
    private final zzdgj zze;
    private final zzfir zzf;
    private final zzfiu zzg;
    private final zzcrv zzh;

    public zzdtf(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        this.zza = zzdbdVar;
        this.zzb = zzdcmVar;
        this.zzc = zzdczVar;
        this.zzd = zzddqVar;
        this.zze = zzdgjVar;
        this.zzf = zzfirVar;
        this.zzg = zzfiuVar;
        this.zzh = zzcrvVar;
    }

    public final void zza(zzdtk zzdtkVar) {
        zzdcm zzdcmVar = this.zzb;
        zzdsy zzk = zzdtkVar.zzk();
        Objects.requireNonNull(zzdcmVar);
        zzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new zzdte(zzdcmVar));
        zzdtkVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
