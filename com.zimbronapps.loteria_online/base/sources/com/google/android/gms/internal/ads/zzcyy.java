package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcyy implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcyy(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcyy zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyy(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdfw) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
