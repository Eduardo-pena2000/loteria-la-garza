package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzehw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzehw(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzehw zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzehw(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehv zzb() {
        return new zzehv(((zzeho) this.zza).zzb(), ((zzcmd) this.zzb).zza());
    }
}
