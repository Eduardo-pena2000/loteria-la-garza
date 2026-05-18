package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzakk.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x002a, code lost:
    
        r7 = zzn(r9.zzb);
        r8 = r9.zzd(1836475768);
        r8.getClass();
        r15 = new android.util.SparseArray();
        r8 = r8.zzb;
        r10 = r8.size();
        r14 = r2;
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x004b, code lost:
    
        if (r14 >= r10) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x004d, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzfv) r8.get(r14);
        r5 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x005a, code lost:
    
        if (r5 != 1953654136) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x005c, code lost:
    
        r1 = r1.zza;
        r1.zzh(r11);
        r1 = android.util.Pair.create(java.lang.Integer.valueOf(r1.zzB()), new com.google.android.gms.internal.ads.zzaki(r1.zzB() - 1, r1.zzB(), r1.zzB(), r1.zzB()));
        r15.put(((java.lang.Integer) r1.first).intValue(), (com.google.android.gms.internal.ads.zzaki) r1.second);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b4, code lost:
    
        r14 = r14 + r6;
        r11 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0097, code lost:
    
        if (r5 != 1835362404) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0099, code lost:
    
        r1 = r1.zza;
        r1.zzh(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00a6, code lost:
    
        if (com.google.android.gms.internal.ads.zzakh.zza(r1.zzB()) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00a8, code lost:
    
        r4 = r1.zzz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00ac, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00af, code lost:
    
        r4 = r1.zzJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00b8, code lost:
    
        r1 = r9.zzd(1835365473);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00bf, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00c1, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzakh.zze(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00c7, code lost:
    
        r4 = new com.google.android.gms.internal.ads.zzafn();
        r5 = r9.zzc(1969517665);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00d3, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00d5, code lost:
    
        r14 = com.google.android.gms.internal.ads.zzakh.zzc(r5);
        r4.zza(r14);
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00df, code lost:
    
        r10 = r9.zzc(1836476516);
        r10.getClass();
        r11 = new com.google.android.gms.internal.ads.zzao[r6];
        r11[r2] = com.google.android.gms.internal.ads.zzakh.zzd(r10.zza);
        r8 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0102, code lost:
    
        if ((r0.zzd & 16) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0104, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0107, code lost:
    
        r7 = r15;
        r9 = com.google.android.gms.internal.ads.zzakh.zzb(r9, r4, r16, r7, r14, false, new com.google.android.gms.internal.ads.zzakj(r0), false);
        r10 = r9.size();
        r11 = r0.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0129, code lost:
    
        if (r11.size() != 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x01a0, code lost:
    
        if (r11.size() != r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x01a2, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x01a5, code lost:
    
        com.google.android.gms.internal.ads.zzgrc.zzi(r1);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x01a9, code lost:
    
        if (r1 >= r10) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x01ab, code lost:
    
        r4 = (com.google.android.gms.internal.ads.zzalf) r9.get(r1);
        r5 = r4.zza.zza;
        ((com.google.android.gms.internal.ads.zzakn) r11.get(r5)).zza(r4, zzo(r7, r5));
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x01a4, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x012b, code lost:
    
        r12 = com.google.android.gms.internal.ads.zzakr.zza(r9);
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0130, code lost:
    
        if (r13 >= r10) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0132, code lost:
    
        r14 = (com.google.android.gms.internal.ads.zzalf) r9.get(r13);
        r15 = r14.zza;
        r2 = r0.zzI;
        r3 = r15.zzb;
        r2 = r2.zzu(r13, r3);
        r18 = r7;
        r6 = r15.zze;
        r2.zzN(r6);
        r20 = r9;
        r9 = r15.zzg;
        r21 = r10;
        r10 = r9.zza();
        r10.zzl(r12);
        com.google.android.gms.internal.ads.zzakq.zzb(r3, r4, r10);
        com.google.android.gms.internal.ads.zzakq.zza(r3, r1, r10, r9.zzl, r5, r8);
        r3 = r15.zza;
        r11.put(r3, new com.google.android.gms.internal.ads.zzakn(r2, r14, zzo(r18, r3), r10.zzM()));
        r0.zzA = java.lang.Math.max(r0.zzA, r6);
        r13 = r13 + 1;
        r7 = r18;
        r9 = r20;
        r10 = r21;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x018e, code lost:
    
        r0.zzI.zzv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0106, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00de, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00c6, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07e4, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07e7, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0413  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(long r57) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 2024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzj(long):void");
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i + 8);
        int zzB = zzerVar.zzB();
        int i2 = zzakh.zza;
        if ((zzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzerVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i3 = zzaleVar.zze;
        if (zzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, zzH, z);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j) throws zzat {
        long zzJ;
        long zzJ2;
        zzerVar.zzh(8);
        int zza2 = zzakh.zza(zzerVar.zzB());
        zzerVar.zzk(4);
        long zzz = zzerVar.zzz();
        if (zza2 == 0) {
            zzJ = zzerVar.zzz();
            zzJ2 = zzerVar.zzz();
        } else {
            zzJ = zzerVar.zzJ();
            zzJ2 = zzerVar.zzJ();
        }
        long j2 = zzJ;
        long j3 = j + zzJ2;
        long zzt = zzfj.zzt(j2, 1000000L, zzz, RoundingMode.DOWN);
        zzerVar.zzk(2);
        int zzt2 = zzerVar.zzt();
        int[] iArr = new int[zzt2];
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        long[] jArr3 = new long[zzt2];
        long j4 = zzt;
        int i = 0;
        long j5 = j2;
        while (i < zzt2) {
            int zzB = zzerVar.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzerVar.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + zzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i2 = zzt2;
            long zzt3 = zzfj.zzt(j6, 1000000L, zzz, RoundingMode.DOWN);
            jArr5[i] = zzt3 - jArr4[i];
            zzerVar.zzk(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr2 = jArr5;
            jArr = jArr;
            zzt2 = i2;
            jArr3 = jArr4;
            j5 = j6;
            j4 = zzt3;
        }
        return Pair.create(Long.valueOf(zzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzn(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private static final zzaki zzo(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i);
        zzakiVar.getClass();
        return zzakiVar;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zza2 = zzalb.zza(zzaevVar);
        this.zzr = zza2 != null ? zzguf.zzj(zza2) : zzguf.zzi();
        return zza2 == null;
    }

    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    public final void zzc(zzaex zzaexVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i4 < this.zzK.length) {
            zzagh zzu = this.zzI.zzu(i3, 3);
            zzu.zzz((zzv) list.get(i4));
            this.zzK[i4] = zzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x0094, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0097, code lost:
    
        if (r26.zzs != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0099, code lost:
    
        r26.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x00ad, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00af, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x00b4, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00ba, code lost:
    
        if (r2.zzf >= r2.zzi) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00bc, code lost:
    
        r27.zzf(r26.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00c5, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00c8, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00ce, code lost:
    
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00d0, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00d9, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00db, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00e8, code lost:
    
        if (r2.zzh() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00ea, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00ec, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x02cc, code lost:
    
        r26.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x02cf, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x00f5, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00f7, code lost:
    
        r26.zzD -= 8;
        r27.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x010e, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0110, code lost:
    
        r26.zzE = r2.zzi(r26.zzD, 7);
        r3 = r26.zzD;
        r8 = r26.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r26.zzE + 7;
        r26.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0135, code lost:
    
        r26.zzD += r3;
        r26.zzs = 4;
        r26.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x012c, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r26.zzD, 0);
        r26.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x013e, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x014a, code lost:
    
        if (r8 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x014c, code lost:
    
        r3 = r26.zzE;
        r5 = r26.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0150, code lost:
    
        if (r3 >= r5) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0152, code lost:
    
        r26.zzE += r6.zza(r27, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0265, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x026b, code lost:
    
        if (r26.zzG != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x026d, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0270, code lost:
    
        r20 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0276, code lost:
    
        if (r1 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0278, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x027f, code lost:
    
        r6.zze(r10, r20, r26.zzD, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x028c, code lost:
    
        r1 = r26.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0292, code lost:
    
        if (r1.isEmpty() != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0294, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r26.zzy;
        r4 = r1.zzc;
        r26.zzy = r3 - r4;
        r5 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x02a5, code lost:
    
        if (r1.zzb == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x02a7, code lost:
    
        r5 = r5 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x02a8, code lost:
    
        r1 = r26.zzJ;
        r3 = r1.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x02ac, code lost:
    
        if (r7 >= r3) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x02ae, code lost:
    
        r1[r7].zze(r5, 1, r4, r26.zzy, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x02c6, code lost:
    
        if (r2.zzh() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x02c8, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x02cb, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x027d, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x015e, code lost:
    
        r13 = r26.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[2] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0172, code lost:
    
        if (r26.zzE >= r26.zzD) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0174, code lost:
    
        r4 = r26.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0176, code lost:
    
        if (r4 != 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x017b, code lost:
    
        if (r26.zzK.length > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x017f, code lost:
    
        if (r26.zzG != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0182, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0194, code lost:
    
        r27.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01a1, code lost:
    
        if (r9 < 0) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01a3, code lost:
    
        r26.zzF = r9 - r4;
        r9 = r26.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r26.zzE += r5;
        r26.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01bb, code lost:
    
        if (r26.zzK.length <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01bd, code lost:
    
        if (r4 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01c7, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r3.zzg, r14[r5]) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01c9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01cc, code lost:
    
        r26.zzH = r7;
        r6.zzc(r13, r4);
        r26.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01d6, code lost:
    
        if (r4 <= 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01da, code lost:
    
        if (r26.zzG != false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01e2, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r4, r3.zzg) == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01e4, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x01cb, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01f7, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0184, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0191, code lost:
    
        if ((r8 + r4) <= (r26.zzD - r26.zzE)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01fa, code lost:
    
        if (r26.zzH == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01fc, code lost:
    
        r7 = r26.zzi;
        r7.zza(r4);
        r27.zzc(r7.zzi(), 0, r26.zzF);
        r6.zzc(r7, r26.zzF);
        r4 = r26.zzF;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0229, code lost:
    
        if (r5 != (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x022b, code lost:
    
        r5 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0231, code lost:
    
        if (r5.zzb() == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0233, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0242, code lost:
    
        r5 = r26.zzp;
        r5.zzc(r10, r7);
        r9 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x024d, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x024f, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0259, code lost:
    
        r26.zzE += r4;
        r26.zzF -= r4;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0237, code lost:
    
        r9 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x023d, code lost:
    
        if (r9.zzb() == r5) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x023f, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0253, code lost:
    
        r9 = r5;
        r4 = r6.zza(r27, r4, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r27, com.google.android.gms.internal.ads.zzafv r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzakn) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    public final void zzf() {
    }

    public final /* synthetic */ void zzh(long j, zzer zzerVar) {
        zzaeh.zza(j, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i, zzfg zzfgVar, zzalc zzalcVar, List list, zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzakl(this));
        this.zzq = new zzaej();
        this.zzM = -1L;
    }
}
