package com.revenuecat.purchases.ui.revenuecatui;

import Ga.e;
import Ga.k;
import Ha.b;
import Ha.c;
import Ia.h;
import Qa.l;
import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PaywallPurchaseLogicWithCallback implements PaywallPurchaseLogic {
    public static final int $stable = 0;

    public final Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, e eVar) {
        k kVar = new k(b.c(eVar));
        performPurchaseWithCompletion(activity, paywallPurchaseLogicParams, new PaywallPurchaseLogicWithCallback$performPurchase$2$1(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public abstract void performPurchaseWithCompletion(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, l lVar);

    public final Object performRestore(CustomerInfo customerInfo, e eVar) {
        k kVar = new k(b.c(eVar));
        performRestoreWithCompletion(customerInfo, new PaywallPurchaseLogicWithCallback$performRestore$2$1(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public abstract void performRestoreWithCompletion(CustomerInfo customerInfo, l lVar);
}
