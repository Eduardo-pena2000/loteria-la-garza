package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzena implements zzgzl {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzenb zzb;

    public zzena(zzenb zzenbVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzenbVar);
        this.zzb = zzenbVar;
    }

    public final void zza(Throwable th) {
        zzenb zzenbVar = this.zzb;
        synchronized (zzenbVar) {
            try {
                zzenc zzc = zzenbVar.zzc();
                zzfir zzfirVar = this.zza;
                zzc.zzc(th, zzfirVar);
                zzfir zza = zzenbVar.zzc().zza();
                if (zzfirVar.zzav) {
                    while (zza != null) {
                        zzenbVar.zzb(zza);
                        zza = zzenbVar.zzc().zza();
                    }
                } else if (zza != null) {
                    zzenbVar.zzb(zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenb zzenbVar = this.zzb;
        zzens zzensVar = (zzens) obj;
        synchronized (zzenbVar) {
            try {
                zzenbVar.zzc().zzb(zzensVar, this.zza);
                zzfir zza = zzenbVar.zzc().zza();
                if (zza != null) {
                    zzenbVar.zzb(zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
