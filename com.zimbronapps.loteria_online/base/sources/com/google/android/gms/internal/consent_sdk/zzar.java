package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzar implements zzth {
    private final zztk zza;

    private zzar(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzar zza(zztk zztkVar) {
        return new zzar(zztkVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzaq((Application) this.zza.zzb());
    }
}
