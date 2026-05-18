package com.revenuecat.purchases.ui.revenuecatui;

import Ca.e;
import android.app.Activity;
import com.revenuecat.purchases.Package;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PurchaseLogic extends PaywallPurchaseLogic {

    public static final class DefaultImpls {
        public static Object performPurchase(PurchaseLogic purchaseLogic, Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, Ga.e eVar) {
            return purchaseLogic.performPurchase(activity, paywallPurchaseLogicParams.getRcPackage(), eVar);
        }
    }

    Object performPurchase(Activity activity, Package r2, Ga.e eVar);

    Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, Ga.e eVar);
}
