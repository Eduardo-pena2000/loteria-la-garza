package com.revenuecat.purchases;

import java.util.Set;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$activeSubscriptions$2 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Set invoke() {
        CustomerInfo customerInfo = this.this$0;
        return CustomerInfo.access$activeIdentifiers(customerInfo, customerInfo.getAllExpirationDatesByProduct());
    }
}
