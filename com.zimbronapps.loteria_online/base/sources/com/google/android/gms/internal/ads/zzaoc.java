package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaoc implements zzaeu {
    private final zzaod zza = new zzaod(null, 0, "audio/ac3");
    private final zzer zzb = new zzer(2786);
    private boolean zzc;

    static {
        int i = zzaob.zza;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(10);
        int i = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int zzG = zzerVar.zzG();
            i += zzG + 10;
            zzaelVar.zzj(zzG, false);
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 6, false);
            zzerVar.zzh(0);
            if (zzerVar.zzt() != 2935) {
                zzaevVar.zzl();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzd = zzadv.zzd(zzerVar.zzi());
                if (zzd == -1) {
                    return false;
                }
                zzaelVar2.zzj(zzd - 6, false);
            }
        }
    }

    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzer zzerVar = this.zzb;
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    public final void zzf() {
    }
}
