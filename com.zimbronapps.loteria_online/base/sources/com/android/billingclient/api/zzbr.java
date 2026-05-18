package com.android.billingclient.api;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbr implements S1.b {
    public final /* synthetic */ ProductDetailsResponseListener zza;

    public /* synthetic */ zzbr(ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = productDetailsResponseListener;
    }

    public final void accept(Object obj) {
        QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
        this.zza.onProductDetailsResponse((BillingResult) obj, queryProductDetailsResult);
    }
}
