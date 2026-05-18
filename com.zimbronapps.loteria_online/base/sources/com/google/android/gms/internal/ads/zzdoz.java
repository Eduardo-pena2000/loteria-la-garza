package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdoz implements zzikg {
    private final zzdos zza;

    private zzdoz(zzdos zzdosVar) {
        this.zza = zzdosVar;
    }

    public static zzdoz zzc(zzdos zzdosVar) {
        return new zzdoz(zzdosVar);
    }

    public static zzdoh zzd(zzdos zzdosVar) {
        zzdoh zza = zzdosVar.zza();
        zziko.zzb(zza);
        return zza;
    }

    public final zzdoh zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
