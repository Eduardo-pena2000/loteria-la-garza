package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonStoreProductKt {
    public static final AmazonStoreProduct getAmazonProduct(StoreProduct storeProduct) {
        t.g(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            return (AmazonStoreProduct) storeProduct;
        }
        return null;
    }
}
