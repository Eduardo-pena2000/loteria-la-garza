package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeib implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzeib(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
    }

    public static zzeib zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzeib(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehz zzb() {
        return new zzehz(((zzcmj) this.zza).zza(), ((zzdak) this.zzb).zza(), (zzehr) this.zzc.zzb(), ((zzeho) this.zzd).zzb(), ((zzcmd) this.zze).zza());
    }
}
