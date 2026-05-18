package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfnw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfnw(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
    }

    public static zzfnw zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfnw(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfnu(zzfmk.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfnx) this.zzb).zza());
    }
}
