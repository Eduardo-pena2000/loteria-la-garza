package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator {
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        public final DefaultPurchasingServiceProvider[] newArray(int i) {
            return new DefaultPurchasingServiceProvider[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public RequestId getProductData(Set set) {
        t.g(set, "skus");
        RequestId productData = PurchasingService.getProductData(set);
        t.f(productData, "getProductData(skus)");
        return productData;
    }

    public RequestId getPurchaseUpdates(boolean z) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(z);
        t.f(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData(UserDataRequest.newBuilder().setFetchLWAConsentStatus(true).build());
        t.f(userData, "getUserData(UserDataRequ…sentStatus(true).build())");
        return userData;
    }

    public void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        t.g(str, "receiptId");
        t.g(fulfillmentResult, "fulfillmentResult");
        PurchasingService.notifyFulfillment(str, fulfillmentResult);
    }

    public RequestId purchase(String str) {
        t.g(str, "sku");
        RequestId purchase = PurchasingService.purchase(str);
        t.f(purchase, "purchase(sku)");
        return purchase;
    }

    public void registerListener(Context context, PurchasingListener purchasingListener) {
        t.g(context, "context");
        t.g(purchasingListener, "listener");
        PurchasingService.registerListener(context, purchasingListener);
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeInt(1);
    }
}
