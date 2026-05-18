package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaoi implements zzaeu {
    private final zzaoj zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaex zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzaoh.zza;
    }

    public zzaoi() {
        throw null;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar;
        int i = 0;
        while (true) {
            zzerVar = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 2, false);
            zzerVar.zzh(0);
            if (zzaoj.zzf(zzerVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
                zzeq zzeqVar = this.zzd;
                zzeqVar.zzf(14);
                int zzj = zzeqVar.zzj(13);
                if (zzj <= 6) {
                    i4++;
                    zzaevVar.zzl();
                    zzaelVar2.zzj(i4, false);
                } else {
                    zzaelVar2.zzj(zzj - 6, false);
                    i3 += zzj;
                }
            } else {
                i4++;
                zzaevVar.zzl();
                zzaelVar2.zzj(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zze = zzaexVar;
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzafx(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    public final void zzf() {
    }

    public zzaoi(int i) {
        this.zza = new zzaoj(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(2048);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] zzi = zzerVar.zzi();
        this.zzd = new zzeq(zzi, zzi.length);
    }
}
