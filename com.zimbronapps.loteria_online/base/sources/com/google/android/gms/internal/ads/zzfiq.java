package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfiq {
    private final E6.f zza;
    private final zzdxz zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfiq(E6.f fVar, zzdxz zzdxzVar) {
        this.zza = fVar;
        this.zzb = zzdxzVar;
    }

    private final void zze() {
        long a = this.zza.a();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) S5.D.c().zzd(zzbhe.zzgT)).longValue() <= a) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        Object obj = this.zzc;
        long a = this.zza.a();
        synchronized (obj) {
            try {
                if (this.zze != i) {
                    return;
                }
                this.zze = i2;
                if (this.zze == 3) {
                    this.zzd = a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoA)).booleanValue()) {
            zzdxy zza = this.zzb.zza();
            zza.zzc("action", "mbs_state");
            zza.zzc("mbs_state", true != z ? "0" : "1");
            zza.zzd();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
