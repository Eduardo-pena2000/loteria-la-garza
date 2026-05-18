package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.models.Transaction;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TransactionMapperKt {
    public static final Map map(Transaction transaction) {
        t.g(transaction, "<this>");
        return S.l(new q[]{x.a("transactionIdentifier", transaction.getTransactionIdentifier()), x.a("revenueCatId", transaction.getTransactionIdentifier()), x.a("productIdentifier", transaction.getProductIdentifier()), x.a("productId", transaction.getProductIdentifier()), x.a("purchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(transaction.getPurchaseDate()))), x.a("purchaseDate", MappersHelpersKt.toIso8601(transaction.getPurchaseDate()))});
    }
}
