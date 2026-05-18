package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzan implements zzth {
    private final zztk zza;

    private zzan(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzan zza(zztk zztkVar) {
        return new zzan(zztkVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzam((Application) this.zza.zzb());
    }
}
