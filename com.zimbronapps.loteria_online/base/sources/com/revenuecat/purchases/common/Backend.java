package com.revenuecat.purchases.common;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeKt;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Backend {
    private static final String APP_USER_ID = "app_user_id";
    private static final String FETCH_TOKEN = "fetch_token";
    private static final String NEW_APP_USER_ID = "new_app_user_id";
    private static final int POST_RECEIPT_PAYLOAD_VERSION = 1;
    private volatile Map aliasCallbacks;
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map callbacks;
    private volatile Map createSupportTicketCallbacks;
    private volatile Map customerCenterCallbacks;
    private volatile Map diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map identifyCallbacks;
    private volatile Map offeringsCallbacks;
    private volatile Map paywallEventsCallbacks;
    private volatile Map postReceiptCallbacks;
    private volatile Map productEntitlementCallbacks;
    private volatile Map redeemWebPurchaseCallbacks;
    private volatile Map virtualCurrenciesCallbacks;
    private volatile Map webBillingProductsCallbacks;
    public static final Companion Companion = new Companion(null);
    private static final tb.b json = u.b((tb.b) null, Backend$Companion$json$1.INSTANCE, 1, (Object) null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsBc8Release$annotations() {
        }

        public final tb.b getJson$purchases_defaultsBc8Release() {
            return Backend.access$getJson$cp();
        }

        private Companion() {
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher dispatcher2, HTTPClient hTTPClient, BackendHelper backendHelper) {
        t.g(appConfig, "appConfig");
        t.g(dispatcher, "dispatcher");
        t.g(dispatcher2, "eventsDispatcher");
        t.g(hTTPClient, "httpClient");
        t.g(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = dispatcher2;
        this.httpClient = hTTPClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.aliasCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
        this.customerCenterCallbacks = new LinkedHashMap();
        this.createSupportTicketCallbacks = new LinkedHashMap();
        this.redeemWebPurchaseCallbacks = new LinkedHashMap();
        this.virtualCurrenciesCallbacks = new LinkedHashMap();
        this.webBillingProductsCallbacks = new LinkedHashMap();
    }

    public static final /* synthetic */ PostReceiptErrorHandlingBehavior access$determinePostReceiptErrorHandlingBehavior(Backend backend, int i, PurchasesError purchasesError) {
        return backend.determinePostReceiptErrorHandlingBehavior(i, purchasesError);
    }

    public static final /* synthetic */ AppConfig access$getAppConfig$p(Backend backend) {
        return backend.appConfig;
    }

    public static final /* synthetic */ BackendHelper access$getBackendHelper$p(Backend backend) {
        return backend.backendHelper;
    }

    public static final /* synthetic */ HTTPClient access$getHttpClient$p(Backend backend) {
        return backend.httpClient;
    }

    public static final /* synthetic */ tb.b access$getJson$cp() {
        return json;
    }

    private final synchronized void addBackgroundAwareCallback(Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, q qVar, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        try {
            BackgroundAwareCallbackCacheKey copy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean containsKey = map.containsKey(copy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && containsKey) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    String str = "[Purchases] - " + logLevel.name();
                    String format = String.format("Request already scheduled without jitter delay, adding callbacks to unjittered request with key: %s", Arrays.copyOf(new Object[]{copy$default}, 1));
                    t.f(format, "format(...)");
                    currentLogHandler.d(str, format);
                }
                backgroundAwareCallbackCacheKey2 = copy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, qVar, delay);
            BackgroundAwareCallbackCacheKey copy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean containsKey2 = map.containsKey(copy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && containsKey2) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    String str2 = "[Purchases] - " + logLevel2.name();
                    String format2 = String.format("Request already scheduled with jitter delay, adding existing callbacks to unjittered request with key: %s", Arrays.copyOf(new Object[]{copy$default}, 1));
                    t.f(format2, "format(...)");
                    currentLogHandler2.d(str2, format2);
                }
                Collection collection = (List) map.remove(copy$default2);
                if (collection != null) {
                    Collection collection2 = collection.isEmpty() ? null : collection;
                    if (collection2 != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List list = (List) map.get(backgroundAwareCallbackCacheKey);
                            if (list != null) {
                                list.addAll(collection2);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, collection2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, q qVar, Delay delay, int i, Object obj) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, qVar, delay);
    }

    private final void addCallback(Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, Object obj2, Delay delay) {
        if (!map.containsKey(obj)) {
            map.put(obj, v.t(new Object[]{obj2}));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            U u = U.a;
            String format = String.format("Same call already in progress, adding to callbacks map with key: %s", Arrays.copyOf(new Object[]{obj}, 1));
            t.f(format, "format(...)");
            currentLogHandler.d(str, format);
        }
        Object obj3 = map.get(obj);
        t.d(obj3);
        ((List) obj3).add(obj2);
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, Object obj2, Delay delay, int i, Object obj3) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, obj2, delay);
    }

    private final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i, PurchasesError purchasesError) {
        return RCHTTPStatusCodes.INSTANCE.isServerError(i) ? PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME : purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public final void aliasUsers(String str, String str2, Qa.a aVar, l lVar) {
        t.g(str, "oldAppUserID");
        t.g(str2, "newAppUserID");
        t.g(aVar, "onSuccessHandler");
        t.g(lVar, "onErrorHandler");
        List s = v.s(new String[]{str, str2});
        Backend$aliasUsers$call$1 backend$aliasUsers$call$1 = new Backend$aliasUsers$call$1(str, str2, this, s);
        synchronized (this) {
            addCallback$default(this, this.aliasCallbacks, backend$aliasUsers$call$1, this.dispatcher, s, x.a(aVar, lVar), null, 16, null);
            I i = I.a;
        }
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map getAliasCallbacks() {
        return this.aliasCallbacks;
    }

    public final synchronized Map getCallbacks() {
        return this.callbacks;
    }

    public final synchronized Map getCreateSupportTicketCallbacks() {
        return this.createSupportTicketCallbacks;
    }

    public final synchronized Map getCustomerCenterCallbacks() {
        return this.customerCenterCallbacks;
    }

    public final void getCustomerCenterConfig(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccessHandler");
        t.g(lVar2, "onErrorHandler");
        Endpoint.GetCustomerCenterConfig getCustomerCenterConfig = new Endpoint.GetCustomerCenterConfig(str);
        String path$default = Endpoint.getPath$default(getCustomerCenterConfig, false, 1, null);
        Dispatcher.AsyncCall backend$getCustomerCenterConfig$call$1 = new Backend$getCustomerCenterConfig$call$1(this, getCustomerCenterConfig, path$default);
        synchronized (this) {
            addCallback(this.customerCenterCallbacks, backend$getCustomerCenterConfig$call$1, this.dispatcher, path$default, x.a(lVar, lVar2), Delay.NONE);
            I i = I.a;
        }
    }

    public final void getCustomerInfo(String str, boolean z, l lVar, p pVar) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(pVar, "onError");
        Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(str);
        String path$default = Endpoint.getPath$default(getCustomerInfo, false, 1, null);
        synchronized (this) {
            try {
                backgroundAwareCallbackCacheKey = this.postReceiptCallbacks.isEmpty() ? new BackgroundAwareCallbackCacheKey(Da.u.e(path$default), z) : new BackgroundAwareCallbackCacheKey(D.w0(Da.u.e(path$default), String.valueOf(this.callbacks.size())), z);
            } finally {
            }
        }
        Backend$getCustomerInfo$call$1 backend$getCustomerInfo$call$1 = new Backend$getCustomerInfo$call$1(this, getCustomerInfo, backgroundAwareCallbackCacheKey);
        synchronized (this) {
            try {
                addBackgroundAwareCallback(this.callbacks, backend$getCustomerInfo$call$1, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(lVar, pVar), z ? Delay.DEFAULT : Delay.NONE);
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Map getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String str, boolean z, p pVar, p pVar2) {
        t.g(str, "appUserID");
        t.g(pVar, "onSuccess");
        t.g(pVar2, "onError");
        Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(str);
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(Da.u.e(Endpoint.getPath$default(getOfferings, false, 1, null)), z);
        Backend$getOfferings$call$1 backend$getOfferings$call$1 = new Backend$getOfferings$call$1(this, getOfferings, backgroundAwareCallbackCacheKey);
        synchronized (this) {
            try {
                addBackgroundAwareCallback(this.offeringsCallbacks, backend$getOfferings$call$1, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(pVar, pVar2), z ? Delay.DEFAULT : Delay.NONE);
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Map getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(l lVar, l lVar2) {
        t.g(lVar, "onSuccessHandler");
        t.g(lVar2, "onErrorHandler");
        Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        String path$default = Endpoint.getPath$default(getProductEntitlementMapping, false, 1, null);
        Dispatcher.AsyncCall backend$getProductEntitlementMapping$call$1 = new Backend$getProductEntitlementMapping$call$1(this, getProductEntitlementMapping, path$default);
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, backend$getProductEntitlementMapping$call$1, this.dispatcher, path$default, x.a(lVar, lVar2), Delay.LONG);
            I i = I.a;
        }
    }

    public final synchronized Map getRedeemWebPurchaseCallbacks() {
        return this.redeemWebPurchaseCallbacks;
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void getVirtualCurrencies(String str, boolean z, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        Endpoint.GetVirtualCurrencies getVirtualCurrencies = new Endpoint.GetVirtualCurrencies(str);
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(Da.u.e(Endpoint.getPath$default(getVirtualCurrencies, false, 1, null)), z);
        Backend$getVirtualCurrencies$call$1 backend$getVirtualCurrencies$call$1 = new Backend$getVirtualCurrencies$call$1(this, getVirtualCurrencies, backgroundAwareCallbackCacheKey);
        synchronized (this) {
            try {
                addBackgroundAwareCallback(this.virtualCurrenciesCallbacks, backend$getVirtualCurrencies$call$1, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(lVar, lVar2), z ? Delay.DEFAULT : Delay.NONE);
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Map getVirtualCurrenciesCallbacks() {
        return this.virtualCurrenciesCallbacks;
    }

    public final void getWebBillingProducts(String str, Set set, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(set, "productIds");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        Endpoint.WebBillingGetProducts webBillingGetProducts = new Endpoint.WebBillingGetProducts(str, set);
        String path$default = Endpoint.getPath$default(webBillingGetProducts, false, 1, null);
        Dispatcher.AsyncCall backend$getWebBillingProducts$call$1 = new Backend$getWebBillingProducts$call$1(this, webBillingGetProducts, path$default);
        synchronized (this) {
            addCallback(this.webBillingProductsCallbacks, backend$getWebBillingProducts$call$1, this.dispatcher, path$default, x.a(lVar, lVar2), Delay.NONE);
            I i = I.a;
        }
    }

    public final synchronized Map getWebBillingProductsCallbacks() {
        return this.webBillingProductsCallbacks;
    }

    public final void logIn(String str, String str2, p pVar, l lVar) {
        t.g(str, "appUserID");
        t.g(str2, "newAppUserID");
        t.g(pVar, "onSuccessHandler");
        t.g(lVar, "onErrorHandler");
        List s = v.s(new String[]{str, str2});
        Backend$logIn$call$1 backend$logIn$call$1 = new Backend$logIn$call$1(str, str2, this, s);
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, backend$logIn$call$1, this.dispatcher, s, x.a(pVar, lVar), null, 16, null);
            I i = I.a;
        }
    }

    public final void postCreateSupportTicket(String str, String str2, String str3, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(str2, "email");
        t.g(str3, "description");
        t.g(lVar, "onSuccessHandler");
        t.g(lVar2, "onErrorHandler");
        Endpoint.PostCreateSupportTicket postCreateSupportTicket = Endpoint.PostCreateSupportTicket.INSTANCE;
        String path$default = Endpoint.getPath$default(postCreateSupportTicket, false, 1, null);
        Dispatcher.AsyncCall backend$postCreateSupportTicket$call$1 = new Backend$postCreateSupportTicket$call$1(this, postCreateSupportTicket, S.l(new q[]{x.a("app_user_id", str), x.a("customer_email", str2), x.a("issue_description", str3)}), path$default);
        synchronized (this) {
            addCallback(this.createSupportTicketCallbacks, backend$postCreateSupportTicket$call$1, this.dispatcher, path$default, x.a(lVar, lVar2), Delay.NONE);
            I i = I.a;
        }
    }

    public final void postDiagnostics(List list, l lVar, p pVar) {
        t.g(list, "diagnosticsList");
        t.g(lVar, "onSuccessHandler");
        t.g(pVar, "onErrorHandler");
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        Dispatcher.AsyncCall backend$postDiagnostics$call$1 = new Backend$postDiagnostics$call$1(this, Q.f(x.a("entries", new JSONArray(list))), arrayList);
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, backend$postDiagnostics$call$1, this.eventsDispatcher, arrayList, x.a(lVar, pVar), Delay.LONG);
            I i = I.a;
        }
    }

    public final void postEvents(EventsRequest eventsRequest, URL url, Delay delay, Qa.a aVar, p pVar) {
        t.g(eventsRequest, "paywallEventRequest");
        t.g(url, "baseURL");
        t.g(delay, "delay");
        t.g(aVar, "onSuccessHandler");
        t.g(pVar, "onErrorHandler");
        tb.b defaultJson = JsonProvider.Companion.getDefaultJson();
        defaultJson.a();
        Map asMap = JsonElementExtensionsKt.asMap(defaultJson.e(EventsRequest.Companion.serializer(), eventsRequest));
        if (asMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            pVar.invoke(purchasesError, Boolean.TRUE);
        } else {
            Backend$postEvents$call$1 backend$postEvents$call$1 = new Backend$postEvents$call$1(this, url, asMap, eventsRequest);
            synchronized (this) {
                addCallback(this.paywallEventsCallbacks, backend$postEvents$call$1, this.eventsDispatcher, eventsRequest.getCacheKey(), x.a(aVar, pVar), delay);
                I i = I.a;
            }
        }
    }

    public final void postReceiptData(String str, String str2, boolean z, boolean z2, Map map, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, l lVar, Qa.q qVar) {
        ArrayList arrayList;
        PresentedOfferingContext.TargetingContext targetingContext;
        t.g(str, "purchaseToken");
        t.g(str2, "appUserID");
        Map map2 = map;
        t.g(map2, "subscriberAttributes");
        t.g(receiptInfo, "receiptInfo");
        t.g(postReceiptInitiationSource, "initiationSource");
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        t.g(lVar, "onSuccess");
        t.g(qVar, "onError");
        List s = v.s(new String[]{str, str2, String.valueOf(z), String.valueOf(z2), map.toString(), receiptInfo.toString(), purchasesAreCompletedBy.toString()});
        q a = x.a("fetch_token", str);
        q a2 = x.a("product_ids", receiptInfo.getProductIDs());
        q a3 = x.a("platform_product_ids", receiptInfo.getPlatformProductIds());
        q a4 = x.a("app_user_id", str2);
        q a5 = x.a("is_restore", Boolean.valueOf(z));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        q a6 = x.a("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        q a7 = x.a("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        q a8 = x.a("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : S.l(new q[]{x.a("revision", Integer.valueOf(targetingContext.getRevision())), x.a("rule_id", targetingContext.getRuleId())}));
        q a9 = x.a("observer_mode", Boolean.valueOf(!z2));
        String lowerCase = purchasesAreCompletedBy.name().toLowerCase(Locale.ROOT);
        t.f(lowerCase, "toLowerCase(...)");
        q a10 = x.a("purchase_completed_by", lowerCase);
        q a11 = x.a("price", receiptInfo.getPrice());
        q a12 = x.a("currency", receiptInfo.getCurrency());
        if (map.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            map2 = null;
        }
        q a13 = x.a("attributes", map2);
        q a14 = x.a("normal_duration", receiptInfo.getDuration());
        q a15 = x.a("store_user_id", receiptInfo.getStoreUserID());
        List pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList = new ArrayList(w.y(pricingPhases, 10));
            Iterator it = pricingPhases.iterator();
            while (it.hasNext()) {
                arrayList.add(BackendKt.toMap((PricingPhase) it.next()));
            }
        } else {
            arrayList = null;
        }
        q a16 = x.a("pricing_phases", arrayList);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        Backend$postReceiptData$call$1 backend$postReceiptData$call$1 = new Backend$postReceiptData$call$1(this, MapExtensionsKt.filterNotNullValues(S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, x.a("proration_mode", replacementMode != null ? ReplacementModeKt.getBackendName(replacementMode) : null), x.a("initiation_source", postReceiptInitiationSource.getPostReceiptFieldValue()), x.a("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null), x.a("sdk_originated", Boolean.valueOf(receiptInfo.getSdkOriginated())), x.a("payload_version", 1)})), v.q(new q[]{x.a("app_user_id", str2), x.a("fetch_token", str)}), MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("price_string", receiptInfo.getFormattedPrice()), x.a("marketplace", receiptInfo.getMarketplace())})), s);
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, backend$postReceiptData$call$1, this.dispatcher, s, x.a(lVar, qVar), null, 16, null);
            I i = I.a;
        }
    }

    public final void postRedeemWebPurchase(String str, String str2, l lVar) {
        t.g(str, "appUserID");
        t.g(str2, "redemptionToken");
        t.g(lVar, "onResultHandler");
        Endpoint.PostRedeemWebPurchase postRedeemWebPurchase = Endpoint.PostRedeemWebPurchase.INSTANCE;
        String path$default = Endpoint.getPath$default(postRedeemWebPurchase, false, 1, null);
        Dispatcher.AsyncCall backend$postRedeemWebPurchase$call$1 = new Backend$postRedeemWebPurchase$call$1(this, postRedeemWebPurchase, S.l(new q[]{x.a("redemption_token", str2), x.a("app_user_id", str)}), path$default);
        synchronized (this) {
            addCallback(this.redeemWebPurchaseCallbacks, backend$postRedeemWebPurchase$call$1, this.dispatcher, path$default, lVar, Delay.NONE);
            I i = I.a;
        }
    }

    public final synchronized void setAliasCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.aliasCallbacks = map;
    }

    public final synchronized void setCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setCreateSupportTicketCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.createSupportTicketCallbacks = map;
    }

    public final synchronized void setCustomerCenterCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.customerCenterCallbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public final synchronized void setRedeemWebPurchaseCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.redeemWebPurchaseCallbacks = map;
    }

    public final synchronized void setVirtualCurrenciesCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.virtualCurrenciesCallbacks = map;
    }

    public final synchronized void setWebBillingProductsCallbacks(Map map) {
        t.g(map, "<set-?>");
        this.webBillingProductsCallbacks = map;
    }
}
