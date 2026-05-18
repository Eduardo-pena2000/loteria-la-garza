package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzffl implements zzfgj {
    private zzdam zza;
    private final Executor zzb = zzhaf.zza();

    public final zzdam zza() {
        return this.zza;
    }

    public final x7.e zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zza = zzfgiVar.zza(zzfgkVar.zzb);
        zza.zzj(new zzfgn(true));
        zzdam zzdamVar2 = (zzdam) zza.zzh();
        this.zza = zzdamVar2;
        zzcxj zza2 = zzdamVar2.zza();
        zzfli zzfliVar = new zzfli();
        zzgzg zzw = zzgzg.zzw(zza2.zzb());
        zzffk zzffkVar = new zzffk(this, zzfliVar, zza2);
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj(zzw, zzffkVar, executor), new zzffj(zzfliVar), executor);
    }

    public final /* bridge */ /* synthetic */ x7.e zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
