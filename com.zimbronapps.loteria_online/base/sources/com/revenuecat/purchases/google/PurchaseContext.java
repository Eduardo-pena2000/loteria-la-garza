package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseContext {
    private final PresentedOfferingContext presentedOfferingContext;
    private final ProductType productType;
    private final GoogleReplacementMode replacementMode;
    private final String selectedSubscriptionOptionId;
    private final Map subscriptionOptionIdForProductIDs;

    public PurchaseContext(ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, Map map) {
        t.g(productType, "productType");
        this.productType = productType;
        this.presentedOfferingContext = presentedOfferingContext;
        this.selectedSubscriptionOptionId = str;
        this.replacementMode = googleReplacementMode;
        this.subscriptionOptionIdForProductIDs = map;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final GoogleReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSelectedSubscriptionOptionId() {
        return this.selectedSubscriptionOptionId;
    }

    public final Map getSubscriptionOptionIdForProductIDs() {
        return this.subscriptionOptionIdForProductIDs;
    }
}
