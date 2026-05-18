package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfnz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzfnz(zzfny zzfnyVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzfnz zza(zzfny zzfnyVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfnz(zzfnyVar, zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbsz zzb = new zzbsq().zzb(((zzcmj) this.zza).zza(), ((zzcna) this.zzb).zza(), (zzfor) this.zzc.zzb());
        zziko.zzb(zzb);
        return zzb;
    }
}
