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
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzerx extends X {
    private final q2 zza;
    private final Context zzb;
    private final zzfgv zzc;
    private final String zzd;
    private final W5.a zze;
    private final zzerp zzf;
    private final zzfhv zzg;
    private final zzazh zzh;
    private final zzdxz zzi;
    private zzdkn zzj;
    private boolean zzk = ((Boolean) S5.D.c().zzd(zzbhe.zzbk)).booleanValue();

    public zzerx(Context context, q2 q2Var, String str, zzfgv zzfgvVar, zzerp zzerpVar, zzfhv zzfhvVar, W5.a aVar, zzazh zzazhVar, zzdxz zzdxzVar) {
        this.zza = q2Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfgvVar;
        this.zzf = zzerpVar;
        this.zzg = zzfhvVar;
        this.zze = aVar;
        this.zzh = zzazhVar;
        this.zzi = zzdxzVar;
    }

    private final synchronized boolean zzN() {
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar != null) {
            if (!zzdknVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zzA() {
        return false;
    }

    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    public final void zzC(zzcam zzcamVar) {
        this.zzg.zzn(zzcamVar);
    }

    public final void zzD(String str) {
    }

    public final void zzE(String str) {
    }

    public final g1 zzF() {
        return null;
    }

    public final void zzJ(zzbfa zzbfaVar) {
    }

    public final synchronized void zzK(boolean z) {
        com.google.android.gms.common.internal.t.e("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final /* synthetic */ zzdkn zzL() {
        return this.zzj;
    }

    public final /* synthetic */ void zzM(zzdkn zzdknVar) {
        this.zzj = zzdknVar;
    }

    public final void zzP(V0 v0) {
        com.google.android.gms.common.internal.t.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!v0.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzo(v0);
    }

    public final void zzQ(l2 l2Var, S5.N n) {
        this.zzf.zzp(n);
        zze(l2Var);
    }

    public final synchronized void zzR(N6.a aVar) {
        if (this.zzj == null) {
            int i = o0.b;
            W5.p.f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfkm.zzd(9, null, null));
        } else {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) N6.b.r1(aVar));
        }
    }

    public final void zzS(w0 w0Var) {
        this.zzf.zzq(w0Var);
    }

    public final synchronized void zzT(long j) {
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar == null || zzdknVar.zzo() == null) {
            return;
        }
        zzdknVar.zzo().zzb(j);
    }

    public final synchronized long zzU() {
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar == null || zzdknVar.zzo() == null) {
            return 0L;
        }
        return zzdknVar.zzo().zza();
    }

    public final N6.a zzb() {
        return null;
    }

    public final synchronized void zzc() {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar != null) {
            zzdknVar.zzl().zzc(null);
        }
    }

    public final synchronized boolean zzd() {
        com.google.android.gms.common.internal.t.e("isLoaded must be called on the main UI thread.");
        return zzN();
    }

    public final void zzdR(S5.K k) {
        com.google.android.gms.common.internal.t.e("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(k);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zze(S5.l2 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzi     // Catch: java.lang.Throwable -> L2d
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
            goto L95
        L2f:
            W5.a r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L2d
            boolean r2 = V5.F0.m(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L70
            S5.b0 r2 = r6.s     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L70
            int r6 = V5.o0.b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            W5.p.c(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzerp r6 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            S5.c1 r0 = com.google.android.gms.internal.ads.zzfkm.zzd(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.zzdI(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L70:
            boolean r2 = r5.zzN()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L93
            boolean r1 = r6.f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfkh.zzb(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.zzj = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgv r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L2d
            S5.q2 r2 = r5.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgo r3 = new com.google.android.gms.internal.ads.zzfgo     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzerw r2 = new com.google.android.gms.internal.ads.zzerw     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.zza(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)
            return r1
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerx.zze(S5.l2):boolean");
    }

    public final synchronized void zzf() {
        com.google.android.gms.common.internal.t.e("pause must be called on the main UI thread.");
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar != null) {
            zzdknVar.zzl().zza(null);
        }
    }

    public final synchronized void zzg() {
        com.google.android.gms.common.internal.t.e("resume must be called on the main UI thread.");
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar != null) {
            zzdknVar.zzl().zzb(null);
        }
    }

    public final void zzi(p0 p0Var) {
        com.google.android.gms.common.internal.t.e("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzn(p0Var);
    }

    public final void zzj(d0 d0Var) {
        com.google.android.gms.common.internal.t.e("setAdMetadataListener must be called on the main UI thread.");
    }

    public final Bundle zzk() {
        com.google.android.gms.common.internal.t.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized void zzl() {
        com.google.android.gms.common.internal.t.e("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = o0.b;
            W5.p.f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfkm.zzd(9, null, null));
        } else {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    public final void zzm() {
    }

    public final q2 zzn() {
        return null;
    }

    public final void zzp(zzbyb zzbybVar) {
    }

    public final void zzq(zzbye zzbyeVar, String str) {
    }

    public final synchronized String zzr() {
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar == null || zzdknVar.zzn() == null) {
            return null;
        }
        return zzdknVar.zzn().zze();
    }

    public final synchronized String zzs() {
        zzdkn zzdknVar = this.zzj;
        if (zzdknVar == null || zzdknVar.zzn() == null) {
            return null;
        }
        return zzdknVar.zzn().zze();
    }

    public final synchronized d1 zzt() {
        zzdkn zzdknVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue() && (zzdknVar = this.zzj) != null) {
            return zzdknVar.zzn();
        }
        return null;
    }

    public final synchronized String zzu() {
        return this.zzd;
    }

    public final p0 zzv() {
        return this.zzf.zzk();
    }

    public final S5.K zzw() {
        return this.zzf.zzi();
    }

    public final synchronized void zzx(zzbhz zzbhzVar) {
        com.google.android.gms.common.internal.t.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbhzVar);
    }

    public final void zzz(boolean z) {
    }

    public final void zzG(e2 e2Var) {
    }

    public final void zzH(k1 k1Var) {
    }

    public final void zzI(w2 w2Var) {
    }

    public final void zzY(t0 t0Var) {
    }

    public final void zzo(q2 q2Var) {
    }

    public final void zzy(S5.H h) {
    }
}
