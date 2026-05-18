package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Fa.b.d(Long.valueOf(((StoreTransaction) obj).getPurchaseTime()), Long.valueOf(((StoreTransaction) obj2).getPurchaseTime()));
    }
}
