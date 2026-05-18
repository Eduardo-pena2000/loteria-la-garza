package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzest implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzest(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzest zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzest(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesr zzb() {
        return new zzesr(zzfmk.zzc(), ((zzcmj) this.zza).zza(), ((zzdaw) this.zzb).zza(), ((zzctv) this.zzc).zza());
    }
}
