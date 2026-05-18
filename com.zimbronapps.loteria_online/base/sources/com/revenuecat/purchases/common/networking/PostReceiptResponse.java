package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.CustomerInfo;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptResponse {
    private final JSONObject body;
    private final CustomerInfo customerInfo;
    private final Map productInfoByProductId;

    public PostReceiptResponse(CustomerInfo customerInfo, Map map, JSONObject jSONObject) {
        t.g(customerInfo, "customerInfo");
        t.g(jSONObject, "body");
        this.customerInfo = customerInfo;
        this.productInfoByProductId = map;
        this.body = jSONObject;
    }

    public static /* synthetic */ PostReceiptResponse copy$default(PostReceiptResponse postReceiptResponse, CustomerInfo customerInfo, Map map, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            customerInfo = postReceiptResponse.customerInfo;
        }
        if ((i & 2) != 0) {
            map = postReceiptResponse.productInfoByProductId;
        }
        if ((i & 4) != 0) {
            jSONObject = postReceiptResponse.body;
        }
        return postReceiptResponse.copy(customerInfo, map, jSONObject);
    }

    public final CustomerInfo component1() {
        return this.customerInfo;
    }

    public final Map component2() {
        return this.productInfoByProductId;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final PostReceiptResponse copy(CustomerInfo customerInfo, Map map, JSONObject jSONObject) {
        t.g(customerInfo, "customerInfo");
        t.g(jSONObject, "body");
        return new PostReceiptResponse(customerInfo, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostReceiptResponse)) {
            return false;
        }
        PostReceiptResponse postReceiptResponse = (PostReceiptResponse) obj;
        return t.c(this.customerInfo, postReceiptResponse.customerInfo) && t.c(this.productInfoByProductId, postReceiptResponse.productInfoByProductId) && t.c(this.body, postReceiptResponse.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map getProductInfoByProductId() {
        return this.productInfoByProductId;
    }

    public int hashCode() {
        int hashCode = this.customerInfo.hashCode() * 31;
        Map map = this.productInfoByProductId;
        return ((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "PostReceiptResponse(customerInfo=" + this.customerInfo + ", productInfoByProductId=" + this.productInfoByProductId + ", body=" + this.body + ')';
    }
}
