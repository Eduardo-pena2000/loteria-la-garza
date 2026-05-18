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
import V5.F0;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzequ extends X implements zzdeb {
    private final Context zza;
    private final zzfff zzb;
    private final String zzc;
    private final zzerp zzd;
    private q2 zze;
    private final zzfjj zzf;
    private final W5.a zzg;
    private final zzdxz zzh;
    private zzctx zzi;

    public zzequ(Context context, q2 q2Var, String str, zzfff zzfffVar, zzerp zzerpVar, W5.a aVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzfffVar;
        this.zze = q2Var;
        this.zzc = str;
        this.zzd = zzerpVar;
        this.zzf = zzfffVar.zzg();
        this.zzg = aVar;
        this.zzh = zzdxzVar;
        zzfffVar.zzi(this);
    }

    private final synchronized void zzO(q2 q2Var) {
        zzfjj zzfjjVar = this.zzf;
        zzfjjVar.zzc(q2Var);
        zzfjjVar.zze(this.zze.n);
    }

    private final synchronized boolean zzV(l2 l2Var) throws RemoteException {
        try {
            if (zzW()) {
                com.google.android.gms.common.internal.t.e("loadAd must be called on the main UI thread.");
            }
            R5.t.g();
            Context context = this.zza;
            if (!F0.m(context) || l2Var.s != null) {
                zzfkh.zzb(context, l2Var.f);
                return this.zzb.zza(l2Var, this.zzc, null, new zzeqt(this));
            }
            int i = o0.b;
            W5.p.c("Failed to load the ad because app ID is missing.");
            zzerp zzerpVar = this.zzd;
            if (zzerpVar != null) {
                zzerpVar.zzdI(zzfkm.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzW() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmF
            com.google.android.gms.internal.ads.zzbhc r3 = S5.D.c()
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            W5.a r3 = r6.zzg
            int r3 = r3.c
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzmG
            com.google.android.gms.internal.ads.zzbhc r5 = S5.D.c()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzW():boolean");
    }

    public final synchronized boolean zzA() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            if (zzctxVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    public final void zzC(zzcam zzcamVar) {
    }

    public final void zzD(String str) {
    }

    public final void zzE(String str) {
    }

    public final synchronized g1 zzF() {
        com.google.android.gms.common.internal.t.e("getVideoController must be called from the main thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null) {
            return null;
        }
        return zzctxVar.zzc();
    }

    public final synchronized void zzG(e2 e2Var) {
        try {
            if (zzW()) {
                com.google.android.gms.common.internal.t.e("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(e2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzJ(zzbfa zzbfaVar) {
    }

    public final void zzK(boolean z) {
    }

    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfff zzfffVar = this.zzb;
        if (zzfffVar.zzh()) {
            zzfffVar.zzc();
        } else {
            zzfffVar.zzk();
        }
    }

    public final /* synthetic */ zzctx zzM() {
        return this.zzi;
    }

    public final /* synthetic */ void zzN(zzctx zzctxVar) {
        this.zzi = zzctxVar;
    }

    public final void zzP(V0 v0) {
        if (zzW()) {
            com.google.android.gms.common.internal.t.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!v0.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzo(v0);
    }

    public final synchronized void zzT(long j) {
        this.zzf.zzx(j);
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return;
        }
        zzctxVar.zzo().zzb(j);
    }

    public final synchronized long zzU() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzctxVar.zzo().zza();
    }

    public final synchronized void zzY(t0 t0Var) {
        com.google.android.gms.common.internal.t.e("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzZ(t0Var);
    }

    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzfjj zzfjjVar = this.zzf;
            q2 zzf = zzfjjVar.zzf();
            if (this.zzi != null && zzfjjVar.zzC()) {
                zzf = zzfjq.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(zzf);
            zzfjjVar.zzd(true);
            try {
                zzV(zzfjjVar.zzb());
            } catch (RemoteException unused) {
                int i = o0.b;
                W5.p.f("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final N6.a zzb() {
        if (zzW()) {
            com.google.android.gms.common.internal.t.e("getAdFrame must be called on the main UI thread.");
        }
        return N6.b.s1(this.zzb.zzd());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zze     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmC     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            W5.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.t.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.zzd()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzc():void");
    }

    public final boolean zzd() {
        return false;
    }

    public final void zzdR(S5.K k) {
        if (zzW()) {
            com.google.android.gms.common.internal.t.e("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(k);
    }

    public final synchronized boolean zze(l2 l2Var) throws RemoteException {
        zzO(this.zze);
        return zzV(l2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzf() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzg     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmD     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            W5.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.t.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdce r0 = r0.zzl()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zza(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzf():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbjc.zzh     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzmB     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            W5.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L38
            int r0 = r0.c     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzmH     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.t.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.zzctx r0 = r3.zzi     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzdce r0 = r0.zzl()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzequ.zzg():void");
    }

    public final void zzi(p0 p0Var) {
        if (zzW()) {
            com.google.android.gms.common.internal.t.e("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(p0Var);
    }

    public final void zzj(d0 d0Var) {
        com.google.android.gms.common.internal.t.e("setAdMetadataListener must be called on the main UI thread.");
    }

    public final Bundle zzk() {
        com.google.android.gms.common.internal.t.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final void zzl() {
    }

    public final synchronized void zzm() {
        com.google.android.gms.common.internal.t.e("recordManualImpression must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzi();
        }
    }

    public final synchronized q2 zzn() {
        com.google.android.gms.common.internal.t.e("getAdSize must be called on the main UI thread.");
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            return zzfjq.zza(this.zza, Collections.singletonList(zzctxVar.zze()));
        }
        return this.zzf.zzf();
    }

    public final synchronized void zzo(q2 q2Var) {
        com.google.android.gms.common.internal.t.e("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(q2Var);
        this.zze = q2Var;
        zzctx zzctxVar = this.zzi;
        if (zzctxVar != null) {
            zzctxVar.zzb(this.zzb.zzd(), q2Var);
        }
    }

    public final void zzp(zzbyb zzbybVar) {
    }

    public final void zzq(zzbye zzbyeVar, String str) {
    }

    public final synchronized String zzr() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    public final synchronized String zzs() {
        zzctx zzctxVar = this.zzi;
        if (zzctxVar == null || zzctxVar.zzn() == null) {
            return null;
        }
        return zzctxVar.zzn().zze();
    }

    public final synchronized d1 zzt() {
        zzctx zzctxVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue() && (zzctxVar = this.zzi) != null) {
            return zzctxVar.zzn();
        }
        return null;
    }

    public final synchronized String zzu() {
        return this.zzc;
    }

    public final p0 zzv() {
        return this.zzd.zzk();
    }

    public final S5.K zzw() {
        return this.zzd.zzi();
    }

    public final synchronized void zzx(zzbhz zzbhzVar) {
        com.google.android.gms.common.internal.t.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbhzVar);
    }

    public final void zzy(S5.H h) {
        if (zzW()) {
            com.google.android.gms.common.internal.t.e("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(h);
    }

    public final synchronized void zzz(boolean z) {
        try {
            if (zzW()) {
                com.google.android.gms.common.internal.t.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzH(k1 k1Var) {
    }

    public final void zzI(w2 w2Var) {
    }

    public final void zzR(N6.a aVar) {
    }

    public final void zzS(w0 w0Var) {
    }

    public final void zzQ(l2 l2Var, S5.N n) {
    }
}
