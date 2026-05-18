package com.revenuecat.purchases;

import Da.D;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$nonSubscriptionTransactions$2 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final List invoke() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = CustomerInfo.access$getSubscriberJSONObject$p(this.this$0).getJSONObject("non_subscriptions");
        Iterator keys = jSONObject.keys();
        t.f(keys, "nonSubscriptions.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                t.f(str, "productId");
                t.f(jSONObject2, "transactionJSONObject");
                arrayList.add(new Transaction(str, jSONObject2, null, 4, null));
            }
        }
        return D.C0(arrayList, new CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1());
    }
}
