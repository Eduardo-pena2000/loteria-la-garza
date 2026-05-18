package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(8);
        int i = zzaqm.zza(zzaevVar, zzerVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 4);
        zzerVar.zzh(0);
        int zzB = zzerVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        zzee.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaql zzb(zzaev zzaevVar) throws IOException {
        byte[] bArr;
        int i;
        zzer zzerVar = new zzer(16);
        long j = zzd(1718449184, zzaevVar, zzerVar).zzb;
        zzgrc.zzi(j >= 16);
        zzaevVar.zzi(zzerVar.zzi(), 0, 16);
        zzerVar.zzh(0);
        int zzu = zzerVar.zzu();
        int zzu2 = zzerVar.zzu();
        int zzI = zzerVar.zzI();
        int zzI2 = zzerVar.zzI();
        int zzu3 = zzerVar.zzu();
        int zzu4 = zzerVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            zzaevVar.zzi(bArr2, 0, i2);
            if (zzu != 65534) {
                i = zzu;
                bArr = bArr2;
            } else if (i2 == 24) {
                zzer zzerVar2 = new zzer(bArr2);
                zzerVar2.zzu();
                int zzu5 = zzerVar2.zzu();
                if (zzu5 != 0 && zzu5 != zzu4) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzu5).length() + 33 + String.valueOf(zzu4).length() + 19);
                    sb.append("validBits ( ");
                    sb.append(zzu5);
                    sb.append(")  != bitsPerSample( ");
                    sb.append(zzu4);
                    sb.append(") are not supported");
                    throw zzat.zzc(sb.toString());
                }
                int zzI3 = zzerVar2.zzI();
                if ((zzI3 >> 18) != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzI3).length() + 21);
                    sb2.append("invalid channel mask ");
                    sb2.append(zzI3);
                    throw zzat.zzc(sb2.toString());
                }
                if (zzI3 != 0 && Integer.bitCount(zzI3) != zzu2) {
                    int bitCount = Integer.bitCount(zzI3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(bitCount).length() + 46 + String.valueOf(zzI3).length());
                    sb3.append("invalid number of channels (");
                    sb3.append(bitCount);
                    sb3.append(") in channel mask ");
                    sb3.append(zzI3);
                    throw zzat.zzc(sb3.toString());
                }
                zzu = zzerVar2.zzu();
                byte[] bArr3 = new byte[14];
                zzerVar2.zzm(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                    throw zzat.zzc("invalid wav format extension guid");
                }
                i = zzu;
                bArr = bArr2;
            } else {
                bArr = bArr2;
                i = 65534;
            }
        } else {
            bArr = zzfj.zzb;
            i = zzu;
        }
        zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
        return new zzaql(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr);
    }

    public static Pair zzc(zzaev zzaevVar) throws IOException {
        zzaevVar.zzl();
        zzaqm zzd = zzd(1684108385, zzaevVar, new zzer(8));
        zzaevVar.zzf(8);
        return Pair.create(Long.valueOf(zzaevVar.zzn()), Long.valueOf(zzd.zzb));
    }

    private static zzaqm zzd(int i, zzaev zzaevVar, zzer zzerVar) throws IOException {
        zzaqm zza2 = zzaqm.zza(zzaevVar, zzerVar);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzee.zzc("WavHeaderReader", sb.toString());
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzat.zzc(sb2.toString());
            }
            zzaevVar.zzf((int) j2);
            zza2 = zzaqm.zza(zzaevVar, zzerVar);
        }
    }
}
