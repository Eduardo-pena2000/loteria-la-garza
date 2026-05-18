package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaeh {
    public static void zza(long j, zzer zzerVar, zzagh[] zzaghVarArr) {
        int i;
        while (true) {
            if (zzerVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzerVar);
            int zzc2 = zzc(zzerVar);
            int zzg = zzerVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzerVar.zzd()) {
                zzee.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzerVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzs = zzerVar.zzs();
                int zzt = zzerVar.zzt();
                if (zzt == 49) {
                    i = zzerVar.zzB();
                    zzt = 49;
                } else {
                    i = 0;
                }
                int zzs2 = zzerVar.zzs();
                if (zzt == 47) {
                    zzerVar.zzk(1);
                    zzt = 47;
                }
                boolean z = zzs == 181 && (zzt == 49 || zzt == 47) && zzs2 == 3;
                if (zzt == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzerVar, zzaghVarArr);
                }
            }
            zzerVar.zzh(zzg);
        }
    }

    public static void zzb(long j, zzer zzerVar, zzagh[] zzaghVarArr) {
        int zzs = zzerVar.zzs();
        if ((zzs & 64) != 0) {
            int i = zzs & 31;
            zzerVar.zzk(1);
            int zzg = zzerVar.zzg();
            for (zzagh zzaghVar : zzaghVarArr) {
                int i2 = i * 3;
                zzerVar.zzh(zzg);
                zzaghVar.zzc(zzerVar, i2);
                zzgrc.zzi(j != -9223372036854775807L);
                zzaghVar.zze(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzer zzerVar) {
        int i = 0;
        while (zzerVar.zzd() != 0) {
            int zzs = zzerVar.zzs();
            i += zzs;
            if (zzs != 255) {
                return i;
            }
        }
        return -1;
    }
}
