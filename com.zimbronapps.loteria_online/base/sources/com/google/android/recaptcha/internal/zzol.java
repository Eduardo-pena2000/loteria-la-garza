package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzol implements zzow {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzov zzovVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzps.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j2)) != 0;
            case 2:
                return zzps.zzd(obj, j2) != 0;
            case 3:
                return zzps.zzd(obj, j2) != 0;
            case 4:
                return zzps.zzc(obj, j2) != 0;
            case 5:
                return zzps.zzd(obj, j2) != 0;
            case 6:
                return zzps.zzc(obj, j2) != 0;
            case 7:
                return zzps.zzw(obj, j2);
            case 8:
                Object zzf = zzps.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j2) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j2));
            case 11:
                return zzps.zzc(obj, j2) != 0;
            case 12:
                return zzps.zzc(obj, j2) != 0;
            case 13:
                return zzps.zzc(obj, j2) != 0;
            case 14:
                return zzps.zzd(obj, j2) != 0;
            case 15:
                return zzps.zzc(obj, j2) != 0;
            case 16:
                return zzps.zzd(obj, j2) != 0;
            case 17:
                return zzps.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzps.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
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
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r34, com.google.android.recaptcha.internal.zzof r35, com.google.android.recaptcha.internal.zzoo r36, com.google.android.recaptcha.internal.zznv r37, com.google.android.recaptcha.internal.zzpl r38, com.google.android.recaptcha.internal.zzmp r39, com.google.android.recaptcha.internal.zzod r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzt) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i3 = i2 + i7;
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
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0e29, code lost:
    
        if (r11 == 1048575) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e2b, code lost:
    
        r36.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e31, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e36, code lost:
    
        if (r11 >= r6.zzl) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e38, code lost:
    
        zzy(r34, r6.zzj[r11], null, r6.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e4d, code lost:
    
        if (r9 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e4f, code lost:
    
        if (r8 != r14) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e57, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e5c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e58, code lost:
    
        if (r8 > r14) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e5a, code lost:
    
        if (r10 != r9) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0e62, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x09a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0cd9 A[PHI: r0 r2 r8 r10 r19 r24 r36
      0x0cd9: PHI (r0v102 int) = (r0v73 int), (r0v74 int), (r0v80 int), (r0v85 int), (r0v93 int), (r0v99 int), (r0v103 int) binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r2v96 com.google.android.recaptcha.internal.zzkt) = 
      (r2v79 com.google.android.recaptcha.internal.zzkt)
      (r2v80 com.google.android.recaptcha.internal.zzkt)
      (r2v86 com.google.android.recaptcha.internal.zzkt)
      (r2v89 com.google.android.recaptcha.internal.zzkt)
      (r2v92 com.google.android.recaptcha.internal.zzkt)
      (r2v94 com.google.android.recaptcha.internal.zzkt)
      (r2v97 com.google.android.recaptcha.internal.zzkt)
     binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r8v86 int) = (r8v61 int), (r8v62 int), (r8v68 int), (r8v71 int), (r8v75 int), (r8v80 int), (r8v87 int) binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r10v54 int) = (r10v21 int), (r10v22 int), (r10v28 int), (r10v33 int), (r10v43 int), (r10v49 int), (r10v55 int) binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r19v51 int) = (r19v30 int), (r19v31 int), (r19v37 int), (r19v40 int), (r19v44 int), (r19v48 int), (r19v52 int) binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r24v25 int) = (r24v7 int), (r24v8 int), (r24v14 int), (r24v17 int), (r24v19 int), (r24v22 int), (r24v26 int) binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]
      0x0cd9: PHI (r36v37 sun.misc.Unsafe) = 
      (r36v15 sun.misc.Unsafe)
      (r36v16 sun.misc.Unsafe)
      (r36v22 sun.misc.Unsafe)
      (r36v25 sun.misc.Unsafe)
      (r36v29 sun.misc.Unsafe)
      (r36v34 sun.misc.Unsafe)
      (r36v38 sun.misc.Unsafe)
     binds: [B:528:0x0cc2, B:525:0x0c9c, B:504:0x0bd4, B:488:0x0b81, B:470:0x0ac5, B:464:0x0a89, B:455:0x0a43] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x09c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zznd
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zznd r0 = (com.google.android.recaptcha.internal.zznd) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzJ(r2)
            r0.zza = r1
            r0.zzH()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
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
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.recaptcha.internal.zzoc r6 = (com.google.android.recaptcha.internal.zzoc) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.recaptcha.internal.zzps.zzf(r8, r3)
            com.google.android.recaptcha.internal.zznk r2 = (com.google.android.recaptcha.internal.zznk) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.recaptcha.internal.zzpl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.recaptcha.internal.zzmp r0 = r7.zzn
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzf(java.lang.Object):void");
    }

    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case 50:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        Long valueOf;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar = this.zzm;
        Object obj2 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zznm unused) {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i = this.zzk; i < this.zzl; i++) {
                                zzy(obj, this.zzj[i], obj2, zzplVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzps.zzo(obj, zzu & 1048575, zzovVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzps.zzp(obj, zzu & 1048575, zzovVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzps.zzm(obj, zzu & 1048575, zzovVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzovVar);
                            zzH(obj, zzq);
                        case 9:
                            zzoi zzoiVar = (zzoi) zzA(obj, zzq);
                            zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar);
                        case 10:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze2 = zzovVar.zze();
                            zznh zzw = zzw(zzq);
                            if (zzw == null || zzw.zza(zze2)) {
                                zzps.zzq(obj, zzu & 1048575, zze2);
                                zzH(obj, zzq);
                            } else {
                                obj2 = zzoy.zzo(obj, zzc, zze2, obj2, zzplVar);
                            }
                            break;
                        case 13:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzps.zzq(obj, zzu & 1048575, zzovVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzps.zzr(obj, zzu & 1048575, zzovVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzoi zzoiVar2 = (zzoi) zzA(obj, zzq);
                            zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                            zzJ(obj, zzq, zzoiVar2);
                        case 18:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 19:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 20:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 21:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 22:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 23:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 24:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 25:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzlj) zzovVar).zzK(zznv.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzovVar.zzF(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 28:
                            zzovVar.zzw(zznv.zza(obj, zzu & 1048575));
                        case 29:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza2);
                            obj2 = zzoy.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzplVar);
                        case 31:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 32:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 33:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 34:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 35:
                            zzovVar.zzx(zznv.zza(obj, zzu & 1048575));
                        case 36:
                            zzovVar.zzB(zznv.zza(obj, zzu & 1048575));
                        case 37:
                            zzovVar.zzE(zznv.zza(obj, zzu & 1048575));
                        case 38:
                            zzovVar.zzM(zznv.zza(obj, zzu & 1048575));
                        case 39:
                            zzovVar.zzD(zznv.zza(obj, zzu & 1048575));
                        case 40:
                            zzovVar.zzA(zznv.zza(obj, zzu & 1048575));
                        case 41:
                            zzovVar.zzz(zznv.zza(obj, zzu & 1048575));
                        case 42:
                            zzovVar.zzv(zznv.zza(obj, zzu & 1048575));
                        case 43:
                            zzovVar.zzL(zznv.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zznv.zza(obj, zzu & 1048575);
                            zzovVar.zzy(zza3);
                            obj2 = zzoy.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzplVar);
                        case 45:
                            zzovVar.zzG(zznv.zza(obj, zzu & 1048575));
                        case 46:
                            zzovVar.zzH(zznv.zza(obj, zzu & 1048575));
                        case 47:
                            zzovVar.zzI(zznv.zza(obj, zzu & 1048575));
                        case 48:
                            zzovVar.zzJ(zznv.zza(obj, zzu & 1048575));
                        case 49:
                            zzovVar.zzC(zznv.zza(obj, zzu & 1048575), zzx(zzq), zzmoVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzf = zzps.zzf(obj, zzu2);
                            if (zzf == null) {
                                zzf = zzoc.zza().zzb();
                                zzps.zzs(obj, zzu2, zzf);
                            } else if (zzod.zza(zzf)) {
                                zzoc zzb2 = zzoc.zza().zzb();
                                zzod.zzb(zzb2, zzf);
                                zzps.zzs(obj, zzu2, zzb2);
                                zzf = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzps.zzs(obj, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzps.zzs(obj, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzps.zzs(obj, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzovVar);
                            zzI(obj, zzc, zzq);
                        case 60:
                            zzoi zzoiVar3 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar3);
                        case 61:
                            zzps.zzs(obj, zzu & 1048575, zzovVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze3 = zzovVar.zze();
                            zznh zzw2 = zzw(zzq);
                            if (zzw2 == null || zzw2.zza(zze3)) {
                                zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zze3));
                                zzI(obj, zzc, zzq);
                            } else {
                                obj2 = zzoy.zzo(obj, zzc, zze3, obj2, zzplVar);
                            }
                            break;
                        case 64:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzps.zzs(obj, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzps.zzs(obj, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzoi zzoiVar4 = (zzoi) zzB(obj, zzc, zzq);
                            zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                            zzK(obj, zzc, zzq, zzoiVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzplVar.zza(obj);
                            }
                            if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                    zzy(obj, this.zzj[i2], obj2, zzplVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                        zzy(obj, this.zzj[i3], obj2, zzplVar, obj);
                    }
                } else {
                    zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                    if (zza4 != null) {
                        if (zzmtVar == null) {
                            zzmtVar = ((zzna) obj).zzi();
                        }
                        zznb zznbVar = zza4.zza;
                        zzpw zzpwVar = zzpw.zzn;
                        zzpw zzpwVar2 = zznbVar.zzb;
                        if (zzpwVar2 == zzpwVar) {
                            zzovVar.zzg();
                            throw null;
                        }
                        switch (zzpwVar2.ordinal()) {
                            case 0:
                                valueOf = Double.valueOf(zzovVar.zza());
                                break;
                            case 1:
                                valueOf = Float.valueOf(zzovVar.zzb());
                                break;
                            case 2:
                                valueOf = Long.valueOf(zzovVar.zzl());
                                break;
                            case 3:
                                valueOf = Long.valueOf(zzovVar.zzo());
                                break;
                            case 4:
                                valueOf = Integer.valueOf(zzovVar.zzg());
                                break;
                            case 5:
                                valueOf = Long.valueOf(zzovVar.zzk());
                                break;
                            case 6:
                                valueOf = Integer.valueOf(zzovVar.zzf());
                                break;
                            case 7:
                                valueOf = Boolean.valueOf(zzovVar.zzN());
                                break;
                            case 8:
                                valueOf = zzovVar.zzr();
                                break;
                            case 9:
                                Object zze4 = zzmtVar.zze(zza4.zza);
                                if (!(zze4 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                if (!((zznd) zze4).zzL()) {
                                    Object zze5 = zzb3.zze();
                                    zzb3.zzg(zze5, zze4);
                                    zzmtVar.zzi(zza4.zza, zze5);
                                    zze4 = zze5;
                                }
                                zzovVar.zzt(zze4, zzb3, zzmoVar);
                                continue;
                            case 10:
                                Object zze6 = zzmtVar.zze(zza4.zza);
                                if (!(zze6 instanceof zznd)) {
                                    throw null;
                                }
                                zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                if (!((zznd) zze6).zzL()) {
                                    Object zze7 = zzb4.zze();
                                    zzb4.zzg(zze7, zze6);
                                    zzmtVar.zzi(zza4.zza, zze7);
                                    zze6 = zze7;
                                }
                                zzovVar.zzu(zze6, zzb4, zzmoVar);
                                continue;
                            case 11:
                                valueOf = zzovVar.zzp();
                                break;
                            case 12:
                                valueOf = Integer.valueOf(zzovVar.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case 14:
                                valueOf = Integer.valueOf(zzovVar.zzh());
                                break;
                            case 15:
                                valueOf = Long.valueOf(zzovVar.zzm());
                                break;
                            case 16:
                                valueOf = Integer.valueOf(zzovVar.zzi());
                                break;
                            case 17:
                                valueOf = Long.valueOf(zzovVar.zzn());
                                break;
                            default:
                                valueOf = null;
                                break;
                        }
                        int ordinal = zza4.zza.zzb.ordinal();
                        if ((ordinal == 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                            byte[] bArr = zznl.zzb;
                            valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                        }
                        zzmtVar.zzi(zza4.zza, valueOf);
                    } else {
                        if (obj2 == null) {
                            obj2 = zzplVar.zza(obj);
                        }
                        if (!zzplVar.zzk(obj2, zzovVar, 0)) {
                            for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                                zzy(obj, this.zzj[i4], obj2, zzplVar, obj);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    zzy(obj, this.zzj[i5], obj2, zzplVar, obj);
                }
                if (obj2 != null) {
                    zzplVar.zzj(obj, obj2);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            zzplVar.zzj(obj, obj2);
        }
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r25, com.google.android.recaptcha.internal.zzpy r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
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
                    long zzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzl(java.lang.Object):boolean");
    }
}
