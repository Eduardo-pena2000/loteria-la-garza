package com.amazon.device.iap.internal.a.e;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.RequestId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends com.amazon.device.iap.internal.a.c {
    public d(RequestId requestId, String str) {
        super(requestId);
        c cVar = new c(this, str);
        cVar.b(new b(this, str));
        a((h) cVar);
    }

    public void b() {
    }

    public void c() {
        PurchaseResponse purchaseResponse = (PurchaseResponse) a().b();
        if (purchaseResponse == null) {
            purchaseResponse = new PurchaseResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseResponse.RequestStatus.FAILED).build();
        }
        a(purchaseResponse);
    }
}
