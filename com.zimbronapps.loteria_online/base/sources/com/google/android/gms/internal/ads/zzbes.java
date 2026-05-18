package com.google.android.gms.internal.ads;

import N5.a;
import S5.c1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbes extends zzbez {
    private final a.a zza;
    private final String zzb;

    public zzbes(a.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    public final void zzb(zzbex zzbexVar) {
        a.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdLoaded(new zzbet(zzbexVar, this.zzb));
        }
    }

    public final void zzc(int i) {
    }

    public final void zzd(c1 c1Var) {
        a.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdFailedToLoad(c1Var.N1());
        }
    }
}
