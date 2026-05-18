package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        t.g(purchase, "<this>");
        Object obj = purchase.getProducts().get(0);
        t.f(obj, "products[0]");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        t.g(purchase, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("productIds: ");
        List products = purchase.getProducts();
        t.f(products, "this.products");
        sb.append(D.n0(products, (CharSequence) null, "[", "]", 0, (CharSequence) null, (l) null, 57, (Object) null));
        sb.append(", orderId: ");
        sb.append(purchase.getOrderId());
        sb.append(", purchaseToken: ");
        sb.append(purchase.getPurchaseToken());
        return sb.toString();
    }
}
