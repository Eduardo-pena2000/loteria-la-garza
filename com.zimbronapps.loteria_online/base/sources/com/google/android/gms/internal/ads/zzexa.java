package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexa implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzexa(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzexa zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzexa(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezj(((zzeyd) this.zza).zzb(), ((Integer) S5.D.c().zzd(zzbhe.zznW)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
