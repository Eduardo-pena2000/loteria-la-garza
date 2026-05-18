package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcly implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcly(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcly zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcly(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzclx((zzclk) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
