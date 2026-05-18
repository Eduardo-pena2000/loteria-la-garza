package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzct implements Runnable {
    final Future zza;
    final zzcs zzb;

    public zzct(Future future, zzcs zzcsVar) {
        this.zza = future;
        this.zzb = zzcsVar;
    }

    public final void run() {
        Object obj;
        Throwable zza;
        zzdf zzdfVar = this.zza;
        if ((zzdfVar instanceof zzdf) && (zza = zzdg.zza(zzdfVar)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            if (!zzdfVar.isDone()) {
                throw new IllegalStateException(zzbj.zza("Future was expected to be done: %s", zzdfVar));
            }
            boolean z = false;
            while (true) {
                try {
                    obj = zzdfVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzbc zza = zzbe.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
