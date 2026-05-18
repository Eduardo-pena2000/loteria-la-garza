package com.google.android.gms.internal.ads;

import V5.F0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzced {
    private zzgzy zza;
    private zzdxz zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzgzy zzgzyVar, zzdxz zzdxzVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzgzyVar;
        this.zzb = zzdxzVar;
        this.zzf = ((Long) S5.D.c().zzd(zzbhe.zzpl)).longValue();
        this.zzg = ((Long) S5.D.c().zzd(zzbhe.zzpm)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzgzy zzgzyVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzgzyVar = this.zza) == null) {
            return;
        }
        zzgzyVar.submit(new zzceb(this));
    }

    public final /* synthetic */ void zzc() {
        zzdxz zzdxzVar;
        ActivityManager.MemoryInfo n;
        while (this.zze.get()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            F0.l.post(new zzcea(atomicBoolean));
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzpn)).booleanValue() && (zzdxzVar = this.zzb) != null) {
                        zzdxy zza = zzdxzVar.zza();
                        zza.zzc("action", "panr");
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzpP)).booleanValue() && (n = W5.g.n(this.zzc)) != null) {
                            zza.zzc("mem_avl", String.valueOf(n.availMem));
                            zza.zzc("mem_tt", String.valueOf(n.totalMem));
                            zza.zzc("low_m", true != n.lowMemory ? "0" : "1");
                        }
                        zza.zzf();
                    }
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzpo)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        Throwable zzcecVar = new zzcec("Potential ANR detected");
                        zzcecVar.setStackTrace(stackTrace);
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzpp)).booleanValue()) {
                            zzbyp.zzc(this.zzc).zzi(zzcecVar, "AnrWatchdog", ((Integer) S5.D.c().zzd(zzbhe.zzpq)).intValue() / 100.0f);
                        } else {
                            R5.t.l().zzg(zzcecVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
