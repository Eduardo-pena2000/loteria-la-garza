package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.PurchasesError;
import java.util.Locale;

@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface GetStorefrontLocaleCallback {
    void onError(PurchasesError purchasesError);

    void onReceived(Locale locale);
}
