package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzap implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;

    private zzap(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
    }

    public static zzap zzc(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        return new zzap(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzao zzb() {
        return new zzao((Application) this.zza.zzb(), (zzaq) this.zzb.zzb(), (zzl) this.zzc.zzb(), zzax.zza());
    }
}
