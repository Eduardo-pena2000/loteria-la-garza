package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzidf implements zzidu {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i, int i2, zzidc zzidcVar, boolean z, int[] iArr2, int i3, int i4, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z2 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zziem.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zziem.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zziem.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zziem.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zziem.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zziem.zzd(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziem.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziem.zzj(obj, j2)) != 0;
            case 2:
                return zziem.zzf(obj, j2) != 0;
            case 3:
                return zziem.zzf(obj, j2) != 0;
            case 4:
                return zziem.zzd(obj, j2) != 0;
            case 5:
                return zziem.zzf(obj, j2) != 0;
            case 6:
                return zziem.zzd(obj, j2) != 0;
            case 7:
                return zziem.zzh(obj, j2);
            case 8:
                Object zzn = zziem.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzian) {
                    return !zzian.zza.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziem.zzn(obj, j2) != null;
            case 10:
                return !zzian.zza.equals(zziem.zzn(obj, j2));
            case 11:
                return zziem.zzd(obj, j2) != 0;
            case 12:
                return zziem.zzd(obj, j2) != 0;
            case 13:
                return zziem.zzd(obj, j2) != 0;
            case 14:
                return zziem.zzf(obj, j2) != 0;
            case 15:
                return zziem.zzd(obj, j2) != 0;
            case 16:
                return zziem.zzf(obj, j2) != 0;
            case 17:
                return zziem.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zziem.zze(obj, j, (1 << (zzB >>> 20)) | zziem.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zziem.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zziem.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
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

    private static final int zzT(byte[] bArr, int i, int i2, zzies zziesVar, Class cls, zziab zziabVar) throws IOException {
        int i3;
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                i3 = i + 8;
                zziabVar.zzc = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i)));
                break;
            case 1:
                i3 = i + 4;
                zziabVar.zzc = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i)));
                break;
            case 2:
            case 3:
                int zzc = zziac.zzc(bArr, i, zziabVar);
                zziabVar.zzc = Long.valueOf(zziabVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zziac.zza(bArr, i, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziabVar.zza);
                return zza2;
            case 5:
            case 15:
                i3 = i + 8;
                zziabVar.zzc = Long.valueOf(zziac.zze(bArr, i));
                break;
            case 6:
            case 14:
                i3 = i + 4;
                zziabVar.zzc = Integer.valueOf(zziac.zzd(bArr, i));
                break;
            case 7:
                int zzc2 = zziac.zzc(bArr, i, zziabVar);
                zziabVar.zzc = Boolean.valueOf(zziabVar.zzb != 0);
                return zzc2;
            case 8:
                return zziac.zzf(bArr, i, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i, i2, zziabVar);
            case 11:
                return zziac.zzg(bArr, i, zziabVar);
            case 16:
                int zza3 = zziac.zza(bArr, i, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziaq.zzK(zziabVar.zza));
                return zza3;
            case 17:
                int zzc3 = zziac.zzc(bArr, i, zziabVar);
                zziabVar.zzc = Long.valueOf(zziaq.zzL(zziabVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzU(int i, Object obj, zzieu zzieuVar) throws IOException {
        if (obj instanceof String) {
            zzieuVar.zzm(i, (String) obj);
        } else {
            zzieuVar.zzn(i, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zzb2 = zzieg.zzb();
        zzibrVar.zzt = zzb2;
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
    public static com.google.android.gms.internal.ads.zzidf zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzicz r35, com.google.android.gms.internal.ads.zzidi r36, com.google.android.gms.internal.ads.zzico r37, com.google.android.gms.internal.ads.zzief r38, com.google.android.gms.internal.ads.zzibc r39, com.google.android.gms.internal.ads.zzicx r40) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzicz, com.google.android.gms.internal.ads.zzidi, com.google.android.gms.internal.ads.zzico, com.google.android.gms.internal.ads.zzief, com.google.android.gms.internal.ads.zzibc, com.google.android.gms.internal.ads.zzicx):com.google.android.gms.internal.ads.zzidf");
    }

    private static Field zzn(Class cls, String str) {
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

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzidu zzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzidu zzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzidu zziduVar = (zzidu) objArr[i3];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zzb2 = zzidm.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzibx zzs(int i) {
        int i2 = i / 3;
        return (zzibx) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzidu zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzidu zzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzief zziefVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzn = zziem.zzn(obj, zzA(i) & 1048575);
        if (zzn == null) {
            return obj2;
        }
        zzibx zzs = zzs(i);
        if (zzs == null) {
            return obj2;
        }
        zzicu zze = ((zzicv) zzr(i)).zze();
        Iterator it = ((zzicw) zzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int zzc = zzicv.zzc(zze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[zzc];
                int i3 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, zzc);
                try {
                    zzicv.zzb(zziatVar, zze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i2, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzidp zzidpVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zziem.zzo(obj, j, zzidpVar.zzn());
        } else if (this.zzi) {
            zziem.zzo(obj, j, zzidpVar.zzm());
        } else {
            zziem.zzo(obj, j, zzidpVar.zzq());
        }
    }

    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    public final boolean zzb(Object obj, Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            long j = zzA & 1048575;
            switch (zzC(zzA)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zziem.zzl(obj, j)) == Double.doubleToLongBits(zziem.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zziem.zzj(obj, j)) == Float.floatToIntBits(zziem.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zziem.zzf(obj, j) == zziem.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zziem.zzf(obj, j) == zziem.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zziem.zzf(obj, j) == zziem.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zziem.zzh(obj, j) == zziem.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zziem.zzf(obj, j) == zziem.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zziem.zzd(obj, j) == zziem.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zziem.zzf(obj, j) == zziem.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
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
                    zzG = zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j));
                    break;
                case 50:
                    zzG = zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j));
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
                    long zzB = zzB(i) & 1048575;
                    if (zziem.zzd(obj, zzB) == zziem.zzd(obj2, zzB) && zzidw.zzG(zziem.zzn(obj, j), zziem.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
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
                int hashCode = (i4 * 53) + ((zzibr) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : hashCode;
            }
            int zzA = zzA(i3);
            int i5 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzC) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zziem.zzl(obj, j));
                    byte[] bArr = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zziem.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zziem.zzf(obj, j);
                    byte[] bArr2 = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zziem.zzf(obj, j);
                    byte[] bArr3 = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zziem.zzf(obj, j);
                    byte[] bArr4 = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzice.zzb(zziem.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zziem.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zziem.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zziem.zzf(obj, j);
                    byte[] bArr5 = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zziem.zzf(obj, j);
                    byte[] bArr6 = zzice.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zziem.zzn(obj, j);
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
                    floatToIntBits = zziem.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zziem.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzice.zzb(zzK(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zziem.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zziem.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zziem.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zzice.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zziem.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzidw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzidw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzm(obj, j, zziem.zzl(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzk(obj, j, zziem.zzj(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzg(obj, j, zziem.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzg(obj, j, zziem.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzg(obj, j, zziem.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzi(obj, j, zziem.zzh(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzo(obj, j, zziem.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzo(obj, j, zziem.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzg(obj, j, zziem.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zze(obj, j, zziem.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zziem.zzg(obj, j, zziem.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzicd zzicdVar = (zzicd) zziem.zzn(obj, j);
                    zzicd zzicdVar2 = (zzicd) zziem.zzn(obj2, j);
                    int size = zzicdVar.size();
                    int size2 = zzicdVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzicdVar.zza()) {
                            zzicdVar = zzicdVar.zzh(size2 + size);
                        }
                        zzicdVar.addAll(zzicdVar2);
                    }
                    if (size > 0) {
                        zzicdVar2 = zzicdVar;
                    }
                    zziem.zzo(obj, j, zzicdVar2);
                    break;
                case 50:
                    int i4 = zzidw.zza;
                    zziem.zzo(obj, j, zzicx.zzb(zziem.zzn(obj, j), zziem.zzn(obj2, j)));
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
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zziem.zzo(obj, j, zziem.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zziem.zzo(obj, j, zziem.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r22, com.google.android.gms.internal.ads.zzieu r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzieu):void");
    }

    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) throws IOException {
        Object obj2;
        zzibbVar.getClass();
        zzF(obj);
        zzief zziefVar = this.zzm;
        Object obj3 = null;
        while (true) {
            try {
                int zzb2 = zzidpVar.zzb();
                int zzR = zzR(zzb2);
                if (zzR >= 0) {
                    int zzA = zzA(zzR);
                    try {
                    } catch (zzicf unused) {
                        if (obj3 == null) {
                            obj3 = zziefVar.zzh(obj);
                        }
                        if (!zziefVar.zzk(obj3, zzidpVar, 0)) {
                            obj2 = obj3;
                            for (int i = this.zzk; i < this.zzl; i++) {
                                obj2 = zzx(obj, this.zzj[i], obj2, zziefVar, obj);
                            }
                        }
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            zziem.zzm(obj, zzA & 1048575, zzidpVar.zze());
                            zzO(obj, zzR);
                        case 1:
                            zziem.zzk(obj, zzA & 1048575, zzidpVar.zzf());
                            zzO(obj, zzR);
                        case 2:
                            zziem.zzg(obj, zzA & 1048575, zzidpVar.zzh());
                            zzO(obj, zzR);
                        case 3:
                            zziem.zzg(obj, zzA & 1048575, zzidpVar.zzg());
                            zzO(obj, zzR);
                        case 4:
                            zziem.zze(obj, zzA & 1048575, zzidpVar.zzi());
                            zzO(obj, zzR);
                        case 5:
                            zziem.zzg(obj, zzA & 1048575, zzidpVar.zzj());
                            zzO(obj, zzR);
                        case 6:
                            zziem.zze(obj, zzA & 1048575, zzidpVar.zzk());
                            zzO(obj, zzR);
                        case 7:
                            zziem.zzi(obj, zzA & 1048575, zzidpVar.zzl());
                            zzO(obj, zzR);
                        case 8:
                            zzz(obj, zzA, zzidpVar);
                            zzO(obj, zzR);
                        case 9:
                            zzidc zzidcVar = (zzidc) zzt(obj, zzR);
                            zzidpVar.zzo(zzidcVar, zzq(zzR), zzibbVar);
                            zzu(obj, zzR, zzidcVar);
                        case 10:
                            zziem.zzo(obj, zzA & 1048575, zzidpVar.zzq());
                            zzO(obj, zzR);
                        case 11:
                            zziem.zze(obj, zzA & 1048575, zzidpVar.zzr());
                            zzO(obj, zzR);
                        case 12:
                            int zzs = zzidpVar.zzs();
                            zzibx zzs2 = zzs(zzR);
                            if (zzs2 == null || zzs2.zza(zzs)) {
                                zziem.zze(obj, zzA & 1048575, zzs);
                                zzO(obj, zzR);
                            } else {
                                obj3 = zzidw.zzK(obj, zzb2, zzs, obj3, zziefVar);
                            }
                            break;
                        case 13:
                            zziem.zze(obj, zzA & 1048575, zzidpVar.zzt());
                            zzO(obj, zzR);
                        case 14:
                            zziem.zzg(obj, zzA & 1048575, zzidpVar.zzu());
                            zzO(obj, zzR);
                        case 15:
                            zziem.zze(obj, zzA & 1048575, zzidpVar.zzv());
                            zzO(obj, zzR);
                        case 16:
                            zziem.zzg(obj, zzA & 1048575, zzidpVar.zzw());
                            zzO(obj, zzR);
                        case 17:
                            zzidc zzidcVar2 = (zzidc) zzt(obj, zzR);
                            zzidpVar.zzp(zzidcVar2, zzq(zzR), zzibbVar);
                            zzu(obj, zzR, zzidcVar2);
                        case 18:
                            zzidpVar.zzx(zzico.zza(obj, zzA & 1048575));
                        case 19:
                            zzidpVar.zzy(zzico.zza(obj, zzA & 1048575));
                        case 20:
                            zzidpVar.zzA(zzico.zza(obj, zzA & 1048575));
                        case 21:
                            zzidpVar.zzz(zzico.zza(obj, zzA & 1048575));
                        case 22:
                            zzidpVar.zzB(zzico.zza(obj, zzA & 1048575));
                        case 23:
                            zzidpVar.zzC(zzico.zza(obj, zzA & 1048575));
                        case 24:
                            zzidpVar.zzD(zzico.zza(obj, zzA & 1048575));
                        case 25:
                            zzidpVar.zzE(zzico.zza(obj, zzA & 1048575));
                        case 26:
                            if (zzD(zzA)) {
                                ((zziar) zzidpVar).zzF(zzico.zza(obj, zzA & 1048575), true);
                            } else {
                                ((zziar) zzidpVar).zzF(zzico.zza(obj, zzA & 1048575), false);
                            }
                        case 27:
                            zzidpVar.zzG(zzico.zza(obj, zzA & 1048575), zzq(zzR), zzibbVar);
                        case 28:
                            zzidpVar.zzI(zzico.zza(obj, zzA & 1048575));
                        case 29:
                            zzidpVar.zzJ(zzico.zza(obj, zzA & 1048575));
                        case 30:
                            List zza2 = zzico.zza(obj, zzA & 1048575);
                            zzidpVar.zzK(zza2);
                            obj3 = zzidw.zzJ(obj, zzb2, zza2, zzs(zzR), obj3, zziefVar);
                        case 31:
                            zzidpVar.zzL(zzico.zza(obj, zzA & 1048575));
                        case 32:
                            zzidpVar.zzM(zzico.zza(obj, zzA & 1048575));
                        case 33:
                            zzidpVar.zzN(zzico.zza(obj, zzA & 1048575));
                        case 34:
                            zzidpVar.zzO(zzico.zza(obj, zzA & 1048575));
                        case 35:
                            zzidpVar.zzx(zzico.zza(obj, zzA & 1048575));
                        case 36:
                            zzidpVar.zzy(zzico.zza(obj, zzA & 1048575));
                        case 37:
                            zzidpVar.zzA(zzico.zza(obj, zzA & 1048575));
                        case 38:
                            zzidpVar.zzz(zzico.zza(obj, zzA & 1048575));
                        case 39:
                            zzidpVar.zzB(zzico.zza(obj, zzA & 1048575));
                        case 40:
                            zzidpVar.zzC(zzico.zza(obj, zzA & 1048575));
                        case 41:
                            zzidpVar.zzD(zzico.zza(obj, zzA & 1048575));
                        case 42:
                            zzidpVar.zzE(zzico.zza(obj, zzA & 1048575));
                        case 43:
                            zzidpVar.zzJ(zzico.zza(obj, zzA & 1048575));
                        case 44:
                            List zza3 = zzico.zza(obj, zzA & 1048575);
                            zzidpVar.zzK(zza3);
                            obj3 = zzidw.zzJ(obj, zzb2, zza3, zzs(zzR), obj3, zziefVar);
                        case 45:
                            zzidpVar.zzL(zzico.zza(obj, zzA & 1048575));
                        case 46:
                            zzidpVar.zzM(zzico.zza(obj, zzA & 1048575));
                        case 47:
                            zzidpVar.zzN(zzico.zza(obj, zzA & 1048575));
                        case 48:
                            zzidpVar.zzO(zzico.zza(obj, zzA & 1048575));
                        case 49:
                            zzidpVar.zzH(zzico.zza(obj, zzA & 1048575), zzq(zzR), zzibbVar);
                        case 50:
                            Object zzr = zzr(zzR);
                            long zzA2 = zzA(zzR) & 1048575;
                            Object zzn = zziem.zzn(obj, zzA2);
                            if (zzn == null) {
                                zzn = zzicw.zza().zzc();
                                zziem.zzo(obj, zzA2, zzn);
                            } else if (zzicx.zza(zzn)) {
                                zzicw zzc = zzicw.zza().zzc();
                                zzicx.zzb(zzc, zzn);
                                zziem.zzo(obj, zzA2, zzc);
                                zzn = zzc;
                            }
                            zzidpVar.zzP((zzicw) zzn, ((zzicv) zzr).zze(), zzibbVar);
                        case 51:
                            zziem.zzo(obj, zzA & 1048575, Double.valueOf(zzidpVar.zze()));
                            zzQ(obj, zzb2, zzR);
                        case 52:
                            zziem.zzo(obj, zzA & 1048575, Float.valueOf(zzidpVar.zzf()));
                            zzQ(obj, zzb2, zzR);
                        case 53:
                            zziem.zzo(obj, zzA & 1048575, Long.valueOf(zzidpVar.zzh()));
                            zzQ(obj, zzb2, zzR);
                        case 54:
                            zziem.zzo(obj, zzA & 1048575, Long.valueOf(zzidpVar.zzg()));
                            zzQ(obj, zzb2, zzR);
                        case 55:
                            zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzidpVar.zzi()));
                            zzQ(obj, zzb2, zzR);
                        case 56:
                            zziem.zzo(obj, zzA & 1048575, Long.valueOf(zzidpVar.zzj()));
                            zzQ(obj, zzb2, zzR);
                        case 57:
                            zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzidpVar.zzk()));
                            zzQ(obj, zzb2, zzR);
                        case 58:
                            zziem.zzo(obj, zzA & 1048575, Boolean.valueOf(zzidpVar.zzl()));
                            zzQ(obj, zzb2, zzR);
                        case 59:
                            zzz(obj, zzA, zzidpVar);
                            zzQ(obj, zzb2, zzR);
                        case 60:
                            zzidc zzidcVar3 = (zzidc) zzv(obj, zzb2, zzR);
                            zzidpVar.zzo(zzidcVar3, zzq(zzR), zzibbVar);
                            zzw(obj, zzb2, zzR, zzidcVar3);
                        case 61:
                            zziem.zzo(obj, zzA & 1048575, zzidpVar.zzq());
                            zzQ(obj, zzb2, zzR);
                        case 62:
                            zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzidpVar.zzr()));
                            zzQ(obj, zzb2, zzR);
                        case 63:
                            int zzs3 = zzidpVar.zzs();
                            zzibx zzs4 = zzs(zzR);
                            if (zzs4 == null || zzs4.zza(zzs3)) {
                                zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzs3));
                                zzQ(obj, zzb2, zzR);
                            } else {
                                obj3 = zzidw.zzK(obj, zzb2, zzs3, obj3, zziefVar);
                            }
                            break;
                        case 64:
                            zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzidpVar.zzt()));
                            zzQ(obj, zzb2, zzR);
                        case 65:
                            zziem.zzo(obj, zzA & 1048575, Long.valueOf(zzidpVar.zzu()));
                            zzQ(obj, zzb2, zzR);
                        case 66:
                            zziem.zzo(obj, zzA & 1048575, Integer.valueOf(zzidpVar.zzv()));
                            zzQ(obj, zzb2, zzR);
                        case 67:
                            zziem.zzo(obj, zzA & 1048575, Long.valueOf(zzidpVar.zzw()));
                            zzQ(obj, zzb2, zzR);
                        case 68:
                            zzidc zzidcVar4 = (zzidc) zzv(obj, zzb2, zzR);
                            zzidpVar.zzp(zzidcVar4, zzq(zzR), zzibbVar);
                            zzw(obj, zzb2, zzR, zzidcVar4);
                        default:
                            if (obj3 == null) {
                                obj3 = zziefVar.zzh(obj);
                            }
                            if (!zziefVar.zzk(obj3, zzidpVar, 0)) {
                                obj2 = obj3;
                                for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                    obj2 = zzx(obj, this.zzj[i2], obj2, zziefVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj2 = obj3;
                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                        obj2 = zzx(obj, this.zzj[i3], obj2, zziefVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzibbVar.zzc(this.zzg, zzb2)) != null) {
                        throw null;
                    }
                    if (obj3 == null) {
                        obj3 = zziefVar.zzh(obj);
                    }
                    if (!zziefVar.zzk(obj3, zzidpVar, 0)) {
                        obj2 = obj3;
                        for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                            obj2 = zzx(obj, this.zzj[i4], obj2, zziefVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Object obj4 = obj3;
                for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                    obj4 = zzx(obj, this.zzj[i5], obj4, zziefVar, obj);
                }
                if (obj4 != null) {
                    zziefVar.zzi(obj, obj4);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            zziefVar.zzi(obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0b43, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0f01, code lost:
    
        if (r11 == r0) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0f03, code lost:
    
        r9.putInt(r14, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0f07, code lost:
    
        r6 = r10.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0f0e, code lost:
    
        if (r6 >= r10.zzl) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0f10, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzieg) zzx(r35, r10.zzj[r6], r3, r10.zzm, r35);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0f26, code lost:
    
        if (r3 == null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0f28, code lost:
    
        r10.zzm.zzi(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0f2d, code lost:
    
        if (r7 != 0) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0f31, code lost:
    
        if (r8 != r38) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0f3b, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0f44, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0f3c, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0f40, code lost:
    
        if (r8 > r38) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0f42, code lost:
    
        if (r12 != r7) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0f4a, code lost:
    
        throw new com.google.android.gms.internal.ads.zzicg(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0e85  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09e2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v174, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zziab r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zziab):int");
    }

    public final void zzj(Object obj, byte[] bArr, int i, int i2, zziab zziabVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zziabVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzibr
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzibr r0 = (com.google.android.gms.internal.ads.zzibr) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzicw r6 = (com.google.android.gms.internal.ads.zzicw) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zziem.zzn(r8, r3)
            com.google.android.gms.internal.ads.zzicd r2 = (com.google.android.gms.internal.ads.zzicd) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzP(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzidu r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzidu r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzidf.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzief r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzibc r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzl(java.lang.Object):boolean");
    }
}
