package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzad implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ BillingConfigResponseListener zzb;

    public /* synthetic */ zzad(a aVar, BillingConfigResponseListener billingConfigResponseListener) {
        this.zza = aVar;
        this.zzb = billingConfigResponseListener;
    }

    public final Object call() {
        a.g1(this.zza, this.zzb);
        return null;
    }
}
