package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbb implements Runnable {
    public final /* synthetic */ o5.e zza;
    public final /* synthetic */ BillingResult zzb;

    public /* synthetic */ zzbb(o5.e eVar, BillingResult billingResult) {
        this.zza = eVar;
        this.zzb = billingResult;
    }

    public final void run() {
        o5.e eVar = this.zza;
        try {
            a.S0(eVar.b).onBillingSetupFinished(this.zzb);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingSetupFinished.", th);
        }
    }
}
