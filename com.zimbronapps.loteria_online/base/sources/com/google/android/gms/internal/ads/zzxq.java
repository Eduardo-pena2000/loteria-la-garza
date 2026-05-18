package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;
    private zzwh zzs;
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new zzxm(this);
    private final Runnable zzq = new zzxj(this);
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i;
        this.zzn = zzxdVar;
        this.zzl = j;
    }

    public static /* synthetic */ Map zzJ() {
        return zzb;
    }

    public static /* synthetic */ zzv zzK() {
        return zzc;
    }

    private final void zzR(int i) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zza = zzxpVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzwg(1, zzas.zzf(zza.zzo), zza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzxoVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzxoVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i3 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i3);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i3);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i3);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzv zzn = this.zzv[i2].zzn();
            zzn.getClass();
            String str = zzn.zzo;
            boolean zza = zzas.zza(str);
            boolean z = zza || zzas.zzb(str);
            zArr[i2] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zza || this.zzw[i2].zzb) {
                    zzap zzapVar = zzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zza2 = zzn.zza();
                    zza2.zzk(zzapVar2);
                    zzn = zza2.zzM();
                }
                if (zza && zzn.zzh == -1 && zzn.zzi == -1 && (i = zzaicVar.zza) != -1) {
                    zzt zza3 = zzn.zza();
                    zza3.zzh(i);
                    zzn = zza3.zzM();
                }
            }
            zzv zzb2 = zzn.zzb(this.zzf.zzb(zzn));
            zzbgVarArr[i2] = new zzbg(Integer.toString(i2), zzb2);
            this.zzI = zzb2.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int i = 0;
        for (zzyb zzybVar : this.zzv) {
            i += zzybVar.zzi();
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzY(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzyb[] r3 = r5.zzv
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzxp r4 = r5.zzB
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzo()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzY(boolean):long");
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j, long j2, boolean z) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j, long j2) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j, long j2, int i) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        if (i == 0) {
            long zze = zzxhVar.zze();
            zzhf zzh = zzxhVar.zzh();
            zzwbVar = new zzwb(zze, zzh, zzh.zza, Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new zzxl(this));
    }

    public final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages((Object) null);
        this.zzs = null;
        this.zzQ = true;
    }

    public final void zzb(zzwh zzwhVar, long j) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        zzaac zzaacVar;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzaacVarArr.length; i3++) {
            zzyc zzycVar = zzycVarArr[i3];
            if (zzycVar != null && (zzaacVarArr[i3] == null || !zArr[i3])) {
                int zza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[zza]);
                this.zzJ--;
                zArr3[zza] = false;
                zzycVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzaacVarArr.length; i4++) {
            if (zzycVarArr[i4] == null && (zzaacVar = zzaacVarArr[i4]) != null) {
                zzgrc.zzi(zzaacVar.zze() == 1);
                zzgrc.zzi(zzaacVar.zzf(0) == 0);
                int zzb2 = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i4] = new zzxn(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    zzyb zzybVar = this.zzv[zzb2];
                    z = (zzybVar.zzm() == 0 || zzybVar.zzt(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i2 < length) {
                    zzybVarArr[i2].zzx();
                    i2++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzj(j);
            while (i2 < zzycVarArr.length) {
                if (zzycVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    public final void zzf(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzw(j, false, zArr[i]);
        }
    }

    public final void zzg(long j) {
    }

    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    public final long zzi() {
        long j;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i] && zzxpVar.zzc[i] && !this.zzv[i].zzp()) {
                    j = Math.min(j, this.zzv[i].zzo());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzL : j;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzj(long r9) {
        /*
            r8 = this;
            r8.zzaa()
            com.google.android.gms.internal.ads.zzxp r0 = r8.zzB
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzafy r1 = r8.zzC
            boolean r1 = r1.zzb()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzH = r1
            long r2 = r8.zzL
            r8.zzL = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzM = r9
            return r9
        L22:
            int r4 = r8.zzF
            r5 = 7
            if (r4 == r5) goto L73
            boolean r4 = r8.zzP
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzabf r4 = r8.zzm
            boolean r4 = r4.zze()
            if (r4 == 0) goto L73
        L33:
            com.google.android.gms.internal.ads.zzyb[] r4 = r8.zzv
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto La5
            com.google.android.gms.internal.ads.zzyb[] r6 = r8.zzv
            r6 = r6[r5]
            com.google.android.gms.internal.ads.zzxg[] r7 = r8.zzu
            r7 = r7[r5]
            boolean r7 = r7.zzf()
            if (r7 != 0) goto L48
            goto L70
        L48:
            int r7 = r6.zzm()
            if (r7 != 0) goto L52
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L70
        L52:
            boolean r7 = r8.zzA
            if (r7 == 0) goto L5f
            int r7 = r6.zzl()
            boolean r6 = r6.zzs(r7)
            goto L65
        L5f:
            boolean r7 = r8.zzP
            boolean r6 = r6.zzt(r9, r7)
        L65:
            if (r6 != 0) goto L70
            boolean r6 = r0[r5]
            if (r6 != 0) goto L73
            boolean r6 = r8.zzz
            if (r6 != 0) goto L70
            goto L73
        L70:
            int r5 = r5 + 1
            goto L37
        L73:
            r8.zzN = r1
            r8.zzM = r9
            r8.zzP = r1
            r8.zzI = r1
            com.google.android.gms.internal.ads.zzabf r0 = r8.zzm
            boolean r2 = r0.zze()
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzyb[] r2 = r8.zzv
            int r3 = r2.length
        L86:
            if (r1 >= r3) goto L90
            r4 = r2[r1]
            r4.zzx()
            int r1 = r1 + 1
            goto L86
        L90:
            r0.zzf()
            goto La5
        L94:
            r0.zzc()
            com.google.android.gms.internal.ads.zzyb[] r0 = r8.zzv
            int r2 = r0.length
            r3 = r1
        L9b:
            if (r3 >= r2) goto La5
            r4 = r0[r3]
            r4.zzg(r1)
            int r3 = r3 + 1
            goto L9b
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzj(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzk(long r28, com.google.android.gms.internal.ads.zzmt r30) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxq.zzk(long, com.google.android.gms.internal.ads.zzmt):long");
    }

    public final long zzl() {
        return zzi();
    }

    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    public final boolean zzp(int i) {
        return !zzT() && this.zzv[i].zzq(this.zzP);
    }

    public final void zzq(int i) throws IOException {
        this.zzv[i].zzk();
        zzr();
    }

    public final void zzr() throws IOException {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    public final int zzs(int i, zzlh zzlhVar, zzih zzihVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzr = this.zzv[i].zzr(zzlhVar, zzihVar, i2, this.zzP);
        if (zzr == -3) {
            zzS(i);
        }
        return zzr;
    }

    public final int zzt(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzyb zzybVar = this.zzv[i];
        int zzu = zzybVar.zzu(j, this.zzP);
        zzybVar.zzv(zzu);
        if (zzu != 0) {
            return zzu;
        }
        zzS(i);
        return 0;
    }

    public final zzagh zzu(int i, int i2) {
        return zzU(new zzxo(i, false));
    }

    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    public final void zzw(zzafy zzafyVar) {
        this.zzr.post(new zzxk(this, zzafyVar));
    }

    public final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j, long j2, IOException iOException, int i) {
        long j3;
        zzaaz zza;
        zzafy zzafyVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if ((iOException instanceof zzat) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhp) || (iOException instanceof zzabe)) {
            j3 = -9223372036854775807L;
            break;
        }
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof zzhc) && ((zzhc) iOException2).zza == 2008) {
                j3 = -9223372036854775807L;
                break;
            }
        }
        j3 = Math.min((i - 1) * 1000, 5000);
        if (j3 == -9223372036854775807L) {
            zza = zzabf.zzb;
        } else {
            int zzX = zzX();
            boolean z = zzX > this.zzO;
            if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                this.zzO = zzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyb zzybVar : this.zzv) {
                        zzybVar.zzg(false);
                    }
                    zzxhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zza = zzabf.zza;
                }
            }
            zza = zzabf.zza(z, j3);
        }
        boolean zza2 = zza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, true ^ zza2);
        if (!zza2) {
            zzxhVar.zze();
        }
        return zza;
    }
}
