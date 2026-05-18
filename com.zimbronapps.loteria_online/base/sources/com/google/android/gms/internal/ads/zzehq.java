package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzehq implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzehq(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzehq zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzehq(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehp(((zzeib) this.zza).zza(), ((zzcmd) this.zzb).zza());
    }
}
