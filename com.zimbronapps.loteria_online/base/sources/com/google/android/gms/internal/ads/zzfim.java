package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfim implements zzese {
    final /* synthetic */ zzfio zza;

    public zzfim(zzfio zzfioVar) {
        Objects.requireNonNull(zzfioVar);
        this.zza = zzfioVar;
    }

    public final void zza() {
        zzfio zzfioVar = this.zza;
        synchronized (zzfioVar) {
            zzfioVar.zzx(null);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfio zzfioVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfioVar) {
            try {
                zzfioVar.zzx(zzdtzVar);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzet)).booleanValue()) {
                    zzdtzVar.zzh().zza = zzfioVar.zzv();
                }
                zzfioVar.zzw().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
