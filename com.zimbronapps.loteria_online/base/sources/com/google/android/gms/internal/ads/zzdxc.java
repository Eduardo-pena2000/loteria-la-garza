package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxc implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdxc(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdxc zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdxc(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxb zzb() {
        return new zzdxb((zzbgd) this.zza.zzb(), ((zzikk) this.zzb).zzd());
    }
}
