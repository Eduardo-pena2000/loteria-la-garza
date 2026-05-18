package com.google.android.gms.internal.ads;

import N5.a;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzebr extends a.a {
    final /* synthetic */ String zza;
    final /* synthetic */ zzecc zzb;

    public zzebr(zzecc zzeccVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzeccVar);
        this.zzb = zzeccVar;
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        this.zzb.zzg(zzecc.zzh(nVar));
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzf(this.zza, (N5.a) obj);
    }
}
