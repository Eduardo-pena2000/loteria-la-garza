package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznk extends zznh {
    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zznf.zzaz(i);
        }
        if (i2 == 1) {
            return zznf.zzs(i, zznd.zza(bArr, j));
        }
        if (i2 == 2) {
            return zznf.zzd(i, zznd.zza(bArr, j), zznd.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005f, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zznk.zzb(int, byte[], int, int):int");
    }

    public final String zzg(byte[] bArr, int i, int i2) throws zzkq {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte zza = zznd.zza(bArr, i);
            if (!zzng.zzh(zza)) {
                break;
            }
            i++;
            zzng.zzb(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zznd.zza(bArr, i);
            if (zzng.zzh(zza2)) {
                int i7 = i5 + 1;
                zzng.zzb(zza2, cArr, i5);
                while (i6 < i3) {
                    byte zza3 = zznd.zza(bArr, i6);
                    if (!zzng.zzh(zza3)) {
                        break;
                    }
                    i6++;
                    zzng.zzb(zza3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (zzng.zzi(zza2)) {
                if (i6 >= i3) {
                    throw zzkq.zzdn();
                }
                i += 2;
                zzng.zzb(zza2, zznd.zza(bArr, i6), cArr, i5);
                i5++;
            } else if (zzng.zzj(zza2)) {
                if (i6 >= i3 - 1) {
                    throw zzkq.zzdn();
                }
                int i8 = i + 2;
                i += 3;
                zzng.zzb(zza2, zznd.zza(bArr, i6), zznd.zza(bArr, i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw zzkq.zzdn();
                }
                byte zza4 = zznd.zza(bArr, i6);
                int i9 = i + 3;
                byte zza5 = zznd.zza(bArr, i + 2);
                i += 4;
                zzng.zzb(zza2, zza4, zza5, zznd.zza(bArr, i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        int i3;
        long j2;
        long j3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zznd.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= 128 || j4 >= j5) {
                if (charAt3 >= 2048 || j4 > j5 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt4 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    j2 = 1;
                                    zznd.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    j3 = j5;
                                    zznd.zza(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = j4 + 3;
                                    zznd.zza(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    zznd.zza(bArr, j6, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new zznj(i4 - 1, length);
                        }
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                            throw new zznj(i4, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append(str2);
                        sb2.append(charAt3);
                        sb2.append(str);
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    zznd.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    zznd.zza(bArr, j4 + 1, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j4 += 3;
                    zznd.zza(bArr, j7, (byte) ((charAt3 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j8 = j4 + j;
                    zznd.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    j4 += 2;
                    zznd.zza(bArr, j8, (byte) ((charAt3 & '?') | 128));
                }
                j3 = j5;
                j2 = 1;
            } else {
                zznd.zza(bArr, j4, (byte) charAt3);
                j3 = j5;
                str2 = str4;
                j2 = j;
                j4 += j;
                str = str3;
            }
            i4++;
            str3 = str;
            str4 = str2;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }
}
