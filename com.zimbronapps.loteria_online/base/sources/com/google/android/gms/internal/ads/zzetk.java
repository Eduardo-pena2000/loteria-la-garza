package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzetk(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzetk zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzetk(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeti zzb() {
        return new zzeti((zzevl) this.zza.zzb(), ((zzdaw) this.zzb).zza(), ((zzcmj) this.zzc).zza(), (zzcdu) this.zzd.zzb());
    }
}
