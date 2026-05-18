package com.revenuecat.purchases.google;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper$findPurchaseInPurchaseHistory$2$1 extends u implements l {
    final /* synthetic */ l $onCompletion;
    final /* synthetic */ l $onError;
    final /* synthetic */ String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$findPurchaseInPurchaseHistory$2$1(l lVar, String str, l lVar2) {
        super(1);
        this.$onCompletion = lVar;
        this.$productId = str;
        this.$onError = lVar2;
    }

    public final void invoke(List list) {
        Object obj;
        t.g(list, "purchasesList");
        String str = this.$productId;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((StoreTransaction) obj).getProductIds().contains(str)) {
                    break;
                }
            }
        }
        StoreTransaction storeTransaction = (StoreTransaction) obj;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        String format = String.format("Couldn't find existing purchase for SKU: %s", Arrays.copyOf(new Object[]{this.$productId}, 1));
        t.f(format, "format(...)");
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, format));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }
}
