package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcqk implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcqk(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcqk zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcqk(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcqj zzb() {
        return new zzcqj(((zzikk) this.zza).zzd(), ((zzikk) this.zzb).zzd());
    }
}
