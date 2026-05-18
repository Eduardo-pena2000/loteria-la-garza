package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcom implements zzefx {
    final zzikp zza;
    final zzikp zzb;
    private final zzcnp zzc;
    private final zzcom zzd = this;

    public zzcom(zzcnp zzcnpVar, Context context) {
        this.zzc = zzcnpVar;
        zzehf zzc = zzehf.zzc(zzcnpVar.zzaC);
        this.zza = zzc;
        this.zzb = zzegx.zza(zzcnpVar.zzf, zzfmk.zza(), zzcnj.zza, zzcnpVar.zzaB, zzc, zzcnpVar.zzaD, zzcng.zza, zzcnpVar.zzC);
    }

    public final zzegb zza() {
        zzcnp zzcnpVar = this.zzc;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzcmc zzI = zzcnpVar.zzI();
        return zzegc.zza(zzcmj.zzd(zzcnpVar.zzI()), zzfmq.zzc(), zzfmk.zzc(), zzikf.zzc(this.zzb), zzcna.zzd(zzI), this, (zzdxz) zzikpVar.zzb());
    }

    public final zzegd zzb() {
        return new zzcon(this.zzc, this.zzd, null);
    }
}
