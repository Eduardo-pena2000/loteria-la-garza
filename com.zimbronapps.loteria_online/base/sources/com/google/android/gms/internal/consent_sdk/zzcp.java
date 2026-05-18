package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcp implements zzth {
    private final zztk zza;

    private zzcp(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzcp zza(zztk zztkVar) {
        return new zzcp(zztkVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzco((Application) this.zza.zzb());
    }
}
