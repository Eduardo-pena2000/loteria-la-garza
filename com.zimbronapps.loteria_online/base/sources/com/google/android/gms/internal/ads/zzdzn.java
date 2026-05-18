package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzn implements zzikg {
    private final zzikp zza;

    private zzdzn(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdzn zzc(zzikp zzikpVar) {
        return new zzdzn(zzikpVar);
    }

    public static zzdzm zzd(zzbph zzbphVar) {
        return new zzdzm(zzbphVar);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzm zzb() {
        return new zzdzm((zzbph) this.zza.zzb());
    }
}
