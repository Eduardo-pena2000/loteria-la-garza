package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzagc zza(zzaev zzaevVar) throws IOException {
        return zzc(zzaevVar, true, false);
    }

    public static zzagc zzb(zzaev zzaevVar, boolean z) throws IOException {
        return zzc(zzaevVar, false, z);
    }

    private static zzagc zzc(zzaev zzaevVar, boolean z, boolean z2) throws IOException {
        zzer zzerVar;
        int i;
        long j;
        zzer zzerVar2;
        int i2;
        boolean z3;
        int[] iArr;
        long zzo = zzaevVar.zzo();
        long j2 = -1;
        long j3 = 4096;
        if (zzo != -1 && zzo <= 4096) {
            j3 = zzo;
        }
        zzer zzerVar3 = new zzer(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i3) {
            zzerVar3.zza(8);
            if (!zzaevVar.zzh(zzerVar3.zzi(), i4, 8, true)) {
                break;
            }
            long zzz = zzerVar3.zzz();
            int zzB = zzerVar3.zzB();
            if (zzz == 1) {
                zzaevVar.zzi(zzerVar3.zzi(), 8, 8);
                i = 16;
                zzerVar3.zzf(16);
                zzz = zzerVar3.zzD();
                zzerVar = zzerVar3;
            } else {
                if (zzz == 0) {
                    long zzo2 = zzaevVar.zzo();
                    if (zzo2 != j2) {
                        zzz = (zzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar3;
                i = 8;
            }
            long j4 = zzz;
            long j5 = i;
            if (j4 < j5) {
                if (zzB == 1718773093) {
                    if (i == 8) {
                        zzB = 1718773093;
                        j4 = 8;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new zzajv(zzB, j4, i);
            }
            i5 += i;
            if (zzB == 1836019574) {
                i3 += (int) j4;
                if (zzo != -1 && i3 > zzo) {
                    i3 = (int) zzo;
                }
                zzerVar3 = zzerVar;
                j2 = -1;
                i4 = 0;
            } else {
                if (zzB == 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                    j = zzo;
                    zzerVar2 = zzerVar;
                    i2 = 0;
                } else {
                    if (zzB == 1836019558 || zzB == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z4 |= !(zzB != 1835295092);
                    if (zzB == 1937007212) {
                        if (j4 > 1000000) {
                            i4 = 0;
                            break;
                        }
                        zzB = 1937007212;
                    }
                    j = zzo;
                    if ((i5 + j4) - j5 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j4 - j5);
                    i5 += i6;
                    if (zzB != 1718909296) {
                        zzerVar2 = zzerVar;
                        i2 = 0;
                        if (i6 != 0) {
                            zzaevVar.zzk(i6);
                        }
                    } else {
                        if (i6 < 8) {
                            return new zzajv(1718909296, i6, 8);
                        }
                        zzerVar2 = zzerVar;
                        zzerVar2.zza(i6);
                        i2 = 0;
                        zzaevVar.zzi(zzerVar2.zzi(), 0, i6);
                        int zzB2 = zzerVar2.zzB();
                        boolean zzd = zzd(zzB2, z2) | z4;
                        zzerVar2.zzk(4);
                        int zzd2 = zzerVar2.zzd() / 4;
                        if (!zzd && zzd2 > 0) {
                            iArr = new int[zzd2];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= zzd2) {
                                    z3 = zzd;
                                    break;
                                }
                                int zzB3 = zzerVar2.zzB();
                                iArr[i7] = zzB3;
                                if (zzd(zzB3, z2)) {
                                    z3 = true;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z3 = zzd;
                            iArr = null;
                        }
                        if (!z3) {
                            return new zzalg(zzB2, iArr);
                        }
                        z4 = z3;
                    }
                }
                zzerVar3 = zzerVar2;
                i4 = i2;
                zzo = j;
                j2 = -1;
            }
        }
        if (!z4) {
            return zzakx.zza;
        }
        if (z != i4) {
            return i4 != 0 ? zzakp.zza : zzakp.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
