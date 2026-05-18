package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.RequestId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ UserDataHandler a;
    public final /* synthetic */ RequestId b;

    public /* synthetic */ b(UserDataHandler userDataHandler, RequestId requestId) {
        this.a = userDataHandler;
        this.b = requestId;
    }

    public final void run() {
        UserDataHandler.a(this.a, this.b);
    }
}
