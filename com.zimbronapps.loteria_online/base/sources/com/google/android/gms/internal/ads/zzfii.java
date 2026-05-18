package com.google.android.gms.internal.ads;

import S5.S0;
import S5.V0;
import S5.d1;
import S5.l2;
import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfii extends zzcay {
    private final zzfie zza;
    private final zzfhv zzb;
    private final String zzc;
    private final zzfjd zzd;
    private final Context zze;
    private final W5.a zzf;
    private final zzazh zzg;
    private final zzdxz zzh;
    private zzdtz zzi;
    private boolean zzj = ((Boolean) S5.D.c().zzd(zzbhe.zzbk)).booleanValue();

    public zzfii(String str, zzfie zzfieVar, Context context, zzfhv zzfhvVar, zzfjd zzfjdVar, W5.a aVar, zzazh zzazhVar, zzdxz zzdxzVar) {
        this.zzc = str;
        this.zza = zzfieVar;
        this.zzb = zzfhvVar;
        this.zzd = zzfjdVar;
        this.zze = context;
        this.zzf = aVar;
        this.zzg = zzazhVar;
        this.zzh = zzdxzVar;
    }

    private final synchronized void zzx(l2 l2Var, zzcbg zzcbgVar, int i) throws RemoteException {
        try {
            if (!l2Var.zzb()) {
                boolean z = false;
                if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.zzf.c < ((Integer) S5.D.c().zzd(zzbhe.zzmG)).intValue() || !z) {
                    com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
                }
            }
            zzfhv zzfhvVar = this.zzb;
            zzfhvVar.zzh(zzcbgVar);
            R5.t.g();
            if (F0.m(this.zze) && l2Var.s == null) {
                int i2 = o0.b;
                W5.p.c("Failed to load the ad because app ID is missing.");
                zzfhvVar.zzdI(zzfkm.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfhx zzfhxVar = new zzfhx(null);
            zzfie zzfieVar = this.zza;
            zzfieVar.zzj(i);
            zzfieVar.zza(l2Var, this.zzc, zzfhxVar, new zzfih(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(N6.a aVar) throws RemoteException {
        zzk(aVar, this.zzj);
    }

    public final synchronized void zzc(l2 l2Var, zzcbg zzcbgVar) throws RemoteException {
        zzx(l2Var, zzcbgVar, 2);
    }

    public final synchronized void zzd(l2 l2Var, zzcbg zzcbgVar) throws RemoteException {
        zzx(l2Var, zzcbgVar, 3);
    }

    public final void zze(zzcbc zzcbcVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbcVar);
    }

    public final void zzf(S0 s0) {
        if (s0 == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfig(this, s0));
        }
    }

    public final Bundle zzg() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return zzdtzVar != null ? zzdtzVar.zzg() : new Bundle();
    }

    public final synchronized void zzh(zzcbn zzcbnVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzfjd zzfjdVar = this.zzd;
        zzfjdVar.zza = zzcbnVar.zza;
        zzfjdVar.zzb = zzcbnVar.zzb;
    }

    public final boolean zzi() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        return (zzdtzVar == null || zzdtzVar.zzb()) ? false : true;
    }

    public final synchronized String zzj() throws RemoteException {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzn() == null) {
            return null;
        }
        return zzdtzVar.zzn().zze();
    }

    public final synchronized void zzk(N6.a aVar, boolean z) throws RemoteException {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = o0.b;
            W5.p.f("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfkm.zzd(9, null, null));
        } else {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z, (Activity) N6.b.r1(aVar));
        }
    }

    public final zzcaw zzl() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar != null) {
            return zzdtzVar.zzc();
        }
        return null;
    }

    public final d1 zzm() {
        zzdtz zzdtzVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhG)).booleanValue() && (zzdtzVar = this.zzi) != null) {
            return zzdtzVar.zzn();
        }
        return null;
    }

    public final String zzn() {
        return this.zzc;
    }

    public final void zzo(V0 v0) {
        com.google.android.gms.common.internal.t.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!v0.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(v0);
    }

    public final synchronized void zzp(boolean z) {
        com.google.android.gms.common.internal.t.e("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    public final synchronized long zzq() {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return 0L;
        }
        return zzdtzVar.zzo().zza();
    }

    public final synchronized void zzr(long j) {
        zzdtz zzdtzVar = this.zzi;
        if (zzdtzVar == null || zzdtzVar.zzo() == null) {
            return;
        }
        zzdtzVar.zzo().zzb(j);
    }

    public final void zzs(zzcbh zzcbhVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzcbhVar);
    }

    public final /* synthetic */ zzfjd zzu() {
        return this.zzd;
    }

    public final /* synthetic */ zzdtz zzv() {
        return this.zzi;
    }

    public final /* synthetic */ void zzw(zzdtz zzdtzVar) {
        this.zzi = zzdtzVar;
    }
}
