package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface GetVirtualCurrenciesCallback {
    void onError(PurchasesError purchasesError);

    void onReceived(VirtualCurrencies virtualCurrencies);
}
