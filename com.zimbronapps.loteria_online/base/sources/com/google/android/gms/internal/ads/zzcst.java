package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcst implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzcst(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
    }

    public static zzcst zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzcst(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcss((zzbti) this.zza.zzb(), (zzcso) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzcsn) this.zzd.zzb(), (E6.f) this.zze.zzb());
    }
}
