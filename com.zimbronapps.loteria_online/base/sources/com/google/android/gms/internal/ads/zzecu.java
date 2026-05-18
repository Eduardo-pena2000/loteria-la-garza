package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzecu(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzecu zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzecu(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzect(((zzcmj) this.zza).zza(), (zzdxz) this.zzb.zzb());
    }
}
