package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzehn {
    private final zzehj zza;
    private final zzgzy zzb;

    public zzehn(zzehj zzehjVar, zzgzy zzgzyVar) {
        this.zza = zzehjVar;
        this.zzb = zzgzyVar;
    }

    public final void zza(zzfmu zzfmuVar) {
        zzehj zzehjVar = this.zza;
        Objects.requireNonNull(zzehjVar);
        zzehm zzehmVar = new zzehm(zzehjVar);
        zzgzy zzgzyVar = this.zzb;
        zzgzo.zzr(zzgzyVar.submit(zzehmVar), new zzehl(this, zzfmuVar), zzgzyVar);
    }
}
