package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends com.amazon.device.iap.internal.a.c {
    public a(RequestId requestId, boolean z) {
        super(requestId);
        com.amazon.device.iap.internal.a.c.d dVar = new com.amazon.device.iap.internal.a.c.d(this, null);
        dVar.a((h) new d(this, z));
        com.amazon.device.iap.internal.a.c.c cVar = new com.amazon.device.iap.internal.a.c.c(this);
        cVar.a((h) new c(this, z));
        dVar.b(cVar);
        a((h) dVar);
    }

    public void b() {
        h hVar;
        PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) a().b();
        if (purchaseUpdatesResponse.getReceipts() == null || purchaseUpdatesResponse.getReceipts().size() <= 0) {
            hVar = null;
        } else {
            HashSet hashSet = new HashSet();
            for (Receipt receipt : purchaseUpdatesResponse.getReceipts()) {
                if (!f.a(receipt.getReceiptId())) {
                    hashSet.add(receipt.getReceiptId());
                }
            }
            hVar = new com.amazon.device.iap.internal.a.d.b(this, hashSet, com.amazon.device.iap.internal.model.a.a.toString());
        }
        a(purchaseUpdatesResponse, hVar);
    }

    public void c() {
        Object b = a().b();
        a((b == null || !(b instanceof PurchaseUpdatesResponse)) ? new PurchaseUpdatesResponseBuilder().setRequestId(d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).build() : (PurchaseUpdatesResponse) b);
    }
}
