package com.google.android.gms.internal.ads;

import S5.d0;
import S5.d1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfio extends zzcai {
    private final zzfie zza;
    private final zzfhv zzb;
    private final zzfjd zzc;
    private zzdtz zzd;
    private boolean zze = false;

    public zzfio(zzfie zzfieVar, zzfhv zzfhvVar, zzfjd zzfjdVar) {
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzc = zzfjdVar;
    }

    private final synchronized boolean zzy() {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar != null) {
            if (!zzdtzVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) S5.D.c().zzd(com.google.android.gms.internal.ads.zzbhe.zzgx)).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzcan r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.t.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzgv     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcdu r2 = R5.t.l()     // Catch: java.lang.Throwable -> L20
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzgx     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfhx r0 = new com.google.android.gms.internal.ads.zzfhx     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfie r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            S5.l2 r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfim r3 = new com.google.android.gms.internal.ads.zzfim     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfio.zzb(com.google.android.gms.internal.ads.zzcan):void");
    }

    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    public final void zzd(zzcam zzcamVar) throws RemoteException {
        com.google.android.gms.common.internal.t.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcamVar);
    }

    public final boolean zze() throws RemoteException {
        com.google.android.gms.common.internal.t.e("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    public final void zzf() {
        zzi(null);
    }

    public final void zzg() {
        zzj(null);
    }

    public final void zzh() throws RemoteException {
        zzk(null);
    }

    public final synchronized void zzi(N6.a aVar) {
        com.google.android.gms.common.internal.t.e("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(aVar == null ? null : (Context) N6.b.r1(aVar));
        }
    }

    public final synchronized void zzj(N6.a aVar) {
        com.google.android.gms.common.internal.t.e("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(aVar == null ? null : (Context) N6.b.r1(aVar));
        }
    }

    public final synchronized void zzk(N6.a aVar) {
        com.google.android.gms.common.internal.t.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (aVar != null) {
                context = (Context) N6.b.r1(aVar);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    public final synchronized String zzl() throws RemoteException {
        zzdtz zzdtzVar = this.zzd;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    public final synchronized void zzm(String str) throws RemoteException {
        com.google.android.gms.common.internal.t.e("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    public final void zzn(d0 d0Var) {
        com.google.android.gms.common.internal.t.e("setAdMetadataListener can only be called from the UI thread.");
        if (d0Var == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfin(this, d0Var));
        }
    }

    public final Bundle zzo() {
        com.google.android.gms.common.internal.t.e("getAdMetadata can only be called from the UI thread.");
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    public final synchronized void zzp(N6.a aVar) throws RemoteException {
        try {
            com.google.android.gms.common.internal.t.e("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object r1 = N6.b.r1(aVar);
                    if (r1 instanceof Activity) {
                        activity = (Activity) r1;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzq(String str) throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    public final synchronized void zzr(boolean z) {
        com.google.android.gms.common.internal.t.e("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    public final boolean zzs() {
        zzdtz zzdtzVar = this.zzd;
        return zzdtzVar != null && zzdtzVar.zzf();
    }

    public final synchronized d1 zzt() throws RemoteException {
        zzdtz zzdtzVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzd) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    public final void zzu(zzcah zzcahVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzcahVar);
    }

    public final /* synthetic */ zzfjd zzv() {
        return this.zzc;
    }

    public final /* synthetic */ zzdtz zzw() {
        return this.zzd;
    }

    public final /* synthetic */ void zzx(zzdtz zzdtzVar) {
        this.zzd = zzdtzVar;
    }
}
