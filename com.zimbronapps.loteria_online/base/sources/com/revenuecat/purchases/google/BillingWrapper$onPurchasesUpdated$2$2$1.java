package com.revenuecat.purchases.google;

import Qa.l;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$onPurchasesUpdated$2$2$1 extends u implements l {
    public static final BillingWrapper$onPurchasesUpdated$2$2$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$2$2$1();

    public BillingWrapper$onPurchasesUpdated$2$2$1() {
        super(1);
    }

    public final CharSequence invoke(Purchase purchase) {
        t.g(purchase, "it");
        return PurchaseExtensionsKt.toHumanReadableDescription(purchase);
    }
}
