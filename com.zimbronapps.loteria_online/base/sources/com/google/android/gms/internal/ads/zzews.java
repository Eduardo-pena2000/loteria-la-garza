package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzews implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzews(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzews zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzews(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeuv zzb = ((zzeux) this.zza).zzb();
        zzevl zzevlVar = (zzevl) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("13")) {
            return new zzezj(zzevlVar, ((Integer) S5.D.c().zzd(zzbhe.zznM)).intValue(), scheduledExecutorService);
        }
        return new zzezj(zzb, ((Integer) S5.D.c().zzd(zzbhe.zznM)).intValue(), scheduledExecutorService);
    }
}
