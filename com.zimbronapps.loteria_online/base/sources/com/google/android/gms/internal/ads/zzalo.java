package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzalo {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzer zzg = new zzer(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaev zzaevVar, long j) throws IOException {
        zzgrc.zza(zzaevVar.zzn() == zzaevVar.zzm());
        zzer zzerVar = this.zzg;
        zzerVar.zza(4);
        while (true) {
            if ((j == -1 || zzaevVar.zzn() + 4 < j) && zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 4, true)) {
                zzerVar.zzh(0);
                if (zzerVar.zzz() == 1332176723) {
                    zzaevVar.zzl();
                    return true;
                }
                zzaevVar.zzf(1);
            }
        }
        do {
            if (j != -1 && zzaevVar.zzn() >= j) {
                break;
            }
        } while (zzaevVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzaev zzaevVar, boolean z) throws IOException {
        zza();
        zzer zzerVar = this.zzg;
        zzerVar.zza(27);
        if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 27, z) && zzerVar.zzz() == 1332176723) {
            if (zzerVar.zzs() != 0) {
                if (z) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzerVar.zzs();
            this.zzb = zzerVar.zzE();
            zzerVar.zzA();
            zzerVar.zzA();
            zzerVar.zzA();
            int zzs = zzerVar.zzs();
            this.zzc = zzs;
            this.zzd = zzs + 27;
            zzerVar.zza(zzs);
            if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    int[] iArr = this.zzf;
                    int zzs2 = zzerVar.zzs();
                    iArr[i] = zzs2;
                    this.zze += zzs2;
                }
                return true;
            }
        }
        return false;
    }
}
