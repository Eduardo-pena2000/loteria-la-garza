package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdgl implements zzdel {
    private int zza = ((Integer) S5.D.c().zzd(zzbhe.zzbN)).intValue();
    private int zzb = ((Integer) S5.D.c().zzd(zzbhe.zzoq)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    public final void zzdO(zzbzu zzbzuVar) {
    }

    public final synchronized void zzdP(zzfjc zzfjcVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbO)).booleanValue()) {
            try {
                zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
                this.zza = zzfiuVar.zzc;
                this.zzb = zzfiuVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
