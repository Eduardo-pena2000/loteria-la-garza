package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzapu implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;

    public zzapu(zzapx zzapxVar) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[4], 4);
    }

    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    public final void zzb(zzer zzerVar) {
        if (zzerVar.zzs() == 0 && (zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(6);
            int zzd = zzerVar.zzd() / 4;
            for (int i = 0; i < zzd; i++) {
                zzeq zzeqVar = this.zzb;
                zzerVar.zzl(zzeqVar, 4);
                int zzj = zzeqVar.zzj(16);
                zzeqVar.zzh(3);
                if (zzj == 0) {
                    zzeqVar.zzh(13);
                } else {
                    int zzj2 = zzeqVar.zzj(13);
                    zzapx zzapxVar = this.zza;
                    if (zzapxVar.zzj().get(zzj2) == null) {
                        zzapxVar.zzj().put(zzj2, new zzapo(new zzapv(zzapxVar, zzj2)));
                        zzapxVar.zzo(zzapxVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
