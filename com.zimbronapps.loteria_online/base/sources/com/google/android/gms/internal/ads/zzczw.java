package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzczw implements zzdbf, zzdir, zzdgh, zzdbv, zzbde {
    private final zzdbx zza;
    private final zzddy zzb;
    private final zzfir zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    public zzczw(zzdbx zzdbxVar, zzfir zzfirVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzddy zzddyVar) {
        this.zza = zzdbxVar;
        this.zzc = zzfirVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzddyVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }

    public final synchronized void zzdG() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhah zzhahVar = this.zzf;
        if (zzhahVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhahVar.zza(Boolean.TRUE);
    }

    public final void zzdH() {
    }

    public final void zzdJ() {
    }

    public final void zzdj(zzbdd zzbddVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmU)).booleanValue() && zzl() && zzbddVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            o0.k("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final void zzds() {
    }

    public final void zzdt() {
        zzfir zzfirVar = this.zzc;
        if (zzfirVar.zze == 3) {
            return;
        }
        int i = zzfirVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzmU)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzg() {
        zzfir zzfirVar = this.zzc;
        int i = zzfirVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcc)).booleanValue() && zzfirVar.zzY == 2) {
            int i2 = zzfirVar.zzq;
            if (i2 == 0) {
                this.zza.zza();
            } else {
                zzgzo.zzr(this.zzf, new zzczu(this), this.zze);
                this.zzg = this.zzd.schedule(new zzczv(this), i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void zzh() {
    }

    public final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzhah zzhahVar = this.zzf;
                if (zzhahVar.isDone()) {
                    return;
                }
                zzhahVar.zza(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zzj(c1 c1Var) {
        try {
            zzhah zzhahVar = this.zzf;
            if (zzhahVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhahVar.zzb(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzdbx zzk() {
        return this.zza;
    }
}
