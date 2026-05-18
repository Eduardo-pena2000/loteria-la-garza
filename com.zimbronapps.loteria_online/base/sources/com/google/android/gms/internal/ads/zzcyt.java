package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcyt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcyt(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcyt zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyt(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdfw) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
