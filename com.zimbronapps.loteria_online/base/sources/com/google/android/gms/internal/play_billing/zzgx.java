package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhh zzb;

    static {
        int i = zzgs.zza;
        zzb = new zzhj();
    }

    public static void zzA(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i, list, z);
    }

    public static void zzB(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i, list, z);
    }

    public static void zzC(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzJ(i, list, z);
    }

    public static void zzD(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzL(i, list, z);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfj) {
            zzfj zzfjVar = (zzfj) list;
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(zzfjVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzep.zzC(i << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfj) {
            zzfj zzfjVar = (zzfj) list;
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(zzfjVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            zzga zzgaVar = (zzga) list;
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(zzgaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzh(int i, Object obj, zzgv zzgvVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzfw)) {
            return zzep.zzC(i2) + zzep.zzA((zzgl) obj, zzgvVar);
        }
        int zzC = zzep.zzC(i2);
        int zza2 = ((zzfw) obj).zza();
        return zzC + zzep.zzC(zza2) + zza2;
    }

    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfj) {
            zzfj zzfjVar = (zzfj) list;
            i = 0;
            while (i2 < size) {
                int zze = zzfjVar.zze(i2);
                i += zzep.zzC((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzep.zzC((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            zzga zzgaVar = (zzga) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgaVar.zze(i2);
                i += zzep.zzD((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzep.zzD((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfj) {
            zzfj zzfjVar = (zzfj) list;
            i = 0;
            while (i2 < size) {
                i += zzep.zzC(zzfjVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzep.zzC(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzga) {
            zzga zzgaVar = (zzga) list;
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(zzgaVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzep.zzD(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhh zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, int i2, Object obj2, zzhh zzhhVar) {
        if (obj2 == null) {
            obj2 = zzhhVar.zza(obj);
        }
        ((zzhi) obj2).zzj(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void zzo(zzev zzevVar, Object obj, Object obj2) {
        if (((zzff) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzhh zzhhVar, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        zzhi zzhiVar2 = ((zzfi) obj2).zzc;
        if (!zzhi.zzc().equals(zzhiVar2)) {
            if (zzhi.zzc().equals(zzhiVar)) {
                zzhiVar = zzhi.zze(zzhiVar, zzhiVar2);
            } else {
                zzhiVar.zzd(zzhiVar2);
            }
        }
        zzfiVar.zzc = zzhiVar;
    }

    public static void zzq(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzj(i, list, z);
    }

    public static void zzt(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzl(i, list, z);
    }

    public static void zzu(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzn(i, list, z);
    }

    public static void zzv(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzp(i, list, z);
    }

    public static void zzw(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzs(i, list, z);
    }

    public static void zzx(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i, list, z);
    }

    public static void zzy(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i, list, z);
    }

    public static void zzz(int i, List list, zzhu zzhuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i, list, z);
    }
}
