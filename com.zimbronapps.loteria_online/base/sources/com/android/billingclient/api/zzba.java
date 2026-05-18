package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzba implements Runnable {
    public final /* synthetic */ o5.e zza;

    public /* synthetic */ zzba(o5.e eVar) {
        this.zza = eVar;
    }

    public final void run() {
        try {
            a.S0(this.zza.b).onBillingServiceDisconnected();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingServiceDisconnected.", th);
        }
    }
}
