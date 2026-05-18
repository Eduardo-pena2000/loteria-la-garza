package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzb extends Thread {
    final CountDownLatch zza = new CountDownLatch(1);
    boolean zzb = false;
    private final WeakReference zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        this.zzc = new WeakReference(advertisingIdClient);
        this.zzd = j;
        start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }

    public final void run() {
        try {
            if (this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
                return;
            }
            zza();
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
