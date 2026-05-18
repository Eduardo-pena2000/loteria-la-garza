package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.q;
import Ca.x;
import Ga.e;
import Ia.d;
import Ia.f;
import Za.E;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductChangeCalculator {
    private static final int MONTHS_IN_HALF_YEAR = 6;
    private static final int MONTHS_IN_QUARTER = 3;
    private static final int MONTHS_IN_YEAR = 12;
    private static final long SANDBOX_HALF_YEAR_MINUTES = 15;
    private static final long SANDBOX_MONTHLY_MINUTES = 5;
    private static final long SANDBOX_QUARTER_MINUTES = 10;
    private static final long SANDBOX_YEARLY_MINUTES = 30;
    private final PurchasesType purchases;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Long getNormalizedPrice$revenuecatui_defaultsBc8Release(StoreProduct storeProduct, boolean z) {
            t.g(storeProduct, "<this>");
            Period period = storeProduct.getPeriod();
            if (period == null) {
                return null;
            }
            long amountMicros = storeProduct.getPrice().getAmountMicros();
            if (z) {
                return Long.valueOf(amountMicros / getSandboxRenewalMinutes$revenuecatui_defaultsBc8Release(period));
            }
            Price pricePerMonth$default = StoreProduct.pricePerMonth$default(storeProduct, (Locale) null, 1, (Object) null);
            if (pricePerMonth$default != null) {
                return Long.valueOf(pricePerMonth$default.getAmountMicros());
            }
            return null;
        }

        public final long getSandboxRenewalMinutes$revenuecatui_defaultsBc8Release(Period period) {
            t.g(period, "period");
            double valueInMonths = period.getValueInMonths();
            if (valueInMonths >= 12.0d) {
                return 30L;
            }
            if (valueInMonths >= 6.0d) {
                return 15L;
            }
            return valueInMonths >= 3.0d ? 10L : 5L;
        }

        public final q parseProductIdentifier$revenuecatui_defaultsBc8Release(String productIdentifier) {
            t.g(productIdentifier, "productIdentifier");
            String d1 = E.d1(productIdentifier, ":", null, 2, null);
            String T0 = E.T0(productIdentifier, ":", "");
            return x.a(d1, T0.length() > 0 ? T0 : null);
        }

        public final q subscriptionIdentifiers$revenuecatui_defaultsBc8Release(StoreProduct storeProduct) {
            t.g(storeProduct, "<this>");
            if (!(storeProduct instanceof GoogleStoreProduct)) {
                return parseProductIdentifier$revenuecatui_defaultsBc8Release(storeProduct.getId());
            }
            GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) storeProduct;
            return x.a(googleStoreProduct.getProductId(), googleStoreProduct.getBasePlanId());
        }

        private Companion() {
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator", f = "ProductChangeCalculator.kt", l = {72}, m = "calculateProductChange")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductChangeCalculator.access$calculateProductChange(ProductChangeCalculator.this, null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator", f = "ProductChangeCalculator.kt", l = {40, 45}, m = "calculateProductChangeInfo")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductChangeCalculator.this.calculateProductChangeInfo(null, null, this);
        }
    }

    public ProductChangeCalculator(PurchasesType purchases) {
        t.g(purchases, "purchases");
        this.purchases = purchases;
    }

    public static final /* synthetic */ Object access$calculateProductChange(ProductChangeCalculator productChangeCalculator, SubscriptionInfo subscriptionInfo, Package r2, ProductChangeConfig productChangeConfig, e eVar) {
        return productChangeCalculator.calculateProductChange(subscriptionInfo, r2, productChangeConfig, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object calculateProductChange(com.revenuecat.purchases.SubscriptionInfo r12, com.revenuecat.purchases.Package r13, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r14, Ga.e r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChange(com.revenuecat.purchases.SubscriptionInfo, com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object calculateProductChangeInfo(com.revenuecat.purchases.Package r9, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r10, Ga.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChangeInfo.1
            if (r0 == 0) goto L13
            r0 = r11
            com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator$calculateProductChangeInfo$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChangeInfo.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator$calculateProductChangeInfo$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator$calculateProductChangeInfo$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            Ca.t.b(r11)     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            goto Lac
        L2e:
            r9 = move-exception
            goto Lb0
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$2
            r10 = r9
            com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r10 = (com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig) r10
            java.lang.Object r9 = r0.L$1
            com.revenuecat.purchases.Package r9 = (com.revenuecat.purchases.Package) r9
            java.lang.Object r2 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator r2 = (com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator) r2
            Ca.t.b(r11)     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            goto L6c
        L4a:
            Ca.t.b(r11)
            com.revenuecat.purchases.models.StoreProduct r11 = r9.getProduct()
            com.revenuecat.purchases.ProductType r11 = r11.getType()
            com.revenuecat.purchases.ProductType r2 = com.revenuecat.purchases.ProductType.SUBS
            if (r11 == r2) goto L5a
            return r5
        L5a:
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r11 = r8.purchases     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.L$0 = r8     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.L$1 = r9     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.L$2 = r10     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.label = r4     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.lang.Object r11 = com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType.DefaultImpls.awaitCustomerInfo$default(r11, r5, r0, r4, r5)     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r11 != r1) goto L6b
            return r1
        L6b:
            r2 = r8
        L6c:
            com.revenuecat.purchases.CustomerInfo r11 = (com.revenuecat.purchases.CustomerInfo) r11     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.util.Map r11 = r11.getSubscriptionsByProductIdentifier()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.util.Collection r11 = r11.values()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.util.Iterator r11 = r11.iterator()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
        L7c:
            boolean r4 = r11.hasNext()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r4 == 0) goto L98
            java.lang.Object r4 = r11.next()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r6 = r4
            com.revenuecat.purchases.SubscriptionInfo r6 = (com.revenuecat.purchases.SubscriptionInfo) r6     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            boolean r7 = r6.isActive()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r7 == 0) goto L7c
            com.revenuecat.purchases.Store r6 = r6.getStore()     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            com.revenuecat.purchases.Store r7 = com.revenuecat.purchases.Store.PLAY_STORE     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r6 != r7) goto L7c
            goto L99
        L98:
            r4 = r5
        L99:
            com.revenuecat.purchases.SubscriptionInfo r4 = (com.revenuecat.purchases.SubscriptionInfo) r4     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r4 == 0) goto Lca
            r0.L$0 = r5     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.L$1 = r5     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.L$2 = r5     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r0.label = r3     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            java.lang.Object r11 = r2.calculateProductChange(r4, r9, r10, r0)     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            if (r11 != r1) goto Lac
            return r1
        Lac:
            com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeInfo r11 = (com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeInfo) r11     // Catch: com.revenuecat.purchases.PurchasesException -> L2e
            r5 = r11
            goto Lca
        Lb0:
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r10 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Error determining product change info: "
            r11.append(r0)
            java.lang.String r9 = r9.getMessage()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.e(r9)
        Lca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.ProductChangeCalculator.calculateProductChangeInfo(com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, Ga.e):java.lang.Object");
    }
}
