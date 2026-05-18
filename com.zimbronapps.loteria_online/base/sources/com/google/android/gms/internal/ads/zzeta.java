package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeta implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzeta(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
    }

    public static zzeta zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzeta(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesy zzb() {
        return new zzesy(zzfmk.zzc(), ((zzdaw) this.zza).zza(), (zzfka) this.zzb.zzb(), ((Integer) this.zzc.zzb()).intValue());
    }
}
