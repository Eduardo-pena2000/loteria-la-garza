package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzflv {
    private final zzfkz zza;
    private final zzfls zzb;
    private final zzfkv zzc;
    private zzfmb zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzflv(zzfkz zzfkzVar, zzfkv zzfkvVar, zzfls zzflsVar) {
        this.zza = zzfkzVar;
        this.zzc = zzfkvVar;
        this.zzb = zzflsVar;
        zzfkvVar.zza(new zzflu(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfmb(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzflq(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzd() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzhi     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2f
            com.google.android.gms.internal.ads.zzcdu r0 = R5.t.l()     // Catch: java.lang.Throwable -> L2d
            V5.q0 r0 = r0.zzo()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzcdp r0 = r0.zzi()     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L26
            goto L2f
        L26:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2d
            r0.clear()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            return
        L2d:
            r0 = move-exception
            goto L6e
        L2f:
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6c
        L35:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L6c
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzflt r0 = (com.google.android.gms.internal.ads.zzflt) r0     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L57
            com.google.android.gms.internal.ads.zzflj r1 = r0.zzb()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzfkz r1 = r4.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzflj r2 = r0.zzb()     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.zzc(r2)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L35
        L57:
            com.google.android.gms.internal.ads.zzfkz r1 = r4.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfls r2 = r4.zzb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfmb r3 = new com.google.android.gms.internal.ads.zzfmb     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L2d
            r4.zze = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzflq r1 = new com.google.android.gms.internal.ads.zzflq     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2d
            r3.zza(r1)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            return
        L6c:
            monitor-exit(r4)
            return
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflv.zzd():void");
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzflt zzfltVar) {
        this.zzd.add(zzfltVar);
    }

    public final synchronized x7.e zzb(zzflt zzfltVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfltVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfmb zzfmbVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
