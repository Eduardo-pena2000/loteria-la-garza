package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfga implements zzfgj {
    private final zzfgj zza;
    private zzdam zzb;

    public zzfga(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zzb;
    }

    public final synchronized x7.e zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzbzu zzbzuVar;
        this.zzb = zzdamVar;
        if (zzdamVar == null || (zzbzuVar = zzfgkVar.zza) == null) {
            return ((zzffz) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        }
        zzcxj zza = zzdamVar.zza();
        return zza.zzc(zza.zza(zzgzo.zza(zzbzuVar)));
    }

    public final /* bridge */ /* synthetic */ x7.e zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
