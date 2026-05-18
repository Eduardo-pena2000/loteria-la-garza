package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzefd implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzefd(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar3;
    }

    public static zzefd zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzefd(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzefc zzb() {
        return new zzefc(((zzikn) this.zza).zzd(), zzfmk.zzc(), ((zzdek) this.zzb).zzb());
    }
}
