package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcsp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcsp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcsp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcsp(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcso(((zzcmj) this.zza).zza(), (zzbdb) this.zzb.zzb());
    }
}
