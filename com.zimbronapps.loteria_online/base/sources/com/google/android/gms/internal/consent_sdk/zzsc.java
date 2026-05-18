package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i, list, z);
    }

    public static void zzB(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i, list, z);
    }

    public static void zzC(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i, list, z);
    }

    public static void zzD(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i, list, z);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i, zzrq zzrqVar, zzsa zzsaVar) {
        int zzC = zzpv.zzC(i << 3);
        return zzC + zzC + ((zzpa) zzrqVar).zzj(zzsaVar);
    }

    public static int zzb(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqn) {
            zzqn zzqnVar = (zzqn) list;
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 4);
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzpv.zzC(i << 3) + 8);
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqn) {
            zzqn zzqnVar = (zzqn) list;
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzh(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzreVar = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(zzreVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzi(int i, Object obj, zzsa zzsaVar) {
        int zzC;
        int zzj;
        int zzC2;
        int i2 = i << 3;
        if (obj instanceof zzra) {
            zzC = zzpv.zzC(i2);
            zzj = ((zzra) obj).zza();
            zzC2 = zzpv.zzC(zzj);
        } else {
            zzC = zzpv.zzC(i2);
            zzj = ((zzpa) obj).zzj(zzsaVar);
            zzC2 = zzpv.zzC(zzj);
        }
        return zzC + zzC2 + zzj;
    }

    public static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzqn) {
            zzqn zzqnVar = (zzqn) list;
            i = 0;
            while (i2 < size) {
                int zze = zzqnVar.zze(i2);
                i += zzpv.zzC((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzre) {
            zzre zzreVar = (zzre) list;
            i = 0;
            while (i2 < size) {
                long zze = zzreVar.zze(i2);
                i += zzpv.zzD((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzqn) {
            zzqn zzqnVar = (zzqn) list;
            i = 0;
            while (i2 < size) {
                i += zzpv.zzC(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzpv.zzC(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzre) {
            zzre zzreVar = (zzre) list;
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(zzreVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzpv.zzD(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzsp zzn() {
        return zzb;
    }

    public static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVar = zzqmVar.zzc;
        zzsq zzsqVar2 = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar2)) {
            if (zzsq.zzc().equals(zzsqVar)) {
                zzsqVar = zzsq.zze(zzsqVar, zzsqVar2);
            } else {
                zzsqVar.zzd(zzsqVar2);
            }
        }
        zzqmVar.zzc = zzsqVar;
    }

    public static void zzq(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i, list, z);
    }

    public static void zzr(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i, list, z);
    }

    public static void zzs(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i, list, z);
    }

    public static void zzt(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i, list, z);
    }

    public static void zzu(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i, list, z);
    }

    public static void zzv(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i, list, z);
    }

    public static void zzw(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i, list, z);
    }

    public static void zzx(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i, list, z);
    }

    public static void zzy(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i, list, z);
    }

    public static void zzz(int i, List list, zztb zztbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i, list, z);
    }
}
