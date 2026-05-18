package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdmo implements zzikg {
    private final zzdml zza;

    private zzdmo(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    public static zzdmo zzc(zzdml zzdmlVar) {
        return new zzdmo(zzdmlVar);
    }

    public static zzdor zzd(zzdml zzdmlVar) {
        zzdor zza = zzdmlVar.zza();
        zziko.zzb(zza);
        return zza;
    }

    public final zzdor zza() {
        return zzd(this.zza);
    }

    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
