package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzkt zzktVar) throws zznn {
        int zzi = zzi(bArr, i, zzktVar);
        int i2 = zzktVar.zza;
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzktVar.zzc = zzle.zzb;
            return zzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, zzi, i2);
        return zzi + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i, int i2, int i3, zzkt zzktVar) throws IOException {
        Object zze = zzowVar.zze();
        int zzm = zzm(zze, zzowVar, bArr, i, i2, i3, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        Object zze = zzowVar.zze();
        int zzn = zzn(zze, zzowVar, bArr, i, i2, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzowVar, int i, byte[] bArr, int i2, int i3, zznk zznkVar, zzkt zzktVar) throws IOException {
        int zzd = zzd(zzowVar, bArr, i2, i3, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (zzd < i3) {
            int zzi = zzi(bArr, zzd, zzktVar);
            if (i != zzktVar.zza) {
                break;
            }
            zzd = zzd(zzowVar, bArr, zzi, i3, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zznk zznkVar, zzkt zzktVar) throws IOException {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i, zzktVar);
        int i2 = zzktVar.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i, zzkt zzktVar) throws zznn {
        int zzi = zzi(bArr, i, zzktVar);
        int i2 = zzktVar.zza;
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzktVar.zzc = "";
            return zzi;
        }
        zzktVar.zzc = new String(bArr, zzi, i2, zznl.zza);
        return zzi + i2;
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzpm zzpmVar, zzkt zzktVar) throws zznn {
        if ((i >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzl = zzl(bArr, i2, zzktVar);
            zzpmVar.zzj(i, Long.valueOf(zzktVar.zzb));
            return zzl;
        }
        if (i4 == 1) {
            zzpmVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzi = zzi(bArr, i2, zzktVar);
            int i5 = zzktVar.zza;
            if (i5 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzpmVar.zzj(i, zzle.zzb);
            } else {
                zzpmVar.zzj(i, zzle.zzk(bArr, zzi, i5));
            }
            return zzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzpm zzf = zzpm.zzf();
        int i7 = zzktVar.zze + 1;
        zzktVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzi2 = zzi(bArr, i2, zzktVar);
            i8 = zzktVar.zza;
            if (i8 == i6) {
                i2 = zzi2;
                break;
            }
            i2 = zzh(i8, bArr, zzi2, i3, zzf, zzktVar);
        }
        zzktVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i, zzf);
        return i2;
    }

    public static int zzi(byte[] bArr, int i, zzkt zzktVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzktVar);
        }
        zzktVar.zza = b;
        return i2;
    }

    public static int zzj(int i, byte[] bArr, int i2, zzkt zzktVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzktVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzktVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzktVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzktVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzktVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i2, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (zzi < i3) {
            int zzi2 = zzi(bArr, zzi, zzktVar);
            if (i != zzktVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i, zzkt zzktVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzktVar.zzb = j;
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
        zzktVar.zzb = j2;
        return i3;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i, int i2, int i3, zzkt zzktVar) throws IOException {
        zzol zzolVar = (zzol) zzowVar;
        int i4 = zzktVar.zze + 1;
        zzktVar.zze = i4;
        zzq(i4);
        int zzc = zzolVar.zzc(obj, bArr, i, i2, i3, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzj(i4, bArr, i3, zzktVar);
            i4 = zzktVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzktVar.zze + 1;
        zzktVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zzowVar.zzi(obj, bArr, i5, i7, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i7;
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zzkt zzktVar) throws zznn {
        if ((i >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzktVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzktVar) + zzktVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzktVar);
            i6 = zzktVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzktVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new zznn("Failed to parse the message.");
        }
        return i2;
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzq(int i) throws zznn {
        if (i >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
