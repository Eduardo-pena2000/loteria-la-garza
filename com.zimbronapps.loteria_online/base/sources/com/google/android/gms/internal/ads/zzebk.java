package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzebk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzebk(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzebk zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzebk(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecc(((zzcmj) this.zza).zza(), ((zzcmk) this.zzb).zza(), (zzebq) this.zzc.zzb(), new zzece(), zzfmk.zzc());
    }
}
