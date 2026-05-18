package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcpp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcpp(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcpp zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcpp(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new W5.v(((zzcmj) this.zza).zza(), (String) this.zzb.zzb());
    }
}
