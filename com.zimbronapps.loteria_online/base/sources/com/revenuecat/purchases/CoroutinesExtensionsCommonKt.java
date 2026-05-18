package com.revenuecat.purchases;

import Ca.s;
import Da.v;
import android.content.Context;
import com.revenuecat.purchases.Purchases;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsCommonKt {

    @Ia.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {171}, m = "awaitGetProductsResult")
    public static final class 1 extends Ia.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object awaitGetProductsResult = CoroutinesExtensionsCommonKt.awaitGetProductsResult(null, null, null, this);
            return awaitGetProductsResult == Ha.c.f() ? awaitGetProductsResult : s.a(awaitGetProductsResult);
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {50}, m = "awaitOfferingsResult")
    public static final class 1 extends Ia.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object awaitOfferingsResult = CoroutinesExtensionsCommonKt.awaitOfferingsResult(null, this);
            return awaitOfferingsResult == Ha.c.f() ? awaitOfferingsResult : s.a(awaitOfferingsResult);
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {109}, m = "awaitPurchaseResult")
    public static final class 1 extends Ia.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object awaitPurchaseResult = CoroutinesExtensionsCommonKt.awaitPurchaseResult(null, null, this);
            return awaitPurchaseResult == Ha.c.f() ? awaitPurchaseResult : s.a(awaitPurchaseResult);
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.CoroutinesExtensionsCommonKt", f = "CoroutinesExtensionsCommon.kt", l = {230}, m = "awaitRestoreResult")
    public static final class 1 extends Ia.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object awaitRestoreResult = CoroutinesExtensionsCommonKt.awaitRestoreResult(null, this);
            return awaitRestoreResult == Ha.c.f() ? awaitRestoreResult : s.a(awaitRestoreResult);
        }
    }

    public static final /* synthetic */ Object awaitCanMakePayments(Purchases.Companion companion, Context context, List list, Ga.e eVar) {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        companion.canMakePayments(context, list, new CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static /* synthetic */ Object awaitCanMakePayments$default(Purchases.Companion companion, Context context, List list, Ga.e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list = v.n();
        }
        return awaitCanMakePayments(companion, context, list, eVar);
    }

    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, Ga.e eVar) throws PurchasesTransactionException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, Ga.e eVar, int i, Object obj) throws PurchasesTransactionException {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitGetProductsResult(com.revenuecat.purchases.Purchases r4, java.util.List r5, com.revenuecat.purchases.ProductType r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProductsResult.1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProductsResult.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.L$2
            com.revenuecat.purchases.ProductType r4 = (com.revenuecat.purchases.ProductType) r4
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Ca.t.b(r7)
            goto L6e
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            Ca.t.b(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            Ga.k r7 = new Ga.k
            Ga.e r2 = Ha.b.c(r0)
            r7.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1
            r2.<init>(r7)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2
            r3.<init>(r7)
            com.revenuecat.purchases.ListenerConversionsCommonKt.getProductsWith(r4, r5, r6, r2, r3)
            java.lang.Object r7 = r7.a()
            java.lang.Object r4 = Ha.c.f()
            if (r7 != r4) goto L6b
            Ia.h.c(r0)
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            Ca.s r7 = (Ca.s) r7
            java.lang.Object r4 = r7.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitGetProductsResult(com.revenuecat.purchases.Purchases, java.util.List, com.revenuecat.purchases.ProductType, Ga.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitGetProductsResult$default(Purchases purchases, List list, ProductType productType, Ga.e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProductsResult(purchases, list, productType, eVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitOfferingsResult(com.revenuecat.purchases.Purchases r4, Ga.e r5) {
        /*
            boolean r0 = r5 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitOfferingsResult.1
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitOfferingsResult.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Ca.t.b(r5)
            goto L62
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Ca.t.b(r5)
            r0.L$0 = r4
            r0.label = r3
            Ga.k r5 = new Ga.k
            Ga.e r2 = Ha.b.c(r0)
            r5.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1
            r2.<init>(r5)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2
            r3.<init>(r5)
            com.revenuecat.purchases.ListenerConversionsCommonKt.getOfferingsWith(r4, r2, r3)
            java.lang.Object r5 = r5.a()
            java.lang.Object r4 = Ha.c.f()
            if (r5 != r4) goto L5f
            Ia.h.c(r0)
        L5f:
            if (r5 != r1) goto L62
            return r1
        L62:
            Ca.s r5 = (Ca.s) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitOfferingsResult(com.revenuecat.purchases.Purchases, Ga.e):java.lang.Object");
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, Ga.e eVar) throws PurchasesTransactionException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(kVar)));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitPurchaseResult(com.revenuecat.purchases.Purchases r4, com.revenuecat.purchases.PurchaseParams r5, Ga.e r6) {
        /*
            boolean r0 = r6 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitPurchaseResult.1
            if (r0 == 0) goto L13
            r0 = r6
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitPurchaseResult.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            com.revenuecat.purchases.PurchaseParams r4 = (com.revenuecat.purchases.PurchaseParams) r4
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Ca.t.b(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            Ca.t.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            Ga.k r6 = new Ga.k
            Ga.e r2 = Ha.b.c(r0)
            r6.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1
            r2.<init>(r6)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2
            r3.<init>(r6)
            com.revenuecat.purchases.interfaces.PurchaseCallback r2 = com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback(r2, r3)
            r4.purchase(r5, r2)
            java.lang.Object r6 = r6.a()
            java.lang.Object r4 = Ha.c.f()
            if (r6 != r4) goto L69
            Ia.h.c(r0)
        L69:
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Ca.s r6 = (Ca.s) r6
            java.lang.Object r4 = r6.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitPurchaseResult(com.revenuecat.purchases.Purchases, com.revenuecat.purchases.PurchaseParams, Ga.e):java.lang.Object");
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, Ga.e eVar) throws PurchasesTransactionException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(kVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object awaitRestoreResult(com.revenuecat.purchases.Purchases r4, Ga.e r5) {
        /*
            boolean r0 = r5 instanceof com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitRestoreResult.1
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1 r0 = (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitRestoreResult.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1 r0 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.revenuecat.purchases.Purchases r4 = (com.revenuecat.purchases.Purchases) r4
            Ca.t.b(r5)
            goto L62
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Ca.t.b(r5)
            r0.L$0 = r4
            r0.label = r3
            Ga.k r5 = new Ga.k
            Ga.e r2 = Ha.b.c(r0)
            r5.<init>(r2)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1 r2 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1
            r2.<init>(r5)
            com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2 r3 = new com.revenuecat.purchases.CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2
            r3.<init>(r5)
            com.revenuecat.purchases.ListenerConversionsCommonKt.restorePurchasesWith(r4, r2, r3)
            java.lang.Object r5 = r5.a()
            java.lang.Object r4 = Ha.c.f()
            if (r5 != r4) goto L5f
            Ia.h.c(r0)
        L5f:
            if (r5 != r1) goto L62
            return r1
        L62:
            Ca.s r5 = (Ca.s) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitRestoreResult(com.revenuecat.purchases.Purchases, Ga.e):java.lang.Object");
    }

    public static final Object awaitStorefrontCountryCode(Purchases purchases, Ga.e eVar) {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(purchases, new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2(kVar), new CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }
}
