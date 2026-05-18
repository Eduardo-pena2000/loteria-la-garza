package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[PHI: r0
      0x00c8: PHI (r0v84 int) = (r0v48 int), (r0v44 int) binds: [B:203:0x01e2, B:41:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzer r18, java.lang.String r19, java.lang.String r20, com.google.android.gms.internal.ads.zzq r21) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zza(com.google.android.gms.internal.ads.zzer, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzadx zzb(com.google.android.gms.internal.ads.zzeq r12) {
        /*
            r0 = 16
            int r1 = r12.zzj(r0)
            int r0 = r12.zzj(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r12.zzj(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r12.zzj(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L38
            r1 = r2
        L2c:
            int r5 = r12.zzj(r0)
            int r1 = r1 + r5
            boolean r5 = r12.zzi()
            if (r5 != 0) goto L3a
            int r1 = r1 + r4
        L38:
            r5 = r1
            goto L3e
        L3a:
            int r1 = r1 + 1
            int r1 = r1 << r0
            goto L2c
        L3e:
            r1 = 10
            int r1 = r12.zzj(r1)
            boolean r6 = r12.zzi()
            if (r6 == 0) goto L53
            int r6 = r12.zzj(r4)
            if (r6 <= 0) goto L53
            r12.zzh(r0)
        L53:
            boolean r6 = r12.zzi()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L62
            r11 = r9
            goto L63
        L62:
            r11 = r7
        L63:
            int r12 = r12.zzj(r3)
            if (r11 != r9) goto L73
            r6 = 13
            if (r12 != r6) goto L73
            int[] r12 = com.google.android.gms.internal.ads.zzady.zzb
            r12 = r12[r6]
            r9 = r12
            goto La0
        L73:
            if (r11 != r7) goto L94
            r6 = 14
            if (r12 >= r6) goto L94
            int[] r2 = com.google.android.gms.internal.ads.zzady.zzb
            r2 = r2[r12]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9b
            r7 = 11
            if (r1 == r0) goto L96
            if (r1 == r4) goto L9b
            if (r1 == r3) goto L8c
            goto L94
        L8c:
            if (r12 == r4) goto L92
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
        L92:
            int r2 = r2 + 1
        L94:
            r9 = r2
            goto La0
        L96:
            if (r12 == r6) goto L92
            if (r12 != r7) goto L94
            goto L92
        L9b:
            if (r12 == r4) goto L92
            if (r12 != r6) goto L94
            goto L92
        La0:
            com.google.android.gms.internal.ads.zzadx r12 = new com.google.android.gms.internal.ads.zzadx
            r6 = 2
            r10 = 0
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzady.zzb(com.google.android.gms.internal.ads.zzeq):com.google.android.gms.internal.ads.zzadx");
    }

    public static void zzc(int i, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] zzi = zzerVar.zzi();
        zzi[0] = -84;
        zzi[1] = 64;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i >> 16) & 255);
        zzi[5] = (byte) ((i >> 8) & 255);
        zzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int zzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int zzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzadwVar.zzb = zzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zzi = zzeqVar.zzi();
        int zzj = zzeqVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int zzj = zzeqVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", new Object[]{Integer.valueOf(zzj)}));
        }
        zzeqVar.zzh(zzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
