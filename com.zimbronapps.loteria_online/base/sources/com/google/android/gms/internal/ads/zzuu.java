package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzuq zzC;
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;
    private zzv zzn;
    private zzv zzo;
    private zzth zzp;
    private zzth zzq;
    private zzmk zzr;
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzuk zzw;
    private zzv zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i, zzui zzuiVar, zzuw zzuwVar, boolean z, float f) {
        super(i);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i) throws zziw {
        zzlh zzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int zzO = zzO(zzH, zzihVar, i | 4);
        if (zzO == -5) {
            zzam(zzH);
            return true;
        }
        if (zzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(zzv zzvVar) throws zziw {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f = this.zzv;
            zzvVar.getClass();
            float zzai = zzai(f, zzvVar, zzI());
            float f2 = this.zzA;
            if (f2 != zzai) {
                if (zzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f2 != -1.0f || zzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = zzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw {
        int i = this.zzY;
        if (i == 1) {
            zzav();
            return;
        }
        if (i == 2) {
            zzav();
            zzbp();
        } else if (i != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzo;
        if (zzvVar == null || !Objects.equals(zzvVar.zzo, "audio/opus")) {
            return true;
        }
        return !zzafu.zzf(j, j2);
    }

    public void zzA(long j, boolean z, boolean z2) throws zziw {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    public void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    public final long zzT(long j, long j2) {
        return zzah(j, j2, this.zzL);
    }

    public void zzV(float f, float f2) throws zziw {
        this.zzu = f;
        this.zzv = f2;
        zzbj(this.zzx);
    }

    /*  JADX ERROR: Type inference failed
        LI11I1ll1Ii11.iliLiI1iLLIL: Type inference error: updates count limit reached
        	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
        	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:21)
        */
    public void zzX(long r26, long r28) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzX(long, long):void");
    }

    public boolean zzY() {
        throw null;
    }

    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0291 A[Catch: zzuq -> 0x0294, TryCatch #5 {zzuq -> 0x0294, blocks: (B:99:0x0278, B:101:0x0291, B:102:0x029c, B:107:0x02a3, B:108:0x02a5, B:109:0x0296, B:175:0x02a9, B:177:0x02aa, B:180:0x02b3, B:181:0x02b4, B:182:0x02c0, B:194:0x02c4), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296 A[Catch: zzuq -> 0x0294, TryCatch #5 {zzuq -> 0x0294, blocks: (B:99:0x0278, B:101:0x0291, B:102:0x029c, B:107:0x02a3, B:108:0x02a5, B:109:0x0296, B:175:0x02a9, B:177:0x02aa, B:180:0x02b3, B:181:0x02b4, B:182:0x02c0, B:194:0x02c4), top: B:26:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159 A[Catch: Exception -> 0x0107, TryCatch #6 {Exception -> 0x0107, blocks: (B:151:0x00fd, B:55:0x0148, B:57:0x0159, B:58:0x016e, B:60:0x0177, B:62:0x017f, B:64:0x0189, B:66:0x0191, B:68:0x0199, B:71:0x01a4, B:73:0x01aa, B:76:0x01b5, B:78:0x01be, B:82:0x0215, B:84:0x021b, B:86:0x0221, B:87:0x022f, B:114:0x01cb, B:116:0x01d3, B:118:0x01db, B:120:0x01e3, B:122:0x01eb, B:124:0x01f3, B:126:0x01fb, B:128:0x0205, B:130:0x020f), top: B:150:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa A[Catch: Exception -> 0x0107, TryCatch #6 {Exception -> 0x0107, blocks: (B:151:0x00fd, B:55:0x0148, B:57:0x0159, B:58:0x016e, B:60:0x0177, B:62:0x017f, B:64:0x0189, B:66:0x0191, B:68:0x0199, B:71:0x01a4, B:73:0x01aa, B:76:0x01b5, B:78:0x01be, B:82:0x0215, B:84:0x021b, B:86:0x0221, B:87:0x022f, B:114:0x01cb, B:116:0x01d3, B:118:0x01db, B:120:0x01e3, B:122:0x01eb, B:124:0x01f3, B:126:0x01fb, B:128:0x0205, B:130:0x020f), top: B:150:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021b A[Catch: Exception -> 0x0107, TryCatch #6 {Exception -> 0x0107, blocks: (B:151:0x00fd, B:55:0x0148, B:57:0x0159, B:58:0x016e, B:60:0x0177, B:62:0x017f, B:64:0x0189, B:66:0x0191, B:68:0x0199, B:71:0x01a4, B:73:0x01aa, B:76:0x01b5, B:78:0x01be, B:82:0x0215, B:84:0x021b, B:86:0x0221, B:87:0x022f, B:114:0x01cb, B:116:0x01d3, B:118:0x01db, B:120:0x01e3, B:122:0x01eb, B:124:0x01f3, B:126:0x01fb, B:128:0x0205, B:130:0x020f), top: B:150:0x00fd }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaA() throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzaA():void");
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaC(zzun zzunVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    public final zzuk zzaE() {
        return this.zzw;
    }

    public final zzv zzaF() {
        return this.zzx;
    }

    public final MediaFormat zzaG() {
        return this.zzy;
    }

    public final zzun zzaH() {
        return this.zzD;
    }

    public final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzak(zzunVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th;
        }
    }

    public final boolean zzaJ() throws zziw {
        boolean zzau = zzau();
        if (zzau) {
            zzaA();
        }
        return zzau;
    }

    public boolean zzaK() {
        int i = this.zzY;
        if (i == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    public boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    public void zzaR(zzih zzihVar) throws zziw {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    public void zzaV(long j) {
        this.zzah = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    public final float zzaX() {
        return this.zzu;
    }

    public final zzmk zzaY() {
        return this.zzr;
    }

    public final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e) {
            throw zzN(e, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    public abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z) throws zzuy;

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    public zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j, long j2, boolean z) {
        return super.zzT(j, j2);
    }

    public float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzio zzam(com.google.android.gms.internal.ads.zzlh r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzam(com.google.android.gms.internal.ads.zzlh):com.google.android.gms.internal.ads.zzio");
    }

    public void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zziw;

    public void zzar() throws zziw {
        throw null;
    }

    public void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    public final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    public final int zzu() {
        return 8;
    }

    public void zzx(int i, Object obj) throws zziw {
        if (i == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    public void zzy(boolean z, boolean z2) throws zziw {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzwk r18) throws com.google.android.gms.internal.ads.zziw {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            boolean r1 = r0.zzaj
            if (r1 == 0) goto L5b
            r12.zzap()
            return
        L27:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.zzac
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.zzah
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            com.google.android.gms.internal.ads.zzut r1 = new com.google.android.gms.internal.ads.zzut
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzbn(r1)
            com.google.android.gms.internal.ads.zzut r1 = r0.zzag
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5b
            r12.zzap()
        L5b:
            return
        L5c:
            com.google.android.gms.internal.ads.zzut r9 = new com.google.android.gms.internal.ads.zzut
            long r3 = r0.zzac
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwk):void");
    }
}
