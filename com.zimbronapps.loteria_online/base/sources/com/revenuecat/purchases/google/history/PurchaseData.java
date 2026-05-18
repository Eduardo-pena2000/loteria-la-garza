package com.revenuecat.purchases.google.history;

import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseData {
    public static final Companion Companion = new Companion(null);
    private final boolean acknowledged;
    private final boolean autoRenewing;
    private final String orderId;
    private final String packageName;
    private final String productId;
    private final int purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final int quantity;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final PurchaseData fromJson(String str) {
            t.g(str, "json");
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("orderId", "");
                t.f(optString, "jsonObject.optString(\"orderId\", \"\")");
                String optString2 = jSONObject.optString("packageName", "");
                t.f(optString2, "jsonObject.optString(\"packageName\", \"\")");
                String optString3 = jSONObject.optString("productId", "");
                t.f(optString3, "jsonObject.optString(\"productId\", \"\")");
                long optLong = jSONObject.optLong("purchaseTime", 0L);
                int optInt = jSONObject.optInt("purchaseState", 0);
                String optString4 = jSONObject.optString("purchaseToken", "");
                t.f(optString4, "jsonObject.optString(\"purchaseToken\", \"\")");
                return new PurchaseData(optString, optString2, optString3, optLong, optInt, optString4, jSONObject.optInt("quantity", 1), jSONObject.optBoolean("acknowledged", false), jSONObject.optBoolean("autoRenewing", false));
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing AIDL purchase data JSON: " + str, th);
                return null;
            }
        }

        private Companion() {
        }
    }

    public PurchaseData(String str, String str2, String str3, long j, int i, String str4, int i2, boolean z, boolean z2) {
        t.g(str, "orderId");
        t.g(str2, "packageName");
        t.g(str3, "productId");
        t.g(str4, "purchaseToken");
        this.orderId = str;
        this.packageName = str2;
        this.productId = str3;
        this.purchaseTime = j;
        this.purchaseState = i;
        this.purchaseToken = str4;
        this.quantity = i2;
        this.acknowledged = z;
        this.autoRenewing = z2;
    }

    public static /* synthetic */ PurchaseData copy$default(PurchaseData purchaseData, String str, String str2, String str3, long j, int i, String str4, int i2, boolean z, boolean z2, int i3, Object obj) {
        return purchaseData.copy((i3 & 1) != 0 ? purchaseData.orderId : str, (i3 & 2) != 0 ? purchaseData.packageName : str2, (i3 & 4) != 0 ? purchaseData.productId : str3, (i3 & 8) != 0 ? purchaseData.purchaseTime : j, (i3 & 16) != 0 ? purchaseData.purchaseState : i, (i3 & 32) != 0 ? purchaseData.purchaseToken : str4, (i3 & 64) != 0 ? purchaseData.quantity : i2, (i3 & 128) != 0 ? purchaseData.acknowledged : z, (i3 & 256) != 0 ? purchaseData.autoRenewing : z2);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.productId;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final int component5() {
        return this.purchaseState;
    }

    public final String component6() {
        return this.purchaseToken;
    }

    public final int component7() {
        return this.quantity;
    }

    public final boolean component8() {
        return this.acknowledged;
    }

    public final boolean component9() {
        return this.autoRenewing;
    }

    public final PurchaseData copy(String str, String str2, String str3, long j, int i, String str4, int i2, boolean z, boolean z2) {
        t.g(str, "orderId");
        t.g(str2, "packageName");
        t.g(str3, "productId");
        t.g(str4, "purchaseToken");
        return new PurchaseData(str, str2, str3, j, i, str4, i2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseData)) {
            return false;
        }
        PurchaseData purchaseData = (PurchaseData) obj;
        return t.c(this.orderId, purchaseData.orderId) && t.c(this.packageName, purchaseData.packageName) && t.c(this.productId, purchaseData.productId) && this.purchaseTime == purchaseData.purchaseTime && this.purchaseState == purchaseData.purchaseState && t.c(this.purchaseToken, purchaseData.purchaseToken) && this.quantity == purchaseData.quantity && this.acknowledged == purchaseData.acknowledged && this.autoRenewing == purchaseData.autoRenewing;
    }

    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((((((((((((((this.orderId.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.productId.hashCode()) * 31) + Long.hashCode(this.purchaseTime)) * 31) + Integer.hashCode(this.purchaseState)) * 31) + this.purchaseToken.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.acknowledged)) * 31) + Boolean.hashCode(this.autoRenewing);
    }

    public String toString() {
        return "PurchaseData(orderId=" + this.orderId + ", packageName=" + this.packageName + ", productId=" + this.productId + ", purchaseTime=" + this.purchaseTime + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", acknowledged=" + this.acknowledged + ", autoRenewing=" + this.autoRenewing + ')';
    }
}
