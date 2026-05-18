package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzebw extends L5.e {
    final /* synthetic */ zzecc zza;

    public zzebw(zzecc zzeccVar) {
        Objects.requireNonNull(zzeccVar);
        this.zza = zzeccVar;
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        this.zza.zzg(zzecc.zzh(nVar));
    }
}
