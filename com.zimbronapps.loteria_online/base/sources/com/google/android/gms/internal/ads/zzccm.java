package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzccm extends zzccr {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    final zzikp zzh;
    private final E6.f zzj;

    public zzccm(Context context, E6.f fVar, q0 q0Var, zzccq zzccqVar) {
        this.zzj = fVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(q0Var);
        this.zzb = zza2;
        this.zzc = zzikf.zza(zzccg.zza(zza, zza2));
        zzikg zza3 = zzikh.zza(fVar);
        this.zzd = zza3;
        zzikg zza4 = zzikh.zza(zzccqVar);
        this.zze = zza4;
        zzikp zza5 = zzikf.zza(zzcci.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzcck zzc = zzcck.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzikf.zza(zzccx.zza(zza, zzc));
    }

    public final zzccj zza() {
        return new zzccj(this.zzj, (zzcch) this.zzf.zzb());
    }
}
