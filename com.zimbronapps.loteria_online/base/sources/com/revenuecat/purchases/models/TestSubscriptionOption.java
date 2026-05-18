package com.revenuecat.purchases.models;

import Da.v;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final InstallmentsInfo installmentsInfo;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List pricingPhases;
    private final PurchasingData purchasingData;
    private final List tags;

    public TestSubscriptionOption(List list, String str, List list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData) {
        t.g(list, "pricingPhases");
        t.g(str, "basePlanId");
        t.g(list2, "tags");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        t.g(purchasingData, "purchasingData");
        this.pricingPhases = list;
        this.basePlanId = str;
        this.tags = list2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = installmentsInfo;
        this.purchasingData = purchasingData;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public String getId() {
        if (getPricingPhases().size() == 1) {
            return this.basePlanId;
        }
        return this.basePlanId + ":testOfferId";
    }

    public InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    public List getPricingPhases() {
        return this.pricingPhases;
    }

    public PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    public List getTags() {
        return this.tags;
    }

    public /* synthetic */ TestSubscriptionOption(List list, String str, List list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData, int i, k kVar) {
        this(list, (i & 2) != 0 ? "testBasePlanId" : str, (i & 4) != 0 ? v.n() : list2, (i & 8) != 0 ? new PresentedOfferingContext("offering") : presentedOfferingContext, (i & 16) != 0 ? null : installmentsInfo, purchasingData);
    }
}
