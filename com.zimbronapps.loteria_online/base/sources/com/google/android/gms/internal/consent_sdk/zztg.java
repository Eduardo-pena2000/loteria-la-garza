package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztg implements zztk {
    private static final Object zza = new Object();
    private volatile zztk zzb;
    private volatile Object zzc = zza;

    private zztg(zztk zztkVar) {
        this.zzb = zztkVar;
    }

    public static zztk zza(zztk zztkVar) {
        return zztkVar instanceof zztg ? zztkVar : new zztg(zztkVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object zzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != zzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
