package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgzm implements Runnable {
    final Future zza;
    final zzgzl zzb;

    public zzgzm(Future future, zzgzl zzgzlVar) {
        this.zza = future;
        this.zzb = zzgzlVar;
    }

    public final void run() {
        Throwable zza;
        zzhaq zzhaqVar = this.zza;
        if ((zzhaqVar instanceof zzhaq) && (zza = zzhar.zza(zzhaqVar)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgzo.zzs(zzhaqVar));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgqy zzb = zzgqz.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}
