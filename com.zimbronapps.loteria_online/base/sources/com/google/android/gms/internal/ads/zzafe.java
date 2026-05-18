package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzafe {
    public static zzap zza(zzaev zzaevVar, boolean z) throws IOException {
        zzap zza = new zzafp().zza(zzaevVar, z ? null : zzaim.zza, 0);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static boolean zzb(zzaev zzaevVar, zzafd zzafdVar) throws IOException {
        zzaevVar.zzl();
        zzeq zzeqVar = new zzeq(new byte[4], 4);
        zzaevVar.zzi(zzeqVar.zza, 0, 4);
        boolean zzi = zzeqVar.zzi();
        int zzj = zzeqVar.zzj(7);
        int zzj2 = zzeqVar.zzj(24) + 4;
        if (zzj == 0) {
            byte[] bArr = new byte[38];
            zzaevVar.zzc(bArr, 0, 38);
            zzafdVar.zza = new zzafh(bArr, 4);
        } else {
            zzafh zzafhVar = zzafdVar.zza;
            if (zzafhVar == null) {
                throw new IllegalArgumentException();
            }
            if (zzj == 3) {
                zzer zzerVar = new zzer(zzj2);
                zzaevVar.zzc(zzerVar.zzi(), 0, zzj2);
                zzafdVar.zza = zzafhVar.zze(zzc(zzerVar));
            } else if (zzj == 4) {
                zzer zzerVar2 = new zzer(zzj2);
                zzaevVar.zzc(zzerVar2.zzi(), 0, zzj2);
                zzerVar2.zzk(4);
                zzafdVar.zza = new zzafh(zzafhVar.zza, zzafhVar.zzb, zzafhVar.zzc, zzafhVar.zzd, zzafhVar.zze, zzafhVar.zzg, zzafhVar.zzh, zzafhVar.zzj, zzafhVar.zzk, zzafhVar.zzd(zzagn.zzc(Arrays.asList(zzagn.zzb(zzerVar2, false, false).zza))));
            } else if (zzj == 6) {
                zzer zzerVar3 = new zzer(zzj2);
                zzaevVar.zzc(zzerVar3.zzi(), 0, zzj2);
                zzerVar3.zzk(4);
                zzafdVar.zza = new zzafh(zzafhVar.zza, zzafhVar.zzb, zzafhVar.zzc, zzafhVar.zzd, zzafhVar.zze, zzafhVar.zzg, zzafhVar.zzh, zzafhVar.zzj, zzafhVar.zzk, zzafhVar.zzd(new zzap(zzguf.zzj(zzaia.zzb(zzerVar3)))));
            } else {
                zzaevVar.zzf(zzj2);
            }
        }
        return zzi;
    }

    public static zzafg zzc(zzer zzerVar) {
        zzerVar.zzk(1);
        int zzx = zzerVar.zzx();
        long zzg = zzerVar.zzg();
        long j = zzx;
        int i = zzx / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzD = zzerVar.zzD();
            if (zzD == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzD;
            jArr2[i2] = zzerVar.zzD();
            zzerVar.zzk(2);
            i2++;
        }
        zzerVar.zzk((int) ((zzg + j) - zzerVar.zzg()));
        return new zzafg(jArr, jArr2);
    }
}
