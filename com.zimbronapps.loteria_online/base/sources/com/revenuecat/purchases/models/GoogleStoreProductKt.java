package com.revenuecat.purchases.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleStoreProductKt {
    public static final GoogleStoreProduct getGoogleProduct(StoreProduct storeProduct) {
        t.g(storeProduct, "<this>");
        if (storeProduct instanceof GoogleStoreProduct) {
            return (GoogleStoreProduct) storeProduct;
        }
        return null;
    }
}
