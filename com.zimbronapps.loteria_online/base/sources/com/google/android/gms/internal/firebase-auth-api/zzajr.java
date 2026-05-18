package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzajr {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    public static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    public static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i, zzaju zzajuVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzajuVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzajuVar.zzb = j2;
        return i3;
    }

    public static int zza(byte[] bArr, int i, zzaju zzajuVar) throws zzall {
        int zzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza;
        if (i2 < 0) {
            throw zzall.zzf();
        }
        if (i2 > bArr.length - zzc) {
            throw zzall.zzj();
        }
        if (i2 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return zzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, zzc, i2);
        return zzc + i2;
    }

    public static int zzb(zzanb zzanbVar, int i, byte[] bArr, int i2, int i3, zzalm zzalmVar, zzaju zzajuVar) throws IOException {
        int zza2 = zza(zzanbVar, bArr, i2, i3, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (zza2 < i3) {
            int zzc = zzc(bArr, zza2, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            zza2 = zza(zzanbVar, bArr, zzc, i3, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i, zzaju zzajuVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzajuVar);
        }
        zzajuVar.zza = b;
        return i2;
    }

    public static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i, zzaju zzajuVar) throws zzall {
        int zzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza;
        if (i2 < 0) {
            throw zzall.zzf();
        }
        if (i2 == 0) {
            zzajuVar.zzc = "";
            return zzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, zzc, i2);
        return zzc + i2;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzamm zzammVar, zzanu zzanuVar, zzaju zzajuVar) throws IOException {
        if (zzajuVar.zzd.zza(zzammVar, i >>> 3) == null) {
            return zza(i, bArr, i2, i3, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzanb zzanbVar, byte[] bArr, int i, int i2, int i3, zzaju zzajuVar) throws IOException {
        Object zza2 = zzanbVar.zza();
        int zza3 = zza(zza2, zzanbVar, bArr, i, i2, i3, zzajuVar);
        zzanbVar.zzd(zza2);
        zzajuVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzanb zzanbVar, int i, byte[] bArr, int i2, int i3, zzalm zzalmVar, zzaju zzajuVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int zza2 = zza(zzanbVar, bArr, i2, i3, i4, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (zza2 < i3) {
            int zzc = zzc(bArr, zza2, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            zza2 = zza(zzanbVar, bArr, zzc, i3, i4, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return zza2;
    }

    public static int zza(zzanb zzanbVar, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        Object zza2 = zzanbVar.zza();
        int zza3 = zza(zza2, zzanbVar, bArr, i, i2, zzajuVar);
        zzanbVar.zzd(zza2);
        zzajuVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i, zzalm zzalmVar, zzaju zzajuVar) throws IOException {
        zzali zzaliVar = (zzali) zzalmVar;
        int zzc = zzc(bArr, i, zzajuVar);
        int i2 = zzajuVar.zza + zzc;
        while (zzc < i2) {
            zzc = zzc(bArr, zzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (zzc == i2) {
            return zzc;
        }
        throw zzall.zzj();
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzanx zzanxVar, zzaju zzajuVar) throws zzall {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzd = zzd(bArr, i2, zzajuVar);
            zzanxVar.zza(i, Long.valueOf(zzajuVar.zzb));
            return zzd;
        }
        if (i4 == 1) {
            zzanxVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzc = zzc(bArr, i2, zzajuVar);
            int i5 = zzajuVar.zza;
            if (i5 >= 0) {
                if (i5 > bArr.length - zzc) {
                    throw zzall.zzj();
                }
                if (i5 == 0) {
                    zzanxVar.zza(i, zzajv.zza);
                } else {
                    zzanxVar.zza(i, zzajv.zza(bArr, zzc, i5));
                }
                return zzc + i5;
            }
            throw zzall.zzf();
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzanxVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            }
            throw zzall.zzc();
        }
        zzanx zzd2 = zzanx.zzd();
        int i6 = (i & (-8)) | 4;
        int i7 = zzajuVar.zze + 1;
        zzajuVar.zze = i7;
        zza(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzc2 = zzc(bArr, i2, zzajuVar);
            int i9 = zzajuVar.zza;
            i8 = i9;
            if (i9 == i6) {
                i2 = zzc2;
                break;
            }
            int zza2 = zza(i8, bArr, zzc2, i3, zzd2, zzajuVar);
            i8 = i9;
            i2 = zza2;
        }
        zzajuVar.zze--;
        if (i2 <= i3 && i8 == i6) {
            zzanxVar.zza(i, zzd2);
            return i2;
        }
        throw zzall.zzg();
    }

    public static int zza(int i, byte[] bArr, int i2, zzaju zzajuVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzajuVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzajuVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzajuVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzajuVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzajuVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzalm zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int zzc = zzc(bArr, i2, zzajuVar);
        zzaliVar.zzc(zzajuVar.zza);
        while (zzc < i3) {
            int zzc2 = zzc(bArr, zzc, zzajuVar);
            if (i != zzajuVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzanb zzanbVar, byte[] bArr, int i, int i2, int i3, zzaju zzajuVar) throws IOException {
        zzamq zzamqVar = (zzamq) zzanbVar;
        int i4 = zzajuVar.zze + 1;
        zzajuVar.zze = i4;
        zza(i4);
        int zza2 = zzamqVar.zza(obj, bArr, i, i2, i3, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return zza2;
    }

    public static int zza(Object obj, zzanb zzanbVar, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzajuVar);
            i4 = zzajuVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = zzajuVar.zze + 1;
            zzajuVar.zze = i6;
            zza(i6);
            int i7 = i4 + i5;
            zzanbVar.zza(obj, bArr, i5, i7, zzajuVar);
            zzajuVar.zze--;
            zzajuVar.zzc = obj;
            return i7;
        }
        throw zzall.zzj();
    }

    public static int zza(int i, byte[] bArr, int i2, int i3, zzaju zzajuVar) throws zzall {
        if ((i >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzajuVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzajuVar) + zzajuVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzall.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzajuVar);
            i6 = zzajuVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzajuVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzall.zzg();
        }
        return i2;
    }

    private static void zza(int i) throws zzall {
        if (i >= zza) {
            throw zzall.zzh();
        }
    }
}
