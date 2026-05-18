package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdoo implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdoo(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdoo zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdoo(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdol(((zzcww) this.zza).zza(), ((zzdnf) this.zzb).zza());
    }
}
