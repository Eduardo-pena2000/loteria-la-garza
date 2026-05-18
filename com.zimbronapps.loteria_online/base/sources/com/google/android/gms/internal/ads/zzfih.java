package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfih implements zzese {
    final /* synthetic */ zzfii zza;

    public zzfih(zzfii zzfiiVar) {
        Objects.requireNonNull(zzfiiVar);
        this.zza = zzfiiVar;
    }

    public final void zza() {
        zzfii zzfiiVar = this.zza;
        synchronized (zzfiiVar) {
            zzfiiVar.zzw(null);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfii zzfiiVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfiiVar) {
            try {
                zzfiiVar.zzw(zzdtzVar);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzet)).booleanValue()) {
                    zzdtzVar.zzh().zza = zzfiiVar.zzu();
                }
                zzfiiVar.zzv().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
