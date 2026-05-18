package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends c {
    private final String c;
    private final FulfillmentResult d;

    public a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.c = str;
        this.d = fulfillmentResult;
        a((h) new b(this, hashSet, fulfillmentResult.toString()));
    }

    public void b() {
    }

    public void c() {
        String c;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.d;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (c = d.a().c(this.c)) != null) {
            new com.amazon.device.iap.internal.a.g.b(this, c).l();
            d.a().a(this.c);
        }
    }
}
