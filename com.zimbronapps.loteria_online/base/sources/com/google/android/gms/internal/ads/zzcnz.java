package com.google.android.gms.internal.ads;

import S5.q2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcnz implements zzffi {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    private final Context zzg;
    private final q2 zzh;
    private final String zzi;
    private final zzcnp zzj;

    public zzcnz(zzcnp zzcnpVar, Context context, String str, q2 q2Var) {
        this.zzj = zzcnpVar;
        this.zzg = context;
        this.zzh = q2Var;
        this.zzi = str;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(q2Var);
        this.zzb = zza2;
        zzikp zza3 = zzikf.zza(zzerq.zza(zzcnpVar.zzl));
        this.zzc = zza3;
        zzikp zza4 = zzikf.zza(zzerv.zza());
        this.zzd = zza4;
        zzikp zza5 = zzikf.zza(zzdgn.zza());
        this.zze = zza5;
        this.zzf = zzikf.zza(zzffg.zza(zza, zzcnpVar.zza, zza2, zzcnpVar.zzab, zza3, zza4, zzfjm.zza(), zza5));
    }

    public final zzequ zza() {
        zzfff zzfffVar = (zzfff) this.zzf.zzb();
        zzerp zzerpVar = (zzerp) this.zzc.zzb();
        zzcnp zzcnpVar = this.zzj;
        zzikp zzikpVar = zzcnpVar.zzl;
        return new zzequ(this.zzg, this.zzh, this.zzi, zzfffVar, zzerpVar, zzcna.zzd(zzcnpVar.zzI()), (zzdxz) zzikpVar.zzb());
    }
}
