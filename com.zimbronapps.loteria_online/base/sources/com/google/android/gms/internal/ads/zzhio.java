package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhio {
    private static final zzhij zzb = new zzhij(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhil zzc = new zzhil(new zzhim(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        zzhil zzhilVar = new zzhil(zzc);
        zzhin zzhinVar = new zzhin();
        for (i = 1; i < 64; i += 2) {
            zzhij zzhijVar = new zzhij(zzb);
            zzk(zzhijVar, i / 2, bArr2[i]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar);
        }
        zzhim zzhimVar = new zzhim();
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        zzhim.zza(zzhimVar, zzhilVar);
        zzi(zzhilVar, zzhimVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            zzhij zzhijVar2 = new zzhij(zzb);
            zzk(zzhijVar2, i7 / 2, bArr2[i7]);
            zzhin.zza(zzhinVar, zzhilVar);
            zzg(zzhilVar, zzhinVar, zzhijVar2);
        }
        zzhim zzhimVar2 = new zzhim(zzhilVar);
        long[] jArr = new long[10];
        zzhiv.zzf(jArr, zzhimVar2.zza);
        long[] jArr2 = new long[10];
        zzhiv.zzf(jArr2, zzhimVar2.zzb);
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr3, zzhimVar2.zzc);
        long[] jArr4 = new long[10];
        zzhiv.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhiv.zzb(jArr5, jArr2, jArr);
        zzhiv.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhiv.zze(jArr6, jArr, jArr2);
        zzhiv.zze(jArr6, jArr6, zzhiq.zza);
        zzhiv.zza(jArr6, jArr6, jArr4);
        zzhiv.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhiv.zzh(jArr5), zzhiv.zzh(jArr6))) {
            return zzhimVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        char c;
        byte b;
        int i;
        byte b2;
        byte[] bArr4 = bArr2;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i2 = 31;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int i3 = copyOfRange[i2] & 255;
            int i4 = zza[i2] & 255;
            if (i3 == i4) {
                i2--;
                copyOfRange = copyOfRange;
                bArr4 = bArr2;
            } else if (i3 < i4) {
                MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long zzn = zzn(digest, 0) & 2097151;
                long zzo = zzo(digest, 2) >> 5;
                long zzn2 = zzn(digest, 5) >> 2;
                long zzo2 = zzo(digest, 7) >> 7;
                long zzo3 = zzo(digest, 10) >> 4;
                long zzn3 = zzn(digest, 13) >> 1;
                long zzo4 = zzo(digest, 15) >> 6;
                long zzn4 = zzn(digest, 18) >> 3;
                long zzn5 = zzn(digest, 21) & 2097151;
                long zzo5 = zzo(digest, 23) >> 5;
                long zzn6 = zzn(digest, 26) >> 2;
                long zzo6 = zzo(digest, 28) >> 7;
                long zzo7 = zzo(digest, 31) >> 4;
                long zzn7 = zzn(digest, 34) >> 1;
                long zzo8 = zzo(digest, 36) >> 6;
                long zzn8 = zzn(digest, 39) >> 3;
                long zzn9 = zzn(digest, 42) & 2097151;
                long zzo9 = zzo(digest, 44) >> 5;
                long zzn10 = (zzn(digest, 47) >> 2) & 2097151;
                long zzo10 = (zzo(digest, 49) >> 7) & 2097151;
                long zzo11 = (zzo(digest, 52) >> 4) & 2097151;
                long zzn11 = (zzn(digest, 55) >> 1) & 2097151;
                long zzo12 = (zzo(digest, 57) >> 6) & 2097151;
                long zzo13 = zzo(digest, 60) >> 3;
                long j = (zzo4 & 2097151) + (zzn10 * 666643);
                long j2 = (j + 1048576) >> 21;
                long j3 = j2 << 21;
                long j4 = zzn5 + (zzo11 * 666643) + (zzo10 * 470296) + (zzn10 * 654183);
                long j5 = (j4 + 1048576) >> 21;
                long j6 = j5 << 21;
                long j7 = (((((zzn6 & 2097151) + (zzo12 * 666643)) + (zzn11 * 470296)) + (zzo11 * 654183)) - (zzo10 * 997805)) + (zzn10 * 136657);
                long j8 = (j7 + 1048576) >> 21;
                long j9 = j8 << 21;
                long j10 = (((((zzo7 & 2097151) + (zzo13 * 470296)) + (zzo12 * 654183)) - (zzn11 * 997805)) + (zzo11 * 136657)) - (zzo10 * 683901);
                long j11 = (j10 + 1048576) >> 21;
                long j12 = (((zzo8 & 2097151) - (zzo13 * 997805)) + (zzo12 * 136657)) - (zzn11 * 683901);
                long j13 = (j12 + 1048576) >> 21;
                long j14 = zzn9 - (zzo13 * 683901);
                long j15 = (j14 + 1048576) >> 21;
                long j16 = zzn4 + (zzo10 * 666643) + (zzn10 * 470296) + j2;
                long j17 = (j16 + 1048576) >> 21;
                long j18 = j17 << 21;
                long j19 = (((((zzo5 & 2097151) + (zzn11 * 666643)) + (zzo11 * 470296)) + (zzo10 * 654183)) - (zzn10 * 997805)) + j5;
                long j20 = (j19 + 1048576) >> 21;
                long j21 = j20 << 21;
                long j22 = (((((((zzo6 & 2097151) + (zzo13 * 666643)) + (zzo12 * 470296)) + (zzn11 * 654183)) - (zzo11 * 997805)) + (zzo10 * 136657)) - (zzn10 * 683901)) + j8;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((((zzn7 & 2097151) + (zzo13 * 654183)) - (zzo12 * 997805)) + (zzn11 * 136657)) - (zzo11 * 683901)) + j11;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = ((zzn8 + (zzo13 * 136657)) - (zzo12 * 683901)) + j13;
                long j28 = (j27 + 1048576) >> 21;
                long j29 = (j10 - (j11 << 21)) + j23;
                long j30 = zzn + (j29 * 666643);
                long j31 = (j30 + 1048576) >> 21;
                long j32 = j31 << 21;
                long j33 = (j12 - (j13 << 21)) + j26;
                long j34 = j25 - (j26 << 21);
                long j35 = (zzn2 & 2097151) + (j33 * 666643) + (j34 * 470296) + (j29 * 654183);
                long j36 = (j35 + 1048576) >> 21;
                long j37 = j36 << 21;
                long j38 = (j14 - (j15 << 21)) + j28;
                long j39 = j27 - (j28 << 21);
                long j40 = (((((zzo3 & 2097151) + (j38 * 666643)) + (j39 * 470296)) + (j33 * 654183)) - (j34 * 997805)) + (j29 * 136657);
                long j41 = (j40 + 1048576) >> 21;
                long j42 = j41 << 21;
                long j43 = (zzo9 & 2097151) + j15;
                long j44 = (((((j - j3) + (j43 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j33 * 136657)) - (j34 * 683901);
                long j45 = (j44 + 1048576) >> 21;
                long j46 = j45 << 21;
                long j47 = ((((j4 - j6) + j17) - (j43 * 997805)) + (j38 * 136657)) - (j39 * 683901);
                long j48 = (j47 + 1048576) >> 21;
                long j49 = j48 << 21;
                long j50 = ((j7 - j9) + j20) - (j43 * 683901);
                long j51 = (j50 + 1048576) >> 21;
                long j52 = (zzo & 2097151) + (j34 * 666643) + (j29 * 470296) + j31;
                long j53 = (j52 + 1048576) >> 21;
                long j54 = (((((zzo2 & 2097151) + (j39 * 666643)) + (j33 * 470296)) + (j34 * 654183)) - (j29 * 997805)) + j36;
                long j55 = (j54 + 1048576) >> 21;
                long j56 = (((((((zzn3 & 2097151) + (j43 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j33 * 997805)) + (j34 * 136657)) - (j29 * 683901)) + j41;
                long j57 = (j56 + 1048576) >> 21;
                long j58 = (((((j16 - j18) + (j43 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j33 * 683901)) + j45;
                long j59 = (j58 + 1048576) >> 21;
                long j60 = (((j19 - j21) + (j43 * 136657)) - (j38 * 683901)) + j48;
                long j61 = (j60 + 1048576) >> 21;
                long j62 = (j22 - j24) + j51;
                long j63 = (j62 + 1048576) >> 21;
                long j64 = j63 << 21;
                long j65 = (j30 - j32) + (j63 * 666643);
                long j66 = j65 >> 21;
                long j67 = j66 << 21;
                long j68 = (j52 - (j53 << 21)) + (j63 * 470296) + j66;
                long j69 = j68 >> 21;
                long j70 = j69 << 21;
                long j71 = (j35 - j37) + j53 + (j63 * 654183) + j69;
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = ((j54 - (j55 << 21)) - (j63 * 997805)) + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j40 - j42) + j55 + (j63 * 136657) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = ((j56 - (j57 << 21)) - (j63 * 683901)) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j44 - j46) + j57 + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j58 - (j59 << 21)) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j47 - j49) + j59 + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j60 - (j61 << 21)) + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j50 - (j51 << 21)) + j61 + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j62 - j64) + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j65 - j67) + (666643 * j99);
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j68 - j70) + (470296 * j99) + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + (654183 * j99) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = ((j74 - j76) - (997805 * j99)) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (136657 * j99) + j111;
                long j114 = j113 >> 21;
                long j115 = ((j80 - j82) - (j99 * 683901)) + j114;
                long j116 = j115 >> 21;
                long j117 = j116 << 21;
                long j118 = (j83 - j85) + j116;
                long j119 = j118 >> 21;
                long j120 = j119 << 21;
                long j121 = (j86 - j88) + j119;
                long j122 = j121 >> 21;
                long j123 = j122 << 21;
                long j124 = (j89 - j91) + j122;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                digest[0] = (byte) (j101 - j103);
                long j132 = j121 - j123;
                long j133 = j118 - j120;
                long j134 = j115 - j117;
                long j135 = j113 - (j114 << 21);
                long j136 = j110 - j112;
                long j137 = j107 - j109;
                long j138 = j104 - j106;
                digest[1] = (byte) (r8 >> 8);
                digest[2] = (byte) ((r8 >> 16) | (j138 << 5));
                digest[3] = (byte) (j138 >> 3);
                digest[4] = (byte) (j138 >> 11);
                digest[5] = (byte) ((j138 >> 19) | (j137 << 2));
                digest[6] = (byte) (j137 >> 6);
                digest[7] = (byte) ((j137 >> 14) | (j136 << 7));
                digest[8] = (byte) (j136 >> 1);
                digest[9] = (byte) (j136 >> 9);
                digest[10] = (byte) ((j136 >> 17) | (j135 << 4));
                digest[11] = (byte) (j135 >> 4);
                digest[12] = (byte) (j135 >> 12);
                digest[13] = (byte) ((j135 >> 20) | (j134 + j134));
                digest[14] = (byte) (j134 >> 7);
                digest[15] = (byte) ((j134 >> 15) | (j133 << 6));
                digest[16] = (byte) (j133 >> 2);
                digest[17] = (byte) (j133 >> 10);
                digest[18] = (byte) ((j133 >> 18) | (j132 << 3));
                long j139 = j130 - (j131 << 21);
                long j140 = (j98 - j100) + j131;
                long j141 = j127 - j129;
                digest[19] = (byte) (j132 >> 5);
                digest[20] = (byte) (j132 >> 13);
                digest[21] = (byte) (j124 - j126);
                digest[22] = (byte) (r6 >> 8);
                digest[23] = (byte) ((r6 >> 16) | (j141 << 5));
                digest[24] = (byte) (j141 >> 3);
                digest[25] = (byte) (j141 >> 11);
                digest[26] = (byte) ((j141 >> 19) | (j139 << 2));
                digest[27] = (byte) (j139 >> 6);
                digest[28] = (byte) ((j139 >> 14) | (j140 << 7));
                digest[29] = (byte) (j140 >> 1);
                digest[30] = (byte) (j140 >> 9);
                digest[31] = (byte) (j140 >> 17);
                long[] jArr = new long[10];
                long[] zzg = zzhiv.zzg(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhiv.zzf(jArr4, zzg);
                zzhiv.zze(jArr5, jArr4, zzhiq.zza);
                zzhiv.zzb(jArr4, jArr4, jArr2);
                zzhiv.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhiv.zzf(jArr8, jArr5);
                zzhiv.zze(jArr8, jArr8, jArr5);
                zzhiv.zzf(jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr5);
                zzhiv.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhiv.zzf(jArr9, jArr);
                zzhiv.zzf(jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr10);
                zzhiv.zze(jArr10, jArr, jArr10);
                zzhiv.zze(jArr9, jArr9, jArr10);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                byte[] bArr5 = copyOfRange;
                for (int i5 = 1; i5 < 5; i5++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i6 = 1; i6 < 10; i6++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i7 = 1; i7 < 20; i7++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i8 = 1; i8 < 10; i8++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr10, jArr9);
                for (int i9 = 1; i9 < 50; i9++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr10, jArr10, jArr9);
                zzhiv.zzf(jArr11, jArr10);
                for (int i10 = 1; i10 < 100; i10++) {
                    zzhiv.zzf(jArr11, jArr11);
                }
                zzhiv.zze(jArr10, jArr11, jArr10);
                zzhiv.zzf(jArr10, jArr10);
                for (int i11 = 1; i11 < 50; i11++) {
                    zzhiv.zzf(jArr10, jArr10);
                }
                zzhiv.zze(jArr9, jArr10, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zzf(jArr9, jArr9);
                zzhiv.zze(jArr, jArr9, jArr);
                zzhiv.zze(jArr, jArr, jArr8);
                zzhiv.zze(jArr, jArr, jArr4);
                zzhiv.zzf(jArr6, jArr);
                zzhiv.zze(jArr6, jArr6, jArr5);
                zzhiv.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhiv.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhiv.zze(jArr, jArr, zzhiq.zzc);
                }
                if (zze(jArr)) {
                    c = 31;
                    b = 255;
                    i = 7;
                } else {
                    c = 31;
                    b = 255;
                    i = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[c] & b) >> i)) {
                    zzm(jArr, jArr);
                }
                zzhiv.zze(jArr3, jArr, zzg);
                zzhin zzhinVar = new zzhin(new zzhim(jArr, zzg, jArr2), jArr3);
                zzhik[] zzhikVarArr = new zzhik[8];
                zzhikVarArr[0] = new zzhik(zzhinVar);
                zzhil zzhilVar = new zzhil(new zzhim(), new long[10]);
                zzi(zzhilVar, zzhinVar.zza);
                zzhin zzhinVar2 = new zzhin(zzhilVar);
                for (int i12 = 1; i12 < 8; i12++) {
                    zzg(zzhilVar, zzhinVar2, zzhikVarArr[i12 - 1]);
                    zzhikVarArr[i12] = new zzhik(new zzhin(zzhilVar));
                }
                byte[] zzl = zzl(digest);
                byte[] zzl2 = zzl(bArr5);
                zzhil zzhilVar2 = new zzhil(zzc);
                zzhin zzhinVar3 = new zzhin();
                int i13 = b;
                while (i13 >= 0 && zzl[i13] == 0 && zzl2[i13] == 0) {
                    i13--;
                }
                while (i13 >= 0) {
                    zzi(zzhilVar2, new zzhim(zzhilVar2));
                    byte b3 = zzl[i13];
                    if (b3 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        b2 = 2;
                        zzg(zzhilVar2, zzhinVar3, zzhikVarArr[zzl[i13] / 2]);
                    } else {
                        b2 = 2;
                        if (b3 < 0) {
                            zzhin.zza(zzhinVar3, zzhilVar2);
                            zzh(zzhilVar2, zzhinVar3, zzhikVarArr[(-zzl[i13]) / 2]);
                        }
                    }
                    byte b4 = zzl2[i13];
                    if (b4 > 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzg(zzhilVar2, zzhinVar3, zzhiq.zze[zzl2[i13] / b2]);
                    } else if (b4 < 0) {
                        zzhin.zza(zzhinVar3, zzhilVar2);
                        zzh(zzhilVar2, zzhinVar3, zzhiq.zze[(-zzl2[i13]) / b2]);
                    }
                    i13--;
                }
                byte[] zzb2 = new zzhim(zzhilVar2).zzb();
                for (int i14 = 0; i14 < 32; i14++) {
                    if (zzb2[i14] != bArr2[i14]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void zzd() {
        if (zzhiq.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhiv.zzd(jArr2);
        byte[] zzh = zzhiv.zzh(jArr2);
        for (int i = 0; i < 32; i++) {
            if (zzh[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhiv.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zzb);
        long[] jArr6 = zzhijVar.zza;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zza(jArr7, jArr, jArr8);
        zzhiv.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhil zzhilVar, zzhin zzhinVar, zzhij zzhijVar) {
        zzhim zzhimVar = zzhinVar.zza;
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhimVar2.zza;
        long[] jArr3 = zzhimVar.zzb;
        long[] jArr4 = zzhimVar.zza;
        zzhiv.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhimVar2.zzb;
        zzhiv.zzb(jArr5, jArr3, jArr4);
        zzhiv.zze(jArr5, jArr5, zzhijVar.zza);
        long[] jArr6 = zzhijVar.zzb;
        long[] jArr7 = zzhimVar2.zzc;
        zzhiv.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhilVar.zzb;
        zzhiv.zze(jArr8, zzhinVar.zzb, zzhijVar.zzc);
        zzhijVar.zza(jArr2, zzhimVar.zzc);
        zzhiv.zza(jArr, jArr2, jArr2);
        zzhiv.zzb(jArr2, jArr7, jArr5);
        zzhiv.zza(jArr5, jArr7, jArr5);
        zzhiv.zzb(jArr7, jArr, jArr8);
        zzhiv.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhil zzhilVar, zzhim zzhimVar) {
        zzhim zzhimVar2 = zzhilVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = new long[10];
        zzhiv.zzf(jArr, jArr2);
        long[] jArr4 = zzhimVar2.zzc;
        long[] jArr5 = zzhimVar.zzb;
        zzhiv.zzf(jArr4, jArr5);
        long[] jArr6 = zzhilVar.zzb;
        zzhiv.zzf(jArr6, zzhimVar.zzc);
        zzhiv.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhimVar2.zzb;
        zzhiv.zza(jArr7, jArr2, jArr5);
        zzhiv.zzf(jArr3, jArr7);
        zzhiv.zza(jArr7, jArr4, jArr);
        zzhiv.zzb(jArr4, jArr4, jArr);
        zzhiv.zzb(jArr, jArr3, jArr7);
        zzhiv.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void zzk(zzhij zzhijVar, int i, byte b) {
        zzhij[][] zzhijVarArr = zzhiq.zzd;
        int i2 = (b & 255) >> 7;
        int i3 = (-i2) & b;
        int i4 = b - (i3 + i3);
        zzhijVar.zzb(zzhijVarArr[i][0], zzj(i4, 1));
        zzhijVar.zzb(zzhijVarArr[i][1], zzj(i4, 2));
        zzhijVar.zzb(zzhijVarArr[i][2], zzj(i4, 3));
        zzhijVar.zzb(zzhijVarArr[i][3], zzj(i4, 4));
        zzhijVar.zzb(zzhijVarArr[i][4], zzj(i4, 5));
        zzhijVar.zzb(zzhijVarArr[i][5], zzj(i4, 6));
        zzhijVar.zzb(zzhijVarArr[i][6], zzj(i4, 7));
        zzhijVar.zzb(zzhijVarArr[i][7], zzj(i4, 8));
        long[] jArr = zzhijVar.zzc;
        long[] jArr2 = zzhijVar.zza;
        long[] copyOf = Arrays.copyOf(zzhijVar.zzb, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        zzm(copyOf3, copyOf3);
        zzhijVar.zzb(new zzhij(copyOf, copyOf2, copyOf3), i2);
    }

    private static byte[] zzl(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b2 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    private static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long zzo(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | zzn(bArr, i);
    }
}
