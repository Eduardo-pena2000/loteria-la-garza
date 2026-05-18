package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcnu implements zzfdv {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    private final zzcnp zzg;

    public zzcnu(zzcnp zzcnpVar, Context context, String str) {
        this.zzg = zzcnpVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(str);
        this.zzb = zza2;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgl zzc = zzfgl.zzc(zza, zzikpVar, zzcnpVar.zzbx);
        this.zzc = zzc;
        zzikp zza3 = zzikf.zza(zzfes.zza(zzikpVar));
        this.zzd = zza3;
        zzikp zzikpVar2 = zzcnpVar.zza;
        zzikp zzikpVar3 = zzcnpVar.zzab;
        zzfjm zza4 = zzfjm.zza();
        zzikp zzikpVar4 = zzcnpVar.zzi;
        zzikp zza5 = zzikf.zza(zzfeu.zza(zza, zzikpVar2, zzikpVar3, zzc, zza3, zza4, zzikpVar4));
        this.zze = zza5;
        this.zzf = zzikf.zza(zzffa.zza(zzikpVar3, zza, zza2, zza5, zza3, zzikpVar4, zzcnpVar.zzl));
    }

    public final zzfez zza() {
        return (zzfez) this.zzf.zzb();
    }
}
