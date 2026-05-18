package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlu implements zzmf {
    private static final int[] zzub = new int[0];
    private static final Unsafe zzuc = zznd.zzff();
    private final int[] zzud;
    private final Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final zzly zzup;
    private final zzla zzuq;
    private final zzmx zzur;
    private final zzjy zzus;
    private final zzll zzut;

    private zzlu(int[] iArr, Object[] objArr, int i, int i2, zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzly zzlyVar, zzla zzlaVar, zzmx zzmxVar, zzjy zzjyVar, zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.drive.zzlu zza(java.lang.Class r35, com.google.android.gms.internal.drive.zzlo r36, com.google.android.gms.internal.drive.zzly r37, com.google.android.gms.internal.drive.zzla r38, com.google.android.gms.internal.drive.zzmx r39, com.google.android.gms.internal.drive.zzjy r40, com.google.android.gms.internal.drive.zzll r41) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Class, com.google.android.gms.internal.drive.zzlo, com.google.android.gms.internal.drive.zzly, com.google.android.gms.internal.drive.zzla, com.google.android.gms.internal.drive.zzmx, com.google.android.gms.internal.drive.zzjy, com.google.android.gms.internal.drive.zzll):com.google.android.gms.internal.drive.zzlu");
    }

    private final zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        zzmf zzmfVar = (zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf zzf = zzmd.zzej().zzf((Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzf;
        return zzf;
    }

    private final Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final zzko zzar(int i) {
        return (zzko) this.zzue[((i / 3) << 1) + 1];
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final void zzb(Object obj, Object obj2, int i) {
        int zzas = zzas(i);
        int i2 = this.zzud[i];
        long j = zzas & 1048575;
        if (zza(obj2, i2, i)) {
            Object zzo = zznd.zzo(obj, j);
            Object zzo2 = zznd.zzo(obj2, j);
            if (zzo != null && zzo2 != null) {
                zznd.zza(obj, j, zzkm.zza(zzo, zzo2));
                zzb(obj, i2, i);
            } else if (zzo2 != null) {
                zznd.zza(obj, j, zzo2);
                zzb(obj, i2, i);
            }
        }
    }

    private static List zzd(Object obj, long j) {
        return (List) zznd.zzo(obj, j);
    }

    private static double zze(Object obj, long j) {
        return ((Double) zznd.zzo(obj, j)).doubleValue();
    }

    private static float zzf(Object obj, long j) {
        return ((Float) zznd.zzo(obj, j)).floatValue();
    }

    private static int zzg(Object obj, long j) {
        return ((Integer) zznd.zzo(obj, j)).intValue();
    }

    private static long zzh(Object obj, long j) {
        return ((Long) zznd.zzo(obj, j)).longValue();
    }

    private static boolean zzi(Object obj, long j) {
        return ((Boolean) zznd.zzo(obj, j)).booleanValue();
    }

    private static zzmy zzo(Object obj) {
        zzkk zzkkVar = (zzkk) obj;
        zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != zzmy.zzfa()) {
            return zzmyVar;
        }
        zzmy zzfb = zzmy.zzfb();
        zzkkVar.zzrq = zzfb;
        return zzfb;
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final int hashCode(Object obj) {
        int i;
        int zzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & zzas;
            int i5 = 37;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzu = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(obj, j)));
                    i2 = i + zzu;
                    break;
                case 1:
                    i = i2 * 53;
                    zzu = Float.floatToIntBits(zznd.zzm(obj, j));
                    i2 = i + zzu;
                    break;
                case 2:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(obj, j));
                    i2 = i + zzu;
                    break;
                case 3:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(obj, j));
                    i2 = i + zzu;
                    break;
                case 4:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 5:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(obj, j));
                    i2 = i + zzu;
                    break;
                case 6:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 7:
                    i = i2 * 53;
                    zzu = zzkm.zze(zznd.zzl(obj, j));
                    i2 = i + zzu;
                    break;
                case 8:
                    i = i2 * 53;
                    zzu = ((String) zznd.zzo(obj, j)).hashCode();
                    i2 = i + zzu;
                    break;
                case 9:
                    Object zzo = zznd.zzo(obj, j);
                    if (zzo != null) {
                        i5 = zzo.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzu = zznd.zzo(obj, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 11:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 12:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 13:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 14:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(obj, j));
                    i2 = i + zzu;
                    break;
                case 15:
                    i = i2 * 53;
                    zzu = zznd.zzj(obj, j);
                    i2 = i + zzu;
                    break;
                case 16:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(obj, j));
                    i2 = i + zzu;
                    break;
                case 17:
                    Object zzo2 = zznd.zzo(obj, j);
                    if (zzo2 != null) {
                        i5 = zzo2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzu = zznd.zzo(obj, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 50:
                    i = i2 * 53;
                    zzu = zznd.zzo(obj, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 51:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(Double.doubleToLongBits(zze(obj, j)));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = Float.floatToIntBits(zzf(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zze(zzi(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = ((String) zznd.zzo(obj, j)).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(obj, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(obj, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(obj, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(obj, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza(obj, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(obj, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzur.zzr(obj).hashCode();
        return this.zzui ? (hashCode * 53) + this.zzus.zzb(obj).hashCode() : hashCode;
    }

    public final Object newInstance() {
        return this.zzup.newInstance(this.zzuh);
    }

    public final void zzc(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzud.length; i += 3) {
            int zzas = zzas(i);
            long j = 1048575 & zzas;
            int i2 = this.zzud[i];
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzn(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzm(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzk(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzk(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzk(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzl(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzo(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(obj, obj2, i);
                    break;
                case 10:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzo(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzk(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzj(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza(obj2, i)) {
                        zznd.zza(obj, j, zznd.zzk(obj2, j));
                        zzb(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzuq.zza(obj, obj2, j);
                    break;
                case 50:
                    zzmh.zza(this.zzut, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza(obj2, i2, i)) {
                        zznd.zza(obj, j, zznd.zzo(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(obj2, i2, i)) {
                        zznd.zza(obj, j, zznd.zzo(obj2, j));
                        zzb(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(obj, obj2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        zzmh.zza(this.zzur, obj, obj2);
        if (this.zzui) {
            zzmh.zza(this.zzus, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0569 A[PHI: r5
      0x0569: PHI (r5v4 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v16 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v17 int)
      (r5v1 int)
     binds: [B:299:0x0550, B:501:0x09bc, B:495:0x09a0, B:492:0x098e, B:489:0x097e, B:486:0x0970, B:483:0x0962, B:480:0x0957, B:477:0x094b, B:474:0x093d, B:471:0x092f, B:468:0x091b, B:441:0x082a, B:435:0x080c, B:429:0x07ee, B:423:0x07d0, B:417:0x07b2, B:411:0x0794, B:405:0x0776, B:399:0x0758, B:393:0x073a, B:387:0x071d, B:381:0x0700, B:375:0x06e3, B:369:0x06c6, B:362:0x06a6, B:357:0x0672, B:354:0x0665, B:351:0x0655, B:348:0x0645, B:345:0x0635, B:342:0x0627, B:339:0x061b, B:336:0x060f, B:330:0x05f1, B:327:0x05dd, B:324:0x05cc, B:321:0x05bd, B:318:0x05ae, B:316:0x05a8, B:314:0x05a1, B:311:0x0594, B:308:0x0585, B:305:0x0576, B:303:0x0568, B:301:0x0558] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzn(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzn(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzp(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzp(java.lang.Object):boolean");
    }

    public final void zzd(Object obj) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long zzas = zzas(this.zzum[i2]) & 1048575;
            Object zzo = zznd.zzo(obj, zzas);
            if (zzo != null) {
                zznd.zza(obj, zzas, this.zzut.zzk(zzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(obj, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(obj);
        if (this.zzui) {
            this.zzus.zzd(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(java.lang.Object r18, com.google.android.gms.internal.drive.zzns r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzb(java.lang.Object, com.google.android.gms.internal.drive.zzns):void");
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final boolean zzc(Object obj, Object obj2, int i) {
        return zza(obj, i) == zza(obj2, i);
    }

    private static Field zza(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zza(Object obj, Object obj2, int i) {
        long zzas = zzas(i) & 1048575;
        if (zza(obj2, i)) {
            Object zzo = zznd.zzo(obj, zzas);
            Object zzo2 = zznd.zzo(obj2, zzas);
            if (zzo != null && zzo2 != null) {
                zznd.zza(obj, zzas, zzkm.zza(zzo, zzo2));
                zzb(obj, i);
            } else if (zzo2 != null) {
                zznd.zza(obj, zzas, zzo2);
                zzb(obj, i);
            }
        }
    }

    private static int zza(zzmx zzmxVar, Object obj) {
        return zzmxVar.zzn(zzmxVar.zzr(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x054a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Object r14, com.google.android.gms.internal.drive.zzns r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, com.google.android.gms.internal.drive.zzns):void");
    }

    private final void zzb(Object obj, int i) {
        if (this.zzuk) {
            return;
        }
        int zzat = zzat(i);
        long j = zzat & 1048575;
        zznd.zza(obj, j, zznd.zzj(obj, j) | (1 << (zzat >>> 20)));
    }

    private final void zzb(Object obj, int i, int i2) {
        zznd.zza(obj, zzat(i2) & 1048575, i);
    }

    private final void zza(zzns zznsVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static void zza(zzmx zzmxVar, Object obj, zzns zznsVar) throws IOException {
        zzmxVar.zza(zzmxVar.zzr(obj), zznsVar);
    }

    private static int zza(byte[] bArr, int i, int i2, zznm zznmVar, Class cls, zziz zzizVar) throws IOException {
        switch (zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int zzb = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Boolean.valueOf(zzizVar.zznl != 0);
                return zzb;
            case 2:
                return zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = Double.valueOf(zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = Integer.valueOf(zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = Long.valueOf(zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = Float.valueOf(zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzizVar.zznk);
                return zza;
            case 12:
            case 13:
                int zzb2 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzizVar.zznl);
                return zzb2;
            case 14:
                return zziy.zza(zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int zza2 = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzjo.zzw(zzizVar.zznk));
                return zza2;
            case 16:
                int zzb3 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzjo.zzk(zzizVar.zznl));
                return zzb3;
            case 17:
                return zziy.zzd(bArr, i, zzizVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziz zzizVar) throws IOException {
        int zza;
        int i8 = i;
        Unsafe unsafe = zzuc;
        zzkp zzkpVar = (zzkp) unsafe.getObject(obj, j2);
        if (!zzkpVar.zzbo()) {
            int size = zzkpVar.size();
            zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(obj, j2, zzkpVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzju zzjuVar = (zzju) zzkpVar;
                    int zza2 = zziy.zza(bArr, i8, zzizVar);
                    int i9 = zzizVar.zznk + zza2;
                    while (zza2 < i9) {
                        zzjuVar.zzc(zziy.zzc(bArr, zza2));
                        zza2 += 8;
                    }
                    if (zza2 == i9) {
                        return zza2;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzju zzjuVar2 = (zzju) zzkpVar;
                    zzjuVar2.zzc(zziy.zzc(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = zziy.zza(bArr, i10, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i10;
                        }
                        zzjuVar2.zzc(zziy.zzc(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzkh zzkhVar = (zzkh) zzkpVar;
                    int zza3 = zziy.zza(bArr, i8, zzizVar);
                    int i11 = zzizVar.zznk + zza3;
                    while (zza3 < i11) {
                        zzkhVar.zzc(zziy.zzd(bArr, zza3));
                        zza3 += 4;
                    }
                    if (zza3 == i11) {
                        return zza3;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkh zzkhVar2 = (zzkh) zzkpVar;
                    zzkhVar2.zzc(zziy.zzd(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = zziy.zza(bArr, i12, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i12;
                        }
                        zzkhVar2.zzc(zziy.zzd(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzle zzleVar = (zzle) zzkpVar;
                    int zza4 = zziy.zza(bArr, i8, zzizVar);
                    int i13 = zzizVar.zznk + zza4;
                    while (zza4 < i13) {
                        zza4 = zziy.zzb(bArr, zza4, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (zza4 == i13) {
                        return zza4;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar2 = (zzle) zzkpVar;
                    int zzb = zziy.zzb(bArr, i8, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                    while (zzb < i2) {
                        int zza5 = zziy.zza(bArr, zzb, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb;
                        }
                        zzb = zziy.zzb(bArr, zza5, zzizVar);
                        zzleVar2.zzv(zzizVar.zznl);
                    }
                    return zzb;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zziy.zza(bArr, i8, zzkpVar, zzizVar);
                }
                if (i5 == 0) {
                    return zziy.zza(i3, bArr, i, i2, zzkpVar, zzizVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzle zzleVar3 = (zzle) zzkpVar;
                    int zza6 = zziy.zza(bArr, i8, zzizVar);
                    int i14 = zzizVar.zznk + zza6;
                    while (zza6 < i14) {
                        zzleVar3.zzv(zziy.zzb(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i14) {
                        return zza6;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzle zzleVar4 = (zzle) zzkpVar;
                    zzleVar4.zzv(zziy.zzb(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = zziy.zza(bArr, i15, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i15;
                        }
                        zzleVar4.zzv(zziy.zzb(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkl zzklVar = (zzkl) zzkpVar;
                    int zza7 = zziy.zza(bArr, i8, zzizVar);
                    int i16 = zzizVar.zznk + zza7;
                    while (zza7 < i16) {
                        zzklVar.zzam(zziy.zza(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i16) {
                        return zza7;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkl zzklVar2 = (zzkl) zzkpVar;
                    zzklVar2.zzam(zziy.zza(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = zziy.zza(bArr, i17, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i17;
                        }
                        zzklVar2.zzam(zziy.zza(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzja zzjaVar = (zzja) zzkpVar;
                    zza = zziy.zza(bArr, i8, zzizVar);
                    int i18 = zzizVar.zznk + zza;
                    while (zza < i18) {
                        zza = zziy.zzb(bArr, zza, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (zza != i18) {
                        throw zzkq.zzdi();
                    }
                    return zza;
                }
                if (i5 == 0) {
                    zzja zzjaVar2 = (zzja) zzkpVar;
                    i8 = zziy.zzb(bArr, i8, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                    while (i8 < i2) {
                        int zza8 = zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = zziy.zzb(bArr, zza8, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                        }
                    }
                }
                return i8;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zza9 = zziy.zza(bArr, i8, zzizVar);
                        int i19 = zzizVar.zznk;
                        if (i19 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i19 == 0) {
                            zzkpVar.add("");
                        } else {
                            zzkpVar.add(new String(bArr, zza9, i19, zzkm.UTF_8));
                            zza9 += i19;
                        }
                        while (zza9 < i2) {
                            int zza10 = zziy.zza(bArr, zza9, zzizVar);
                            if (i3 != zzizVar.zznk) {
                                return zza9;
                            }
                            zza9 = zziy.zza(bArr, zza10, zzizVar);
                            int i20 = zzizVar.zznk;
                            if (i20 < 0) {
                                throw zzkq.zzdj();
                            }
                            if (i20 == 0) {
                                zzkpVar.add("");
                            } else {
                                zzkpVar.add(new String(bArr, zza9, i20, zzkm.UTF_8));
                                zza9 += i20;
                            }
                        }
                        return zza9;
                    }
                    int zza11 = zziy.zza(bArr, i8, zzizVar);
                    int i21 = zzizVar.zznk;
                    if (i21 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i21 == 0) {
                        zzkpVar.add("");
                    } else {
                        int i22 = zza11 + i21;
                        if (zznf.zze(bArr, zza11, i22)) {
                            zzkpVar.add(new String(bArr, zza11, i21, zzkm.UTF_8));
                            zza11 = i22;
                        } else {
                            throw zzkq.zzdn();
                        }
                    }
                    while (zza11 < i2) {
                        int zza12 = zziy.zza(bArr, zza11, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza11;
                        }
                        zza11 = zziy.zza(bArr, zza12, zzizVar);
                        int i23 = zzizVar.zznk;
                        if (i23 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i23 == 0) {
                            zzkpVar.add("");
                        } else {
                            int i24 = zza11 + i23;
                            if (zznf.zze(bArr, zza11, i24)) {
                                zzkpVar.add(new String(bArr, zza11, i23, zzkm.UTF_8));
                                zza11 = i24;
                            } else {
                                throw zzkq.zzdn();
                            }
                        }
                    }
                    return zza11;
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return zziy.zza(zzap(i6), i3, bArr, i, i2, zzkpVar, zzizVar);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int zza13 = zziy.zza(bArr, i8, zzizVar);
                    int i25 = zzizVar.zznk;
                    if (i25 >= 0) {
                        if (i25 > bArr.length - zza13) {
                            throw zzkq.zzdi();
                        }
                        if (i25 == 0) {
                            zzkpVar.add(zzjc.zznq);
                        } else {
                            zzkpVar.add(zzjc.zzb(bArr, zza13, i25));
                            zza13 += i25;
                        }
                        while (zza13 < i2) {
                            int zza14 = zziy.zza(bArr, zza13, zzizVar);
                            if (i3 != zzizVar.zznk) {
                                return zza13;
                            }
                            zza13 = zziy.zza(bArr, zza14, zzizVar);
                            int i26 = zzizVar.zznk;
                            if (i26 >= 0) {
                                if (i26 > bArr.length - zza13) {
                                    throw zzkq.zzdi();
                                }
                                if (i26 == 0) {
                                    zzkpVar.add(zzjc.zznq);
                                } else {
                                    zzkpVar.add(zzjc.zzb(bArr, zza13, i26));
                                    zza13 += i26;
                                }
                            } else {
                                throw zzkq.zzdj();
                            }
                        }
                        return zza13;
                    }
                    throw zzkq.zzdj();
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zziy.zza(i3, bArr, i, i2, zzkpVar, zzizVar);
                    }
                    return i8;
                }
                zza = zziy.zza(bArr, i8, zzkpVar, zzizVar);
                zzkk zzkkVar = (zzkk) obj;
                zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == zzmy.zzfa()) {
                    zzmyVar = null;
                }
                zzmy zzmyVar2 = (zzmy) zzmh.zza(i4, zzkpVar, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkl zzklVar3 = (zzkl) zzkpVar;
                    int zza15 = zziy.zza(bArr, i8, zzizVar);
                    int i27 = zzizVar.zznk + zza15;
                    while (zza15 < i27) {
                        zza15 = zziy.zza(bArr, zza15, zzizVar);
                        zzklVar3.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    if (zza15 == i27) {
                        return zza15;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzkl zzklVar4 = (zzkl) zzkpVar;
                    int zza16 = zziy.zza(bArr, i8, zzizVar);
                    zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    while (zza16 < i2) {
                        int zza17 = zziy.zza(bArr, zza16, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza16;
                        }
                        zza16 = zziy.zza(bArr, zza17, zzizVar);
                        zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    return zza16;
                }
                return i8;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzle zzleVar5 = (zzle) zzkpVar;
                    int zza18 = zziy.zza(bArr, i8, zzizVar);
                    int i28 = zzizVar.zznk + zza18;
                    while (zza18 < i28) {
                        zza18 = zziy.zzb(bArr, zza18, zzizVar);
                        zzleVar5.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    if (zza18 == i28) {
                        return zza18;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar6 = (zzle) zzkpVar;
                    int zzb2 = zziy.zzb(bArr, i8, zzizVar);
                    zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    while (zzb2 < i2) {
                        int zza19 = zziy.zza(bArr, zzb2, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb2;
                        }
                        zzb2 = zziy.zzb(bArr, zza19, zzizVar);
                        zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    return zzb2;
                }
                return i8;
            case 49:
                if (i5 == 3) {
                    zzmf zzap = zzap(i6);
                    int i29 = (i3 & (-8)) | 4;
                    i8 = zziy.zza(zzap, bArr, i, i2, i29, zzizVar);
                    zzkpVar.add(zzizVar.zznm);
                    while (i8 < i2) {
                        int zza20 = zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = zziy.zza(zzap, bArr, zza20, i2, i29, zzizVar);
                            zzkpVar.add(zzizVar.zznm);
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, long j, zziz zzizVar) throws IOException {
        Unsafe unsafe = zzuc;
        Object zzaq = zzaq(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.zzut.zzj(object)) {
            Object zzl = this.zzut.zzl(zzaq);
            this.zzut.zzb(zzl, object);
            unsafe.putObject(obj, j, zzl);
            object = zzl;
        }
        zzlj zzm = this.zzut.zzm(zzaq);
        Map zzh = this.zzut.zzh(object);
        int zza = zziy.zza(bArr, i, zzizVar);
        int i4 = zzizVar.zznk;
        if (i4 >= 0 && i4 <= i2 - zza) {
            int i5 = i4 + zza;
            Object obj2 = zzm.zztv;
            Object obj3 = zzm.zztx;
            while (zza < i5) {
                int i6 = zza + 1;
                int i7 = bArr[zza];
                if (i7 < 0) {
                    i6 = zziy.zza(i7, bArr, i6, zzizVar);
                    i7 = zzizVar.zznk;
                }
                int i8 = i6;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == zzm.zztw.zzfk()) {
                        zza = zza(bArr, i8, i2, zzm.zztw, zzm.zztx.getClass(), zzizVar);
                        obj3 = zzizVar.zznm;
                    } else {
                        zza = zziy.zza(i7, bArr, i8, i2, zzizVar);
                    }
                } else if (i10 == zzm.zztu.zzfk()) {
                    zza = zza(bArr, i8, i2, zzm.zztu, (Class) null, zzizVar);
                    obj2 = zzizVar.zznm;
                } else {
                    zza = zziy.zza(i7, bArr, i8, i2, zzizVar);
                }
            }
            if (zza == i5) {
                zzh.put(obj2, obj3);
                return i5;
            }
            throw zzkq.zzdm();
        }
        throw zzkq.zzdi();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziz zzizVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(zziy.zzc(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(zziy.zzd(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzizVar.zznl));
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzizVar.zznk));
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zziy.zzb(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zziy.zza(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzizVar.zznl != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zziy.zza(bArr, i, zzizVar);
                    int i9 = zzizVar.zznk;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zznf.zze(bArr, zza, zza + i9)) {
                            throw zzkq.zzdn();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zza, i9, zzkm.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(obj, j, zzkm.zza(object, zzizVar.zznm));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zziy.zze(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, zzizVar.zznm);
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zziy.zza(bArr, i, zzizVar);
                    int i10 = zzizVar.zznk;
                    zzko zzar = zzar(i8);
                    if (zzar != null && !zzar.zzan(i10)) {
                        zzo(obj).zzb(i3, Long.valueOf(i10));
                        return zza3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    zzb = zza3;
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjo.zzw(zzizVar.zznk)));
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjo.zzk(zzizVar.zznl)));
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(obj, j, zzkm.zza(object2, zzizVar.zznm));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    public final int zza(Object obj, byte[] bArr, int i, int i2, int i3, zziz zzizVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlu zzluVar;
        int i5;
        int i6;
        int i7;
        int i8;
        zzko zzar;
        int i9;
        int i10;
        int zzau;
        int i11;
        int i12;
        int i13;
        Object obj3;
        int i14;
        zziz zzizVar2;
        int i15;
        int i16;
        int i17;
        zziz zzizVar3;
        int i18;
        zziz zzizVar4;
        int i19;
        zziz zzizVar5;
        int i20;
        int i21;
        int i22;
        int i23;
        zzlu zzluVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zziz zzizVar6 = zzizVar;
        Unsafe unsafe2 = zzuc;
        int i26 = i;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = -1;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i10 = zziy.zza(b, bArr2, i32, zzizVar6);
                    i9 = zzizVar6.zznk;
                } else {
                    i9 = b;
                    i10 = i32;
                }
                int i33 = i9 >>> 3;
                int i34 = i9 & 7;
                if (i33 > i30) {
                    zzau = zzluVar2.zzp(i33, i27 / 3);
                } else {
                    zzau = zzluVar2.zzau(i33);
                }
                int i35 = zzau;
                if (i35 == -1) {
                    i11 = i33;
                    i12 = i10;
                    i6 = i9;
                    unsafe = unsafe2;
                    i4 = i25;
                    i13 = 0;
                } else {
                    int[] iArr = zzluVar2.zzud;
                    int i36 = iArr[i35 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i9;
                    long j = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr[i35 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i31) {
                            if (i31 != -1) {
                                unsafe2.putInt(obj4, i31, i29);
                            }
                            i29 = unsafe2.getInt(obj4, i41);
                            i31 = i41;
                        }
                        switch (i37) {
                            case 0:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 1) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    zznd.zza(obj4, j, zziy.zzc(bArr2, i19));
                                    i26 = i19 + 8;
                                    i29 |= i40;
                                    i31 = i18;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 1:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 5) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    zznd.zza(obj4, j, zziy.zzd(bArr2, i19));
                                    i26 = i19 + 4;
                                    i29 |= i40;
                                    i31 = i18;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 2:
                            case 3:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb = zziy.zzb(bArr2, i19, zzizVar);
                                    unsafe2.putLong(obj, j, zzizVar.zznl);
                                    i29 |= i40;
                                    i26 = zzb;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar;
                                    i31 = i18;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 4:
                            case 11:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i19, zzizVar4);
                                    unsafe2.putInt(obj4, j, zzizVar4.zznk);
                                    i29 |= i40;
                                    i31 = i18;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 5:
                            case 14:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 1) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i18 = i31;
                                    i19 = i10;
                                    unsafe2.putLong(obj, j, zziy.zzb(bArr2, i10));
                                    i26 = i19 + 8;
                                    i29 |= i40;
                                    i31 = i18;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 6:
                            case 13:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                i20 = i2;
                                if (i34 != 5) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zziy.zza(bArr2, i10));
                                    i26 = i10 + 4;
                                    i29 |= i40;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 7:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                i20 = i2;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb2 = zziy.zzb(bArr2, i10, zzizVar5);
                                    zznd.zza(obj4, j, zzizVar5.zznl != 0);
                                    i29 |= i40;
                                    i26 = zzb2;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 8:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                i20 = i2;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    if ((i36 & 536870912) == 0) {
                                        i26 = zziy.zzc(bArr2, i10, zzizVar5);
                                    } else {
                                        i26 = zziy.zzd(bArr2, i10, zzizVar5);
                                    }
                                    unsafe2.putObject(obj4, j, zzizVar5.zznm);
                                    i29 |= i40;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 9:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i20 = i2;
                                    i26 = zziy.zza(zzluVar2.zzap(i15), bArr2, i10, i20, zzizVar5);
                                    if ((i29 & i40) == 0) {
                                        unsafe2.putObject(obj4, j, zzizVar5.zznm);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkm.zza(unsafe2.getObject(obj4, j), zzizVar5.zznm));
                                    }
                                    i29 |= i40;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 10:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zze(bArr2, i10, zzizVar4);
                                    unsafe2.putObject(obj4, j, zzizVar4.zznm);
                                    i29 |= i40;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 12:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i10, zzizVar4);
                                    int i42 = zzizVar4.zznk;
                                    zzko zzar2 = zzluVar2.zzar(i15);
                                    if (zzar2 != null && !zzar2.zzan(i42)) {
                                        zzo(obj).zzb(i17, Long.valueOf(i42));
                                        i28 = i17;
                                        i27 = i15;
                                        i30 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    } else {
                                        unsafe2.putInt(obj4, j, i42);
                                        i29 |= i40;
                                        i28 = i17;
                                        i27 = i15;
                                        i30 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i10, zzizVar4);
                                    unsafe2.putInt(obj4, j, zzjo.zzw(zzizVar4.zznk));
                                    i29 |= i40;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 16:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    int zzb3 = zziy.zzb(bArr2, i10, zzizVar);
                                    zzizVar4 = zzizVar;
                                    unsafe2.putLong(obj, j, zzjo.zzk(zzizVar.zznl));
                                    i29 |= i40;
                                    i26 = zzb3;
                                    i28 = i17;
                                    i27 = i15;
                                    i30 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 17:
                                if (i34 != 3) {
                                    i15 = i35;
                                    i16 = i33;
                                    i17 = i38;
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(zzluVar2.zzap(i35), bArr, i10, i2, (i33 << 3) | 4, zzizVar);
                                    if ((i29 & i40) == 0) {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj4, j, zzizVar3.zznm);
                                    } else {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj4, j, zzkm.zza(unsafe2.getObject(obj4, j), zzizVar3.zznm));
                                    }
                                    i29 |= i40;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i28 = i38;
                                    i27 = i35;
                                    i30 = i33;
                                    i25 = i3;
                                    zzizVar6 = zzizVar3;
                                }
                            default:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                i19 = i10;
                                i12 = i19;
                                i13 = i15;
                                unsafe = unsafe2;
                                i31 = i18;
                                i6 = i17;
                                i11 = i16;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i43 = i31;
                        int i44 = i10;
                        bArr2 = bArr;
                        zziz zzizVar7 = zzizVar6;
                        if (i37 != 27) {
                            i21 = i29;
                            if (i37 <= 49) {
                                i11 = i33;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                i26 = zza(obj, bArr, i44, i2, i38, i11, i34, i35, i36, i37, j, zzizVar);
                                if (i26 == i44) {
                                    i4 = i3;
                                    i12 = i26;
                                } else {
                                    zzluVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i30 = i11;
                                    i24 = i2;
                                    i25 = i3;
                                    zzizVar6 = zzizVar;
                                    i31 = i43;
                                    i28 = i23;
                                    i29 = i21;
                                    unsafe2 = unsafe;
                                    i27 = i13;
                                }
                            } else {
                                i11 = i33;
                                i22 = i44;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                if (i37 != 50) {
                                    i26 = zza(obj, bArr, i22, i2, i23, i11, i34, i36, i37, j, i13, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj4 = obj;
                                        i24 = i2;
                                        i25 = i3;
                                        i28 = i23;
                                        i30 = i11;
                                        i31 = i43;
                                        i29 = i21;
                                        unsafe2 = unsafe;
                                        i27 = i13;
                                        bArr2 = bArr;
                                        zzizVar6 = zzizVar;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zza(obj, bArr, i22, i2, i13, j, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i30 = i11;
                                        i24 = i2;
                                        i25 = i3;
                                        zzizVar6 = zzizVar;
                                        i31 = i43;
                                        i28 = i23;
                                        i29 = i21;
                                        unsafe2 = unsafe;
                                        i27 = i13;
                                    }
                                } else {
                                    i4 = i3;
                                    i12 = i22;
                                }
                                i4 = i3;
                                i12 = i26;
                            }
                        } else if (i34 == 2) {
                            zzkp zzkpVar = (zzkp) unsafe2.getObject(obj4, j);
                            if (!zzkpVar.zzbo()) {
                                int size = zzkpVar.size();
                                zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj4, j, zzkpVar);
                            }
                            i26 = zziy.zza(zzluVar2.zzap(i35), i38, bArr, i44, i2, zzkpVar, zzizVar);
                            i25 = i3;
                            i30 = i33;
                            i28 = i38;
                            i27 = i35;
                            zzizVar6 = zzizVar7;
                            i31 = i43;
                            i29 = i29;
                            i24 = i2;
                        } else {
                            i21 = i29;
                            i11 = i33;
                            i22 = i44;
                            i23 = i38;
                            i13 = i35;
                            unsafe = unsafe2;
                            i4 = i3;
                            i12 = i22;
                        }
                        i31 = i43;
                        i6 = i23;
                        i29 = i21;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.zzui) {
                        zzizVar2 = zzizVar;
                        if (zzizVar2.zznn != zzjx.zzci()) {
                            int i45 = i11;
                            if (zzizVar2.zznn.zza(this.zzuh, i45) == null) {
                                i26 = zziy.zza(i6, bArr, i12, i2, zzo(obj), zzizVar);
                                obj4 = obj;
                                i24 = i2;
                                i28 = i6;
                                zzluVar2 = this;
                                zzizVar6 = zzizVar2;
                                i30 = i45;
                                unsafe2 = unsafe;
                                i27 = i13;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                zzkk.zzc zzcVar = (zzkk.zzc) obj;
                                zzcVar.zzdg();
                                zzkb zzkbVar = zzcVar.zzrw;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            obj3 = obj;
                            i14 = i11;
                        }
                    } else {
                        obj3 = obj;
                        i14 = i11;
                        zzizVar2 = zzizVar;
                    }
                    i26 = zziy.zza(i6, bArr, i12, i2, zzo(obj), zzizVar);
                    i28 = i6;
                    zzluVar2 = this;
                    zzizVar6 = zzizVar2;
                    i30 = i14;
                    obj4 = obj3;
                    unsafe2 = unsafe;
                    i27 = i13;
                    bArr2 = bArr;
                    i24 = i2;
                    i25 = i4;
                } else {
                    zzluVar = this;
                    obj2 = obj;
                    i7 = i31;
                    i8 = -1;
                    i5 = i12;
                }
            } else {
                int i46 = i31;
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj4;
                zzluVar = zzluVar2;
                i5 = i26;
                i6 = i28;
                i7 = i46;
                i8 = -1;
            }
        }
        if (i7 != i8) {
            unsafe.putInt(obj2, i7, i29);
        }
        Object obj5 = null;
        for (int i47 = zzluVar.zzun; i47 < zzluVar.zzuo; i47++) {
            int i48 = zzluVar.zzum[i47];
            zzmx zzmxVar = zzluVar.zzur;
            int i49 = zzluVar.zzud[i48];
            Object zzo = zznd.zzo(obj2, zzluVar.zzas(i48) & 1048575);
            if (zzo != null && (zzar = zzluVar.zzar(i48)) != null) {
                obj5 = zza(i48, i49, zzluVar.zzut.zzh(zzo), zzar, obj5, zzmxVar);
            }
            obj5 = (zzmy) obj5;
        }
        if (obj5 != null) {
            zzluVar.zzur.zzf(obj2, obj5);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzkq.zzdm();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzkq.zzdm();
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e3, code lost:
    
        if (r0 == r15) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0226, code lost:
    
        if (r0 == r15) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0245, code lost:
    
        if (r0 == r15) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0063. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Object r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.drive.zziz r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.drive.zziz):void");
    }

    private final Object zza(int i, int i2, Map map, zzko zzkoVar, Object obj, zzmx zzmxVar) {
        zzlj zzm = this.zzut.zzm(zzaq(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzkoVar.zzan(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = zzmxVar.zzez();
                }
                zzjk zzu = zzjc.zzu(zzli.zza(zzm, entry.getKey(), entry.getValue()));
                try {
                    zzli.zza(zzu.zzby(), zzm, entry.getKey(), entry.getValue());
                    zzmxVar.zza(obj, i2, zzu.zzbx());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    private static boolean zza(Object obj, int i, zzmf zzmfVar) {
        return zzmfVar.zzp(zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzns zznsVar) throws IOException {
        if (obj instanceof String) {
            zznsVar.zza(i, (String) obj);
        } else {
            zznsVar.zza(i, (zzjc) obj);
        }
    }

    private final boolean zza(Object obj, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza(obj, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(Object obj, int i) {
        if (this.zzuk) {
            int zzas = zzas(i);
            long j = zzas & 1048575;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    return zznd.zzn(obj, j) != 0.0d;
                case 1:
                    return zznd.zzm(obj, j) != 0.0f;
                case 2:
                    return zznd.zzk(obj, j) != 0;
                case 3:
                    return zznd.zzk(obj, j) != 0;
                case 4:
                    return zznd.zzj(obj, j) != 0;
                case 5:
                    return zznd.zzk(obj, j) != 0;
                case 6:
                    return zznd.zzj(obj, j) != 0;
                case 7:
                    return zznd.zzl(obj, j);
                case 8:
                    Object zzo = zznd.zzo(obj, j);
                    if (zzo instanceof String) {
                        return !((String) zzo).isEmpty();
                    }
                    if (zzo instanceof zzjc) {
                        return !zzjc.zznq.equals(zzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zznd.zzo(obj, j) != null;
                case 10:
                    return !zzjc.zznq.equals(zznd.zzo(obj, j));
                case 11:
                    return zznd.zzj(obj, j) != 0;
                case 12:
                    return zznd.zzj(obj, j) != 0;
                case 13:
                    return zznd.zzj(obj, j) != 0;
                case 14:
                    return zznd.zzk(obj, j) != 0;
                case 15:
                    return zznd.zzj(obj, j) != 0;
                case 16:
                    return zznd.zzk(obj, j) != 0;
                case 17:
                    return zznd.zzo(obj, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzat = zzat(i);
        return (zznd.zzj(obj, (long) (zzat & 1048575)) & (1 << (zzat >>> 20))) != 0;
    }

    private final boolean zza(Object obj, int i, int i2) {
        return zznd.zzj(obj, (long) (zzat(i2) & 1048575)) == i;
    }
}
