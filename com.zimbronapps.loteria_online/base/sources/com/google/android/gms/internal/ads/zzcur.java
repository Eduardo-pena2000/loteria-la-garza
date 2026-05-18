package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcur implements zzikg {
    private final zzikp zza;

    private zzcur(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcur zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcur(zzcueVar, zzikpVar);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdje((zzcvu) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(singleton);
        return singleton;
    }
}
