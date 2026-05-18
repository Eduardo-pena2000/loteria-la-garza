package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmh {
    private static final Class zzuz = zzep();
    private static final zzmx zzva = zzf(false);
    private static final zzmx zzvb = zzf(true);
    private static final zzmx zzvc = new zzmz();

    public static void zza(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzg(i, list, z);
    }

    public static void zzb(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzf(i, list, z);
    }

    public static void zzc(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzc(i, list, z);
    }

    public static void zzd(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzd(i, list, z);
    }

    public static void zze(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzn(i, list, z);
    }

    public static zzmx zzem() {
        return zzva;
    }

    public static zzmx zzen() {
        return zzvb;
    }

    public static zzmx zzeo() {
        return zzvc;
    }

    private static Class zzep() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class zzeq() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zze(i, list, z);
    }

    public static void zzg(Class cls) {
        Class cls2;
        if (!zzkk.class.isAssignableFrom(cls) && (cls2 = zzuz) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzh(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zza(i, list, z);
    }

    public static void zzi(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzj(i, list, z);
    }

    public static void zzj(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzm(i, list, z);
    }

    public static void zzk(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzb(i, list, z);
    }

    public static void zzl(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzk(i, list, z);
    }

    public static void zzm(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzh(i, list, z);
    }

    public static void zzn(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzi(i, list, z);
    }

    public static int zzo(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzjr.zzab(i));
    }

    public static int zzp(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjr.zzab(i));
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzjr.zzab(i));
    }

    public static int zzr(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzjr.zzab(i));
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjr.zzab(i));
    }

    public static int zzt(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzjr.zzab(i));
    }

    public static int zzu(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjr.zzab(i));
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.zzj(i, 0);
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.zzg(i, 0L);
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjr.zzc(i, true);
    }

    public static void zza(int i, List list, zzns zznsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zza(i, list);
    }

    public static void zzb(int i, List list, zzns zznsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzb(i, list);
    }

    public static int zzc(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzle) {
            zzle zzleVar = (zzle) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzq(zzleVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzq(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzd(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkl) {
            zzkl zzklVar = (zzkl) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzah(zzklVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzah(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkl) {
            zzkl zzklVar = (zzkl) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzac(zzklVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzac(((Integer) list.get(i2)).intValue());
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
        if (list instanceof zzkl) {
            zzkl zzklVar = (zzkl) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzad(zzklVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzad(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzh(List list) {
        return list.size() << 2;
    }

    public static int zzi(List list) {
        return list.size() << 3;
    }

    public static int zzj(List list) {
        return list.size();
    }

    public static void zzg(int i, List list, zzns zznsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzl(i, list, z);
    }

    public static void zza(int i, List list, zzns zznsVar, zzmf zzmfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zza(i, list, zzmfVar);
    }

    public static void zzb(int i, List list, zzns zznsVar, zzmf zzmfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznsVar.zzb(i, list, zzmfVar);
    }

    public static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkl) {
            zzkl zzklVar = (zzkl) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzae(zzklVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzae(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzle) {
            zzle zzleVar = (zzle) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzo(zzleVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzo(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzb(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzle) {
            zzle zzleVar = (zzle) list;
            i = 0;
            while (i2 < size) {
                i += zzjr.zzp(zzleVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjr.zzp(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzc(int i, List list) {
        int zzm;
        int zzm2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzab = zzjr.zzab(i) * size;
        if (list instanceof zzkz) {
            zzkz zzkzVar = (zzkz) list;
            while (i2 < size) {
                Object zzao = zzkzVar.zzao(i2);
                if (zzao instanceof zzjc) {
                    zzm2 = zzjr.zzb((zzjc) zzao);
                } else {
                    zzm2 = zzjr.zzm((String) zzao);
                }
                zzab += zzm2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzjc) {
                    zzm = zzjr.zzb((zzjc) obj);
                } else {
                    zzm = zzjr.zzm((String) obj);
                }
                zzab += zzm;
                i2++;
            }
        }
        return zzab;
    }

    public static int zzd(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzab = size * zzjr.zzab(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzab += zzjr.zzb((zzjc) list.get(i2));
        }
        return zzab;
    }

    private static zzmx zzf(boolean z) {
        try {
            Class zzeq = zzeq();
            if (zzeq == null) {
                return null;
            }
            return (zzmx) zzeq.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(zzll zzllVar, Object obj, Object obj2, long j) {
        zznd.zza(obj, j, zzllVar.zzb(zznd.zzo(obj, j), zznd.zzo(obj2, j)));
    }

    public static int zzd(int i, List list, zzmf zzmfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjr.zzc(i, (zzlq) list.get(i3), zzmfVar);
        }
        return i2;
    }

    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zza(zzjy zzjyVar, Object obj, Object obj2) {
        zzkb zzb = zzjyVar.zzb(obj2);
        if (zzb.zzos.isEmpty()) {
            return;
        }
        zzjyVar.zzc(obj).zza(zzb);
    }

    public static void zza(zzmx zzmxVar, Object obj, Object obj2) {
        zzmxVar.zze(obj, zzmxVar.zzg(zzmxVar.zzr(obj), zzmxVar.zzr(obj2)));
    }

    public static int zzc(int i, Object obj, zzmf zzmfVar) {
        if (obj instanceof zzkx) {
            return zzjr.zza(i, (zzkx) obj);
        }
        return zzjr.zzb(i, (zzlq) obj, zzmfVar);
    }

    public static Object zza(int i, List list, zzko zzkoVar, Object obj, zzmx zzmxVar) {
        if (zzkoVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzkoVar.zzan(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = zza(i, intValue, obj, zzmxVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkoVar.zzan(intValue2)) {
                    obj = zza(i, intValue2, obj, zzmxVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static int zzc(int i, List list, zzmf zzmfVar) {
        int zza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzab = zzjr.zzab(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkx) {
                zza = zzjr.zza((zzkx) obj);
            } else {
                zza = zzjr.zza((zzlq) obj, zzmfVar);
            }
            zzab += zza;
        }
        return zzab;
    }

    private static Object zza(int i, int i2, Object obj, zzmx zzmxVar) {
        if (obj == null) {
            obj = zzmxVar.zzez();
        }
        zzmxVar.zza(obj, i, i2);
        return obj;
    }
}
