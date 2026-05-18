package com.revenuecat.purchases;

import com.revenuecat.purchases.models.Transaction;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Fa.b.d(((Transaction) obj).getPurchaseDate(), ((Transaction) obj2).getPurchaseDate());
    }
}
