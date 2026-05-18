package com.revenuecat.purchases.ui.revenuecatui.data;

import Ga.e;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PurchasesType {

    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitCustomerInfo$default(PurchasesType purchasesType, CacheFetchPolicy cacheFetchPolicy, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCustomerInfo");
            }
            if ((i & 1) != 0) {
                cacheFetchPolicy = CacheFetchPolicy.Companion.default();
            }
            return purchasesType.awaitCustomerInfo(cacheFetchPolicy, eVar);
        }
    }

    Object awaitCreateSupportTicket(String str, String str2, e eVar) throws PurchasesException;

    Object awaitCustomerCenterConfigData(e eVar);

    Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar);

    Object awaitGetProduct(String str, String str2, e eVar);

    Object awaitGetVirtualCurrencies(e eVar) throws PurchasesException;

    Object awaitOfferings(e eVar);

    Object awaitPurchase(PurchaseParams.Builder builder, e eVar);

    Object awaitRestore(e eVar);

    Object awaitSyncPurchases(e eVar);

    CustomerCenterListener getCustomerCenterListener();

    String getPreferredUILocaleOverride();

    PurchasesAreCompletedBy getPurchasesAreCompletedBy();

    String getStorefrontCountryCode();

    void invalidateVirtualCurrenciesCache();

    void track(FeatureEvent featureEvent);
}
