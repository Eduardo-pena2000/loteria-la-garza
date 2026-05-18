package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzffz implements zzfgj {
    private zzdam zza;

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zza;
    }

    public final synchronized x7.e zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzcxj zza;
        try {
            if (zzdamVar != null) {
                this.zza = zzdamVar;
            } else {
                this.zza = (zzdam) zzfgiVar.zza(zzfgkVar.zzb).zzh();
            }
            zza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zza.zzc(zza.zzb());
    }

    public final /* bridge */ /* synthetic */ x7.e zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
