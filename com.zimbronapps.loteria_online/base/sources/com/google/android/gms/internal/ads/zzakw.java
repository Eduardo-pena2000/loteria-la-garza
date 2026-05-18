package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;
    private long[][] zzz;

    static {
        int i = zzaks.zza;
    }

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    public static /* synthetic */ long zzh(zzalf zzalfVar, long j, long j2) {
        int zzl = zzl(zzalfVar, j);
        return zzl == -1 ? j2 : Math.min(zzalfVar.zzc[zzl], j2);
    }

    public static /* synthetic */ int zzi(zzalf zzalfVar, long j) {
        return zzl(zzalfVar, j);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(long r42) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.zzk(long):void");
    }

    private static int zzl(zzalf zzalfVar, long j) {
        int zza2 = zzalfVar.zza(j);
        return zza2 == -1 ? zzalfVar.zzb(j) : zza2;
    }

    private static int zzm(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzguf.zzj(zzb) : zzguf.zzi();
        return zzb == null;
    }

    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0017, code lost:
    
        if (r7 == r6) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027d, code lost:
    
        r5 = r33.zzn - r33.zzo;
        r9 = r34.zzn() + r5;
        r3 = r33.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028b, code lost:
    
        if (r3 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x028d, code lost:
    
        r34.zzc(r3.zzi(), r33.zzo, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0299, code lost:
    
        if (r33.zzm != 1718909296) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x029b, code lost:
    
        r33.zzv = true;
        r3.zzh(8);
        r5 = zzm(r3.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a9, code lost:
    
        if (r5 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ac, code lost:
    
        r3.zzk(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b4, code lost:
    
        if (r3.zzd() <= 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b6, code lost:
    
        r5 = zzm(r3.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02be, code lost:
    
        if (r5 == 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c1, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c2, code lost:
    
        r33.zzA = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c4, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0301, code lost:
    
        zzk(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0304, code lost:
    
        if (r3 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0309, code lost:
    
        if (r33.zzl == 2) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c6, code lost:
    
        r5 = r33.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cc, code lost:
    
        if (r5.isEmpty() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ce, code lost:
    
        ((com.google.android.gms.internal.ads.zzfu) r5.peek()).zza(new com.google.android.gms.internal.ads.zzfv(r33.zzm, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e1, code lost:
    
        if (r33.zzv != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e8, code lost:
    
        if (r33.zzm != 1835295092) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ea, code lost:
    
        r33.zzA = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f2, code lost:
    
        if (r5 >= 262144) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f4, code lost:
    
        r34.zzf((int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f9, code lost:
    
        r35.zza = r34.zzn() + r5;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0019, code lost:
    
        if (r7 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x001b, code lost:
    
        r33.zzi.zzb(r34, r35, r33.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0026, code lost:
    
        if (r35.zza != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0028, code lost:
    
        zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x002b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x002c, code lost:
    
        r7 = r34.zzn();
        r14 = r33.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0032, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0034, code lost:
    
        r21 = r6;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0048, code lost:
    
        r3 = r33.zzy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x004b, code lost:
    
        if (r14 >= r3.length) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x004d, code lost:
    
        r3 = r3[r14];
        r9 = r3.zze;
        r3 = r3.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0055, code lost:
    
        if (r9 != r3.zzb) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0058, code lost:
    
        r29 = r3.zzc[r9];
        r3 = r33.zzz;
        r3.getClass();
        r31 = r3[r14][r9];
        r29 = r29 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0069, code lost:
    
        if (r29 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x006d, code lost:
    
        if (r29 < 262144) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0071, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0072, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0074, code lost:
    
        if (r28 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0076, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x007a, code lost:
    
        if (r3 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x007e, code lost:
    
        if (r29 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0089, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x008d, code lost:
    
        if (r31 >= r19) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x008f, code lost:
    
        r21 = r3;
        r26 = r14;
        r19 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0095, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0080, code lost:
    
        r28 = r3;
        r27 = r14;
        r24 = r29;
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0078, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x006f, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0099, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x009b, code lost:
    
        if (r21 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00a4, code lost:
    
        if (r22 < (r19 + 10485760)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00a6, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00ab, code lost:
    
        r33.zzq = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00ad, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00a9, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00b2, code lost:
    
        r3 = r33.zzy[r14];
        r5 = r3.zzc;
        r9 = r3.zze;
        r14 = r3.zzb;
        r12 = r14.zzc[r9] + r33.zzw;
        r4 = r14.zzd;
        r17 = r4[r9];
        r6 = r3.zzd;
        r7 = (r12 - r7) + r33.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00d4, code lost:
    
        if (r7 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00db, code lost:
    
        if (r7 < 262144) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00e1, code lost:
    
        r2 = r3.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00e6, code lost:
    
        if (r2.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00e8, code lost:
    
        r7 = r7 + 8;
        r17 = r17 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00ed, code lost:
    
        r10 = r17;
        r34.zzf((int) r7);
        r7 = r2.zzg;
        r8 = r7.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00fd, code lost:
    
        if (java.util.Objects.equals(r8, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00ff, code lost:
    
        java.util.Objects.equals(r8, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0104, code lost:
    
        r33.zzu = true;
        r2 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0109, code lost:
    
        if (r2 == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x010b, code lost:
    
        r8 = r33.zze;
        r12 = r8.zzi();
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r13 = 4 - r2;
        r10 = r10 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x011f, code lost:
    
        if (r33.zzs >= r10) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0121, code lost:
    
        r11 = r33.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0123, code lost:
    
        if (r11 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0127, code lost:
    
        if (r33.zzu != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0129, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0135, code lost:
    
        if ((com.google.android.gms.internal.ads.zzgm.zzc(r7) + r2) > (r4[r9] - r33.zzr)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0137, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r7);
        r11 = r2 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0144, code lost:
    
        r34.zzc(r12, r13, r11);
        r33.zzr += r11;
        r8.zzh(0);
        r15 = r8.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0154, code lost:
    
        if (r15 < 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0156, code lost:
    
        r33.zzt = r15 - r4;
        r15 = r33.zzd;
        r15.zzh(0);
        r5.zzc(r15, 4);
        r33.zzs += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0167, code lost:
    
        if (r4 <= 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0169, code lost:
    
        r5.zzc(r8, r4);
        r33.zzs += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0175, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r12, 4, r4, r7) == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0177, code lost:
    
        r33.zzu = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x017a, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0184, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x013e, code lost:
    
        r11 = r2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0141, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0185, code lost:
    
        r16 = r4;
        r11 = r5.zza(r34, r11, false);
        r33.zzr += r11;
        r33.zzs += r11;
        r33.zzt -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0229, code lost:
    
        r7 = r14.zzf[r9];
        r1 = r14.zzg[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0233, code lost:
    
        if (r33.zzu != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0235, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0238, code lost:
    
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x023a, code lost:
    
        r6.zzc(r5, r7, r1, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x024f, code lost:
    
        if ((r9 + 1) != r14.zzb) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0251, code lost:
    
        r6.zzd(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0265, code lost:
    
        r3.zze++;
        r33.zzq = -1;
        r33.zzr = 0;
        r33.zzs = 0;
        r33.zzt = 0;
        r33.zzu = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0256, code lost:
    
        r5.zze(r7, r1, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x01a2, code lost:
    
        if ("audio/ac4".equals(r8) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x01a6, code lost:
    
        if (r33.zzs != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x01a8, code lost:
    
        r2 = r33.zzf;
        com.google.android.gms.internal.ads.zzady.zzc(r10, r2);
        r4 = 7;
        r5.zzc(r2, 7);
        r33.zzs += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01b8, code lost:
    
        r10 = r10 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x020e, code lost:
    
        r2 = r33.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0210, code lost:
    
        if (r2 >= r10) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0212, code lost:
    
        r2 = r5.zza(r34, r10 - r2, false);
        r33.zzr += r2;
        r33.zzs += r2;
        r33.zzt -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01b7, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01bc, code lost:
    
        if (r3.zzf == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01c4, code lost:
    
        if (java.util.Objects.equals(r8, "audio/mpeg") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01c6, code lost:
    
        r2 = r3.zzf;
        r4 = r33.zzf;
        r4.zza(4);
        r34.zzi(r4.zzi(), 0, 4);
        r34.zzl();
        r7 = new com.google.android.gms.internal.ads.zzafr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01e6, code lost:
    
        if (r7.zza(r4.zzB()) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01f0, code lost:
    
        if (java.util.Objects.equals(r2.zzo, r7.zzb) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01f2, code lost:
    
        r2 = r2.zza();
        r4 = r7.zzb;
        r4.getClass();
        r2.zzm(r4);
        r2 = r2.zzM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0202, code lost:
    
        r5.zzz(r2);
        r3.zzf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0209, code lost:
    
        if (r6 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x020b, code lost:
    
        r6.zzb(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0279, code lost:
    
        r35.zza = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x027c, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r34, com.google.android.gms.internal.ads.zzafv r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int zza2 = zzalfVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzalfVar.zzb(j2);
            }
            zzakvVar.zze = zza2;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    public final void zzf() {
    }

    public zzakw(zzamd zzamdVar, int i) {
        this.zzb = zzamdVar;
        this.zzc = i;
        this.zzk = zzguf.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }
}
