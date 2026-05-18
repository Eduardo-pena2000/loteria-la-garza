package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.p;
import Ga.e;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CreateSupportTicketResult;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MockPurchasesType implements PurchasesType {
    public static final int $stable = 8;
    private final CustomerCenterListener customerCenterListener;
    private final String preferredUILocaleOverride;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final String storefrontCountryCode;

    public MockPurchasesType() {
        this(null, null, null, null, 15, null);
    }

    public Object awaitCreateSupportTicket(String str, String str2, e eVar) {
        return new CreateSupportTicketResult(true);
    }

    public Object awaitCustomerCenterConfigData(e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitGetProduct(String str, String str2, e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitGetVirtualCurrencies(e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitOfferings(e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitPurchase(PurchaseParams.Builder builder, e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitRestore(e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public Object awaitSyncPurchases(e eVar) {
        throw new p("Mock implementation for previews only");
    }

    public CustomerCenterListener getCustomerCenterListener() {
        return this.customerCenterListener;
    }

    public String getPreferredUILocaleOverride() {
        return this.preferredUILocaleOverride;
    }

    public PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public String getStorefrontCountryCode() {
        return this.storefrontCountryCode;
    }

    public void invalidateVirtualCurrenciesCache() {
    }

    public void track(FeatureEvent event) {
        t.g(event, "event");
    }

    public MockPurchasesType(String str, PurchasesAreCompletedBy purchasesAreCompletedBy, String str2, CustomerCenterListener customerCenterListener) {
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        this.preferredUILocaleOverride = str;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.storefrontCountryCode = str2;
        this.customerCenterListener = customerCenterListener;
    }

    public /* synthetic */ MockPurchasesType(String str, PurchasesAreCompletedBy purchasesAreCompletedBy, String str2, CustomerCenterListener customerCenterListener, int i, k kVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? PurchasesAreCompletedBy.REVENUECAT : purchasesAreCompletedBy, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : customerCenterListener);
    }
}
