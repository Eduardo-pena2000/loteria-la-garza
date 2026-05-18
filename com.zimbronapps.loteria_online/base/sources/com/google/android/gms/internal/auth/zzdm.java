package com.google.android.gms.internal.auth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdm implements zzdj {
    private static final zzdj zza = zzdl.zza;
    private volatile zzdj zzb;
    private Object zzc;

    public zzdm(zzdj zzdjVar) {
        this.zzb = zzdjVar;
    }

    public final String toString() {
        String str = this.zzb;
        if (str == zza) {
            str = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(str) + ")";
    }

    public final Object zza() {
        zzdj zzdjVar = this.zzb;
        zzdj zzdjVar2 = zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzdjVar2) {
                        Object zza2 = this.zzb.zza();
                        this.zzc = zza2;
                        this.zzb = zzdjVar2;
                        return zza2;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
