package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbt implements S1.b {
    public final /* synthetic */ ConsumeResponseListener zza;
    public final /* synthetic */ ConsumeParams zzb;

    public /* synthetic */ zzbt(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = consumeResponseListener;
        this.zzb = consumeParams;
    }

    public final void accept(Object obj) {
        this.zza.onConsumeResponse((BillingResult) obj, this.zzb.getPurchaseToken());
    }
}
