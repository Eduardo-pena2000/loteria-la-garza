package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzedu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzedu(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar4;
        this.zzc = zzikpVar5;
    }

    public static zzedu zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzedu(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedt zzb() {
        return new zzedt((ScheduledExecutorService) this.zza.zzb(), zzfmk.zzc(), zzfmq.zzc(), ((zzeet) this.zzb).zza(), zzikf.zzc(this.zzc));
    }
}
