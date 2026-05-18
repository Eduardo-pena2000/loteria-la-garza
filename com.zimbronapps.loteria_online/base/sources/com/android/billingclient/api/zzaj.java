package com.android.billingclient.api;

import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzaj implements Runnable {
    public final /* synthetic */ Future zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzaj(Future future, Runnable runnable) {
        this.zza = future;
        this.zzb = runnable;
    }

    public final void run() {
        Future future = this.zza;
        if (future.isDone() || future.isCancelled()) {
            return;
        }
        Runnable runnable = this.zzb;
        future.cancel(true);
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
        if (runnable != null) {
            runnable.run();
        }
    }
}
