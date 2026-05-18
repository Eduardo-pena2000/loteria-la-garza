package com.google.android.gms.internal.ads;

import S5.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbs extends zzcbf {
    private final g6.b zza;
    private final zzcbt zzb;

    public zzcbs(g6.b bVar, zzcbt zzcbtVar) {
        this.zza = bVar;
        this.zzb = zzcbtVar;
    }

    public final void zze() {
        zzcbt zzcbtVar;
        g6.b bVar = this.zza;
        if (bVar == null || (zzcbtVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzcbtVar);
    }

    public final void zzf(int i) {
    }

    public final void zzg(c1 c1Var) {
        g6.b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(c1Var.N1());
        }
    }
}
