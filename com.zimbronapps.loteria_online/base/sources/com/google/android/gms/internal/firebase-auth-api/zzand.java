package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzand {
    private static final zzanu zza = new zzanw();

    @Deprecated
    public static int zza(int i, zzamm zzammVar, zzanb zzanbVar) {
        return (zzakn.zzh(i) << 1) + ((zzajm) zzammVar).zza(zzanbVar);
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzakn.zzh(i));
    }

    public static int zzc(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zzb(i, 0);
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i, 0L);
    }

    public static int zze(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzakn.zzh(i));
    }

    public static int zzf(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzakn.zzh(i));
    }

    public static int zzg(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzakn.zzh(i));
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzakn.zzh(i));
    }

    public static int zzi(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzakn.zzh(i));
    }

    public static int zzj(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzakn.zzh(i));
    }

    public static void zzk(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzk(i, list, z);
    }

    public static void zzl(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzl(i, list, z);
    }

    public static void zzm(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzm(i, list, z);
    }

    public static void zzn(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzn(i, list, z);
    }

    private static int zza(zzajm zzajmVar, zzanb zzanbVar) {
        return zzakn.zzd(zzajmVar.zza(zzanbVar));
    }

    public static int zzc(List list) {
        return list.size() << 2;
    }

    public static int zzd(List list) {
        return list.size() << 3;
    }

    public static int zzb(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zza(zzaliVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void zzc(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzc(i, list, z);
    }

    public static void zzd(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzd(i, list, z);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zzc(zzaliVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zzc(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zzb(zzalxVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zzb(((Long) list.get(i2)).longValue());
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
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zzg(zzaliVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zzg(((Integer) list.get(i2)).intValue());
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
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zzd(zzalxVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zzi(zzaliVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zzi(((Integer) list.get(i2)).intValue());
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
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            i = 0;
            while (i2 < size) {
                i += zzakn.zze(zzalxVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzakn.zze(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i, true);
    }

    public static int zza(List list) {
        return list.size();
    }

    public static int zza(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzh = size * zzakn.zzh(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzh += zzakn.zza((zzajv) list.get(i2));
        }
        return zzh;
    }

    public static int zzb(int i, List list, zzanb zzanbVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzh = zzakn.zzh(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzalu) {
                zza2 = zzakn.zza((zzalu) obj);
            } else {
                zza2 = zza((zzajm) obj, zzanbVar);
            }
            zzh += zza2;
        }
        return zzh;
    }

    public static void zze(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zze(i, list, z);
    }

    public static void zzf(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzf(i, list, z);
    }

    public static void zzg(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzg(i, list, z);
    }

    public static void zzh(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzh(i, list, z);
    }

    public static void zzi(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzi(i, list, z);
    }

    public static void zzj(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzj(i, list, z);
    }

    public static int zza(int i, List list, zzanb zzanbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zza(i, (zzamm) list.get(i3), zzanbVar);
        }
        return i2;
    }

    public static int zza(int i, Object obj, zzanb zzanbVar) {
        if (obj instanceof zzalu) {
            return zzakn.zzb(i, (zzalu) obj);
        }
        return zzakn.zzh(i) + zza((zzajm) obj, zzanbVar);
    }

    public static int zzb(int i, List list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzh = zzakn.zzh(i) * size;
        if (list instanceof zzalt) {
            zzalt zzaltVar = (zzalt) list;
            while (i2 < size) {
                Object zza4 = zzaltVar.zza(i2);
                if (zza4 instanceof zzajv) {
                    zza3 = zzakn.zza((zzajv) zza4);
                } else {
                    zza3 = zzakn.zza((String) zza4);
                }
                zzh += zza3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzajv) {
                    zza2 = zzakn.zza((zzajv) obj);
                } else {
                    zza2 = zzakn.zza((String) obj);
                }
                zzh += zza2;
                i2++;
            }
        }
        return zzh;
    }

    public static zzanu zza() {
        return zza;
    }

    public static Object zza(Object obj, int i, List list, zzalj zzaljVar, Object obj2, zzanu zzanuVar) {
        if (zzaljVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzaljVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zza(obj, i, intValue, obj2, zzanuVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaljVar.zza(intValue2)) {
                    obj2 = zza(obj, i, intValue2, obj2, zzanuVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void zzb(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, z);
    }

    public static void zzb(int i, List list, zzaol zzaolVar, zzanb zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, zzanbVar);
    }

    public static Object zza(Object obj, int i, int i2, Object obj2, zzanu zzanuVar) {
        if (obj2 == null) {
            obj2 = zzanuVar.zzc(obj);
        }
        zzanuVar.zzb(obj2, i, i2);
        return obj2;
    }

    public static void zzb(int i, List list, zzaol zzaolVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list);
    }

    public static void zza(zzakw zzakwVar, Object obj, Object obj2) {
        zzakx zza2 = zzakwVar.zza(obj2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzakwVar.zzb(obj).zza(zza2);
    }

    public static void zza(zzamf zzamfVar, Object obj, Object obj2, long j) {
        zzanz.zza(obj, j, zzamfVar.zza(zzanz.zze(obj, j), zzanz.zze(obj2, j)));
    }

    public static void zza(zzanu zzanuVar, Object obj, Object obj2) {
        zzanuVar.zzc(obj, zzanuVar.zza(zzanuVar.zzd(obj), zzanuVar.zzd(obj2)));
    }

    public static void zza(Class cls) {
        zzalf.class.isAssignableFrom(cls);
    }

    public static void zza(int i, List list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, z);
    }

    public static void zza(int i, List list, zzaol zzaolVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list);
    }

    public static void zza(int i, List list, zzaol zzaolVar, zzanb zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, zzanbVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
