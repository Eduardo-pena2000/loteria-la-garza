package com.google.android.gms.internal.ads;

import S5.V0;
import S5.X;
import S5.d0;
import S5.d1;
import S5.e2;
import S5.g1;
import S5.k1;
import S5.l2;
import S5.p0;
import S5.q2;
import S5.t0;
import S5.w0;
import S5.w2;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfez extends X implements U5.E, zzber {
    protected zzctr zza;
    private final zzcma zzb;
    private final Context zzc;
    private final String zze;
    private final zzfet zzf;
    private final zzfer zzg;
    private final W5.a zzh;
    private final zzdxz zzi;
    private zzcte zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfez(zzcma zzcmaVar, Context context, String str, zzfet zzfetVar, zzfer zzferVar, W5.a aVar, zzdxz zzdxzVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfetVar;
        this.zzg = zzferVar;
        this.zzh = aVar;
        this.zzi = zzdxzVar;
        zzferVar.zzq(this);
    }

    private final synchronized void zzV(int i) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzt();
                zzcte zzcteVar = this.zzk;
                if (zzcteVar != null) {
                    R5.t.k().zzc(zzcteVar);
                }
                if (this.zza != null) {
                    long j = -1;
                    if (this.zzj != -1) {
                        j = R5.t.o().b() - this.zzj;
                    }
                    this.zza.zze(j, i);
                }
                zzc();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzA() {
        return false;
    }

    public final synchronized boolean zzB() {
        return this.zzf.zzb();
    }

    public final void zzC(zzcam zzcamVar) {
    }

    public final void zzD(String str) {
    }

    public final void zzE(String str) {
    }

    public final synchronized g1 zzF() {
        return null;
    }

    public final synchronized void zzG(e2 e2Var) {
    }

    public final void zzI(w2 w2Var) {
        this.zzf.zzd(w2Var);
    }

    public final void zzJ(zzbfa zzbfaVar) {
        this.zzg.zzo(zzbfaVar);
    }

    public final void zzK(boolean z) {
    }

    public final /* synthetic */ void zzL() {
        zzV(5);
    }

    public final /* synthetic */ void zzM() {
        this.zzb.zzb().execute(new zzfey(this));
    }

    public final /* synthetic */ zzfer zzN() {
        return this.zzg;
    }

    public final /* synthetic */ zzdxz zzO() {
        return this.zzi;
    }

    public final void zzT(long j) {
    }

    public final long zzU() {
        return 0L;
    }

    public final synchronized void zzY(t0 t0Var) {
    }

    public final void zza() {
        zzV(3);
    }

    public final N6.a zzb() {
        return null;
    }

    public final synchronized void zzc() {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        zzctr zzctrVar = this.zza;
        if (zzctrVar != null) {
            zzctrVar.zzd();
        }
    }

    public final boolean zzd() {
        return false;
    }

    public final void zzdS() {
    }

    public final void zzdT(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzV(2);
            return;
        }
        if (i2 == 1) {
            zzV(4);
        } else if (i2 != 2) {
            zzV(6);
        } else {
            zzV(3);
        }
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final synchronized void zzdv() {
        zzctr zzctrVar = this.zza;
        if (zzctrVar != null) {
            zzctrVar.zze(R5.t.o().b() - this.zzj, 1);
        }
    }

    public final void zzdw() {
    }

    public final void zzdx() {
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zze(S5.l2 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzd     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmF     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L93
        L2f:
            W5.a r2 = r5.zzh     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzmG     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.zzd(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.t.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            R5.t.g()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            boolean r0 = V5.F0.m(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L70
            S5.b0 r0 = r6.s     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5c
            goto L70
        L5c:
            int r6 = V5.o0.b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            W5.p.c(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfer r6 = r5.zzg     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            S5.c1 r0 = com.google.android.gms.internal.ads.zzfkm.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.zzdI(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L70:
            boolean r0 = r5.zzB()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L78
            monitor-exit(r5)
            return r1
        L78:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.zzd = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfev r0 = new com.google.android.gms.internal.ads.zzfev     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfet r1 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfew r3 = new com.google.android.gms.internal.ads.zzfew     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.zza(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfez.zze(S5.l2):boolean");
    }

    public final synchronized void zzf() {
        com.google.android.gms.common.internal.t.e("pause must be called on the main UI thread.");
    }

    public final synchronized void zzg() {
        com.google.android.gms.common.internal.t.e("resume must be called on the main UI thread.");
    }

    public final synchronized void zzh() {
        if (this.zza != null) {
            this.zzj = R5.t.o().b();
            int zzc = this.zza.zzc();
            if (zzc > 0) {
                zzcte zzcteVar = new zzcte(this.zzb.zzc(), R5.t.o());
                this.zzk = zzcteVar;
                zzcteVar.zzb(zzc, new zzfex(this));
            }
        }
    }

    public final Bundle zzk() {
        return new Bundle();
    }

    public final synchronized void zzl() {
    }

    public final synchronized void zzm() {
    }

    public final synchronized q2 zzn() {
        return null;
    }

    public final synchronized void zzo(q2 q2Var) {
        com.google.android.gms.common.internal.t.e("setAdSize must be called on the main UI thread.");
    }

    public final void zzp(zzbyb zzbybVar) {
    }

    public final void zzq(zzbye zzbyeVar, String str) {
    }

    public final synchronized String zzr() {
        return null;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized d1 zzt() {
        return null;
    }

    public final synchronized String zzu() {
        return this.zze;
    }

    public final p0 zzv() {
        return null;
    }

    public final S5.K zzw() {
        return null;
    }

    public final synchronized void zzx(zzbhz zzbhzVar) {
    }

    public final synchronized void zzz(boolean z) {
    }

    public final void zzH(k1 k1Var) {
    }

    public final void zzP(V0 v0) {
    }

    public final void zzR(N6.a aVar) {
    }

    public final void zzS(w0 w0Var) {
    }

    public final void zzdR(S5.K k) {
    }

    public final void zzi(p0 p0Var) {
    }

    public final void zzj(d0 d0Var) {
    }

    public final void zzy(S5.H h) {
    }

    public final void zzQ(l2 l2Var, S5.N n) {
    }
}
