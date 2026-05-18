package com.revenuecat.purchases;

import com.revenuecat.purchases.common.CustomerInfoFactory;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$subscriptionsByProductIdentifier$2 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$subscriptionsByProductIdentifier$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Map invoke() {
        CustomerInfoFactory customerInfoFactory = CustomerInfoFactory.INSTANCE;
        JSONObject access$getSubscriberJSONObject$p = CustomerInfo.access$getSubscriberJSONObject$p(this.this$0);
        t.f(access$getSubscriberJSONObject$p, "subscriberJSONObject");
        return customerInfoFactory.parseSubscriptionInfos(access$getSubscriberJSONObject$p, this.this$0.getRequestDate());
    }
}
