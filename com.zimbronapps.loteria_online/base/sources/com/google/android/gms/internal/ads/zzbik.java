package com.google.android.gms.internal.ads;

import b6.b0;
import b6.k0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbik implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzbik(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzbik zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzbik(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbij zzb() {
        return new zzbij((ScheduledExecutorService) this.zza.zzb(), (k0) this.zzb.zzb(), (b0) this.zzc.zzb(), (zzdye) this.zzd.zzb());
    }
}
