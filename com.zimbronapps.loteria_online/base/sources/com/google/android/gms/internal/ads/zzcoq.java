package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcoq implements zzfil {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    final zzikp zzh;
    private final zzcnp zzi;

    public zzcoq(zzcnp zzcnpVar, Context context, String str) {
        this.zzi = zzcnpVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikp zzikpVar = zzcnpVar.zzbw;
        zzfgm zzc = zzfgm.zzc(zza, zzikpVar, zzcnpVar.zzbx);
        this.zzb = zzc;
        zzikp zza2 = zzikf.zza(zzfhw.zza(zzikpVar));
        this.zzc = zza2;
        zzikp zza3 = zzikf.zza(zzfji.zza());
        this.zzd = zza3;
        zzikp zza4 = zzikf.zza(zzfif.zza(zza, zzcnpVar.zza, zzcnpVar.zzab, zzc, zza2, zzfjm.zza(), zza3));
        this.zze = zza4;
        this.zzf = zzikf.zza(zzfip.zza(zza4, zza2, zza3));
        zzikg zzc2 = zzikh.zzc(str);
        this.zzg = zzc2;
        this.zzh = zzikf.zza(zzfij.zza(zzc2, zza4, zza, zza2, zza3, zzcnpVar.zzi, zzcnpVar.zzae, zzcnpVar.zzl));
    }

    public final zzfio zza() {
        return (zzfio) this.zzf.zzb();
    }

    public final zzfii zzb() {
        return (zzfii) this.zzh.zzb();
    }
}
