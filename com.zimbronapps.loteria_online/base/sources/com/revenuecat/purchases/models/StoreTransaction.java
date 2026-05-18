package com.revenuecat.purchases.models;

import Ca.e;
import Da.S;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final ReplacementMode replacementMode;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final Map subscriptionOptionIdForProductIDs;
    private final ProductType type;

    public static final class Creator implements Parcelable.Creator {
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean valueOf;
            PurchaseType purchaseType;
            String str;
            Map map;
            t.g(parcel, "parcel");
            String readString = parcel.readString();
            ArrayList createStringArrayList = parcel.createStringArrayList();
            ProductType valueOf2 = ProductType.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            PurchaseState valueOf3 = PurchaseState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            JSONObject create = JSONObjectParceler.INSTANCE.create(parcel);
            PresentedOfferingContext presentedOfferingContext = (PresentedOfferingContext) (parcel.readInt() == 0 ? null : PresentedOfferingContext.CREATOR.createFromParcel(parcel));
            String readString4 = parcel.readString();
            PurchaseType valueOf4 = PurchaseType.valueOf(parcel.readString());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
                str = readString4;
                purchaseType = valueOf4;
            } else {
                int readInt = parcel.readInt();
                Map linkedHashMap = new LinkedHashMap(readInt);
                purchaseType = valueOf4;
                int i = 0;
                while (i != readInt) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i++;
                    readInt = readInt;
                    readString4 = readString4;
                }
                str = readString4;
                map = linkedHashMap;
            }
            return new StoreTransaction(readString, createStringArrayList, valueOf2, readLong, readString2, valueOf3, valueOf, readString3, create, presentedOfferingContext, str, purchaseType, readString5, readString6, map, (ReplacementMode) parcel.readParcelable(StoreTransaction.class.getClassLoader()));
        }

        public final StoreTransaction[] newArray(int i) {
            return new StoreTransaction[i];
        }
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public StoreTransaction(String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6, Map map, ReplacementMode replacementMode) {
        t.g(list, "productIds");
        t.g(productType, "type");
        t.g(str2, "purchaseToken");
        t.g(purchaseState, "purchaseState");
        t.g(jSONObject, "originalJson");
        t.g(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = list;
        this.type = productType;
        this.purchaseTime = j;
        this.purchaseToken = str2;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str3;
        this.originalJson = jSONObject;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str4;
        this.purchaseType = purchaseType;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
        this.subscriptionOptionIdForProductIDs = map;
        this.replacementMode = replacementMode;
    }

    @e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @e
    public static /* synthetic */ void getSkus$annotations() {
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static /* synthetic */ void getSubscriptionOptionIdForProductIDs$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof StoreTransaction) && t.c(new ComparableData(this), new ComparableData((StoreTransaction) obj));
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public final List getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List getSkus() {
        return this.productIds;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final /* synthetic */ Map getSubscriptionOptionIdForProductIDs() {
        return this.subscriptionOptionIdForProductIDs;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "StoreTransaction(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", subscriptionOptionIdForProductIDs=" + this.subscriptionOptionIdForProductIDs + ", replacementMode=" + this.replacementMode + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.productIds);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, i);
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentedOfferingContext.writeToParcel(parcel, i);
        }
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
        parcel.writeString(this.subscriptionOptionId);
        Map map = this.subscriptionOptionIdForProductIDs;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeParcelable(this.replacementMode, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoreTransaction(String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        this(str, list, productType, j, str2, purchaseState, bool, str3, jSONObject, presentedOfferingContext, str4, purchaseType, str5, str6, S.h(), replacementMode);
        t.g(list, "productIds");
        t.g(productType, "type");
        t.g(str2, "purchaseToken");
        t.g(purchaseState, "purchaseState");
        t.g(jSONObject, "originalJson");
        t.g(purchaseType, "purchaseType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public StoreTransaction(String str, List list, ProductType productType, long j, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, String str4, String str5, PurchaseType purchaseType, String str6, String str7, ReplacementMode replacementMode) {
        this(str, list, productType, j, str2, purchaseState, bool, str3, jSONObject, str4 != null ? new PresentedOfferingContext(str4) : null, str5, purchaseType, str6, str7, S.h(), replacementMode);
        t.g(list, "productIds");
        t.g(productType, "type");
        t.g(str2, "purchaseToken");
        t.g(purchaseState, "purchaseState");
        t.g(jSONObject, "originalJson");
        t.g(purchaseType, "purchaseType");
    }
}
