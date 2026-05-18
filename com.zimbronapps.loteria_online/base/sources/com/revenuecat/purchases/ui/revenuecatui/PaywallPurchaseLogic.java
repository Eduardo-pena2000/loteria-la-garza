package com.revenuecat.purchases.ui.revenuecatui;

import Ga.e;
import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallPurchaseLogic {
    Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, e eVar);

    Object performRestore(CustomerInfo customerInfo, e eVar);
}
