package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzebu extends f6.d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzecc zzb;

    public zzebu(zzecc zzeccVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzeccVar);
        this.zzb = zzeccVar;
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        this.zzb.zzg(zzecc.zzh(nVar));
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzf(this.zza, (f6.c) obj);
    }
}
