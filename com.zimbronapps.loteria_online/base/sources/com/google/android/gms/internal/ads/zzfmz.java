package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfmz implements zzikg {
    private final zzikp zza;

    private zzfmz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfmz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfmz(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfmy((ScheduledExecutorService) this.zza.zzb(), zzfmk.zzc());
    }
}
