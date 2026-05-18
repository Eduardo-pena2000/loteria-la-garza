package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ProductDataResponseBuilder {
    private Map productData;
    private RequestId requestId;
    private ProductDataResponse.RequestStatus requestStatus;
    private Set unavailableSkus;

    public ProductDataResponse build() {
        return new ProductDataResponse(this);
    }

    public Map getProductData() {
        return this.productData;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public ProductDataResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public Set getUnavailableSkus() {
        return this.unavailableSkus;
    }

    public ProductDataResponseBuilder setProductData(Map map) {
        this.productData = map;
        return this;
    }

    public ProductDataResponseBuilder setRequestId(RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public ProductDataResponseBuilder setRequestStatus(ProductDataResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public ProductDataResponseBuilder setUnavailableSkus(Set set) {
        this.unavailableSkus = set;
        return this;
    }
}
