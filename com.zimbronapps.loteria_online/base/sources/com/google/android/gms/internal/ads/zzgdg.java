package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdg implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzgdg(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzgdg zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzgdg(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgdf(zzikf.zzc(this.zza), zzikf.zzc(this.zzb), (ExecutorService) this.zzc.zzb(), zzikf.zzc(this.zzd));
    }
}
