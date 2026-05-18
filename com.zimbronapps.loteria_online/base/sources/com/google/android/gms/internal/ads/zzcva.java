package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcva implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzcva(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzcva zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcva(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcuz zzb() {
        return new zzcuz(((zzcuv) this.zza).zza(), (zzdxz) this.zzb.zzb(), ((zzcww) this.zzc).zza());
    }
}
