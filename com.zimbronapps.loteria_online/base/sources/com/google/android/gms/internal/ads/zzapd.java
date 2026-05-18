package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzapd {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzeq r17, com.google.android.gms.internal.ads.zzapb r18) throws com.google.android.gms.internal.ads.zzat {
        /*
            r0 = r17
            r1 = r18
            r17.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lcd
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzgrc.zza(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = java.lang.Math.addExact(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            java.lang.Math.addExact(r14, r5)
            int r5 = r17.zzc()
            r14 = -1
            if (r5 >= r2) goto L44
        L42:
            r5 = r14
            goto L6a
        L44:
            long r5 = r0.zzk(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r5 = r17.zzc()
            if (r5 >= r3) goto L53
            goto L42
        L53:
            long r5 = r0.zzk(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.zzc()
            if (r3 >= r7) goto L63
            goto L42
        L63:
            long r5 = r0.zzk(r7)
            long r5 = r5 + r10
            goto L6a
        L69:
            r5 = r10
        L6a:
            r1.zzb = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L71
            return r4
        L71:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9e
            int r3 = r1.zza
            r5 = 0
            if (r3 == r9) goto L97
            if (r3 == r2) goto L90
            r2 = 17
            if (r3 == r2) goto L89
            goto L9e
        L89:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r5)
            throw r0
        L90:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r5)
            throw r0
        L97:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r5)
            throw r0
        L9e:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lac
            return r9
        Lac:
            return r4
        Lad:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzc(r0)
            throw r0
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapd.zza(com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzapb):boolean");
    }

    public static zzapc zzb(zzeq zzeqVar) throws zzat {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int zzj = zzeqVar.zzj(8);
        int i5 = 5;
        int zzj2 = zzeqVar.zzj(5);
        if (zzj2 != 31) {
            switch (zzj2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(zzj2);
                    throw zzat.zzc(sb.toString());
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        } else {
            i = zzeqVar.zzj(24);
        }
        int zzj3 = zzeqVar.zzj(3);
        int i6 = 1;
        if (zzj3 == 0) {
            i2 = 768;
        } else if (zzj3 == 1) {
            i2 = 1024;
        } else if (zzj3 == 2 || zzj3 == 3) {
            i2 = 2048;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(zzj3);
                throw zzat.zzc(sb2.toString());
            }
            i2 = 4096;
        }
        if (zzj3 == 0 || zzj3 == 1) {
            c = 0;
        } else if (zzj3 == 2) {
            c = 2;
        } else if (zzj3 == 3) {
            c = 3;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(zzj3);
                throw zzat.zzc(sb3.toString());
            }
            c = 1;
        }
        zzeqVar.zzh(2);
        zzc(zzeqVar);
        int zzj4 = zzeqVar.zzj(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzj4 + 1) {
                int zzj5 = zzeqVar.zzj(3);
                i8 += zzf(zzeqVar, 5, 8, 16) + 1;
                if ((zzj5 == 0 || zzj5 == 2) && zzeqVar.zzi()) {
                    zzc(zzeqVar);
                }
                i7++;
            } else {
                int zzf = zzf(zzeqVar, 4, 8, 16) + 1;
                zzeqVar.zzg();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 >= zzf) {
                        int i11 = zzj;
                        byte[] bArr = null;
                        if (zzeqVar.zzi()) {
                            int zzf2 = zzf(zzeqVar, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzf2; i12++) {
                                int zzf3 = zzf(zzeqVar, 4, 8, 16);
                                int zzf4 = zzf(zzeqVar, 4, 8, 16);
                                if (zzf3 == 7) {
                                    int zzj6 = zzeqVar.zzj(4) + 1;
                                    zzeqVar.zzh(4);
                                    byte[] bArr2 = new byte[zzj6];
                                    for (int i13 = 0; i13 < zzj6; i13++) {
                                        bArr2[i13] = (byte) zzeqVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeqVar.zzh(zzf4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i);
                                throw zzat.zzc(sb4.toString());
                        }
                        return new zzapc(i11, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                    int zzj7 = zzeqVar.zzj(2);
                    if (zzj7 == 0) {
                        i3 = zzj;
                        zzd(zzeqVar);
                        if (c > 0) {
                            zze(zzeqVar);
                        }
                    } else if (zzj7 != i6) {
                        if (zzj7 == 3) {
                            zzf(zzeqVar, 4, 8, i9);
                            int zzf5 = zzf(zzeqVar, 4, 8, i9);
                            if (zzeqVar.zzi()) {
                                zzf(zzeqVar, 8, i9, 0);
                            }
                            zzeqVar.zzg();
                            if (zzf5 > 0) {
                                zzeqVar.zzh(zzf5 * 8);
                            }
                        }
                        i3 = zzj;
                    } else {
                        if (zzd(zzeqVar)) {
                            zzeqVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzeqVar);
                            i4 = zzeqVar.zzj(2);
                            c2 = c;
                        } else {
                            i4 = 0;
                            c2 = 0;
                        }
                        if (i4 > 0) {
                            zzeqVar.zzh(6);
                            int zzj8 = zzeqVar.zzj(2);
                            zzeqVar.zzh(4);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(i5);
                            }
                            if (i4 == 2 || i4 == 3) {
                                zzeqVar.zzh(6);
                            }
                            if (zzj8 == 2) {
                                zzeqVar.zzg();
                            }
                        }
                        i3 = zzj;
                        int floor = ((int) Math.floor(Math.log(i8 - 1) / Math.log(2.0d))) + 1;
                        int zzj9 = zzeqVar.zzj(2);
                        if (zzj9 > 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(floor);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(floor);
                        }
                        if (c2 == 0 && zzj9 == 0) {
                            zzeqVar.zzg();
                        }
                    }
                    i10++;
                    zzj = i3;
                    i5 = 5;
                    i6 = 1;
                    i9 = 16;
                }
            }
        }
    }

    private static void zzc(zzeq zzeqVar) {
        int zzj;
        int zzj2 = zzeqVar.zzj(2);
        if (zzj2 == 0) {
            zzeqVar.zzh(6);
            return;
        }
        int zzf = zzf(zzeqVar, 5, 8, 16) + 1;
        if (zzj2 == 1) {
            zzeqVar.zzh(zzf * 7);
            return;
        }
        if (zzj2 == 2) {
            boolean zzi = zzeqVar.zzi();
            int i = true != zzi ? 5 : 1;
            int i2 = true == zzi ? 7 : 5;
            int i3 = true == zzi ? 8 : 6;
            int i4 = 0;
            while (i4 < zzf) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                    zzj = 0;
                } else {
                    if (zzeqVar.zzj(2) == 3 && zzeqVar.zzj(i2) * i != 0) {
                        zzeqVar.zzg();
                    }
                    zzj = zzeqVar.zzj(i3) * i;
                    if (zzj != 0 && zzj != 180) {
                        zzeqVar.zzg();
                    }
                    zzeqVar.zzg();
                }
                if (zzj != 0 && zzj != 180 && zzeqVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        boolean zzi = zzeqVar.zzi();
        if (zzi) {
            zzeqVar.zzh(13);
        }
        return zzi;
    }

    private static void zze(zzeq zzeqVar) {
        zzeqVar.zzh(3);
        zzeqVar.zzh(8);
        boolean zzi = zzeqVar.zzi();
        boolean zzi2 = zzeqVar.zzi();
        if (zzi) {
            zzeqVar.zzh(5);
        }
        if (zzi2) {
            zzeqVar.zzh(6);
        }
    }

    private static int zzf(zzeq zzeqVar, int i, int i2, int i3) {
        zzgrc.zza(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzeqVar.zzc() < i) {
            return -1;
        }
        int zzj = zzeqVar.zzj(i);
        if (zzj != i4) {
            return zzj;
        }
        if (zzeqVar.zzc() < i2) {
            return -1;
        }
        int zzj2 = zzeqVar.zzj(i2);
        int i6 = zzj + zzj2;
        if (zzj2 != i5) {
            return i6;
        }
        if (zzeqVar.zzc() < i3) {
            return -1;
        }
        return i6 + zzeqVar.zzj(i3);
    }
}
