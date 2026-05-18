package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzaa implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AcknowledgePurchaseResponseListener zzb;
    public final /* synthetic */ AcknowledgePurchaseParams zzc;

    public /* synthetic */ zzaa(a aVar, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) {
        this.zza = aVar;
        this.zzb = acknowledgePurchaseResponseListener;
        this.zzc = acknowledgePurchaseParams;
    }

    public final Object call() {
        a.e1(this.zza, this.zzb, this.zzc);
        return null;
    }
}
