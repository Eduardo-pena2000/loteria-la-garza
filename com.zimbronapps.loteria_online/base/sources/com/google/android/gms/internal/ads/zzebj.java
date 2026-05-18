package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzebj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzebj(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzebj zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzebj(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebq(((zzcmj) this.zza).zza(), ((zzcna) this.zzb).zza());
    }
}
