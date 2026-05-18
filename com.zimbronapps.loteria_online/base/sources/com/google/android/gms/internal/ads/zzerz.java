package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzerz implements zzese {
    final /* synthetic */ zzesa zza;

    public zzerz(zzesa zzesaVar) {
        Objects.requireNonNull(zzesaVar);
        this.zza = zzesaVar;
    }

    public final void zza() {
        synchronized (this.zza) {
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcwf zzcwfVar = (zzcwf) obj;
        zzesa zzesaVar = this.zza;
        synchronized (zzesaVar) {
            zzesaVar.zze(zzcwfVar.zzn());
            zzcwfVar.zzj();
        }
    }
}
