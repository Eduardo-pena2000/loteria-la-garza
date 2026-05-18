package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzark extends Thread {
    private static final boolean zza = zzask.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzari zzd;
    private volatile boolean zze = false;
    private final zzasl zzf;
    private final zzarp zzg;

    public zzark(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzari zzariVar, zzarp zzarpVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzariVar;
        this.zzg = zzarpVar;
        this.zzf = new zzasl(this, blockingQueue2, zzarpVar);
    }

    private void zzc() throws InterruptedException {
        zzary zzaryVar = (zzary) this.zzb.take();
        zzaryVar.zzc("cache-queue-take");
        zzaryVar.zze(1);
        try {
            zzaryVar.zzl();
            zzari zzariVar = this.zzd;
            zzarh zza2 = zzariVar.zza(zzaryVar.zzi());
            if (zza2 == null) {
                zzaryVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzaryVar)) {
                    this.zzc.put(zzaryVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaryVar.zzc("cache-hit-expired");
                    zzaryVar.zzj(zza2);
                    if (!this.zzf.zzc(zzaryVar)) {
                        this.zzc.put(zzaryVar);
                    }
                } else {
                    zzaryVar.zzc("cache-hit");
                    zzase zzr = zzaryVar.zzr(new zzaru(zza2.zza, zza2.zzg));
                    zzaryVar.zzc("cache-hit-parsed");
                    if (!zzr.zzc()) {
                        zzaryVar.zzc("cache-parsing-failed");
                        zzariVar.zzd(zzaryVar.zzi(), true);
                        zzaryVar.zzj(null);
                        if (!this.zzf.zzc(zzaryVar)) {
                            this.zzc.put(zzaryVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaryVar.zzc("cache-hit-refresh-needed");
                        zzaryVar.zzj(zza2);
                        zzr.zzd = true;
                        if (this.zzf.zzc(zzaryVar)) {
                            this.zzg.zza(zzaryVar, zzr, null);
                        } else {
                            this.zzg.zza(zzaryVar, zzr, new zzarj(this, zzaryVar));
                        }
                    } else {
                        this.zzg.zza(zzaryVar, zzr, null);
                    }
                }
            }
            zzaryVar.zze(2);
        } catch (Throwable th) {
            zzaryVar.zze(2);
            throw th;
        }
    }

    public final void run() {
        if (zza) {
            zzask.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzask.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    public final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
