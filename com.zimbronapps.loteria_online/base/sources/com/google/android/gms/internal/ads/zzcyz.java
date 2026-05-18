package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcyz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcyz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcyz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcyz(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdje((zzdfw) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
