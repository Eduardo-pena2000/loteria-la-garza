package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgcu implements zzikg {
    private final zzikp zza;

    private zzgcu(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzgcu zza(zzikp zzikpVar) {
        return new zzgcu(zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgdc((ExecutorService) this.zza.zzb());
    }
}
