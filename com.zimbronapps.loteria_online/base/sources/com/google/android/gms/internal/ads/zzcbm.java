package com.google.android.gms.internal.ads;

import S5.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbm extends zzcbf {
    private final f6.d zza;
    private final f6.c zzb;

    public zzcbm(f6.d dVar, f6.c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    public final void zze() {
        f6.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }

    public final void zzf(int i) {
    }

    public final void zzg(c1 c1Var) {
        f6.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdFailedToLoad(c1Var.N1());
        }
    }
}
