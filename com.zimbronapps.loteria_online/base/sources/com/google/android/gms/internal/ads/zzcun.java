package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcun implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzcun(zzcue zzcueVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
        this.zzc = zzikpVar2;
        this.zzd = zzikpVar3;
        this.zze = zzikpVar4;
    }

    public static zzcun zza(zzcue zzcueVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzcun(zzcueVar, zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public static zzdje zzc(zzcue zzcueVar, Context context, W5.a aVar, zzfir zzfirVar, zzfjk zzfjkVar) {
        return new zzdje(new zzcud(context, aVar, zzfirVar, zzfjkVar), zzcei.zzg);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcna) this.zzc).zza(), ((zzcww) this.zzd).zza(), ((zzdaw) this.zze).zza());
    }
}
