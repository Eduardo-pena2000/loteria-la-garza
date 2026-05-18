package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class PurchaseUpdatesResponseBuilder {
    private boolean hasMore;
    private List receipts;
    private RequestId requestId;
    private PurchaseUpdatesResponse.RequestStatus requestStatus;
    private UserData userData;

    public PurchaseUpdatesResponse build() {
        return new PurchaseUpdatesResponse(this);
    }

    public List getReceipts() {
        return this.receipts;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public PurchaseUpdatesResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public PurchaseUpdatesResponseBuilder setHasMore(boolean z) {
        this.hasMore = z;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setReceipts(List list) {
        this.receipts = list;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setRequestId(RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setRequestStatus(PurchaseUpdatesResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public PurchaseUpdatesResponseBuilder setUserData(UserData userData) {
        this.userData = userData;
        return this;
    }
}
