package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzakh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x057f A[PHI: r17
      0x057f: PHI (r17v9 int) = (r17v6 int), (r17v6 int), (r17v10 int) binds: [B:571:0x0558, B:573:0x0561, B:552:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzfu r82, com.google.android.gms.internal.ads.zzafn r83, long r84, com.google.android.gms.internal.ads.zzq r86, boolean r87, boolean r88, com.google.android.gms.internal.ads.zzgqt r89, boolean r90) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 4113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzb(com.google.android.gms.internal.ads.zzfu, com.google.android.gms.internal.ads.zzafn, long, com.google.android.gms.internal.ads.zzq, boolean, boolean, com.google.android.gms.internal.ads.zzgqt, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzap zzc(com.google.android.gms.internal.ads.zzfv r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzc(com.google.android.gms.internal.ads.zzfv):com.google.android.gms.internal.ads.zzap");
    }

    public static zzfy zzd(zzer zzerVar) {
        long zzD;
        long zzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            zzD = zzerVar.zzz();
            zzD2 = zzerVar.zzz();
        } else {
            zzD = zzerVar.zzD();
            zzD2 = zzerVar.zzD();
        }
        return new zzfy(zzD, zzD2, zzerVar.zzz());
    }

    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzc = zzfuVar.zzc(1751411826);
        zzfv zzc2 = zzfuVar.zzc(1801812339);
        zzfv zzc3 = zzfuVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzi(zzc.zza) == 1835299937) {
            zzer zzerVar = zzc2.zza;
            zzerVar.zzh(12);
            int zzB = zzerVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i] = zzerVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int zzg = zzerVar2.zzg() + zzerVar2.zzB();
                int zzB3 = zzerVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzee.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzerVar2.zzg();
                        if (zzg2 >= zzg) {
                            zzfsVar = null;
                            break;
                        }
                        int zzB4 = zzerVar2.zzB();
                        if (zzerVar2.zzB() == 1684108385) {
                            int zzB5 = zzerVar2.zzB();
                            int zzB6 = zzerVar2.zzB();
                            int i2 = zzB4 - 16;
                            byte[] bArr = new byte[i2];
                            zzerVar2.zzm(bArr, 0, i2);
                            zzfsVar = new zzfs(str, bArr, zzB6, zzB5);
                            break;
                        }
                        zzerVar2.zzh(zzg2 + zzB4);
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                }
                zzerVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int zzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzerVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0113  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzalf zzg(com.google.android.gms.internal.ads.zzalc r42, com.google.android.gms.internal.ads.zzfu r43, com.google.android.gms.internal.ads.zzafn r44, boolean r45) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzg(com.google.android.gms.internal.ads.zzalc, com.google.android.gms.internal.ads.zzfu, com.google.android.gms.internal.ads.zzafn, boolean):com.google.android.gms.internal.ads.zzalf");
    }

    private static zzap zzh(zzer zzerVar) {
        short zzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String zzK = zzerVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzgrc.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzgxz.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfj.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", new Object[]{Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))}));
        }
        String zzd = zzgqw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzi zzk(com.google.android.gms.internal.ads.zzer r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzk(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzi");
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(zzi, zzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int zzj = zzeqVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzeqVar.zzo(1);
            int zzj2 = zzeqVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzeqVar.zzh(6);
                boolean zzi2 = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int zzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzeqVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzeqVar.zzj(8);
                    int zzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zzi3 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfu zzfuVar) {
        zzfv zzc = zzfuVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        zzer zzerVar = zzc.zza;
        zzerVar.zzh(8);
        int zza2 = zza(zzerVar.zzB());
        int zzH = zzerVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i = 0; i < zzH; i++) {
            jArr[i] = zza2 == 1 ? zzerVar.zzJ() : zzerVar.zzz();
            jArr2[i] = zza2 == 1 ? zzerVar.zzD() : zzerVar.zzB();
            if (zzerVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzerVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzo(com.google.android.gms.internal.ads.zzer r38, int r39, int r40, int r41, int r42, java.lang.String r43, boolean r44, com.google.android.gms.internal.ads.zzq r45, com.google.android.gms.internal.ads.zzakd r46, int r47) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzo(com.google.android.gms.internal.ads.zzer, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzq, com.google.android.gms.internal.ads.zzakd, int):void");
    }

    private static zzajy zzp(zzer zzerVar, int i) {
        zzerVar.zzh(i + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int zzs = zzerVar.zzs();
        if ((zzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String zze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new zzajy(zze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long zzz = zzerVar.zzz();
        long zzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int zzs2 = zzs(zzerVar);
        byte[] bArr = new byte[zzs2];
        zzerVar.zzm(bArr, 0, zzs2);
        return new zzajy(zze, bArr, zzz2 <= 0 ? -1L : zzz2, zzz > 0 ? zzz : -1L);
    }

    private static zzajw zzq(zzer zzerVar, int i) {
        zzerVar.zzh(i + 8);
        zzerVar.zzk(4);
        return new zzajw(zzerVar.zzz(), zzerVar.zzz());
    }

    private static Pair zzr(zzer zzerVar, int i, int i2) throws zzat {
        Integer num;
        zzald zzaldVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzg = zzerVar.zzg();
        while (zzg - i < i2) {
            zzerVar.zzh(zzg);
            int zzB = zzerVar.zzB();
            zzaey.zza(zzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzg < zzB) {
                    zzerVar.zzh(i5);
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    if (zzB3 == 1718775137) {
                        num2 = Integer.valueOf(zzerVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        str = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaey.zza(num2 != null, "frma atom is mandatory");
                    zzaey.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzaldVar = null;
                            break;
                        }
                        zzerVar.zzh(i8);
                        int zzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int zza2 = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (zza2 == 0) {
                                zzerVar.zzk(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzs = zzerVar.zzs();
                                int i9 = (zzs & 240) >> 4;
                                i3 = zzs & 15;
                                i4 = i9;
                            }
                            boolean z = zzerVar.zzs() == 1;
                            int zzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzerVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaldVar = new zzald(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzaey.zza(zzaldVar != null, "tenc atom is mandatory");
                    String str2 = zzfj.zza;
                    create = Pair.create(num, zzaldVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzs(zzer zzerVar) {
        int zzs = zzerVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzerVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
