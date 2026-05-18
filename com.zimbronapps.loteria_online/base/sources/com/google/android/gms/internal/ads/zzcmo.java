package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmo implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcmo(zzcmc zzcmcVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcmo zza(zzcmc zzcmcVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmo(zzcmcVar, zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzdD)).booleanValue() ? new zzazh((zzazc) this.zzb.zzb()) : new zzazh((zzazc) this.zza.zzb());
    }
}
