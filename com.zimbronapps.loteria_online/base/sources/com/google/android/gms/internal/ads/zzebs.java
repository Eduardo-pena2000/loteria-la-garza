package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzebs extends L5.e {
    final /* synthetic */ String zza;
    final /* synthetic */ L5.l zzb;
    final /* synthetic */ zzecc zzc;

    public zzebs(zzecc zzeccVar, String str, L5.l lVar) {
        this.zza = str;
        this.zzb = lVar;
        Objects.requireNonNull(zzeccVar);
        this.zzc = zzeccVar;
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        this.zzc.zzg(zzecc.zzh(nVar));
    }

    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
