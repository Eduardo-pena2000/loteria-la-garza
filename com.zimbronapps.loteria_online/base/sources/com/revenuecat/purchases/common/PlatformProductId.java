package com.revenuecat.purchases.common;

import Ca.x;
import Da.Q;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class PlatformProductId {
    private final String productId;

    public PlatformProductId(String str) {
        t.g(str, "productId");
        this.productId = str;
    }

    public Map getAsMap() {
        return Q.f(x.a("product_id", getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}
