package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class c implements RedeemWebPurchaseListener {
    public final /* synthetic */ OnResult a;

    public /* synthetic */ c(OnResult onResult) {
        this.a = onResult;
    }

    public final void handleResult(RedeemWebPurchaseListener.Result result) {
        CommonKt.c(this.a, result);
    }
}
