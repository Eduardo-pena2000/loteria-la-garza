package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdln implements zzikg {
    private final zzdkr zza;
    private final zzikp zzb;

    private zzdln(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzdkrVar;
        this.zzb = zzikpVar;
    }

    public static zzdln zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdln(zzdkrVar, zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
