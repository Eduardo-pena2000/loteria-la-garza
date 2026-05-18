package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i, boolean z, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j, boolean z2, boolean z3, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, zzme zzmeVar, zzjg zzjgVar, zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        int i2 = 0;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zza2 = zzmd.zza(zzaakVar);
        this.zzG = zza2;
        this.zzH = new zzlc(zza2);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z4 = false;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            zzmlVarArr[i2].zzc(i2, zzpqVar, zzdnVar);
            this.zzc[i2] = zzmlVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            zzml zzmlVar = zzmlVarArr2[i2];
            if (zzmlVar != null) {
                zzmlVar.zzc(i2, zzpqVar, zzdnVar);
                z4 = true;
            }
            this.zzb[i2] = new zzmp(zzmlVarArr[i2], zzmlVarArr2[i2], i2);
            i2++;
        }
        this.zzy = z4;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzd = zzdnVar.zzd(looper, null);
        this.zzx = zzd;
        this.zzs = new zzlq(zzmxVar, zzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper zza3 = zzmeVar2.zza();
        this.zzk = zza3;
        zzdx zzd2 = zzdnVar.zzd(zza3, this);
        this.zzi = zzd2;
        this.zzz = new zzcd(context, zza3, this);
        zzd2.zzd(35, new zzku(this, zzacpVar)).zza();
    }

    private final void zzA(IOException iOException, int i) {
        zzlq zzlqVar = this.zzs;
        zziw zza2 = zziw.zza(iOException, i);
        zzln zzm = zzlqVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zza2);
    }

    private final void zzB(int i) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i) {
            if (i != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f) throws zziw {
        this.zzac = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzL(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zziw {
        this.zzH.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zziw {
        zzH(z, this.zzz.zzc(z, this.zzG.zze), i, i2);
    }

    private final void zzH(boolean z, int i, int i2, int i3) throws zziw {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.zzC;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z2 && zzmdVar.zzn == i2 && zzmdVar.zzm == i3) {
            return;
        }
        this.zzG = zzmdVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzm = zzlqVar.zzm(); zzm != null; zzm = zzm.zzp()) {
            for (zzaac zzaacVar : zzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z4 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i4 = this.zzG.zze;
        if (i4 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i4 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (zzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, zzT, zzmdVar.zzc, zzmdVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        zzaak zzr = zzm.zzr();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzmpVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(int i, boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzn(new zzkv(this, i, z));
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = Math.min(r2, zzfj.zzp(zzmpVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(r2) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j + r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:14:0x00b0, B:16:0x00ba, B:22:0x00c3, B:24:0x00c9, B:25:0x00cc, B:26:0x00d4, B:28:0x00e0, B:30:0x00e8, B:34:0x00f0, B:38:0x0101, B:39:0x0105, B:40:0x010d, B:42:0x011d, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:51:0x0135, B:53:0x013d, B:56:0x0143, B:57:0x014c, B:60:0x0156, B:76:0x0147), top: B:13:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzR(com.google.android.gms.internal.ads.zzle r21) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzR(com.google.android.gms.internal.ads.zzle):void");
    }

    private final long zzS(zzwk zzwkVar, long j, boolean z) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j, zzlqVar.zzm() != zzlqVar.zzn(), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzT(com.google.android.gms.internal.ads.zzwk r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzT(com.google.android.gms.internal.ads.zzwk, long, boolean, boolean):long");
    }

    private final void zzU(long j, boolean z) throws zziw {
        zzln zzm = this.zzs.zzm();
        long zza2 = j + (zzm == null ? 1000000000000L : zzm.zza());
        this.zzT = zza2;
        this.zzo.zzc(zza2);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmpVarArr[i].zzE(zzm, this.zzT, z);
        }
        for (zzln zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzaac zzaacVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zziw {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzQ, false, true, false);
        this.zzH.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4 A[PHI: r3
      0x00e4: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
     binds: [B:30:0x00ac, B:32:0x00b0, B:34:0x00c1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f A[PHI: r2 r7 r9
      0x009f: PHI (r2v2 com.google.android.gms.internal.ads.zzwk) = (r2v1 com.google.android.gms.internal.ads.zzwk), (r2v6 com.google.android.gms.internal.ads.zzwk) binds: [B:25:0x0074, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x0074, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:25:0x0074, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, -9223372036854775807L);
        zzwk zzy = this.zzs.zzy(zzbfVar, zzm.first, 0L);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzL = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzM = j;
    }

    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        Pair zzm;
        zzbf zzbfVar2 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar3)) {
            return zzm;
        }
        if (zzbfVar.zze(zzm.first) != -1) {
            return (zzbfVar3.zzo(zzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(zzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzleVar.zzc) : zzm;
        }
        int zzr = zzr(zzbeVar, zzbdVar, i, z2, zzm.first, zzbfVar3, zzbfVar);
        if (zzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzyc zzycVar = zzycVarArr[i];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int zzd = zzmpVarArr[i].zzd();
            zzmpVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzR -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmp zzmpVar = zzmpVarArr[i];
                int zzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= zzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zziw {
        zziu zziuVar = this.zzo;
        float f = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        zzln zzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z = true;
        while (zzm != null && zzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzk = zzm.zzk(f, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzm == zzlqVar.zzm() ? zzk : zzaakVar;
            zzaak zzr = zzm.zzr();
            boolean z2 = false;
            if (zzr != null) {
                zzaac[] zzaacVarArr = zzk.zzc;
                if (zzr.zzc.length == zzaacVarArr.length) {
                    for (int i = 0; i < zzaacVarArr.length; i++) {
                        if (zzk.zzb(zzr, i)) {
                        }
                    }
                    if (zzm != zzn) {
                        z2 = true;
                    }
                    z &= z2;
                    zzm = zzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            int i2 = 2;
            if (z) {
                zzln zzm2 = zzlqVar.zzm();
                int zzs = zzlqVar.zzs(zzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long zzm3 = zzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == zzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                boolean z3 = (zzmdVar2.zze == 4 || zzm3 == zzmdVar2.zzs) ? false : true;
                zzmd zzmdVar3 = this.zzG;
                zzln zzlnVar = zzm2;
                this.zzG = zzao(zzmdVar3.zzb, zzm3, zzmdVar3.zzc, zzmdVar3.zzd, z3, 5);
                if (z3) {
                    zzU(zzm3, true);
                }
                zzab();
                i2 = 2;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (i3 < 2) {
                    int zzd = zzmpVarArr[i3].zzd();
                    zArr2[i3] = zzmpVarArr[i3].zzM();
                    zzln zzlnVar2 = zzlnVar;
                    zzmpVarArr[i3].zzD(zzlnVar2.zzc[i3], zziuVar, this.zzT, zArr[i3]);
                    if (zzd - zzmpVarArr[i3].zzd() > 0) {
                        zzN(i3, false);
                    }
                    this.zzR -= zzd - zzmpVarArr[i3].zzd();
                    i3++;
                    zzlnVar = zzlnVar2;
                }
                zzaq(zArr2, this.zzT);
                zzlnVar.zzh = true;
            } else {
                zzlqVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, this.zzT - zzm.zza());
                    if (this.zzy && zzaz() && zzlqVar.zzo() == zzm) {
                        zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzas(true);
            if (this.zzG.zze != 4) {
                zzam();
                zzL();
                this.zzi.zzh(i2);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzm = this.zzs.zzm();
        long j = zzm.zzg.zze;
        if (!zzm.zze) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzG.zzs < j) {
            return true;
        }
        return !zzax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0409  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r33, boolean r34) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j, boolean z) throws zziw {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long zza2 = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmpVarArr[i].zzp(zzlnVar)) {
                    long zzf = zzmpVarArr[i].zzf(zzlnVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzl = zzlqVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzwi zzwiVar = zzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzl.zzg.zza, zzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzm = this.zzs.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzi && this.zzJ) {
            z = true;
        }
        this.zzK = z;
    }

    private final void zzak(zzav zzavVar, boolean z) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzal(zzav zzavVar, float f, boolean z, boolean z2) throws zziw {
        int i;
        if (z) {
            if (z2) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f2 = zzavVar.zzb;
        zzln zzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i < length) {
                zzaac zzaacVar = zzaacVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i < 2) {
            zzmpVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long zza2;
        long j;
        zzlq zzlqVar;
        boolean zzh;
        zzlq zzlqVar2 = this.zzs;
        if (zzaF(zzlqVar2.zzk())) {
            zzln zzk = zzlqVar2.zzk();
            long zzau = zzau(zzk.zzg());
            if (zzk == zzlqVar2.zzm()) {
                zza2 = this.zzT;
                j = zzk.zza();
            } else {
                zza2 = this.zzT - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzlqVar = zzlqVar2;
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzk.zzg.zza, zza2 - j, zzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            zzh = zzljVar.zzh(zzliVar);
            zzln zzm = zzlqVar.zzm();
            if (!zzh && zzm.zze && zzau < 500000 && this.zzn > 0) {
                zzm.zza.zzf(this.zzG.zzs, false);
                zzh = zzljVar.zzh(zzliVar);
            }
        } else {
            zzlqVar = zzlqVar2;
            zzh = false;
        }
        this.zzN = zzh;
        if (zzh) {
            zzln zzk2 = zzlqVar.zzk();
            zzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzN && (zzk == null || !zzk.zza.zzn())) {
            z = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z);
        }
    }

    private final zzmd zzao(zzwk zzwkVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzyn zzynVar;
        zzaak zzaakVar;
        zzln zzm;
        int i2 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar2 = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list2 = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzm2 = zzlqVar.zzm();
            zzyn zzq = zzm2 == null ? zzyn.zza : zzm2.zzq();
            zzaak zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzaac[] zzaacVarArr = zzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z2 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzguf zzi = z2 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzm2 != null) {
                zzlo zzloVar = zzm2.zzg;
                if (zzloVar.zzc != j2) {
                    zzm2.zzg = zzloVar.zzb(j2);
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn() && (zzm = zzlqVar.zzm()) != null) {
                zzaak zzr2 = zzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzr2.zza(i2)) {
                        if (zzmpVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
            zzynVar = zzq;
            zzaakVar = zzr;
        } else if (zzwkVar.equals(this.zzG.zzb)) {
            list = list2;
            zzynVar = zzynVar2;
            zzaakVar = zzaakVar2;
        } else {
            zzaakVar = this.zzf;
            zzynVar = zzyn.zza;
            list = zzguf.zzi();
        }
        if (z) {
            this.zzH.zzc(i);
        }
        return this.zzG.zzc(zzwkVar, j, j2, j3, zzat(), zzynVar, zzaakVar, list);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zziw {
        zzmp[] zzmpVarArr;
        zzln zzn = this.zzs.zzn();
        zzaak zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzmpVarArr[i].zzG();
            }
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzr.zza(i2) && !zzmpVarArr[i2].zzp(zzn)) {
                zzar(zzn, i2, zArr[i2], j);
            }
        }
    }

    private final void zzar(zzln zzlnVar, int i, boolean z, long j) throws zziw {
        zzmp zzmpVar = this.zzb[i];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z2 = zzlnVar == this.zzs.zzm();
        zzaak zzr = zzlnVar.zzr();
        zzmo zzmoVar = zzr.zzb[i];
        zzaac zzaacVar = zzr.zzc[i];
        boolean z3 = zzax() && this.zzG.zze == 3;
        boolean z4 = !z && z3;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i], this.zzT, z4, z2, j, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z3 && z2) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzln zzk = this.zzs.zzk();
        zzwk zzwkVar = zzk == null ? this.zzG.zzb : zzk.zzg.zza;
        boolean equals = this.zzG.zzk.equals(zzwkVar);
        if (!equals) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzk == null ? zzmdVar.zzs : zzk.zzf();
        this.zzG.zzr = zzat();
        if ((!equals || z) && zzk != null && zzk.zze) {
            zzaw(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzln zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long zza2;
        long j;
        zzlq zzlqVar = this.zzs;
        zzln zzk = zzlqVar.zzk();
        zzk.getClass();
        if (zzk == zzlqVar.zzm()) {
            zza2 = this.zzT;
            j = zzk.zza();
        } else {
            zza2 = this.zzT - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, zza2 - j, zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i) throws IOException, zziw {
        zzmp zzmpVar = this.zzb[i];
        try {
            zzln zzm = this.zzs.zzm();
            if (zzm == null) {
                throw null;
            }
            zzmpVar.zzu(zzm);
        } catch (IOException e) {
            e = e;
            zzmpVar.zze();
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmpVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbfVar.zze(obj);
        int zzc = zzbfVar.zzc();
        int i3 = zze;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            if (i4 >= zzc || i5 != -1) {
                break;
            }
            i3 = zzbfVar.zzl(i3, zzbdVar, zzbeVar, i, z);
            if (i3 == -1) {
                i5 = -1;
                break;
            }
            i5 = zzbfVar2.zze(zzbfVar.zzf(i3));
            i4++;
        }
        if (i5 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i5, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x092b: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:747:0x092a */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a57 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0925, zziw -> 0x0929, TryCatch #29 {zziw -> 0x0929, RuntimeException -> 0x0925, blocks: (B:245:0x0942, B:248:0x0914, B:250:0x091b, B:253:0x092e, B:258:0x093e, B:265:0x095b, B:267:0x0961, B:271:0x096e, B:273:0x099b, B:275:0x09a2, B:277:0x09a6, B:280:0x0a4b, B:282:0x0a57, B:283:0x0aaa, B:286:0x0ab2, B:288:0x0ab6, B:290:0x0abe, B:292:0x0ac1, B:295:0x0ac5, B:297:0x0acb, B:299:0x0ad4, B:301:0x0ade, B:303:0x0ae4, B:305:0x0aef, B:306:0x0b14, B:308:0x0b1a, B:311:0x0b24, B:314:0x0b3f, B:320:0x0b36, B:322:0x0b3a, B:324:0x0af6, B:327:0x0b04, B:328:0x0b0c, B:329:0x0b0d, B:330:0x0a64, B:332:0x0a6b, B:334:0x0a6f, B:337:0x0a78, B:339:0x0a88, B:341:0x0a8e, B:343:0x0a98, B:345:0x0a9d, B:347:0x0aa2, B:348:0x0aa7, B:351:0x09b4, B:353:0x09b8, B:355:0x09ca, B:356:0x09d5, B:358:0x09df, B:361:0x09e8, B:363:0x09f2, B:368:0x09fd, B:374:0x0976, B:376:0x097a, B:377:0x0985, B:379:0x098b, B:382:0x0953, B:685:0x0b52, B:688:0x0b5c), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0b0d A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0925, zziw -> 0x0929, TryCatch #29 {zziw -> 0x0929, RuntimeException -> 0x0925, blocks: (B:245:0x0942, B:248:0x0914, B:250:0x091b, B:253:0x092e, B:258:0x093e, B:265:0x095b, B:267:0x0961, B:271:0x096e, B:273:0x099b, B:275:0x09a2, B:277:0x09a6, B:280:0x0a4b, B:282:0x0a57, B:283:0x0aaa, B:286:0x0ab2, B:288:0x0ab6, B:290:0x0abe, B:292:0x0ac1, B:295:0x0ac5, B:297:0x0acb, B:299:0x0ad4, B:301:0x0ade, B:303:0x0ae4, B:305:0x0aef, B:306:0x0b14, B:308:0x0b1a, B:311:0x0b24, B:314:0x0b3f, B:320:0x0b36, B:322:0x0b3a, B:324:0x0af6, B:327:0x0b04, B:328:0x0b0c, B:329:0x0b0d, B:330:0x0a64, B:332:0x0a6b, B:334:0x0a6f, B:337:0x0a78, B:339:0x0a88, B:341:0x0a8e, B:343:0x0a98, B:345:0x0a9d, B:347:0x0aa2, B:348:0x0aa7, B:351:0x09b4, B:353:0x09b8, B:355:0x09ca, B:356:0x09d5, B:358:0x09df, B:361:0x09e8, B:363:0x09f2, B:368:0x09fd, B:374:0x0976, B:376:0x097a, B:377:0x0985, B:379:0x098b, B:382:0x0953, B:685:0x0b52, B:688:0x0b5c), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a6b A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0925, zziw -> 0x0929, TryCatch #29 {zziw -> 0x0929, RuntimeException -> 0x0925, blocks: (B:245:0x0942, B:248:0x0914, B:250:0x091b, B:253:0x092e, B:258:0x093e, B:265:0x095b, B:267:0x0961, B:271:0x096e, B:273:0x099b, B:275:0x09a2, B:277:0x09a6, B:280:0x0a4b, B:282:0x0a57, B:283:0x0aaa, B:286:0x0ab2, B:288:0x0ab6, B:290:0x0abe, B:292:0x0ac1, B:295:0x0ac5, B:297:0x0acb, B:299:0x0ad4, B:301:0x0ade, B:303:0x0ae4, B:305:0x0aef, B:306:0x0b14, B:308:0x0b1a, B:311:0x0b24, B:314:0x0b3f, B:320:0x0b36, B:322:0x0b3a, B:324:0x0af6, B:327:0x0b04, B:328:0x0b0c, B:329:0x0b0d, B:330:0x0a64, B:332:0x0a6b, B:334:0x0a6f, B:337:0x0a78, B:339:0x0a88, B:341:0x0a8e, B:343:0x0a98, B:345:0x0a9d, B:347:0x0aa2, B:348:0x0aa7, B:351:0x09b4, B:353:0x09b8, B:355:0x09ca, B:356:0x09d5, B:358:0x09df, B:361:0x09e8, B:363:0x09f2, B:368:0x09fd, B:374:0x0976, B:376:0x097a, B:377:0x0985, B:379:0x098b, B:382:0x0953, B:685:0x0b52, B:688:0x0b5c), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a88 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0925, zziw -> 0x0929, TryCatch #29 {zziw -> 0x0929, RuntimeException -> 0x0925, blocks: (B:245:0x0942, B:248:0x0914, B:250:0x091b, B:253:0x092e, B:258:0x093e, B:265:0x095b, B:267:0x0961, B:271:0x096e, B:273:0x099b, B:275:0x09a2, B:277:0x09a6, B:280:0x0a4b, B:282:0x0a57, B:283:0x0aaa, B:286:0x0ab2, B:288:0x0ab6, B:290:0x0abe, B:292:0x0ac1, B:295:0x0ac5, B:297:0x0acb, B:299:0x0ad4, B:301:0x0ade, B:303:0x0ae4, B:305:0x0aef, B:306:0x0b14, B:308:0x0b1a, B:311:0x0b24, B:314:0x0b3f, B:320:0x0b36, B:322:0x0b3a, B:324:0x0af6, B:327:0x0b04, B:328:0x0b0c, B:329:0x0b0d, B:330:0x0a64, B:332:0x0a6b, B:334:0x0a6f, B:337:0x0a78, B:339:0x0a88, B:341:0x0a8e, B:343:0x0a98, B:345:0x0a9d, B:347:0x0aa2, B:348:0x0aa7, B:351:0x09b4, B:353:0x09b8, B:355:0x09ca, B:356:0x09d5, B:358:0x09df, B:361:0x09e8, B:363:0x09f2, B:368:0x09fd, B:374:0x0976, B:376:0x097a, B:377:0x0985, B:379:0x098b, B:382:0x0953, B:685:0x0b52, B:688:0x0b5c), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07e4 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, zziw -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {RuntimeException -> 0x0022, blocks: (B:9:0x0016, B:13:0x0041, B:15:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x005d, B:22:0x0061, B:24:0x0069, B:25:0x006e, B:27:0x0072, B:28:0x007c, B:30:0x0089, B:31:0x0090, B:32:0x0096, B:34:0x009f, B:36:0x00a7, B:37:0x00ae, B:38:0x00bd, B:39:0x00ca, B:42:0x00db, B:44:0x00e3, B:46:0x00f2, B:48:0x00fa, B:52:0x0109, B:53:0x0102, B:54:0x010e, B:57:0x012a, B:59:0x0142, B:60:0x0153, B:61:0x016b, B:62:0x0170, B:63:0x0175, B:66:0x017c, B:68:0x0185, B:70:0x0191, B:72:0x0199, B:73:0x01a4, B:74:0x01b8, B:75:0x01d0, B:76:0x01e6, B:78:0x01f5, B:79:0x01f9, B:80:0x020a, B:82:0x0219, B:83:0x0235, B:84:0x0248, B:85:0x0251, B:87:0x0263, B:88:0x026f, B:89:0x027f, B:91:0x028b, B:94:0x0296, B:95:0x029d, B:96:0x02a8, B:99:0x02af, B:101:0x02b7, B:103:0x02bb, B:105:0x02c0, B:108:0x02ca, B:110:0x02cf, B:113:0x02d6, B:115:0x02e6, B:116:0x02f0, B:117:0x02ea, B:119:0x02ed, B:121:0x02f5, B:123:0x0307, B:124:0x0311, B:125:0x030b, B:127:0x030e, B:128:0x0316, B:129:0x031b, B:131:0x0327, B:132:0x0331, B:134:0x0337, B:697:0x0352, B:702:0x03a4, B:703:0x03cb, B:707:0x03d3, B:708:0x03d4, B:710:0x03dc, B:712:0x03f9, B:137:0x03ff, B:151:0x0432, B:147:0x0443, B:148:0x0450, B:215:0x0455, B:217:0x045c, B:218:0x0466, B:219:0x047a, B:403:0x04b8, B:405:0x04c2, B:407:0x04ca, B:408:0x04df, B:410:0x04e5, B:411:0x04ea, B:412:0x04d0, B:414:0x04d4, B:417:0x04f1, B:421:0x0509, B:423:0x050d, B:425:0x0511, B:427:0x0517, B:429:0x051d, B:431:0x0523, B:433:0x0529, B:435:0x0531, B:437:0x053d, B:439:0x0546, B:440:0x054b, B:442:0x054f, B:444:0x0555, B:446:0x055d, B:448:0x0565, B:450:0x058b, B:454:0x0594, B:456:0x059d, B:458:0x05ab, B:539:0x0734, B:541:0x073a, B:543:0x0742, B:544:0x074c, B:547:0x0751, B:554:0x0777, B:556:0x077d, B:558:0x0785, B:560:0x0794, B:562:0x07a1, B:569:0x07a6, B:480:0x07e4, B:486:0x0802, B:488:0x080b, B:490:0x0813, B:578:0x05cb, B:580:0x05d7, B:583:0x05e0, B:585:0x05e4, B:587:0x05ec, B:590:0x05ef, B:592:0x05f5, B:594:0x05ff, B:596:0x0607, B:598:0x0615, B:600:0x061d, B:602:0x0629, B:604:0x065a, B:606:0x065e, B:609:0x066f, B:615:0x06e8, B:618:0x0679, B:620:0x067d, B:625:0x0685, B:627:0x068d, B:629:0x06aa, B:634:0x06b3, B:638:0x06bd, B:641:0x06c5, B:643:0x06cd, B:645:0x06d3, B:652:0x06fa, B:658:0x0704, B:663:0x070d, B:665:0x0713, B:669:0x0721, B:670:0x0728), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x07f0 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x089e, zziw -> 0x08a2, TRY_LEAVE, TryCatch #7 {zziw -> 0x08a2, blocks: (B:467:0x07b6, B:469:0x07c4, B:471:0x07c8, B:473:0x07ce, B:475:0x07d4, B:477:0x07de, B:482:0x07e8, B:484:0x07f0, B:493:0x081f), top: B:466:0x07b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x085b A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0863, zziw -> 0x0867, LOOP:12: B:501:0x0859->B:502:0x085b, LOOP_END, TryCatch #28 {zziw -> 0x0867, RuntimeException -> 0x0863, blocks: (B:529:0x08ae, B:233:0x08d4, B:242:0x090c, B:496:0x083e, B:498:0x0850, B:500:0x0856, B:502:0x085b, B:504:0x086d, B:506:0x0874, B:507:0x0877, B:508:0x0880, B:510:0x0884, B:512:0x088a, B:514:0x088f, B:526:0x08ad), top: B:495:0x083e }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0874 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0863, zziw -> 0x0867, TryCatch #28 {zziw -> 0x0867, RuntimeException -> 0x0863, blocks: (B:529:0x08ae, B:233:0x08d4, B:242:0x090c, B:496:0x083e, B:498:0x0850, B:500:0x0856, B:502:0x085b, B:504:0x086d, B:506:0x0874, B:507:0x0877, B:508:0x0880, B:510:0x0884, B:512:0x088a, B:514:0x088f, B:526:0x08ad), top: B:495:0x083e }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0884 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x0863, zziw -> 0x0867, TryCatch #28 {zziw -> 0x0867, RuntimeException -> 0x0863, blocks: (B:529:0x08ae, B:233:0x08d4, B:242:0x090c, B:496:0x083e, B:498:0x0850, B:500:0x0856, B:502:0x085b, B:504:0x086d, B:506:0x0874, B:507:0x0877, B:508:0x0880, B:510:0x0884, B:512:0x088a, B:514:0x088f, B:526:0x08ad), top: B:495:0x083e }] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0734 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x05c5 A[Catch: IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, RuntimeException -> 0x089e, zziw -> 0x08b8, TRY_LEAVE, TryCatch #10 {RuntimeException -> 0x089e, blocks: (B:399:0x049a, B:401:0x04ab, B:415:0x04ed, B:418:0x0502, B:459:0x05b7, B:462:0x072e, B:467:0x07b6, B:469:0x07c4, B:471:0x07c8, B:473:0x07ce, B:475:0x07d4, B:477:0x07de, B:482:0x07e8, B:484:0x07f0, B:493:0x081f, B:576:0x05c5, B:650:0x06f4, B:654:0x06fe, B:677:0x04ff), top: B:398:0x049a }] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0685 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, zziw -> 0x003d, TryCatch #8 {RuntimeException -> 0x0022, blocks: (B:9:0x0016, B:13:0x0041, B:15:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x005d, B:22:0x0061, B:24:0x0069, B:25:0x006e, B:27:0x0072, B:28:0x007c, B:30:0x0089, B:31:0x0090, B:32:0x0096, B:34:0x009f, B:36:0x00a7, B:37:0x00ae, B:38:0x00bd, B:39:0x00ca, B:42:0x00db, B:44:0x00e3, B:46:0x00f2, B:48:0x00fa, B:52:0x0109, B:53:0x0102, B:54:0x010e, B:57:0x012a, B:59:0x0142, B:60:0x0153, B:61:0x016b, B:62:0x0170, B:63:0x0175, B:66:0x017c, B:68:0x0185, B:70:0x0191, B:72:0x0199, B:73:0x01a4, B:74:0x01b8, B:75:0x01d0, B:76:0x01e6, B:78:0x01f5, B:79:0x01f9, B:80:0x020a, B:82:0x0219, B:83:0x0235, B:84:0x0248, B:85:0x0251, B:87:0x0263, B:88:0x026f, B:89:0x027f, B:91:0x028b, B:94:0x0296, B:95:0x029d, B:96:0x02a8, B:99:0x02af, B:101:0x02b7, B:103:0x02bb, B:105:0x02c0, B:108:0x02ca, B:110:0x02cf, B:113:0x02d6, B:115:0x02e6, B:116:0x02f0, B:117:0x02ea, B:119:0x02ed, B:121:0x02f5, B:123:0x0307, B:124:0x0311, B:125:0x030b, B:127:0x030e, B:128:0x0316, B:129:0x031b, B:131:0x0327, B:132:0x0331, B:134:0x0337, B:697:0x0352, B:702:0x03a4, B:703:0x03cb, B:707:0x03d3, B:708:0x03d4, B:710:0x03dc, B:712:0x03f9, B:137:0x03ff, B:151:0x0432, B:147:0x0443, B:148:0x0450, B:215:0x0455, B:217:0x045c, B:218:0x0466, B:219:0x047a, B:403:0x04b8, B:405:0x04c2, B:407:0x04ca, B:408:0x04df, B:410:0x04e5, B:411:0x04ea, B:412:0x04d0, B:414:0x04d4, B:417:0x04f1, B:421:0x0509, B:423:0x050d, B:425:0x0511, B:427:0x0517, B:429:0x051d, B:431:0x0523, B:433:0x0529, B:435:0x0531, B:437:0x053d, B:439:0x0546, B:440:0x054b, B:442:0x054f, B:444:0x0555, B:446:0x055d, B:448:0x0565, B:450:0x058b, B:454:0x0594, B:456:0x059d, B:458:0x05ab, B:539:0x0734, B:541:0x073a, B:543:0x0742, B:544:0x074c, B:547:0x0751, B:554:0x0777, B:556:0x077d, B:558:0x0785, B:560:0x0794, B:562:0x07a1, B:569:0x07a6, B:480:0x07e4, B:486:0x0802, B:488:0x080b, B:490:0x0813, B:578:0x05cb, B:580:0x05d7, B:583:0x05e0, B:585:0x05e4, B:587:0x05ec, B:590:0x05ef, B:592:0x05f5, B:594:0x05ff, B:596:0x0607, B:598:0x0615, B:600:0x061d, B:602:0x0629, B:604:0x065a, B:606:0x065e, B:609:0x066f, B:615:0x06e8, B:618:0x0679, B:620:0x067d, B:625:0x0685, B:627:0x068d, B:629:0x06aa, B:634:0x06b3, B:638:0x06bd, B:641:0x06c5, B:643:0x06cd, B:645:0x06d3, B:652:0x06fa, B:658:0x0704, B:663:0x070d, B:665:0x0713, B:669:0x0721, B:670:0x0728), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x06c5 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, zziw -> 0x003d, LOOP:19: B:639:0x06c2->B:641:0x06c5, LOOP_END, TryCatch #8 {RuntimeException -> 0x0022, blocks: (B:9:0x0016, B:13:0x0041, B:15:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x005d, B:22:0x0061, B:24:0x0069, B:25:0x006e, B:27:0x0072, B:28:0x007c, B:30:0x0089, B:31:0x0090, B:32:0x0096, B:34:0x009f, B:36:0x00a7, B:37:0x00ae, B:38:0x00bd, B:39:0x00ca, B:42:0x00db, B:44:0x00e3, B:46:0x00f2, B:48:0x00fa, B:52:0x0109, B:53:0x0102, B:54:0x010e, B:57:0x012a, B:59:0x0142, B:60:0x0153, B:61:0x016b, B:62:0x0170, B:63:0x0175, B:66:0x017c, B:68:0x0185, B:70:0x0191, B:72:0x0199, B:73:0x01a4, B:74:0x01b8, B:75:0x01d0, B:76:0x01e6, B:78:0x01f5, B:79:0x01f9, B:80:0x020a, B:82:0x0219, B:83:0x0235, B:84:0x0248, B:85:0x0251, B:87:0x0263, B:88:0x026f, B:89:0x027f, B:91:0x028b, B:94:0x0296, B:95:0x029d, B:96:0x02a8, B:99:0x02af, B:101:0x02b7, B:103:0x02bb, B:105:0x02c0, B:108:0x02ca, B:110:0x02cf, B:113:0x02d6, B:115:0x02e6, B:116:0x02f0, B:117:0x02ea, B:119:0x02ed, B:121:0x02f5, B:123:0x0307, B:124:0x0311, B:125:0x030b, B:127:0x030e, B:128:0x0316, B:129:0x031b, B:131:0x0327, B:132:0x0331, B:134:0x0337, B:697:0x0352, B:702:0x03a4, B:703:0x03cb, B:707:0x03d3, B:708:0x03d4, B:710:0x03dc, B:712:0x03f9, B:137:0x03ff, B:151:0x0432, B:147:0x0443, B:148:0x0450, B:215:0x0455, B:217:0x045c, B:218:0x0466, B:219:0x047a, B:403:0x04b8, B:405:0x04c2, B:407:0x04ca, B:408:0x04df, B:410:0x04e5, B:411:0x04ea, B:412:0x04d0, B:414:0x04d4, B:417:0x04f1, B:421:0x0509, B:423:0x050d, B:425:0x0511, B:427:0x0517, B:429:0x051d, B:431:0x0523, B:433:0x0529, B:435:0x0531, B:437:0x053d, B:439:0x0546, B:440:0x054b, B:442:0x054f, B:444:0x0555, B:446:0x055d, B:448:0x0565, B:450:0x058b, B:454:0x0594, B:456:0x059d, B:458:0x05ab, B:539:0x0734, B:541:0x073a, B:543:0x0742, B:544:0x074c, B:547:0x0751, B:554:0x0777, B:556:0x077d, B:558:0x0785, B:560:0x0794, B:562:0x07a1, B:569:0x07a6, B:480:0x07e4, B:486:0x0802, B:488:0x080b, B:490:0x0813, B:578:0x05cb, B:580:0x05d7, B:583:0x05e0, B:585:0x05e4, B:587:0x05ec, B:590:0x05ef, B:592:0x05f5, B:594:0x05ff, B:596:0x0607, B:598:0x0615, B:600:0x061d, B:602:0x0629, B:604:0x065a, B:606:0x065e, B:609:0x066f, B:615:0x06e8, B:618:0x0679, B:620:0x067d, B:625:0x0685, B:627:0x068d, B:629:0x06aa, B:634:0x06b3, B:638:0x06bd, B:641:0x06c5, B:643:0x06cd, B:645:0x06d3, B:652:0x06fa, B:658:0x0704, B:663:0x070d, B:665:0x0713, B:669:0x0721, B:670:0x0728), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x06d3 A[Catch: RuntimeException -> 0x0022, IOException -> 0x0029, zzvk -> 0x002d, zzhc -> 0x0031, zzat -> 0x0035, zztg -> 0x0039, zziw -> 0x003d, TryCatch #8 {RuntimeException -> 0x0022, blocks: (B:9:0x0016, B:13:0x0041, B:15:0x0047, B:16:0x004d, B:18:0x0057, B:20:0x005d, B:22:0x0061, B:24:0x0069, B:25:0x006e, B:27:0x0072, B:28:0x007c, B:30:0x0089, B:31:0x0090, B:32:0x0096, B:34:0x009f, B:36:0x00a7, B:37:0x00ae, B:38:0x00bd, B:39:0x00ca, B:42:0x00db, B:44:0x00e3, B:46:0x00f2, B:48:0x00fa, B:52:0x0109, B:53:0x0102, B:54:0x010e, B:57:0x012a, B:59:0x0142, B:60:0x0153, B:61:0x016b, B:62:0x0170, B:63:0x0175, B:66:0x017c, B:68:0x0185, B:70:0x0191, B:72:0x0199, B:73:0x01a4, B:74:0x01b8, B:75:0x01d0, B:76:0x01e6, B:78:0x01f5, B:79:0x01f9, B:80:0x020a, B:82:0x0219, B:83:0x0235, B:84:0x0248, B:85:0x0251, B:87:0x0263, B:88:0x026f, B:89:0x027f, B:91:0x028b, B:94:0x0296, B:95:0x029d, B:96:0x02a8, B:99:0x02af, B:101:0x02b7, B:103:0x02bb, B:105:0x02c0, B:108:0x02ca, B:110:0x02cf, B:113:0x02d6, B:115:0x02e6, B:116:0x02f0, B:117:0x02ea, B:119:0x02ed, B:121:0x02f5, B:123:0x0307, B:124:0x0311, B:125:0x030b, B:127:0x030e, B:128:0x0316, B:129:0x031b, B:131:0x0327, B:132:0x0331, B:134:0x0337, B:697:0x0352, B:702:0x03a4, B:703:0x03cb, B:707:0x03d3, B:708:0x03d4, B:710:0x03dc, B:712:0x03f9, B:137:0x03ff, B:151:0x0432, B:147:0x0443, B:148:0x0450, B:215:0x0455, B:217:0x045c, B:218:0x0466, B:219:0x047a, B:403:0x04b8, B:405:0x04c2, B:407:0x04ca, B:408:0x04df, B:410:0x04e5, B:411:0x04ea, B:412:0x04d0, B:414:0x04d4, B:417:0x04f1, B:421:0x0509, B:423:0x050d, B:425:0x0511, B:427:0x0517, B:429:0x051d, B:431:0x0523, B:433:0x0529, B:435:0x0531, B:437:0x053d, B:439:0x0546, B:440:0x054b, B:442:0x054f, B:444:0x0555, B:446:0x055d, B:448:0x0565, B:450:0x058b, B:454:0x0594, B:456:0x059d, B:458:0x05ab, B:539:0x0734, B:541:0x073a, B:543:0x0742, B:544:0x074c, B:547:0x0751, B:554:0x0777, B:556:0x077d, B:558:0x0785, B:560:0x0794, B:562:0x07a1, B:569:0x07a6, B:480:0x07e4, B:486:0x0802, B:488:0x080b, B:490:0x0813, B:578:0x05cb, B:580:0x05d7, B:583:0x05e0, B:585:0x05e4, B:587:0x05ec, B:590:0x05ef, B:592:0x05f5, B:594:0x05ff, B:596:0x0607, B:598:0x0615, B:600:0x061d, B:602:0x0629, B:604:0x065a, B:606:0x065e, B:609:0x066f, B:615:0x06e8, B:618:0x0679, B:620:0x067d, B:625:0x0685, B:627:0x068d, B:629:0x06aa, B:634:0x06b3, B:638:0x06bd, B:641:0x06c5, B:643:0x06cd, B:645:0x06d3, B:652:0x06fa, B:658:0x0704, B:663:0x070d, B:665:0x0713, B:669:0x0721, B:670:0x0728), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x05b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r45) {
        /*
            Method dump skipped, instructions count: 3348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.handleMessage(android.os.Message):boolean");
    }

    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new zzle(zzbfVar, i, j)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdqVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    public final void zzq() {
        this.zzi.zzh(10);
    }

    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    public final /* synthetic */ zzln zzt(zzlo zzloVar, long j) {
        zzaan zze = this.zzg.zze(this.zzv);
        long j2 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j, this.zze, zze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    public final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i, j, null)).zza();
    }
}
