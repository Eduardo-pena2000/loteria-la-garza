package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzm implements zzth {
    private final zztk zza;
    private final zztk zzb;

    private zzm(zztk zztkVar, zztk zztkVar2) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
    }

    public static zzm zza(zztk zztkVar, zztk zztkVar2) {
        return new zzm(zztkVar, zztkVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzl((Application) this.zza.zzb(), (zzam) this.zzb.zzb());
    }
}
