package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.RequestId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ ProductDataHandler a;
    public final /* synthetic */ RequestId b;

    public /* synthetic */ a(ProductDataHandler productDataHandler, RequestId requestId) {
        this.a = productDataHandler;
        this.b = requestId;
    }

    public final void run() {
        ProductDataHandler.a(this.a, this.b);
    }
}
