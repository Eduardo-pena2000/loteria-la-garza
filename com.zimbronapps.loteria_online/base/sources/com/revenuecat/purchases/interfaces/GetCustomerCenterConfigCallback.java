package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface GetCustomerCenterConfigCallback {
    void onError(PurchasesError purchasesError);

    void onSuccess(CustomerCenterConfigData customerCenterConfigData);
}
