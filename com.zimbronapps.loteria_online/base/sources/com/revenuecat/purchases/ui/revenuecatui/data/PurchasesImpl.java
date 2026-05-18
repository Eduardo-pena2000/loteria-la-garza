package com.revenuecat.purchases.ui.revenuecatui.data;

import Ga.e;
import Ia.d;
import Ia.f;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchasesImpl implements PurchasesType {
    public static final int $stable = 8;
    private final Purchases purchases;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl", f = "PurchasesType.kt", l = {91}, m = "awaitGetProduct")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchasesImpl.this.awaitGetProduct(null, null, this);
        }
    }

    public PurchasesImpl() {
        this(null, 1, null);
    }

    public Object awaitCreateSupportTicket(String str, String str2, e eVar) throws PurchasesException {
        return CoroutinesExtensionsKt.awaitCreateSupportTicket(this.purchases, str, str2, eVar);
    }

    public Object awaitCustomerCenterConfigData(e eVar) {
        return CoroutinesExtensionsKt.awaitCustomerCenterConfigData(this.purchases, eVar);
    }

    public Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, e eVar) {
        return CoroutinesExtensionsKt.awaitCustomerInfo(this.purchases, cacheFetchPolicy, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitGetProduct(java.lang.String r8, java.lang.String r9, Ga.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.awaitGetProduct.1
            if (r0 == 0) goto L14
            r0 = r10
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.awaitGetProduct.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl$awaitGetProduct$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = Ha.c.f()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r4.L$0
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            Ca.t.b(r10)
            goto L50
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            Ca.t.b(r10)
            com.revenuecat.purchases.Purchases r1 = r7.purchases
            java.util.List r8 = Da.u.e(r8)
            r4.L$0 = r9
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r10 = com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProducts$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L50
            return r0
        L50:
            java.util.List r10 = (java.util.List) r10
            if (r9 != 0) goto L5b
            java.lang.Object r8 = Da.D.h0(r10)
            com.revenuecat.purchases.models.StoreProduct r8 = (com.revenuecat.purchases.models.StoreProduct) r8
            goto L81
        L5b:
            java.util.Iterator r8 = r10.iterator()
        L5f:
            boolean r10 = r8.hasNext()
            r0 = 0
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r8.next()
            r1 = r10
            com.revenuecat.purchases.models.StoreProduct r1 = (com.revenuecat.purchases.models.StoreProduct) r1
            com.revenuecat.purchases.models.GoogleStoreProduct r1 = com.revenuecat.purchases.models.GoogleStoreProductKt.getGoogleProduct(r1)
            if (r1 == 0) goto L77
            java.lang.String r0 = r1.getBasePlanId()
        L77:
            boolean r0 = kotlin.jvm.internal.t.c(r0, r9)
            if (r0 == 0) goto L5f
            r0 = r10
        L7e:
            r8 = r0
            com.revenuecat.purchases.models.StoreProduct r8 = (com.revenuecat.purchases.models.StoreProduct) r8
        L81:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl.awaitGetProduct(java.lang.String, java.lang.String, Ga.e):java.lang.Object");
    }

    public Object awaitGetVirtualCurrencies(e eVar) throws PurchasesException {
        return CoroutinesExtensionsKt.awaitGetVirtualCurrencies(this.purchases, eVar);
    }

    public Object awaitOfferings(e eVar) {
        return CoroutinesExtensionsCommonKt.awaitOfferings(this.purchases, eVar);
    }

    public Object awaitPurchase(PurchaseParams.Builder builder, e eVar) {
        return CoroutinesExtensionsCommonKt.awaitPurchase(this.purchases, builder.build(), eVar);
    }

    public Object awaitRestore(e eVar) {
        return CoroutinesExtensionsCommonKt.awaitRestore(this.purchases, eVar);
    }

    public Object awaitSyncPurchases(e eVar) {
        return CoroutinesExtensionsKt.awaitSyncPurchases(this.purchases, eVar);
    }

    public CustomerCenterListener getCustomerCenterListener() {
        return this.purchases.getCustomerCenterListener();
    }

    public String getPreferredUILocaleOverride() {
        return this.purchases.getPreferredUILocaleOverride();
    }

    public PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchases.getPurchasesAreCompletedBy();
    }

    public String getStorefrontCountryCode() {
        return this.purchases.getStorefrontCountryCode();
    }

    public void invalidateVirtualCurrenciesCache() {
        this.purchases.invalidateVirtualCurrenciesCache();
    }

    public void track(FeatureEvent event) {
        t.g(event, "event");
        this.purchases.track(event);
    }

    public PurchasesImpl(Purchases purchases) {
        t.g(purchases, "purchases");
        this.purchases = purchases;
    }

    public /* synthetic */ PurchasesImpl(Purchases purchases, int i, k kVar) {
        this((i & 1) != 0 ? Purchases.Companion.getSharedInstance() : purchases);
    }
}
