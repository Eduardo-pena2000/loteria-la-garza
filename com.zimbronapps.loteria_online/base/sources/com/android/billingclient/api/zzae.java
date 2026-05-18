package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzae implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ BillingConfigResponseListener zzb;

    public /* synthetic */ zzae(a aVar, BillingConfigResponseListener billingConfigResponseListener) {
        this.zza = aVar;
        this.zzb = billingConfigResponseListener;
    }

    public final void run() {
        a.l(this.zza, this.zzb);
    }
}
