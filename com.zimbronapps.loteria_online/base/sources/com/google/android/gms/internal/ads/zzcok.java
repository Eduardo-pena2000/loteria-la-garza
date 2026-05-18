package com.google.android.gms.internal.ads;

import S5.q2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcok implements zzfgy {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    private final zzcnp zzh;

    public zzcok(zzcnp zzcnpVar, Context context, String str, q2 q2Var) {
        this.zzh = zzcnpVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(q2Var);
        this.zzb = zza2;
        zzikg zza3 = zzikh.zza(str);
        this.zzc = zza3;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzikp zza4 = zzikf.zza(zzerq.zza(zzikpVar));
        this.zzd = zza4;
        zzikp zza5 = zzikf.zza(zzfhw.zza(zzcnpVar.zzbw));
        this.zze = zza5;
        zzikp zza6 = zzikf.zza(zzfgw.zza(zza, zzcnpVar.zza, zzcnpVar.zzab, zza4, zza5, zzfjm.zza()));
        this.zzf = zza6;
        this.zzg = zzikf.zza(zzery.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcnpVar.zzi, zzcnpVar.zzae, zzikpVar));
    }

    public final zzerx zza() {
        return (zzerx) this.zzg.zzb();
    }
}
