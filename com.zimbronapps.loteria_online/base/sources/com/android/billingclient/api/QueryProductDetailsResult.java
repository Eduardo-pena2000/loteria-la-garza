package com.android.billingclient.api;

import java.util.List;

@zzo
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class QueryProductDetailsResult {
    public final List a;
    public final List b;

    public QueryProductDetailsResult(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static QueryProductDetailsResult create(List list, List list2) {
        return new QueryProductDetailsResult(list, list2);
    }

    @zzo
    public List getProductDetailsList() {
        return this.a;
    }

    @zzo
    public List getUnfetchedProductList() {
        return this.b;
    }
}
