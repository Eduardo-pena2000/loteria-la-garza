package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.D;
import Da.S;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreTransactionMapperKt {
    public static final Map map(StoreTransaction storeTransaction) {
        t.g(storeTransaction, "<this>");
        return S.l(new q[]{x.a("transactionIdentifier", transactionIdentifierValue(storeTransaction)), x.a("productIdentifier", D.f0(storeTransaction.getProductIds())), x.a("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), x.a("purchaseDate", MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime())))});
    }

    private static final String transactionIdentifierValue(StoreTransaction storeTransaction) {
        String orderId = storeTransaction.getOrderId();
        if (orderId != null) {
            return orderId;
        }
        if (storeTransaction.getPurchaseType() == PurchaseType.AMAZON_PURCHASE) {
            return storeTransaction.getPurchaseToken();
        }
        return null;
    }
}
