package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsp implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzdsp(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzdsp zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzdsp(zzikpVar, zzikpVar2, zzikpVar3);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdso(((zzcwx) this.zza).zza(), (zzdoc) this.zzb.zzb(), ((zzdoz) this.zzc).zza());
    }
}
