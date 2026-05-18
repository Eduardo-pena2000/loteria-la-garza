package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpn implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdpn(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdpn zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdpn(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpm(((zzdni) this.zza).zza(), (E6.f) this.zzb.zzb());
    }
}
