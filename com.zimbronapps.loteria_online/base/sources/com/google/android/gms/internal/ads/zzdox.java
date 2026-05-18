package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdox implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzdox(zzdos zzdosVar, zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzdox zzc(zzdos zzdosVar, zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdox(zzdosVar, zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzccn zzb() {
        return new zzccn(((zzcmj) this.zza).zza(), ((zzdaw) this.zzb).zza().zzg);
    }
}
