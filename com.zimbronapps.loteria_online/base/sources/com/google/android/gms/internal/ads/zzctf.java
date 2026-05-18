package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    public zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j, int i) {
        zzdxy zza = this.zza.zza();
        zza.zza(this.zzb.zzb.zzb);
        zza.zzc("action", "ad_closed");
        zza.zzc("show_time", String.valueOf(j));
        zza.zzc("ad_format", "app_open_ad");
        int i2 = i - 1;
        zza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzd();
    }
}
