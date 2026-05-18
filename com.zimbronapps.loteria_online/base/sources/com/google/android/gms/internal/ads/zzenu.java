package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenu implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzenu(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzenu zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzenu(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzent zzb() {
        return new zzent((zzfkd) this.zza.zzb(), (zzdvm) this.zzb.zzb(), (zzdxz) this.zzc.zzb());
    }
}
