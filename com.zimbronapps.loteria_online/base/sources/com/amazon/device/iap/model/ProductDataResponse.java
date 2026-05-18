package com.amazon.device.iap.model;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ProductDataResponse {
    private static final String PRODUCT_DATA = "productData";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)";
    private static final String UNAVAILABLE_SKUS = "UNAVAILABLE_SKUS";
    private final Map productData;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final Set unavailableSkus;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public ProductDataResponse(ProductDataResponseBuilder productDataResponseBuilder) {
        f.a(productDataResponseBuilder.getRequestId(), "requestId");
        f.a(productDataResponseBuilder.getRequestStatus(), "requestStatus");
        if (productDataResponseBuilder.getUnavailableSkus() == null) {
            productDataResponseBuilder.setUnavailableSkus(new HashSet());
        }
        if (RequestStatus.SUCCESSFUL == productDataResponseBuilder.getRequestStatus()) {
            f.a(productDataResponseBuilder.getProductData(), "productData");
        } else {
            productDataResponseBuilder.setProductData(new HashMap());
        }
        this.requestId = productDataResponseBuilder.getRequestId();
        this.requestStatus = productDataResponseBuilder.getRequestStatus();
        this.unavailableSkus = productDataResponseBuilder.getUnavailableSkus();
        this.productData = productDataResponseBuilder.getProductData();
    }

    public Map getProductData() {
        return this.productData;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public Set getUnavailableSkus() {
        return this.unavailableSkus;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("UNAVAILABLE_SKUS", this.unavailableSkus);
        jSONObject.put("requestStatus", this.requestStatus);
        JSONObject jSONObject2 = new JSONObject();
        Map map = this.productData;
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject2.put(str, ((Product) this.productData.get(str)).toJSON());
            }
        }
        jSONObject.put("productData", jSONObject2);
        return jSONObject;
    }

    public String toString() {
        String obj = super.toString();
        RequestId requestId = this.requestId;
        Set set = this.unavailableSkus;
        String obj2 = set != null ? set.toString() : "null";
        RequestStatus requestStatus = this.requestStatus;
        String obj3 = requestStatus != null ? requestStatus.toString() : "null";
        Map map = this.productData;
        return String.format("(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)", new Object[]{obj, requestId, obj2, obj3, map != null ? map.toString() : "null"});
    }
}
