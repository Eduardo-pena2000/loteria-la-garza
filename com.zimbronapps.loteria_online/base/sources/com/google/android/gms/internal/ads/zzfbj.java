package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzfbj(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
    }

    public static zzfbj zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfbj(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbi zzb() {
        return new zzfbi(zzfmk.zzc(), ((zzcmj) this.zza).zza(), (zzecp) this.zzb.zzb());
    }
}
