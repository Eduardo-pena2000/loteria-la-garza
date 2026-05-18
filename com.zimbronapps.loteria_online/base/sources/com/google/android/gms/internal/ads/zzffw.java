package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzffw implements zzfgj {
    private final zzfkz zza;
    private final Executor zzb;
    private final zzgzl zzc = new zzfft(this);

    public zzffw(zzfkz zzfkzVar, Executor executor) {
        this.zza = zzfkzVar;
        this.zzb = executor;
    }

    public final x7.e zza(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzfkz zzfkzVar = this.zza;
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzj(zzgzg.zzw(new zzfgf(zzfkzVar, zzdamVar, executor).zza()), new zzffu(this, zzdamVar), executor), Exception.class, new zzffs(this), executor);
    }

    public final /* synthetic */ x7.e zzb(zzdam zzdamVar, zzfgd zzfgdVar) {
        zzfkz zzfkzVar = this.zza;
        zzflj zzfljVar = zzfgdVar.zzb;
        zzbzu zzbzuVar = zzfgdVar.zza;
        zzfli zza = zzfkzVar.zza(zzfljVar);
        if (zza != null && zzbzuVar != null) {
            zzgzo.zzr(zzdamVar.zza().zzf(zzbzuVar), this.zzc, this.zzb);
        }
        return zzgzo.zza(new zzffv(zzfljVar, zzbzuVar, zza));
    }

    public final /* bridge */ /* synthetic */ x7.e zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zza(zzfgkVar, zzfgiVar, null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
