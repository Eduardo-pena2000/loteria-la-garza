package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdeg extends zzdhd {
    private final ScheduledExecutorService zzb;
    private final E6.f zzc;
    private final zzdxz zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzdeg(ScheduledExecutorService scheduledExecutorService, E6.f fVar, zzdxz zzdxzVar) {
        super(Collections.emptySet());
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = fVar;
        this.zzd = zzdxzVar;
    }

    private final synchronized void zzf(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.b() + j;
            this.zzj = this.zzb.schedule(new zzdee(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            this.zzf = this.zzc.b() + j;
            this.zzk = this.zzb.schedule(new zzdef(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                this.zzg = this.zze - this.zzc.b();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                this.zzh = this.zzf - this.zzc.b();
            }
            this.zzi = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        o0.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzg;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzg = millis;
                return;
            }
            long b = this.zzc.b();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoJ)).booleanValue()) {
                long j2 = this.zze;
                if (b >= j2 || j2 - b > millis) {
                    zzf(millis);
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzpg)).booleanValue()) {
                        zzdxy zza = this.zzd.zza();
                        zza.zzc("action", "rtnc");
                        zza.zzf();
                    }
                }
            } else {
                long j3 = this.zze;
                if (b > j3 || j3 - b > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        o0.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzh;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzh = millis;
                return;
            }
            long b = this.zzc.b();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoJ)).booleanValue()) {
                if (b == this.zzf) {
                    o0.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j2 = this.zzf;
                if (b >= j2 || j2 - b > millis) {
                    zzg(millis);
                }
            } else {
                long j3 = this.zzf;
                if (b > j3 || j3 - b > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
