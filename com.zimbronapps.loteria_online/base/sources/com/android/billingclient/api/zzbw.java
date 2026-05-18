package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbw implements S1.b {
    public final /* synthetic */ AcknowledgePurchaseResponseListener zza;

    public /* synthetic */ zzbw(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = acknowledgePurchaseResponseListener;
    }

    public final void accept(Object obj) {
        this.zza.onAcknowledgePurchaseResponse((BillingResult) obj);
    }
}
