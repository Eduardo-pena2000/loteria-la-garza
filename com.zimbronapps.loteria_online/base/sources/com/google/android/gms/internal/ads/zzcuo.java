package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcuo implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;

    private zzcuo(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
    }

    public static zzcuo zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcuo(zzcueVar, zzikpVar);
    }

    public static Set zzc(zzcue zzcueVar, zzcvu zzcvuVar) {
        Set singleton = Collections.singleton(new zzdje(zzcvuVar, zzcei.zzg));
        zziko.zzb(singleton);
        return singleton;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcvu) this.zzb.zzb());
    }
}
