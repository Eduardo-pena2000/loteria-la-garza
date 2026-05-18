package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexd implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzexd(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzexd zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzexd(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeyq zzc = zzeys.zzc();
        zzevl zzevlVar = (zzevl) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzezj(zzevlVar, ((Integer) S5.D.c().zzd(zzbhe.zznF)).intValue(), scheduledExecutorService);
        }
        return new zzezj(zzc, ((Integer) S5.D.c().zzd(zzbhe.zznF)).intValue(), scheduledExecutorService);
    }
}
