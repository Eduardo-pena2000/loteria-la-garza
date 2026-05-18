package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzbio {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbio(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbio zza(String str, boolean z) {
        return new zzbio(str, Boolean.valueOf(z), 1);
    }

    public static zzbio zzb(String str, long j) {
        return new zzbio(str, Long.valueOf(j), 2);
    }

    public static zzbio zzc(String str, double d) {
        return new zzbio(str, Double.valueOf(d), 3);
    }

    public static zzbio zzd(String str, String str2) {
        return new zzbio("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbju zza = zzbjw.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzb(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbjw.zzb() != null) {
            zzbjw.zzb().zza();
        }
        return this.zzb;
    }
}
