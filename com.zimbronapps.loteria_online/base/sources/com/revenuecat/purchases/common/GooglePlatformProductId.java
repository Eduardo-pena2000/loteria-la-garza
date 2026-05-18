package com.revenuecat.purchases.common;

import Ca.q;
import Ca.x;
import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class GooglePlatformProductId extends PlatformProductId {
    private final String basePlanId;
    private final String offerId;
    private final String productId;

    public /* synthetic */ GooglePlatformProductId(String str, String str2, String str3, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public Map getAsMap() {
        return S.l(new q[]{x.a("product_id", getProductId()), x.a("base_plan_id", this.basePlanId), x.a("offer_id", this.offerId)});
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public String getProductId() {
        return this.productId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlatformProductId(String str, String str2, String str3) {
        super(str);
        t.g(str, "productId");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
    }
}
