package com.revenuecat.purchases.amazon;

import Da.u;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreTransactionConversionsKt {
    public static final StoreTransaction toStoreTransaction(Receipt receipt, String str, PresentedOfferingContext presentedOfferingContext, PurchaseState purchaseState, UserData userData) {
        t.g(receipt, "<this>");
        t.g(str, "productId");
        t.g(purchaseState, "purchaseState");
        t.g(userData, "userData");
        ProductType productType = receipt.getProductType();
        t.f(productType, "this.productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        List e = u.e(str);
        long time = receipt.getPurchaseDate().getTime();
        String receiptId = receipt.getReceiptId();
        t.f(receiptId, "this.receiptId");
        boolean z = false;
        if (revenueCatProductType == com.revenuecat.purchases.ProductType.SUBS && !receipt.isCanceled()) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        JSONObject json = receipt.toJSON();
        t.f(json, "this.toJSON()");
        return new StoreTransaction(null, e, revenueCatProductType, time, receiptId, purchaseState, valueOf, null, json, presentedOfferingContext, userData.getUserId(), PurchaseType.AMAZON_PURCHASE, userData.getMarketplace(), null, null, null);
    }
}
