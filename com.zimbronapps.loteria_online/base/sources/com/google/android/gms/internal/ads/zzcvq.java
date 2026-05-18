package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcvq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcvq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcvq zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcvq(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvp zzb() {
        return new zzcvp(((zzcuv) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
