package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzac implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ BillingResult zzb;

    public /* synthetic */ zzac(a aVar, BillingResult billingResult) {
        this.zza = aVar;
        this.zzb = billingResult;
    }

    public final void run() {
        a.r(this.zza, this.zzb);
    }
}
