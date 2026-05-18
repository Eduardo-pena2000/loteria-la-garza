package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgco implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzgco(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzgco zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzgco(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgcn((Executor) this.zza.zzb(), (zzgao) this.zzb.zzb());
    }
}
