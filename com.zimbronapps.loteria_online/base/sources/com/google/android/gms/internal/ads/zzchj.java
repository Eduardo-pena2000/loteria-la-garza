package com.google.android.gms.internal.ads;

import V5.F0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchj extends V5.B {
    final zzcge zza;
    final zzchr zzb;
    private final String zzc;
    private final String[] zzd;

    public zzchj(zzcge zzcgeVar, zzchr zzchrVar, String str, String[] strArr) {
        this.zza = zzcgeVar;
        this.zzb = zzchrVar;
        this.zzc = str;
        this.zzd = strArr;
        R5.t.b().zzc(this);
    }

    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            F0.l.post(new zzchh(this));
        }
    }

    public final x7.e zzb() {
        return (((Boolean) S5.D.c().zzd(zzbhe.zzcC)).booleanValue() && (this.zzb instanceof zzcia)) ? zzcei.zzf.submit(new zzchi(this)) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
