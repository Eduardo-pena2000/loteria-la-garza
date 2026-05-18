package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzrt implements zzsa {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i, int i2, zzrq zzrqVar, boolean z, int[] iArr2, int i3, int i4, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzsw.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzsw.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i, (String) obj);
        } else {
            zztbVar.zzd(i, (zzpm) obj);
        }
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
    public static com.google.android.gms.internal.consent_sdk.zzrt zzi(java.lang.Class r34, com.google.android.gms.internal.consent_sdk.zzrn r35, com.google.android.gms.internal.consent_sdk.zzrv r36, com.google.android.gms.internal.consent_sdk.zzrc r37, com.google.android.gms.internal.consent_sdk.zzsp r38, com.google.android.gms.internal.consent_sdk.zzqb r39, com.google.android.gms.internal.consent_sdk.zzrl r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzi(java.lang.Class, com.google.android.gms.internal.consent_sdk.zzrn, com.google.android.gms.internal.consent_sdk.zzrv, com.google.android.gms.internal.consent_sdk.zzrc, com.google.android.gms.internal.consent_sdk.zzsp, com.google.android.gms.internal.consent_sdk.zzqb, com.google.android.gms.internal.consent_sdk.zzrl):com.google.android.gms.internal.consent_sdk.zzrt");
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzsw.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzsw.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzsw.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzsw.zzf(obj, j)).longValue();
    }

    private final zzsa zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzsa zzsaVar = (zzsa) objArr[i3];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzb2 = zzrx.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
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

    private final void zzt(Object obj, Object obj2, int i) {
        if (zzy(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        zzsw.zzq(obj, j, (1 << (zzm >>> 20)) | zzsw.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzsw.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j != 1048575) {
            return (zzsw.zzc(obj, j) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j2)) != 0;
            case 2:
                return zzsw.zzd(obj, j2) != 0;
            case 3:
                return zzsw.zzd(obj, j2) != 0;
            case 4:
                return zzsw.zzc(obj, j2) != 0;
            case 5:
                return zzsw.zzd(obj, j2) != 0;
            case 6:
                return zzsw.zzc(obj, j2) != 0;
            case 7:
                return zzsw.zzw(obj, j2);
            case 8:
                Object zzf = zzsw.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzpm) {
                    return !zzpm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j2) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j2));
            case 11:
                return zzsw.zzc(obj, j2) != 0;
            case 12:
                return zzsw.zzc(obj, j2) != 0;
            case 13:
                return zzsw.zzc(obj, j2) != 0;
            case 14:
                return zzsw.zzd(obj, j2) != 0;
            case 15:
                return zzsw.zzc(obj, j2) != 0;
            case 16:
                return zzsw.zzd(obj, j2) != 0;
            case 17:
                return zzsw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzy(obj, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zza(java.lang.Object):int");
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
                int hashCode = (i4 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (hashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzo = zzo(i3);
            int i5 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzn) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j));
                    byte[] bArr = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr2 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr3 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr4 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzqs.zza(zzsw.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzsw.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr5 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr6 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzsw.zzf(obj, j);
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
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzqs.zza(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzB(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.consent_sdk.zzqm
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.consent_sdk.zzqm r0 = (com.google.android.gms.internal.consent_sdk.zzqm) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzA(r2)
            r0.zza = r1
            r0.zzy()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.consent_sdk.zzrk r6 = (com.google.android.gms.internal.consent_sdk.zzrk) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.consent_sdk.zzsw.zzf(r8, r3)
            com.google.android.gms.internal.consent_sdk.zzqr r2 = (com.google.android.gms.internal.consent_sdk.zzqr) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzC(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.consent_sdk.zzsa r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzy(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.consent_sdk.zzsa r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.consent_sdk.zzrt.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.consent_sdk.zzsp r0 = r7.zzi
            r0.zza(r8)
            boolean r0 = r7.zzf
            if (r0 == 0) goto L93
            com.google.android.gms.internal.consent_sdk.zzqb r0 = r7.zzj
            r0.zza(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzd(java.lang.Object):void");
    }

    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzo(obj, j, zzsw.zza(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzp(obj, j, zzsw.zzb(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzm(obj, j, zzsw.zzw(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i);
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
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj, j);
                    zzqr zzqrVar2 = (zzqr) zzsw.zzf(obj2, j);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.zzd(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    zzsw.zzs(obj, j, zzqrVar2);
                    break;
                case 50:
                    int i4 = zzsc.zza;
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj, j);
                    zzrk zzrkVar2 = (zzrk) zzsw.zzf(obj2, j);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.zze()) {
                            zzrkVar = zzrkVar.zzb();
                        }
                        zzrkVar.zzd(zzrkVar2);
                    }
                    zzsw.zzs(obj, j, zzrkVar);
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
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i);
                    break;
            }
            i += 3;
        }
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
    public final void zzf(java.lang.Object r20, com.google.android.gms.internal.consent_sdk.zztb r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzf(java.lang.Object, com.google.android.gms.internal.consent_sdk.zztb):void");
    }

    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzsw.zza(obj, j)) == Double.doubleToLongBits(zzsw.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzsw.zzb(obj, j)) == Float.floatToIntBits(zzsw.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzsw.zzw(obj, j) == zzsw.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
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
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
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
                    long zzm = zzm(i) & 1048575;
                    if (zzsw.zzc(obj, zzm) == zzsw.zzc(obj2, zzm) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzh(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzrt.zzh(java.lang.Object):boolean");
    }
}
