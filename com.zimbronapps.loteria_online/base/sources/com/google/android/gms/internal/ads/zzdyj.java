package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyj implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzdyj(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar2;
        this.zzb = zzikpVar3;
        this.zzc = zzikpVar4;
        this.zzd = zzikpVar5;
    }

    public static zzdyj zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzdyj(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdye(zzfmk.zzc(), (W5.v) this.zza.zzb(), ((c6.b) this.zzb).b(), ((c6.d) this.zzc).b(), ((zzcmj) this.zzd).zza());
    }
}
