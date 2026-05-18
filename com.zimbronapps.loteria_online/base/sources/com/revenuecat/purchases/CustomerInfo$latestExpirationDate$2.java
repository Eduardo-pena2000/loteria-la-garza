package com.revenuecat.purchases;

import Da.D;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$latestExpirationDate$2 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    public final Date invoke() {
        List C0 = D.C0(this.this$0.getAllExpirationDatesByProduct().values(), new CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1());
        if (C0.isEmpty()) {
            C0 = null;
        }
        if (C0 != null) {
            return (Date) D.p0(C0);
        }
        return null;
    }
}
