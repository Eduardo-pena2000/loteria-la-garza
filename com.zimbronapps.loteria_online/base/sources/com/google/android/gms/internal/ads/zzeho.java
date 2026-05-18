package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeho implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzeho(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzeho zzc(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzeho(zzikpVar, zzikpVar2);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehn zzb() {
        return new zzehn(((zzehk) this.zza).zzb(), (zzgzy) this.zzb.zzb());
    }
}
