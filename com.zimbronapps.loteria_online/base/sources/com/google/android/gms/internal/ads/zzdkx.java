package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdkx implements zzikg {
    private final zzikp zza;

    private zzdkx(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdkx zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdkx(zzdkrVar, zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdje((zzczw) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(singleton);
        return singleton;
    }
}
