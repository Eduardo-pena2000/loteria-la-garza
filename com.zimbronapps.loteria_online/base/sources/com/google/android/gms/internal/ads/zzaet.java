package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaet {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static zzv zzb(byte[] bArr, String str, String str2, int i, String str3, zzq zzqVar) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(60);
        int i2 = zzb[zzi2.zzj(6)];
        int i3 = zzc[zzi2.zzj(4)];
        int zzj2 = zzi2.zzj(5);
        int i4 = zzj2 >= 29 ? -1 : (zzd[zzj2] * 1000) / 2;
        zzi2.zzh(10);
        int i5 = i2 + (zzi2.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i4);
        zztVar.zzE(i5);
        zztVar.zzF(i3);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i);
        return zztVar.zzM();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzc(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zzc(byte[]):int");
    }

    public static zzaes zzd(byte[] bArr) throws zzat {
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(40);
        int zzj2 = zzi2.zzj(2);
        boolean zzi3 = zzi2.zzi();
        int i5 = true != zzi3 ? 16 : 20;
        zzi2.zzh(true != zzi3 ? 8 : 12);
        int zzj3 = zzi2.zzj(i5) + 1;
        boolean zzi4 = zzi2.zzi();
        int i6 = 0;
        if (zzi4) {
            i = zzi2.zzj(2);
            int zzj4 = zzi2.zzj(3) + 1;
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            int zzj5 = zzi2.zzj(3) + 1;
            int zzj6 = zzi2.zzj(3) + 1;
            if (zzj5 != 1 || zzj6 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i7 = zzj2 + 1;
            int zzj7 = zzi2.zzj(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                if (((zzj7 >> i8) & 1) == 1) {
                    zzi2.zzh(8);
                }
            }
            int i9 = zzj4 * 512;
            if (zzi2.zzi()) {
                zzi2.zzh(2);
                int zzj8 = (zzi2.zzj(2) + 1) << 2;
                int zzj9 = zzi2.zzj(2) + 1;
                while (i6 < zzj9) {
                    zzi2.zzh(zzj8);
                    i6++;
                }
            }
            i6 = i9;
        } else {
            i = -1;
        }
        zzi2.zzh(i5);
        zzi2.zzh(12);
        if (zzi4) {
            if (zzi2.zzi()) {
                zzi2.zzh(4);
            }
            if (zzi2.zzi()) {
                zzi2.zzh(24);
            }
            if (zzi2.zzi()) {
                zzi2.zzo(zzi2.zzj(10) + 1);
            }
            zzi2.zzh(5);
            int i10 = zze[zzi2.zzj(4)];
            i3 = zzi2.zzj(8) + 1;
            i2 = i10;
        } else {
            i2 = -2147483647;
            i3 = -1;
        }
        if (zzi4) {
            if (i == 0) {
                i4 = 32000;
            } else if (i == 1) {
                i4 = 44100;
            } else {
                if (i != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(i);
                    throw zzat.zzb(sb.toString(), null);
                }
                i4 = 48000;
            }
            j = zzfj.zzt(i6, 1000000L, i4, RoundingMode.DOWN);
        } else {
            j = -9223372036854775807L;
        }
        return new zzaes("audio/vnd.dts.hd;profile=lbr", i3, i2, zzj3, j, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(42);
        return zzi2.zzj(true != zzi2.zzi() ? 8 : 12) + 1;
    }

    public static zzaes zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long j;
        int i;
        int i2;
        int i3;
        zzeq zzi2 = zzi(bArr);
        int zzj2 = zzi2.zzj(32);
        int zzh2 = zzh(zzi2, zzf, true);
        int i4 = zzh2 + 1;
        char c = zzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            j = -9223372036854775807L;
            i = -2147483647;
        } else {
            if (!zzi2.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i5 = zzh2 - 1;
            if (((bArr[zzh2] & 255) | ((char) (bArr[i5] << 8))) != zzfj.zzH(bArr, 0, i5, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int zzj3 = zzi2.zzj(2);
            if (zzj3 == 0) {
                i2 = 512;
            } else if (zzj3 == 1) {
                i2 = 480;
            } else {
                if (zzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(zzj3);
                    throw zzat.zzb(sb.toString(), null);
                }
                i2 = 384;
            }
            int zzj4 = zzi2.zzj(3) + 1;
            int zzj5 = zzi2.zzj(2);
            if (zzj5 == 0) {
                i3 = 32000;
            } else if (zzj5 == 1) {
                i3 = 44100;
            } else {
                if (zzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(zzj5);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i3 = 48000;
            }
            if (zzi2.zzi()) {
                zzi2.zzh(36);
            }
            i = (1 << zzi2.zzj(2)) * i3;
            j = zzfj.zzt(i2 * zzj4, 1000000L, i3, RoundingMode.DOWN);
        }
        int i6 = i;
        long j2 = j;
        int i7 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            i7 += zzh(zzi2, zzg, true);
        }
        for (int i8 = 0; i8 <= 0; i8++) {
            if (c != 0) {
                atomicInteger.set(zzh(zzi2, zzh, true));
            }
            i7 += atomicInteger.get() != 0 ? zzh(zzi2, zzi, true) : 0;
        }
        return new zzaes("audio/vnd.dts.uhd;profile=p2", 2, i6, i4 + i7, j2, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzeq zzi2 = zzi(bArr);
        zzi2.zzh(32);
        return zzh(zzi2, zzj, true) + 1;
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzeqVar.zzi(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzeqVar.zzj(iArr[i]);
    }

    private static zzeq zzi(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b3 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b3;
            }
        }
        int length = copyOf.length;
        zzeq zzeqVar = new zzeq(copyOf, length);
        if (copyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(copyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(copyOf, copyOf.length);
        return zzeqVar;
    }
}
