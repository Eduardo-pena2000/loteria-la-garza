package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgav implements zzikg {
    private final zzikp zza;

    private zzgav(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgav zza(zzikp zzikpVar) {
        return new zzgav(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgzy zzb = zzhaf.zzb((ExecutorService) this.zza.zzb());
        zziko.zzb(zzb);
        return zzb;
    }
}
