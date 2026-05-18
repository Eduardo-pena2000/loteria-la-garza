package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzflq implements zzgzl {
    final /* synthetic */ zzflt zza;
    final /* synthetic */ zzflv zzb;

    public zzflq(zzflv zzflvVar, zzflt zzfltVar) {
        this.zza = zzfltVar;
        Objects.requireNonNull(zzflvVar);
        this.zzb = zzflvVar;
    }

    public final void zza(Throwable th) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            zzflvVar.zzf(null);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflv zzflvVar = this.zzb;
        synchronized (zzflvVar) {
            try {
                zzflvVar.zzf(null);
                zzflvVar.zze().addFirst(this.zza);
                if (zzflvVar.zzg() == 1) {
                    zzflvVar.zzd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
