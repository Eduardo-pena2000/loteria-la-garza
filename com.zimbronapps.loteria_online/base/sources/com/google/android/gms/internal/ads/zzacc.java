package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzacc extends zzuu implements zzacr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzms zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private int zzK;
    private int zzL;
    private zzacp zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final zzacs zzi;
    private final zzacq zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzacb zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzace zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzacc(zzaca zzacaVar) {
        super(2, zzacaVar.zzg(), zzacaVar.zzf(), false, 30.0f);
        Context applicationContext = zzacaVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadl(zzacaVar.zzh(), zzacaVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzacs(applicationContext, this, 0L);
        this.zzj = new zzacq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzat(com.google.android.gms.internal.ads.zzun r11, com.google.android.gms.internal.ads.zzv r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzat(com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzv):int");
    }

    public static int zzbh(zzun zzunVar, zzv zzvVar) {
        int i = zzvVar.zzp;
        if (i == -1) {
            return zzat(zzunVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    public static /* synthetic */ zzmk zzbi(zzacc zzaccVar) {
        return zzaccVar.zzaY();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzbl(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzbl(java.lang.String):boolean");
    }

    public static final boolean zzbm(zzun zzunVar) {
        return Build.VERSION.SDK_INT >= 35 && zzunVar.zzh;
    }

    private static List zzbn(Context context, zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) throws zzuy {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzguf.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            List zzd2 = zzvg.zzd(zzuwVar, zzvVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzvg.zzc(zzuwVar, zzvVar, z, z2);
    }

    private final void zzbo(Object obj) throws zziw {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int zze = zze();
        zzuk zzaE = zzaE();
        if (zzaE != null && this.zzp == null) {
            zzun zzaH = zzaH();
            zzaH.getClass();
            if (!zzbs(zzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface zzbt = zzbt(zzaH);
                if (zzbt != null) {
                    zzaE.zzn(zzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzq();
            }
        }
        if (zze == 2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzihVar.zze - zzbb()) <= 100000;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    private final void zzbr(long j, long j2, zzv zzvVar) {
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            zzacpVar.zzcS(j, j2, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzun zzunVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzunVar) || zzbg(zzunVar);
    }

    private final Surface zzbt(zzun zzunVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzunVar)) {
            return null;
        }
        zzgrc.zzi(zzbg(zzunVar));
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            if (zzaceVar.zza != zzunVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzace.zzb(this.zze, zzunVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            zzaceVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    public final void zzA(long j, boolean z, boolean z2) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !z) {
            zzadrVar.zzg(true);
        }
        super.zzA(j, z, z2);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    public final void zzC() {
        if (this.zzA > 0) {
            long zzb2 = zzL().zzb();
            this.zzg.zzd(this.zzA, zzb2 - this.zzz);
            this.zzA = 0;
            this.zzz = zzb2;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zze(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    public final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadl zzadlVar = this.zzg;
            zzadlVar.zzi(((zzuu) this).zza);
            zzadlVar.zzf(zzbv.zza);
        }
    }

    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }

    public final void zzF() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzf) {
            return;
        }
        zzadrVar.zzx();
    }

    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean zzU(long j) {
        long zzaU = zzaU();
        return zzaU == -9223372036854775807L || j > zzaU - zzbb();
    }

    public final void zzV(float f, float f2) throws zziw {
        super.zzV(f, f2);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    public final void zzW() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzadrVar.zzt();
        }
    }

    public final void zzX(long j, long j2) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            try {
                zzadrVar.zzv(j, j2);
            } catch (zzadq e) {
                throw zzN(e, e.zza, false, 7001);
            }
        }
        super.zzX(j, j2);
    }

    public final boolean zzY() {
        boolean zzaW = zzaW();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzh(zzaW);
        }
        if (zzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zzaW);
    }

    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadr zzadrVar = this.zzp;
        return zzadrVar == null || zzadrVar.zzj();
    }

    public final boolean zzaC(zzun zzunVar) {
        return zzbs(zzunVar);
    }

    public final boolean zzaK() {
        zzun zzaH = zzaH();
        if (this.zzp != null && zzaH != null) {
            String str = zzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzaL() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzv r0 = r12.zzaF()
            long r1 = r12.zzO
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L2a
            r8 = 1
            long r1 = r1 + r8
            long r8 = r12.zzbb()
            long r10 = r12.zzO
            long r8 = r8 + r10
            long r10 = r12.zzaM()
            long r10 = r10 + r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 - r8
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2c
        L2a:
            r1 = r7
            goto L2d
        L2c:
            r1 = r6
        L2d:
            com.google.android.gms.internal.ads.zzms r2 = r12.zzD
            if (r2 != 0) goto L32
            goto L47
        L32:
            boolean r2 = r12.zzE
            if (r2 != 0) goto L47
            if (r0 == 0) goto L3c
            int r0 = r0.zzq
            if (r0 > 0) goto L47
        L3c:
            if (r1 != 0) goto L47
            long r0 = r12.zzba()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r6
        L47:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacc.zzaL():boolean");
    }

    public final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    public final zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzabw(th, zzunVar, this.zzt);
    }

    public final boolean zzaQ(zzv zzvVar) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || zzadrVar.zze()) {
            return true;
        }
        try {
            zzadrVar.zzd(zzvVar);
            return true;
        } catch (zzadq e) {
            throw zzN(e, zzvVar, false, 7000);
        }
    }

    public final void zzaR(zzih zzihVar) throws zziw {
        int zzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaS & 32) == 0) {
            this.zzC++;
        }
    }

    public final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    public final boolean zzaT(zzih zzihVar) {
        boolean z = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z = true;
            }
            if (z) {
                ((zzuu) this).zza.zzd++;
            }
        }
        return z;
    }

    public final void zzaV(long j) {
        super.zzaV(j);
        this.zzC--;
    }

    public final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        boolean z;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzs != null;
        List zzbn = zzbn(context, zzuwVar, zzvVar, z2, false);
        if (z2 && zzbn.isEmpty()) {
            zzbn = zzbn(context, zzuwVar, zzvVar, false, false);
        }
        if (zzbn.isEmpty()) {
            return 129;
        }
        if (!zzuu.zzbd(zzvVar)) {
            return 130;
        }
        zzun zzunVar = (zzun) zzbn.get(0);
        boolean zzc2 = zzunVar.zzc(zzvVar);
        if (zzc2) {
            z = true;
        } else {
            for (int i2 = 1; i2 < zzbn.size(); i2++) {
                zzun zzunVar2 = (zzun) zzbn.get(i2);
                if (zzunVar2.zzc(zzvVar)) {
                    zzc2 = true;
                    z = false;
                    zzunVar = zzunVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzunVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzunVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            List zzbn2 = zzbn(context, zzuwVar, zzvVar, z2, true);
            if (!zzbn2.isEmpty()) {
                zzun zzunVar3 = (zzun) zzvg.zze(zzbn2, zzvVar).get(0);
                if (zzunVar3.zzc(zzvVar) && zzunVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    public final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z) throws zzuy {
        return zzvg.zze(zzbn(this.zze, zzuwVar, zzvVar, false, false), zzvVar);
    }

    public final zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        int i;
        int i2;
        zzacb zzacbVar;
        Point point;
        int i3;
        boolean z;
        zzv[] zzvVarArr;
        char c;
        boolean z2;
        Pair zzd2;
        int zzat;
        zzv[] zzI = zzI();
        int length = zzI.length;
        int zzbh = zzbh(zzunVar, zzvVar);
        int i4 = zzvVar.zzw;
        int i5 = zzvVar.zzv;
        if (length == 1) {
            if (zzbh != -1 && (zzat = zzat(zzunVar, zzvVar)) != -1) {
                zzbh = Math.min((int) (zzbh * 1.5f), zzat);
            }
            zzacbVar = new zzacb(i5, i4, zzbh);
            i = i4;
            i2 = i5;
        } else {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z3 = false;
            while (i8 < length) {
                zzv zzvVar2 = zzI[i8];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVar2.zzE == null) {
                    zzt zza = zzvVar2.zza();
                    zza.zzC(zziVar);
                    zzvVar2 = zza.zzM();
                }
                if (zzunVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i9 = zzvVar2.zzv;
                    c = 65535;
                    if (i9 != -1) {
                        zzvVarArr = zzI;
                        if (zzvVar2.zzw != -1) {
                            z2 = false;
                        }
                        z3 |= z2;
                        i7 = Math.max(i7, i9);
                        i6 = Math.max(i6, zzvVar2.zzw);
                        zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                    } else {
                        zzvVarArr = zzI;
                    }
                    z2 = true;
                    z3 |= z2;
                    i7 = Math.max(i7, i9);
                    i6 = Math.max(i6, zzvVar2.zzw);
                    zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                } else {
                    zzvVarArr = zzI;
                    c = 65535;
                }
                i8++;
                zzI = zzvVarArr;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i6).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i7);
                sb.append("x");
                sb.append(i6);
                zzee.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i4 > i5;
                int i10 = z4 ? i4 : i5;
                int i11 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i12 = 0;
                while (true) {
                    if (i12 >= 9) {
                        i = i4;
                        i2 = i5;
                        break;
                    }
                    float f2 = i11;
                    i = i4;
                    float f3 = i10;
                    i2 = i5;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f4 = i13;
                    if (i13 <= i10 || (i3 = (int) (f4 * (f2 / f3))) <= i11) {
                        break;
                    }
                    int i14 = true != z4 ? i13 : i3;
                    if (true != z4) {
                        i13 = i3;
                    }
                    point = zzunVar.zzi(i14, i13);
                    float f5 = zzvVar.zzz;
                    if (point != null) {
                        z = z4;
                        if (zzunVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i12++;
                    i4 = i;
                    i5 = i2;
                    iArr = iArr2;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i6 = Math.max(i6, point.y);
                    zzt zza2 = zzvVar.zza();
                    zza2.zzt(i7);
                    zza2.zzu(i6);
                    zzbh = Math.max(zzbh, zzat(zzunVar, zza2.zzM()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 35 + String.valueOf(i6).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i6);
                    zzee.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                i = i4;
                i2 = i5;
            }
            zzacbVar = new zzacb(i7, i6, zzbh);
        }
        String str = zzunVar.zzc;
        this.zzm = zzacbVar;
        boolean z5 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f6 = zzvVar.zzz;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo) && (zzd2 = zzdo.zzd(zzvVar)) != null) {
            zzeh.zzb(mediaFormat, "profile", ((Integer) zzd2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacbVar.zza);
        mediaFormat.setInteger("max-height", zzacbVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzacbVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface zzbt = zzbt(zzunVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuh.zzb(zzunVar, mediaFormat, zzvVar, zzbt, null);
    }

    public final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zzio zzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        zzacb zzacbVar = this.zzm;
        zzacbVar.getClass();
        if (zzvVar2.zzv > zzacbVar.zza || zzvVar2.zzw > zzacbVar.zzb) {
            i3 |= 256;
        }
        if (zzbh(zzunVar, zzvVar2) > zzacbVar.zzc) {
            i3 |= 64;
        }
        String str = zzunVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzf.zzd;
            i2 = 0;
        }
        return new zzio(str, zzvVar, zzvVar2, i, i2);
    }

    public final float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        zzun zzaH;
        float f2 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.zzz;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzD == null || (zzaH = zzaH()) == null) {
            return f4;
        }
        float zzh = zzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f4 != -1.0f ? Math.max(f4, zzh) : zzh;
    }

    public final void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzn = zzbl(str);
        zzun zzaH = zzaH();
        zzaH.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaH.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z;
    }

    public final void zzak(String str) {
        this.zzg.zzh(str);
    }

    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    public final zzio zzam(zzlh zzlhVar) throws zziw {
        zzio zzam = super.zzam(zzlhVar);
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzam);
        return zzam;
    }

    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        zzuk zzaE = zzaE();
        if (zzaE != null) {
            zzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzB;
        int i = zzvVar.zzA;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzI = new zzbv(integer, integer2, f);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zza = zzvVar.zza();
            zza.zzt(integer);
            zza.zzu(integer2);
            zza.zzz(f);
            zzv zzM = zza.zzM();
            int i3 = this.zzr;
            List list = this.zzs;
            if (list == null) {
                list = zzguf.zzi();
            }
            zzadrVar.zzs(1, zzM, zzbc(), i3, list);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    public final boolean zzao(long j, long j2, long j3, boolean z, boolean z2) throws zziw {
        int zzP;
        if (this.zzp != null && this.zzf) {
            j2 -= -this.zzN;
        }
        if (j >= -500000 || z || (zzP = zzP(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzin zzinVar = ((zzuu) this).zza;
            int i = zzinVar.zzd + zzP;
            zzinVar.zzd = i;
            zzinVar.zzf += this.zzC;
            zzinVar.zzd = i + this.zzl.size();
        } else {
            ((zzuu) this).zza.zzj++;
            zzaw(zzP + this.zzl.size(), this.zzC);
        }
        zzaJ();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzg(false);
        }
        return true;
    }

    public final void zzap() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
            long j = this.zzN;
            if (j == -9223372036854775807L) {
                j = zzbc();
                this.zzN = j;
            }
            this.zzp.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    public final boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zziw {
        zzukVar.getClass();
        long zzbb = j3 - zzbb();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaw(i4, 0);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            if (!z || z2) {
                return zzadrVar.zzu(j3, new zzaby(this, zzukVar, i, zzbb));
            }
            zzau(zzukVar, i, zzbb);
            return true;
        }
        zzacs zzacsVar = this.zzi;
        long zzbc = zzbc();
        zzacq zzacqVar = this.zzj;
        int zzk = zzacsVar.zzk(j3, j, j2, zzbc, z, z2, zzacqVar);
        if (zzk == 0) {
            long zzc2 = zzL().zzc();
            zzbr(zzbb, zzc2, zzvVar);
            zzay(zzukVar, i, zzbb, zzc2);
            zzax(zzacqVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzav(zzukVar, i, zzbb);
                zzax(zzacqVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzau(zzukVar, i, zzbb);
            zzax(zzacqVar.zza());
            return true;
        }
        long zzb2 = zzacqVar.zzb();
        long zza = zzacqVar.zza();
        if (zzb2 == this.zzH) {
            zzau(zzukVar, i, zzbb);
        } else {
            zzbr(zzbb, zzb2, zzvVar);
            zzay(zzukVar, i, zzbb, zzb2);
        }
        zzax(zza);
        this.zzH = zzb2;
        return true;
    }

    public final void zzar() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
        }
    }

    @TargetApi(29)
    public final void zzas(zzih zzihVar) throws zziw {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzuk zzaE = zzaE();
                        zzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    public final void zzau(zzuk zzukVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzukVar.zzc(i, false);
        Trace.endSection();
        ((zzuu) this).zza.zzf++;
    }

    public final void zzav(zzuk zzukVar, int i, long j) {
        Trace.beginSection("dropVideoBuffer");
        zzukVar.zzc(i, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    public final void zzaw(int i, int i2) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzh += i;
        int i3 = i + i2;
        zzinVar.zzg += i3;
        this.zzA += i3;
        int i4 = this.zzB + i3;
        this.zzB = i4;
        zzinVar.zzi = Math.max(i4, zzinVar.zzi);
    }

    public final void zzax(long j) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzk += j;
        zzinVar.zzl++;
        this.zzF += j;
        this.zzG++;
    }

    public final void zzay(zzuk zzukVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzukVar.zzd(i, j2);
        Trace.endSection();
        ((zzuu) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    public final boolean zzbg(zzun zzunVar) {
        if (zzbl(zzunVar.zza)) {
            return false;
        }
        return !zzunVar.zzf || zzace.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    public final void zzx(int i, Object obj) throws zziw {
        if (i == 1) {
            zzbo(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzacp zzacpVar = (zzacp) obj;
            this.zzM = zzacpVar;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzl(zzacpVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzL != intValue) {
                this.zzL = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzx = intValue2;
            zzuk zzaE = zzaE();
            if (zzaE != null) {
                zzaE.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzy = intValue3;
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadr zzadrVar3 = this.zzp;
                if (zzadrVar3 == null || !zzadrVar3.zze()) {
                    return;
                }
                zzadrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadr zzadrVar4 = this.zzp;
            if (zzadrVar4 != null) {
                zzadrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadr zzadrVar5 = this.zzp;
            if (zzadrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadrVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzuk zzaE2 = zzaE();
                if (zzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzacc) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzD != null;
                zzms zzmsVar = (zzms) obj;
                this.zzD = zzmsVar;
                if (z != (zzmsVar != null)) {
                    zzaZ();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }

    public final void zzy(boolean z, boolean z2) throws zziw {
        super.zzy(z, z2);
        zzJ();
        this.zzg.zza(((zzuu) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzacg zzacgVar = new zzacg(this.zze, this.zzi);
                zzacgVar.zza(true);
                long j = this.zzk;
                zzacgVar.zzc(j != -9223372036854775807L ? -j : -9223372036854775807L);
                zzacgVar.zzb(zzL());
                zzaco zzd2 = zzacgVar.zzd();
                zzd2.zza(1);
                this.zzp = zzd2.zzb(0);
            }
            this.zzq = true;
        }
        int i = !z2 ? 1 : 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            zzacs zzacsVar = this.zzi;
            zzacsVar.zzg(zzL());
            zzacsVar.zza(i);
            return;
        }
        zzadrVar.zzc(new zzabx(this), zzhaf.zza());
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            this.zzp.zzl(zzacpVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i;
        zzaz();
    }

    public final void zzz(zzv[] zzvVarArr, long j, long j2, zzwk zzwkVar) throws zziw {
        super.zzz(zzvVarArr, j, j2, zzwkVar);
        zzbf zzM = zzM();
        if (zzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzM.zzo(zzwkVar.zza, new zzbd()).zzd;
        }
    }
}
