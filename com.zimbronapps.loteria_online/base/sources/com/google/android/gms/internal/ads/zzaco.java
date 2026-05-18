package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzg = zzacgVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzi = zzacgVar.zzi();
        this.zzf = zzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzk = zzacgVar.zzk();
        this.zzi = zzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzk, zzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    public static final /* synthetic */ zzi zzB(zzi zziVar) {
        return zzC(zziVar);
    }

    private static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[Catch: zzdu -> 0x0031, TRY_LEAVE, TryCatch #0 {zzdu -> 0x0031, blocks: (B:6:0x0010, B:8:0x0015, B:10:0x001b, B:12:0x0023, B:24:0x0033, B:26:0x0039, B:29:0x0040, B:34:0x0061), top: B:5:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r11, int r12) {
        /*
            r10 = this;
            int r12 = r10.zzo
            if (r12 != 0) goto L6
            r12 = 1
            goto L7
        L6:
            r12 = 0
        L7:
            com.google.android.gms.internal.ads.zzgrc.zzi(r12)
            com.google.android.gms.internal.ads.zzi r12 = r11.zzE
            com.google.android.gms.internal.ads.zzi r12 = zzC(r12)
            int r0 = r12.zzd     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            r1 = 7
            if (r0 != r1) goto L33
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            r2 = 34
            if (r0 >= r2) goto L21
            boolean r0 = com.google.android.gms.internal.ads.zzdv.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            if (r0 != 0) goto L23
        L21:
            r0 = r1
            goto L33
        L23:
            com.google.android.gms.internal.ads.zzh r12 = r12.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            r0 = 6
            r12.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            com.google.android.gms.internal.ads.zzi r12 = r12.zzg()     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
        L2f:
            r2 = r12
            goto L64
        L31:
            r12 = move-exception
            goto L91
        L33:
            boolean r1 = com.google.android.gms.internal.ads.zzdv.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            if (r1 != 0) goto L5a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            r2 = 29
            if (r1 >= r2) goto L40
            goto L5a
        L40:
            java.lang.String r12 = "PlaybackVidGraphWrapper"
            java.lang.String r1 = "Color transfer %d is not supported. Falling back to OpenGl tone mapping."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfj.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            java.util.Locale r2 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            java.lang.String r0 = java.lang.String.format(r2, r1, r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            com.google.android.gms.internal.ads.zzee.zzc(r12, r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            goto L2f
        L5a:
            r1 = 2
            if (r0 == r1) goto L61
            r1 = 10
            if (r0 != r1) goto L2f
        L61:
            com.google.android.gms.internal.ads.zzi r12 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L31
            goto L2f
        L64:
            com.google.android.gms.internal.ads.zzdn r12 = r10.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r9 = 0
            com.google.android.gms.internal.ads.zzdx r12 = r12.zzd(r0, r9)
            r10.zzl = r12
            com.google.android.gms.internal.ads.zzbs r0 = r10.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            android.content.Context r1 = r10.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            com.google.android.gms.internal.ads.zzl r3 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            java.util.Objects.requireNonNull(r12)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            com.google.android.gms.internal.ads.zzach r5 = new com.google.android.gms.internal.ads.zzach     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            r5.<init>(r12)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            r6 = 0
            r8 = 0
            r4 = r10
            r0.zza(r1, r2, r3, r4, r5, r6, r8)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
            throw r9     // Catch: com.google.android.gms.internal.ads.zzbo -> L8a
        L8a:
            r12 = move-exception
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r12, r11)
            throw r0
        L91:
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r12, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    public final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new zzacj(this));
        }
    }

    public final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    public final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    public final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    public final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
