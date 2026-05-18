package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcyc implements zzikg {
    private final zzikp zza;

    private zzcyc(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzcyc zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyc(zzikpVar, zzikpVar2);
    }

    public static zzdje zzc(zzcsh zzcshVar, Executor executor) {
        return new zzdje(zzcshVar, executor);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcsh) this.zza.zzb(), zzfmk.zzc());
    }
}
