package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeie implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeie(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeie zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeie(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeid zzb() {
        return new zzeid((zzehr) this.zza.zzb(), ((zzehw) this.zzb).zzb());
    }
}
