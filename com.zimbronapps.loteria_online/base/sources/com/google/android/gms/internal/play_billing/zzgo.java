package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgo implements zzgv {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzho.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzhh zzl;
    private final zzev zzm;

    private zzgo(int[] iArr, Object[] objArr, int i, int i2, zzgl zzglVar, boolean z, int[] iArr2, int i3, int i4, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzevVar != null && (zzglVar instanceof zzff)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzhhVar;
        this.zzm = zzevVar;
        this.zzg = zzglVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgv zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzgv zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzho.zzq(obj, j, (1 << (zzp >>> 20)) | zzho.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzho.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzho.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzho.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzho.zzb(obj, j2)) != 0;
            case 2:
                return zzho.zzd(obj, j2) != 0;
            case 3:
                return zzho.zzd(obj, j2) != 0;
            case 4:
                return zzho.zzc(obj, j2) != 0;
            case 5:
                return zzho.zzd(obj, j2) != 0;
            case 6:
                return zzho.zzc(obj, j2) != 0;
            case 7:
                return zzho.zzw(obj, j2);
            case 8:
                Object zzf = zzho.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzei) {
                    return !zzei.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzho.zzf(obj, j2) != null;
            case 10:
                return !zzei.zzb.equals(zzho.zzf(obj, j2));
            case 11:
                return zzho.zzc(obj, j2) != 0;
            case 12:
                return zzho.zzc(obj, j2) != 0;
            case 13:
                return zzho.zzc(obj, j2) != 0;
            case 14:
                return zzho.zzd(obj, j2) != 0;
            case 15:
                return zzho.zzc(obj, j2) != 0;
            case 16:
                return zzho.zzd(obj, j2) != 0;
            case 17:
                return zzho.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzgv zzgvVar) {
        return zzgvVar.zzk(zzho.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).zzz();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzho.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzho.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhu zzhuVar) throws IOException {
        if (obj instanceof String) {
            zzhuVar.zzG(i, (String) obj);
        } else {
            zzhuVar.zzd(i, (zzei) obj);
        }
    }

    public static zzhi zzd(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.zzc()) {
            return zzhiVar;
        }
        zzhi zzf = zzhi.zzf();
        zzfiVar.zzc = zzf;
        return zzf;
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
    public static com.google.android.gms.internal.play_billing.zzgo zzl(java.lang.Class r34, com.google.android.gms.internal.play_billing.zzgi r35, com.google.android.gms.internal.play_billing.zzgq r36, com.google.android.gms.internal.play_billing.zzfy r37, com.google.android.gms.internal.play_billing.zzhh r38, com.google.android.gms.internal.play_billing.zzev r39, com.google.android.gms.internal.play_billing.zzgg r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgq, com.google.android.gms.internal.play_billing.zzfy, com.google.android.gms.internal.play_billing.zzhh, com.google.android.gms.internal.play_billing.zzev, com.google.android.gms.internal.play_billing.zzgg):com.google.android.gms.internal.play_billing.zzgo");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzho.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzho.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzho.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzho.zzf(obj, j)).longValue();
    }

    private final zzfl zzu(int i) {
        int i2 = i / 3;
        return (zzfl) this.zzd[i2 + i2 + 1];
    }

    private final zzgv zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgv zzgvVar = (zzgv) objArr[i3];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzb2 = zzgs.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzgv zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzgv zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x047f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zza(java.lang.Object):int");
    }

    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzfi) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzs = zzs(i3);
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzho.zza(obj, j));
                    byte[] bArr = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzho.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr2 = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr3 = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr4 = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzfo.zza(zzho.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzho.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzho.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr5 = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzho.zzd(obj, j);
                    byte[] bArr6 = zzfo.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzho.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
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
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzho.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzfo.zza(zzN(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzho.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzfo.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzho.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e5d, code lost:
    
        if (r1 == r13) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e5f, code lost:
    
        r0.putInt(r35, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e63, code lost:
    
        r0 = r14.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e67, code lost:
    
        if (r0 >= r14.zzk) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e69, code lost:
    
        r1 = r14.zzi;
        r2 = r14.zzc;
        r1 = r1[r0];
        r2 = r2[r1];
        r2 = com.google.android.gms.internal.play_billing.zzho.zzf(r35, r14.zzs(r1) & r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e7b, code lost:
    
        if (r2 != null) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e82, code lost:
    
        if (r14.zzu(r1) != null) goto L663;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e86, code lost:
    
        r2 = (com.google.android.gms.internal.play_billing.zzgf) r2;
        r0 = (com.google.android.gms.internal.play_billing.zzge) r14.zzw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e8e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e84, code lost:
    
        r0 = r0 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e91, code lost:
    
        if (r9 != 0) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e95, code lost:
    
        if (r8 != r38) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e9d, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ea4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0ea0, code lost:
    
        if (r8 > r38) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0ea2, code lost:
    
        if (r3 != r9) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0eaa, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a9f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0dc4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0dd9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0e22  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.play_billing.zzdw r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdw):int");
    }

    public final Object zze() {
        return ((zzfi) this.zzg).zzo();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.zzfi
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.play_billing.zzfi r0 = (com.google.android.gms.internal.play_billing.zzfi) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzx(r2)
            r0.zza = r1
            r0.zzv()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.zzgo.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.play_billing.zzgf r6 = (com.google.android.gms.internal.play_billing.zzgf) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.zzho.zzf(r8, r3)
            com.google.android.gms.internal.play_billing.zzfn r2 = (com.google.android.gms.internal.play_billing.zzfn) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.play_billing.zzgv r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzgo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.play_billing.zzgv r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.zzgo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.play_billing.zzhh r0 = r7.zzl
            r0.zzb(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L93
            com.google.android.gms.internal.play_billing.zzev r0 = r7.zzm
            r0.zza(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzf(java.lang.Object):void");
    }

    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzgx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzgx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzo(obj, j, zzho.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzp(obj, j, zzho.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzm(obj, j, zzho.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzq(obj, j, zzho.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzho.zzr(obj, j, zzho.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    zzfn zzfnVar = (zzfn) zzho.zzf(obj, j);
                    zzfn zzfnVar2 = (zzfn) zzho.zzf(obj2, j);
                    int size = zzfnVar.size();
                    int size2 = zzfnVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVar.zzc()) {
                            zzfnVar = zzfnVar.zzd(size2 + size);
                        }
                        zzfnVar.addAll(zzfnVar2);
                    }
                    if (size > 0) {
                        zzfnVar2 = zzfnVar;
                    }
                    zzho.zzs(obj, j, zzfnVar2);
                    break;
                case 50:
                    int i4 = zzgx.zza;
                    zzho.zzs(obj, j, zzgg.zza(zzho.zzf(obj, j), zzho.zzf(obj2, j)));
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzho.zzs(obj, j, zzho.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzdw zzdwVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzdwVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r20, com.google.android.gms.internal.play_billing.zzhu r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzhu):void");
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzho.zza(obj, j)) == Double.doubleToLongBits(zzho.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzho.zzb(obj, j)) == Float.floatToIntBits(zzho.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzho.zzw(obj, j) == zzho.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzho.zzc(obj, j) == zzho.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzho.zzd(obj, j) == zzho.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
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
                    zzE = zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzho.zzc(obj, zzp) == zzho.zzc(obj2, zzp) && zzgx.zzE(zzho.zzf(obj, j), zzho.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzk(java.lang.Object):boolean");
    }
}
