package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzat implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ PurchasesResponseListener zzb;

    public /* synthetic */ zzat(a aVar, PurchasesResponseListener purchasesResponseListener) {
        this.zza = aVar;
        this.zzb = purchasesResponseListener;
    }

    public final void run() {
        a.k(this.zza, this.zzb);
    }
}
