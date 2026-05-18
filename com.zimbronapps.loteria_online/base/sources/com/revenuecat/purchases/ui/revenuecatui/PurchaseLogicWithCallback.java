package com.revenuecat.purchases.ui.revenuecatui;

import Ca.e;
import Ga.k;
import Ha.b;
import Ha.c;
import Ia.h;
import Qa.l;
import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PurchaseLogicWithCallback implements PurchaseLogic {
    public static final int $stable = 0;

    public Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, Ga.e eVar) {
        return PurchaseLogic.DefaultImpls.performPurchase(this, activity, paywallPurchaseLogicParams, eVar);
    }

    public abstract void performPurchaseWithCompletion(Activity activity, Package r2, l lVar);

    public final Object performRestore(CustomerInfo customerInfo, Ga.e eVar) {
        k kVar = new k(b.c(eVar));
        performRestoreWithCompletion(customerInfo, new PurchaseLogicWithCallback$performRestore$2$1(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public abstract void performRestoreWithCompletion(CustomerInfo customerInfo, l lVar);

    public final Object performPurchase(Activity activity, Package r4, Ga.e eVar) {
        k kVar = new k(b.c(eVar));
        performPurchaseWithCompletion(activity, r4, new PurchaseLogicWithCallback$performPurchase$2$1(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }
}
