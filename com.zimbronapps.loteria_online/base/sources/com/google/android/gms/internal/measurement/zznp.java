package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznp implements zznx {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object zzn = zzop.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzlh) {
                    return !zzlh.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (zzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i, int i2) {
        return zzop.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(Object obj, int i, int i2) {
        zzop.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        int i3;
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                i3 = i + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                break;
            case 1:
                i3 = i + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                break;
            case 2:
            case 3:
                int zzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return zza2;
            case 5:
            case 15:
                i3 = i + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                break;
            case 6:
            case 14:
                i3 = i + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                break;
            case 7:
                int zzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return zzc2;
            case 8:
                return zzkx.zzf(bArr, i, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i, zzkwVar);
            case 16:
                int zza3 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return zza3;
            case 17:
                int zzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzb2 = zzoj.zzb();
        zzmfVar.zzc = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zznp zzl(java.lang.Class r34, com.google.android.gms.internal.measurement.zznj r35, com.google.android.gms.internal.measurement.zznr r36, com.google.android.gms.internal.measurement.zzmy r37, com.google.android.gms.internal.measurement.zzoi r38, com.google.android.gms.internal.measurement.zzls r39, com.google.android.gms.internal.measurement.zznh r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zznj, com.google.android.gms.internal.measurement.zznr, com.google.android.gms.internal.measurement.zzmy, com.google.android.gms.internal.measurement.zzoi, com.google.android.gms.internal.measurement.zzls, com.google.android.gms.internal.measurement.zznh):com.google.android.gms.internal.measurement.zznp");
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzn(Object obj, Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznx zznxVar = (zznx) objArr[i3];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zzb2 = zznu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzmk zzr(int i) {
        int i2 = i / 3;
        return (zzmk) this.zzd[i2 + i2 + 1];
    }

    private final Object zzs(Object obj, int i) {
        zznx zzp = zzp(i);
        int zzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final Object zzu(Object obj, int i, int i2) {
        zznx zzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    public final boolean zzb(Object obj, Object obj2) {
        boolean zzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzx = zzx(i);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzop.zzl(obj, j)) == Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzop.zzj(obj, j)) == Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzop.zzh(obj, j) == zzop.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
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
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = zzy(i) & 1048575;
                    if (zzop.zzd(obj, zzy) == zzop.zzd(obj2, zzy) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i3);
            int i5 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzz) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zzop.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zzop.zzn(obj, j);
                    if (zzn2 != null) {
                        i7 = zzn2.hashCode();
                    }
                    i4 = i2 + i7;
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
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzmp.zzb(zzG(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i3 = iArr[i];
            long j = i2;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzm(obj, j, zzop.zzl(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i);
                    break;
                case 10:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i);
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
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar2 = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVar.size();
                    int size2 = zzmoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVar.zza()) {
                            zzmoVar = zzmoVar.zzg(size2 + size);
                        }
                        zzmoVar.addAll(zzmoVar2);
                    }
                    if (size > 0) {
                        zzmoVar2 = zzmoVar;
                    }
                    zzop.zzo(obj, j, zzmoVar2);
                    break;
                case 50:
                    int i4 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
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
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r20, com.google.android.gms.internal.measurement.zzov r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzf(java.lang.Object, com.google.android.gms.internal.measurement.zzov):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d85, code lost:
    
        if (r3 == r5) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d87, code lost:
    
        r13.putInt(r8, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d8b, code lost:
    
        r3 = r1.zzj;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d91, code lost:
    
        if (r3 >= r1.zzk) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d93, code lost:
    
        r5 = r1.zzi;
        r6 = r1.zzl;
        r7 = r1.zzc;
        r5 = r5[r3];
        r7 = r7[r5];
        r9 = com.google.android.gms.internal.measurement.zzop.zzn(r8, r1.zzx(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0daa, code lost:
    
        if (r9 == null) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0dac, code lost:
    
        r12 = r1.zzr(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0db0, code lost:
    
        if (r12 == null) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0db2, code lost:
    
        r5 = ((com.google.android.gms.internal.measurement.zznf) r1.zzq(r5)).zze();
        r9 = ((com.google.android.gms.internal.measurement.zzng) r9).entrySet().iterator();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dca, code lost:
    
        if (r9.hasNext() == false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0dcc, code lost:
    
        r13 = (java.util.Map.Entry) r9.next();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0de0, code lost:
    
        if (r12.zza(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L678;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0de2, code lost:
    
        if (r4 != null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0de4, code lost:
    
        r4 = r6.zza(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0de8, code lost:
    
        r14 = com.google.android.gms.internal.measurement.zznf.zzc(r5, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.measurement.zzlh.zzb;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.measurement.zzlm.zzb;
        r10 = new com.google.android.gms.internal.measurement.zzlk(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e00, code lost:
    
        com.google.android.gms.internal.measurement.zznf.zzb(r10, r5, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e0b, code lost:
    
        r4.zzk((r7 << 3) | 2, com.google.android.gms.internal.measurement.zzle.zza(r10, r15));
        r9.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e22, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0aaf, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e25, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e2b, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0e2c, code lost:
    
        r3 = r3 + 1;
        r1 = r33;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0e38, code lost:
    
        if (r4 == null) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0e3a, code lost:
    
        ((com.google.android.gms.internal.measurement.zzmf) r8).zzc = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0e3f, code lost:
    
        if (r0 != 0) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0e43, code lost:
    
        if (r2 != r37) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0e4d, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e56, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e4e, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0e52, code lost:
    
        if (r2 > r37) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0e54, code lost:
    
        if (r11 != r0) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0e5c, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x095a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x096c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0955 A[PHI: r1 r10 r11 r12 r13 r18 r20 r25
      0x0955: PHI (r1v58 com.google.android.gms.internal.measurement.zznp) = 
      (r1v1 com.google.android.gms.internal.measurement.zznp)
      (r1v1 com.google.android.gms.internal.measurement.zznp)
      (r1v1 com.google.android.gms.internal.measurement.zznp)
      (r1v1 com.google.android.gms.internal.measurement.zznp)
      (r1v1 com.google.android.gms.internal.measurement.zznp)
      (r1v59 com.google.android.gms.internal.measurement.zznp)
     binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r10v29 com.google.android.gms.internal.measurement.zzkw) = 
      (r10v13 com.google.android.gms.internal.measurement.zzkw)
      (r10v14 com.google.android.gms.internal.measurement.zzkw)
      (r10v15 com.google.android.gms.internal.measurement.zzkw)
      (r10v16 com.google.android.gms.internal.measurement.zzkw)
      (r10v18 com.google.android.gms.internal.measurement.zzkw)
      (r10v30 com.google.android.gms.internal.measurement.zzkw)
     binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r11v52 int) = (r11v36 int), (r11v37 int), (r11v38 int), (r11v39 int), (r11v41 int), (r11v53 int) binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r12v29 byte[]) = (r12v13 byte[]), (r12v14 byte[]), (r12v15 byte[]), (r12v16 byte[]), (r12v18 byte[]), (r12v30 byte[]) binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r13v33 int) = (r13v17 int), (r13v18 int), (r13v19 int), (r13v20 int), (r13v22 int), (r13v34 int) binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r18v37 int) = (r18v19 int), (r18v20 int), (r18v21 int), (r18v22 int), (r18v24 int), (r18v38 int) binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r20v13 int) = (r20v2 int), (r20v3 int), (r20v4 int), (r20v5 int), (r20v7 int), (r20v14 int) binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]
      0x0955: PHI (r25v19 sun.misc.Unsafe) = 
      (r25v3 sun.misc.Unsafe)
      (r25v4 sun.misc.Unsafe)
      (r25v5 sun.misc.Unsafe)
      (r25v6 sun.misc.Unsafe)
      (r25v8 sun.misc.Unsafe)
      (r25v20 sun.misc.Unsafe)
     binds: [B:583:0x092a, B:559:0x08b6, B:535:0x0849, B:523:0x0807, B:511:0x07cb, B:241:0x03d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0cf3 A[PHI: r6 r8 r11 r15 r17
      0x0cf3: PHI (r6v39 sun.misc.Unsafe) = 
      (r6v14 sun.misc.Unsafe)
      (r6v15 sun.misc.Unsafe)
      (r6v16 sun.misc.Unsafe)
      (r6v17 sun.misc.Unsafe)
      (r6v18 sun.misc.Unsafe)
      (r6v19 sun.misc.Unsafe)
      (r6v21 sun.misc.Unsafe)
      (r6v22 sun.misc.Unsafe)
      (r6v28 sun.misc.Unsafe)
      (r6v33 sun.misc.Unsafe)
      (r6v40 sun.misc.Unsafe)
     binds: [B:719:0x0cdc, B:716:0x0cbb, B:713:0x0c9d, B:710:0x0c80, B:707:0x0c63, B:704:0x0c45, B:696:0x0c1e, B:682:0x0be1, B:666:0x0b59, B:657:0x0b0f, B:648:0x0ace] A[DONT_GENERATE, DONT_INLINE]
      0x0cf3: PHI (r8v34 java.lang.Object) = 
      (r8v11 java.lang.Object)
      (r8v12 java.lang.Object)
      (r8v13 java.lang.Object)
      (r8v14 java.lang.Object)
      (r8v15 java.lang.Object)
      (r8v16 java.lang.Object)
      (r8v18 java.lang.Object)
      (r8v19 java.lang.Object)
      (r8v23 java.lang.Object)
      (r8v28 java.lang.Object)
      (r8v35 java.lang.Object)
     binds: [B:719:0x0cdc, B:716:0x0cbb, B:713:0x0c9d, B:710:0x0c80, B:707:0x0c63, B:704:0x0c45, B:696:0x0c1e, B:682:0x0be1, B:666:0x0b59, B:657:0x0b0f, B:648:0x0ace] A[DONT_GENERATE, DONT_INLINE]
      0x0cf3: PHI (r11v33 int) = 
      (r11v11 int)
      (r11v12 int)
      (r11v13 int)
      (r11v14 int)
      (r11v15 int)
      (r11v16 int)
      (r11v18 int)
      (r11v19 int)
      (r11v23 int)
      (r11v28 int)
      (r11v34 int)
     binds: [B:719:0x0cdc, B:716:0x0cbb, B:713:0x0c9d, B:710:0x0c80, B:707:0x0c63, B:704:0x0c45, B:696:0x0c1e, B:682:0x0be1, B:666:0x0b59, B:657:0x0b0f, B:648:0x0ace] A[DONT_GENERATE, DONT_INLINE]
      0x0cf3: PHI (r15v34 int) = 
      (r15v11 int)
      (r15v12 int)
      (r15v13 int)
      (r15v14 int)
      (r15v15 int)
      (r15v16 int)
      (r15v18 int)
      (r15v19 int)
      (r15v23 int)
      (r15v28 int)
      (r15v35 int)
     binds: [B:719:0x0cdc, B:716:0x0cbb, B:713:0x0c9d, B:710:0x0c80, B:707:0x0c63, B:704:0x0c45, B:696:0x0c1e, B:682:0x0be1, B:666:0x0b59, B:657:0x0b0f, B:648:0x0ace] A[DONT_GENERATE, DONT_INLINE]
      0x0cf3: PHI (r17v22 int) = 
      (r17v6 int)
      (r17v7 int)
      (r17v8 int)
      (r17v9 int)
      (r17v10 int)
      (r17v11 int)
      (r17v13 int)
      (r17v14 int)
      (r17v15 int)
      (r17v17 int)
      (r17v23 int)
     binds: [B:719:0x0cdc, B:716:0x0cbb, B:713:0x0c9d, B:710:0x0c80, B:707:0x0c63, B:704:0x0c45, B:696:0x0c1e, B:682:0x0be1, B:666:0x0b59, B:657:0x0b0f, B:648:0x0ace] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0d2c  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzh(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.measurement.zzkw r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        zzh(obj, bArr, i, i2, 0, zzkwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzA(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzmf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.measurement.zzmf r0 = (com.google.android.gms.internal.measurement.zzmf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzcm(r2)
            r0.zza = r1
            r0.zzcg()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzx(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzz(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L82
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.measurement.zzng r6 = (com.google.android.gms.internal.measurement.zzng) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzop.zzn(r8, r3)
            com.google.android.gms.internal.measurement.zzmo r2 = (com.google.android.gms.internal.measurement.zzmo) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzL(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.zznx r2 = r7.zzp(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzj(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzJ(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.zznx r2 = r7.zzp(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzj(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.measurement.zzoi r0 = r7.zzl
            r0.zzb(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L93
            com.google.android.gms.internal.measurement.zzls r0 = r7.zzm
            r0.zza(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzj(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzk(java.lang.Object):boolean");
    }
}
