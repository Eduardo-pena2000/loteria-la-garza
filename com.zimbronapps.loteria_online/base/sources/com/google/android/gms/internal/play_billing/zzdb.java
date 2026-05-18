package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdb implements Runnable {
    zzde zza;

    public zzdb(zzde zzdeVar) {
        this.zza = zzdeVar;
    }

    public final void run() {
        zzcz zzr;
        zzde zzdeVar = this.zza;
        if (zzdeVar == null || (zzr = zzde.zzr(zzdeVar)) == null) {
            return;
        }
        this.zza = null;
        if (zzr.isDone()) {
            zzdeVar.zzj(zzr);
            return;
        }
        try {
            ScheduledFuture zzt = zzde.zzt(zzdeVar);
            zzde.zzu(zzdeVar, (ScheduledFuture) null);
            String str = "Timed out";
            if (zzt != null) {
                try {
                    long abs = Math.abs(zzt.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzdeVar.zzi(new zzdc(str, null));
                    throw th;
                }
            }
            zzdeVar.zzi(new zzdc(str + ": " + zzr.toString(), null));
        } finally {
            zzr.cancel(true);
        }
    }
}
