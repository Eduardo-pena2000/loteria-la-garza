package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzab implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AcknowledgePurchaseResponseListener zzb;

    public /* synthetic */ zzab(a aVar, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = aVar;
        this.zzb = acknowledgePurchaseResponseListener;
    }

    public final void run() {
        a.n(this.zza, this.zzb);
    }
}
