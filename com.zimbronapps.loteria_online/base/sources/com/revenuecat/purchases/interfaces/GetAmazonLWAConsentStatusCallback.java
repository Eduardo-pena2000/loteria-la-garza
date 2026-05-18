package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.PurchasesError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface GetAmazonLWAConsentStatusCallback {
    void onError(PurchasesError purchasesError);

    void onSuccess(AmazonLWAConsentStatus amazonLWAConsentStatus);
}
