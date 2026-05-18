package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface PurchasingServiceProvider extends Parcelable {
    RequestId getProductData(Set set);

    RequestId getPurchaseUpdates(boolean z);

    RequestId getUserData();

    void notifyFulfillment(String str, FulfillmentResult fulfillmentResult);

    RequestId purchase(String str);

    void registerListener(Context context, PurchasingListener purchasingListener);
}
