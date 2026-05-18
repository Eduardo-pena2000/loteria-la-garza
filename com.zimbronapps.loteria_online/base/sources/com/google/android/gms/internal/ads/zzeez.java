package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeez implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeez(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeez zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeez(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeey zzb() {
        return new zzeey(((zzcmj) this.zza).zza(), (zzccq) this.zzb.zzb());
    }
}
