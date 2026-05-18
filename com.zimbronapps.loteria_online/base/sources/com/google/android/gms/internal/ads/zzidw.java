package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    static {
        int i = zziaa.zza;
        zzb = new zzieh();
    }

    public static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i << 3) + 4);
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i << 3) + 8);
    }

    public static int zzD(int i, Object obj, zzidu zziduVar) {
        int zzA;
        int zzaT;
        int zzA2;
        int i2 = i << 3;
        if (obj instanceof zzicm) {
            zzA = zziaw.zzA(i2);
            zzaT = ((zzicm) obj).zzb();
            zzA2 = zziaw.zzA(zzaT);
        } else {
            zzA = zziaw.zzA(i2);
            zzaT = ((zzhzw) obj).zzaT(zziduVar);
            zzA2 = zziaw.zzA(zzaT);
        }
        return zzA + zzA2 + zzaT;
    }

    @Deprecated
    public static int zzE(int i, zzidc zzidcVar, zzidu zziduVar) {
        int zzA = zziaw.zzA(i << 3);
        return zzA + zzA + ((zzhzw) zzidcVar).zzaT(zziduVar);
    }

    public static zzief zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        zzieg zziegVar2 = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar2)) {
            if (zzieg.zza().equals(zziegVar)) {
                zziegVar = zzieg.zzc(zziegVar, zziegVar2);
            } else {
                zziegVar.zzm(zziegVar2);
            }
        }
        zzibrVar.zzt = zziegVar;
    }

    public static Object zzJ(Object obj, int i, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzibxVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzK(obj, i, intValue, obj2, zziefVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(intValue2)) {
                    obj2 = zzK(obj, i, intValue2, obj2, zziefVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i, int i2, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzr(i, list.get(i2), zziduVar);
        }
    }

    public static void zzr(int i, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzs(i, list.get(i2), zziduVar);
        }
    }

    public static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(zzicqVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(zzicqVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzu(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            i = 0;
            while (i2 < size) {
                long zzc = zzicqVar.zzc(i2);
                i += zziaw.zzB((zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(zzibsVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(zzibsVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zziaw.zzB(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            i = 0;
            while (i2 < size) {
                i += zziaw.zzA(zzibsVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zziaw.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            i = 0;
            while (i2 < size) {
                int zzf = zzibsVar.zzf(i2);
                i += zziaw.zzA((zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
