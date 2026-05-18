package com.revenuecat.purchases.common.offlineentitlements;

import Ca.I;
import Da.A;
import Da.v;
import Da.w;
import Qa.l;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
        final /* synthetic */ PurchasedProductsFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
            super(1);
            this.$onSuccess = lVar;
            this.this$0 = purchasedProductsFetcher;
            this.$productEntitlementMapping = productEntitlementMapping;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "activePurchasesByHashedToken");
            Iterable values = map.values();
            PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
            ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
            ArrayList arrayList = new ArrayList();
            Iterator it = values.iterator();
            while (it.hasNext()) {
                A.D(arrayList, PurchasedProductsFetcher.access$createPurchasedProducts(purchasedProductsFetcher, (StoreTransaction) it.next(), productEntitlementMapping));
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider) {
        t.g(deviceCache, "deviceCache");
        t.g(billingAbstract, "billing");
        t.g(dateProvider, "dateProvider");
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dateProvider = dateProvider;
    }

    public static final /* synthetic */ List access$createPurchasedProducts(PurchasedProductsFetcher purchasedProductsFetcher, StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        return purchasedProductsFetcher.createPurchasedProducts(storeTransaction, productEntitlementMapping);
    }

    private final List createPurchasedProducts(StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        List n;
        Date expirationDate = getExpirationDate(storeTransaction);
        List<String> productIds = storeTransaction.getProductIds();
        ArrayList arrayList = new ArrayList(w.y(productIds, 10));
        for (String str : productIds) {
            ProductEntitlementMapping.Mapping mapping = (ProductEntitlementMapping.Mapping) productEntitlementMapping.getMappings().get(str);
            String basePlanId = mapping != null ? mapping.getBasePlanId() : null;
            if (mapping == null || (n = mapping.getEntitlements()) == null) {
                n = v.n();
            }
            arrayList.add(new PurchasedProduct(str, basePlanId, storeTransaction, n, expirationDate));
        }
        return arrayList;
    }

    private final Date getExpirationDate(StoreTransaction storeTransaction) {
        if (WhenMappings.$EnumSwitchMapping$0[storeTransaction.getType().ordinal()] == 1) {
            return new Date(this.dateProvider.getNow().getTime() + TimeUnit.DAYS.toMillis(1L));
        }
        return null;
    }

    public final void queryActiveProducts(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        ProductEntitlementMapping productEntitlementMapping$purchases_defaultsBc8Release = this.deviceCache.getProductEntitlementMapping$purchases_defaultsBc8Release();
        if (productEntitlementMapping$purchases_defaultsBc8Release == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, "Product entitlement mapping is required for offline entitlements. Skipping offline customer info calculation."));
        } else {
            this.billing.queryPurchases(str, new 1(lVar, this, productEntitlementMapping$purchases_defaultsBc8Release), lVar2);
        }
    }

    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i, k kVar) {
        this(deviceCache, billingAbstract, (i & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
