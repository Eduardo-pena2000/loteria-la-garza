package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        t.g(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map map, GoogleReplacementMode googleReplacementMode) {
        t.g(purchase, "<this>");
        t.g(productType, "productType");
        String orderId = purchase.getOrderId();
        List products = purchase.getProducts();
        t.f(products, "this.products");
        long purchaseTime = purchase.getPurchaseTime();
        String purchaseToken = purchase.getPurchaseToken();
        t.f(purchaseToken, "this.purchaseToken");
        return new StoreTransaction(orderId, products, productType, purchaseTime, purchaseToken, PurchaseStateConversionsKt.toRevenueCatPurchaseState(purchase.getPurchaseState()), Boolean.valueOf(purchase.isAutoRenewing()), purchase.getSignature(), new JSONObject(purchase.getOriginalJson()), presentedOfferingContext, null, PurchaseType.GOOGLE_PURCHASE, null, str, map, googleReplacementMode);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map map, GoogleReplacementMode googleReplacementMode, int i, Object obj) {
        return toStoreTransaction(purchase, productType, (i & 2) != 0 ? null : presentedOfferingContext, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        t.g(purchase, "<this>");
        t.g(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getSubscriptionOptionIdForProductIDs(), purchaseContext.getReplacementMode());
    }
}
