package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends com.amazon.device.iap.internal.a.c {
    public d(RequestId requestId, Set set) {
        super(requestId);
        c cVar = new c(this, set);
        cVar.b(new b(this, set));
        a((h) cVar);
    }

    public void b() {
        a((ProductDataResponse) a().b());
    }

    public void c() {
        ProductDataResponse productDataResponse = (ProductDataResponse) a().b();
        if (productDataResponse == null) {
            productDataResponse = new ProductDataResponseBuilder().setRequestId(d()).setRequestStatus(ProductDataResponse.RequestStatus.FAILED).build();
        }
        a(productDataResponse);
    }
}
