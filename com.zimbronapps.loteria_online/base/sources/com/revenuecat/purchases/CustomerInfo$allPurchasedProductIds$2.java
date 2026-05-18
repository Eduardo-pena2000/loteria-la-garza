package com.revenuecat.purchases;

import Da.D;
import Da.Z;
import Da.w;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$allPurchasedProductIds$2 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$allPurchasedProductIds$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Set invoke() {
        List nonSubscriptionTransactions = this.this$0.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(w.y(nonSubscriptionTransactions, 10));
        Iterator it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Transaction) it.next()).getProductIdentifier());
        }
        return Z.i(D.Q0(arrayList), this.this$0.getAllExpirationDatesByProduct().keySet());
    }
}
