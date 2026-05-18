package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface SyncPurchasesCallback {
    void onError(PurchasesError purchasesError);

    void onSuccess(CustomerInfo customerInfo);
}
