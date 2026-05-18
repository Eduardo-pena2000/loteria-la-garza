package com.revenuecat.purchases.google.history;

import Da.u;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHistoryRecord {
    private final PurchaseData purchaseData;
    private final String rawJson;
    private final String signature;

    public PurchaseHistoryRecord(PurchaseData purchaseData, String str, String str2) {
        t.g(purchaseData, "purchaseData");
        t.g(str, "signature");
        t.g(str2, "rawJson");
        this.purchaseData = purchaseData;
        this.signature = str;
        this.rawJson = str2;
    }

    public static /* synthetic */ PurchaseHistoryRecord copy$default(PurchaseHistoryRecord purchaseHistoryRecord, PurchaseData purchaseData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            purchaseData = purchaseHistoryRecord.purchaseData;
        }
        if ((i & 2) != 0) {
            str = purchaseHistoryRecord.signature;
        }
        if ((i & 4) != 0) {
            str2 = purchaseHistoryRecord.rawJson;
        }
        return purchaseHistoryRecord.copy(purchaseData, str, str2);
    }

    public final PurchaseData component1() {
        return this.purchaseData;
    }

    public final String component2() {
        return this.signature;
    }

    public final String component3() {
        return this.rawJson;
    }

    public final PurchaseHistoryRecord copy(PurchaseData purchaseData, String str, String str2) {
        t.g(purchaseData, "purchaseData");
        t.g(str, "signature");
        t.g(str2, "rawJson");
        return new PurchaseHistoryRecord(purchaseData, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return t.c(this.purchaseData, purchaseHistoryRecord.purchaseData) && t.c(this.signature, purchaseHistoryRecord.signature) && t.c(this.rawJson, purchaseHistoryRecord.rawJson);
    }

    public final PurchaseData getPurchaseData() {
        return this.purchaseData;
    }

    public final String getRawJson() {
        return this.rawJson;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((this.purchaseData.hashCode() * 31) + this.signature.hashCode()) * 31) + this.rawJson.hashCode();
    }

    public final StoreTransaction toStoreTransaction(ProductType productType) {
        t.g(productType, "type");
        return new StoreTransaction(this.purchaseData.getOrderId(), u.e(this.purchaseData.getProductId()), productType, this.purchaseData.getPurchaseTime(), this.purchaseData.getPurchaseToken(), PurchaseState.UNSPECIFIED_STATE, (Boolean) null, this.signature, new JSONObject(this.rawJson), (PresentedOfferingContext) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }

    public String toString() {
        return "PurchaseHistoryRecord(purchaseData=" + this.purchaseData + ", signature=" + this.signature + ", rawJson=" + this.rawJson + ')';
    }
}
