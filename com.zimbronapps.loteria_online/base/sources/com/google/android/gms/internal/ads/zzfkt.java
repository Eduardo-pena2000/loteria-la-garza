package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfkt implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfkt(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzfkt zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfkt(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfks(((zzcmj) this.zza).zza(), ((zzcnd) this.zzb).zza());
    }
}
