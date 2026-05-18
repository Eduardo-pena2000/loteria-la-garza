package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdnr implements zzbde {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdoc zzb;

    public zzdnr(zzdoc zzdocVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    public final void zzdj(zzbdd zzbddVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcp)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbddVar.zzj) {
                        zzdoc zzdocVar = this.zzb;
                        if (zzdocVar.zzaa() != null) {
                            zzdocVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdocVar.zzaa() == null) {
                                return;
                            } else {
                                zzdocVar.zzu(zzdocVar.zzaa().zzdE(), zzdocVar.zzaa().zzj(), zzdocVar.zzaa().zzk(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzbddVar.zzj) {
            zzdoc zzdocVar2 = this.zzb;
            if (zzdocVar2.zzaa() != null) {
                zzdocVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdocVar2.zzaa() == null) {
                    return;
                }
                zzdocVar2.zzu(zzdocVar2.zzaa().zzdE(), zzdocVar2.zzaa().zzj(), zzdocVar2.zzaa().zzk(), true);
            }
        }
    }
}
