package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdvq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdvq zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdvq(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvp(((zzcpu) this.zza).zza(), (zzdvm) this.zzb.zzb());
    }
}
