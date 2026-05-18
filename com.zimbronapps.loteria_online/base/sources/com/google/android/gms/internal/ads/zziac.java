package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziac {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zziab zziabVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zziabVar);
        }
        zziabVar.zza = b;
        return i2;
    }

    public static int zzb(int i, byte[] bArr, int i2, zziab zziabVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zziabVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zziabVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zziabVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zziabVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zziabVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzc(byte[] bArr, int i, zziab zziabVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zziabVar.zzb = j;
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
        zziabVar.zzb = j2;
        return i3;
    }

    public static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i, zziab zziabVar) throws zzicg {
        int zza2 = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza;
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zziabVar.zzc = "";
            return zza2;
        }
        zziabVar.zzc = zzier.zze(bArr, zza2, i2);
        return zza2 + i2;
    }

    public static int zzg(byte[] bArr, int i, zziab zziabVar) throws zzicg {
        int zza2 = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza;
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zziabVar.zzc = zzian.zza;
            return zza2;
        }
        zziabVar.zzc = zzian.zzs(bArr, zza2, i2);
        return zza2 + i2;
    }

    public static int zzh(zzidu zziduVar, byte[] bArr, int i, int i2, zziab zziabVar) throws IOException {
        Object zza2 = zziduVar.zza();
        int zzj = zzj(zza2, zziduVar, bArr, i, i2, zziabVar);
        zziduVar.zzk(zza2);
        zziabVar.zzc = zza2;
        return zzj;
    }

    public static int zzi(zzidu zziduVar, byte[] bArr, int i, int i2, int i3, zziab zziabVar) throws IOException {
        Object zza2 = zziduVar.zza();
        int zzk = zzk(zza2, zziduVar, bArr, i, i2, i3, zziabVar);
        zziduVar.zzk(zza2);
        zziabVar.zzc = zza2;
        return zzk;
    }

    public static int zzj(Object obj, zzidu zziduVar, byte[] bArr, int i, int i2, zziab zziabVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zziabVar);
            i4 = zziabVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zziabVar.zze + 1;
        zziabVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zziduVar.zzj(obj, bArr, i5, i7, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return i7;
    }

    public static int zzk(Object obj, zzidu zziduVar, byte[] bArr, int i, int i2, int i3, zziab zziabVar) throws IOException {
        zzidf zzidfVar = (zzidf) zziduVar;
        int i4 = zziabVar.zze + 1;
        zziabVar.zze = i4;
        zzq(i4);
        int zzi = zzidfVar.zzi(obj, bArr, i, i2, i3, zziabVar);
        zziabVar.zze--;
        zziabVar.zzc = obj;
        return zzi;
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzicd zzicdVar, zziab zziabVar) {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int zza2 = zza(bArr, i2, zziabVar);
        zzibsVar.zzi(zziabVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zziabVar);
            if (i != zziabVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        return zza2;
    }

    public static int zzm(byte[] bArr, int i, zzicd zzicdVar, zziab zziabVar) throws IOException {
        zzibs zzibsVar = (zzibs) zzicdVar;
        int zza2 = zza(bArr, i, zziabVar);
        int i2 = zziabVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zziabVar);
            zzibsVar.zzi(zziabVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzidu zziduVar, int i, byte[] bArr, int i2, int i3, zzicd zzicdVar, zziab zziabVar) throws IOException {
        int zzh = zzh(zziduVar, bArr, i2, i3, zziabVar);
        zzicdVar.add(zziabVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zziabVar);
            if (i != zziabVar.zza) {
                break;
            }
            zzh = zzh(zziduVar, bArr, zza2, i3, zziabVar);
            zzicdVar.add(zziabVar.zzc);
        }
        return zzh;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzieg zziegVar, zziab zziabVar) throws zzicg {
        if ((i >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zziabVar);
            zziegVar.zzk(i, Long.valueOf(zziabVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zziegVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zziabVar);
            int i5 = zziabVar.zza;
            if (i5 < 0) {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zziegVar.zzk(i, zzian.zza);
            } else {
                zziegVar.zzk(i, zzian.zzs(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzicg("Protocol message contained an invalid tag (zero).");
            }
            zziegVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzieg zzb2 = zzieg.zzb();
        int i7 = zziabVar.zze + 1;
        zziabVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zziabVar);
            i8 = zziabVar.zza;
            if (i8 == i6) {
                i2 = zza3;
                break;
            }
            i2 = zzo(i8, bArr, zza3, i3, zzb2, zziabVar);
        }
        zziabVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzicg("Failed to parse the message.");
        }
        zziegVar.zzk(i, zzb2);
        return i2;
    }

    public static int zzp(int i, byte[] bArr, int i2, int i3, zziab zziabVar) throws zzicg {
        if ((i >>> 3) == 0) {
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zziabVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zziabVar) + zziabVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzicg("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zziabVar);
            i6 = zziabVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zziabVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zzicg("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzicg {
        if (i >= zzb) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
