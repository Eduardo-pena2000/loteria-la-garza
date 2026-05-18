package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$acknowledge$2 extends u implements l {
    public static final BillingWrapper$acknowledge$2 INSTANCE = new BillingWrapper$acknowledge$2();

    public BillingWrapper$acknowledge$2() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        t.g(purchasesError, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }
}
