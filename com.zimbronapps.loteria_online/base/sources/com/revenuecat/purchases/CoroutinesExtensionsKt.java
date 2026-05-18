package com.revenuecat.purchases;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CoroutinesExtensionsKt {
    @InternalRevenueCatAPI
    public static final /* synthetic */ Object awaitCreateSupportTicket(Purchases purchases, String str, String str2, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        purchases.createSupportTicket(str, str2, new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1(kVar), new CoroutinesExtensionsKt$awaitCreateSupportTicket$2$2(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    @InternalRevenueCatAPI
    public static final /* synthetic */ Object awaitCustomerCenterConfigData(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        purchases.getCustomerCenterConfigData$purchases_defaultsBc8Release(new CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(kVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, Ga.e eVar, int i, Object obj) throws PurchasesException {
        if ((i & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, eVar);
    }

    public static final /* synthetic */ Object awaitGetVirtualCurrencies(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.getVirtualCurrenciesWith(purchases, new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$1(kVar), new CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, Ga.e eVar) throws PurchasesTransactionException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(kVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, Ga.e eVar) throws PurchasesTransactionException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(kVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitSetAppstackAttributionParams(Purchases purchases, Map map, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        purchases.setAppstackAttributionParams(map, ListenerConversionsKt.syncAttributesAndOfferingsListener(new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$1(kVar), new CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$2(kVar)));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final Object awaitStorefrontLocale(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.getStorefrontLocaleWith(purchases, new CoroutinesExtensionsKt$awaitStorefrontLocale$2$2(kVar), new CoroutinesExtensionsKt$awaitStorefrontLocale$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(kVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }

    public static final /* synthetic */ Object getAmazonLWAConsentStatus(Purchases purchases, Ga.e eVar) throws PurchasesException {
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(kVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(kVar));
        Object a = kVar.a();
        if (a == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return a;
    }
}
