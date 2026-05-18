package com.revenuecat.purchases.common.networking;

import Da.Q;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptResponseKt {
    public static final PostReceiptResponse buildPostReceiptResponse(HTTPResult hTTPResult) {
        t.g(hTTPResult, "result");
        CustomerInfo buildCustomerInfo = CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult);
        JSONObject optJSONObject = hTTPResult.getBody().optJSONObject("purchased_products");
        Map map = null;
        if (optJSONObject != null) {
            Map map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject, false, 1, (Object) null);
            Map linkedHashMap = new LinkedHashMap(Q.e(map$default.size()));
            for (Map.Entry entry : map$default.entrySet()) {
                Object key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                linkedHashMap.put(key, new PostReceiptProductInfo(jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("should_consume")) : null));
            }
            map = linkedHashMap;
        }
        return new PostReceiptResponse(buildCustomerInfo, map, hTTPResult.getBody());
    }
}
