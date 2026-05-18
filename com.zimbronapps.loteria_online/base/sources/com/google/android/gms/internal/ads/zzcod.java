package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcod implements zzdzk {
    private final Long zza;
    private final String zzb;
    private final zzcnp zzc;
    private final zzcof zzd;

    public zzcod(zzcnp zzcnpVar, zzcof zzcofVar, Long l, String str) {
        this.zzc = zzcnpVar;
        this.zzd = zzcofVar;
        this.zza = l;
        this.zzb = str;
    }

    public final zzdzt zza() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzu.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }

    public final zzdzx zzb() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzy.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }
}
