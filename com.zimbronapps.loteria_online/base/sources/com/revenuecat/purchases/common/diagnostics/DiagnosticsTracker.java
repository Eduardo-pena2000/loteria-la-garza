package com.revenuecat.purchases.common.diagnostics;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.networking.ConnectionErrorReason;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DiagnosticsTracker {

    @Deprecated
    public static final String BACKEND_ERROR_CODE_KEY = "backend_error_code";

    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";

    @Deprecated
    public static final String CACHE_STATUS_KEY = "cache_status";

    @Deprecated
    public static final String CONNECTION_ERROR_REASON_KEY = "connection_error_reason";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ERROR_CODE_KEY = "error_code";

    @Deprecated
    public static final String ERROR_MESSAGE_KEY = "error_message";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String FETCH_POLICY_KEY = "fetch_policy";

    @Deprecated
    public static final String FOUND_PRODUCT_IDS_KEY = "found_product_ids";

    @Deprecated
    public static final String HAD_UNSYNCED_PURCHASES_BEFORE_KEY = "had_unsynced_purchases_before";

    @Deprecated
    public static final String HAS_INTRO_PRICE_KEY = "has_intro_price";

    @Deprecated
    public static final String HAS_INTRO_TRIAL_KEY = "has_intro_trial";

    @Deprecated
    public static final String HOST_KEY = "host";

    @Deprecated
    public static final String IS_RETRY = "is_retry";

    @Deprecated
    public static final String NOT_FOUND_PRODUCT_IDS_KEY = "not_found_product_ids";

    @Deprecated
    public static final String OLD_PRODUCT_ID_KEY = "old_product_id";

    @Deprecated
    public static final String PENDING_REQUEST_COUNT = "pending_request_count";

    @Deprecated
    public static final String PRODUCT_IDS_KEY = "product_ids";

    @Deprecated
    public static final String PRODUCT_ID_KEY = "product_id";

    @Deprecated
    public static final String PRODUCT_TYPE_KEY = "product_type";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String PURCHASE_STATUSES_KEY = "purchase_statuses";

    @Deprecated
    public static final String REQUESTED_PRODUCT_IDS_KEY = "requested_product_ids";

    @Deprecated
    public static final String REQUEST_STATUS_KEY = "request_status";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final UUID appSessionID;
    private final Map commonProperties;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private DiagnosticsEventTrackerListener listener;

    public enum CacheStatus {
        NOT_CHECKED,
        NOT_FOUND,
        STALE,
        VALID
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Qa.a $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar) {
            super(0);
            this.$completion = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            if (DiagnosticsTracker.access$getDiagnosticsFileHelper$p(DiagnosticsTracker.this).isDiagnosticsFileTooBig()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Diagnostics file is too big. Deleting it.");
                }
                DiagnosticsTracker.access$getDiagnosticsHelper$p(DiagnosticsTracker.this).resetDiagnosticsStatus();
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ DiagnosticsEntry $diagnosticsEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            DiagnosticsTracker.this.trackEventInCurrentThread$purchases_defaultsBc8Release(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher dispatcher, UUID uuid) {
        t.g(appConfig, "appConfig");
        t.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        t.g(diagnosticsHelper, "diagnosticsHelper");
        t.g(dispatcher, "diagnosticsDispatcher");
        t.g(uuid, "appSessionID");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = dispatcher;
        this.appSessionID = uuid;
        this.commonProperties = appConfig.getStore() == Store.PLAY_STORE ? MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("play_store_version", appConfig.getPlayStoreVersionName()), x.a("play_services_version", appConfig.getPlayServicesVersionName())})) : S.h();
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        enqueue$lambda$2(aVar);
    }

    public static final /* synthetic */ DiagnosticsFileHelper access$getDiagnosticsFileHelper$p(DiagnosticsTracker diagnosticsTracker) {
        return diagnosticsTracker.diagnosticsFileHelper;
    }

    public static final /* synthetic */ DiagnosticsHelper access$getDiagnosticsHelper$p(DiagnosticsTracker diagnosticsTracker) {
        return diagnosticsTracker.diagnosticsHelper;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(Qa.a aVar) {
        enqueue(new 1(aVar));
    }

    private final void enqueue(Qa.a aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new b(aVar), null, 2, null);
    }

    private static final void enqueue$lambda$2(Qa.a aVar) {
        aVar.invoke();
    }

    private final void trackEvent(DiagnosticsEntryName diagnosticsEntryName, Map map) {
        trackEvent(new DiagnosticsEntry(null, diagnosticsEntryName, S.r(this.commonProperties, map), this.appSessionID, null, null, 49, null));
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z);
    }

    public final DiagnosticsEventTrackerListener getListener() {
        return this.listener;
    }

    public final void setListener(DiagnosticsEventTrackerListener diagnosticsEventTrackerListener) {
        this.listener = diagnosticsEventTrackerListener;
    }

    public final void trackAmazonPurchaseAttempt-9VgGkz4(String str, String str2, Integer num, String str3, long j) {
        t.g(str, "productId");
        trackEvent(DiagnosticsEntryName.AMAZON_PURCHASE_ATTEMPT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("product_id", str), x.a("request_status", str2), x.a("error_code", num), x.a("error_message", str3), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackAmazonQueryProductDetailsRequest-KLykuaI(long j, boolean z, Set set) {
        t.g(set, "requestedProductIds");
        trackEvent(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, S.l(new q[]{x.a("successful", Boolean.valueOf(z)), x.a("response_time_millis", Long.valueOf(ab.b.q(j))), x.a("requested_product_ids", set)}));
    }

    public final void trackAmazonQueryPurchasesRequest-KLykuaI(long j, boolean z, List list) {
        trackEvent(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("successful", Boolean.valueOf(z)), x.a("response_time_millis", Long.valueOf(ab.b.q(j))), x.a("found_product_ids", list)})));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, S.h());
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, Q.f(x.a("verification_result", verification.name())));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, S.h());
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        String str = (purchasesError.getCode() == PurchasesErrorCode.UnsupportedError && t.c(purchasesError.getUnderlyingErrorMessage(), "Offline entitlements are not supported for one time purchases. Found one time purchases. See for more info: https://rev.cat/offline-entitlements")) ? "one_time_purchase_found" : (purchasesError.getCode() == PurchasesErrorCode.CustomerInfoError && t.c(purchasesError.getUnderlyingErrorMessage(), "Product entitlement mapping is required for offline entitlements. Skipping offline customer info calculation.")) ? "no_entitlement_mapping_available" : "unknown";
        trackEvent(DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, S.l(new q[]{x.a("offline_entitlement_error_reason", str), x.a("error_message", purchasesError.getMessage() + " Underlying error: " + purchasesError.getUnderlyingErrorMessage())}));
    }

    public final void trackEventInCurrentThread$purchases_defaultsBc8Release(DiagnosticsEntry diagnosticsEntry) {
        t.g(diagnosticsEntry, "diagnosticsEntry");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Tracking diagnostics entry: " + diagnosticsEntry);
        }
        try {
            this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            DiagnosticsEventTrackerListener diagnosticsEventTrackerListener = this.listener;
            if (diagnosticsEventTrackerListener != null) {
                diagnosticsEventTrackerListener.onEventTracked();
            }
        } catch (IOException e) {
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Error tracking diagnostics entry: " + e);
            }
        }
    }

    public final void trackGetCustomerInfoResult-17CK4j0(CacheFetchPolicy cacheFetchPolicy, VerificationResult verificationResult, Boolean bool, String str, Integer num, long j) {
        t.g(cacheFetchPolicy, "cacheFetchPolicy");
        trackEvent(DiagnosticsEntryName.GET_CUSTOMER_INFO_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("fetch_policy", cacheFetchPolicy.name()), x.a("verification_result", verificationResult != null ? verificationResult.name() : null), x.a("had_unsynced_purchases_before", bool), x.a("error_message", str), x.a("error_code", num), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackGetCustomerInfoStarted() {
        trackEvent(DiagnosticsEntryName.GET_CUSTOMER_INFO_STARTED, S.h());
    }

    public final void trackGetOfferingsResult-B8UsjHI(Set set, Set set2, String str, Integer num, String str2, CacheStatus cacheStatus, long j) {
        t.g(cacheStatus, "cacheStatus");
        trackEvent(DiagnosticsEntryName.GET_OFFERINGS_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("requested_product_ids", set), x.a("not_found_product_ids", set2), x.a("error_message", str), x.a("error_code", num), x.a("verification_result", str2), x.a("cache_status", cacheStatus.name()), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackGetOfferingsStarted() {
        trackEvent(DiagnosticsEntryName.GET_OFFERINGS_STARTED, S.h());
    }

    public final void trackGetProductsResult-9VgGkz4(Set set, Set set2, String str, Integer num, long j) {
        t.g(set, "requestedProductIds");
        t.g(set2, "notFoundProductIds");
        trackEvent(DiagnosticsEntryName.GET_PRODUCTS_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("requested_product_ids", set), x.a("not_found_product_ids", set2), x.a("error_message", str), x.a("error_code", num), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackGetProductsStarted(Set set) {
        t.g(set, "requestedProductIds");
        trackEvent(DiagnosticsEntryName.GET_PRODUCTS_STARTED, Q.f(x.a("requested_product_ids", set)));
    }

    public final void trackGoogleBillingServiceDisconnected() {
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_SERVICE_DISCONNECTED, S.h());
    }

    public final void trackGoogleBillingSetupFinished(int i, String str, int i2) {
        t.g(str, "debugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_SETUP_FINISHED, S.l(new q[]{x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str), x.a("pending_request_count", Integer.valueOf(i2))}));
    }

    public final void trackGoogleBillingStartConnection() {
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_START_CONNECTION, S.h());
    }

    public final void trackGooglePurchaseStarted(String str, String str2, Boolean bool, Boolean bool2) {
        t.g(str, "productId");
        trackEvent(DiagnosticsEntryName.GOOGLE_PURCHASE_STARTED, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("product_id", str), x.a("old_product_id", str2), x.a("has_intro_trial", bool), x.a("has_intro_price", bool2)})));
    }

    public final void trackGooglePurchaseUpdateReceived(List list, List list2, int i, String str) {
        t.g(str, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_PURCHASES_UPDATE_RECEIVED, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("product_ids", list), x.a("purchase_statuses", list2), x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str)})));
    }

    public final void trackGoogleQueryProductDetailsRequest-9VgGkz4(Set set, String str, int i, String str2, long j) {
        t.g(set, "requestedProductIds");
        t.g(str, "productType");
        t.g(str2, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, S.l(new q[]{x.a("requested_product_ids", set), x.a("product_type_queried", str), x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str2), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))}));
    }

    public final void trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y(String str, int i, String str2, long j) {
        t.g(str, "productType");
        t.g(str2, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, S.l(new q[]{x.a("product_type_queried", str), x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str2), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))}));
    }

    public final void trackGoogleQueryPurchasesRequest-zkXUZaI(String str, int i, String str2, long j, List list) {
        t.g(str, "productType");
        t.g(str2, "billingDebugMessage");
        t.g(list, "foundProductIds");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, S.l(new q[]{x.a("product_type_queried", str), x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str2), x.a("response_time_millis", Long.valueOf(ab.b.q(j))), x.a("found_product_ids", list)}));
    }

    public final void trackHttpRequestPerformed--XzGXFE(String str, Endpoint endpoint, long j, boolean z, int i, Integer num, HTTPResult.Origin origin, VerificationResult verificationResult, boolean z2, ConnectionErrorReason connectionErrorReason) {
        t.g(str, "host");
        t.g(endpoint, "endpoint");
        t.g(verificationResult, "verificationResult");
        trackEvent(DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("host", str), x.a("endpoint_name", endpoint.getName()), x.a("response_time_millis", Long.valueOf(ab.b.q(j))), x.a("successful", Boolean.valueOf(z)), x.a("response_code", Integer.valueOf(i)), x.a("backend_error_code", num), x.a("etag_hit", Boolean.valueOf(origin == HTTPResult.Origin.CACHE)), x.a("verification_result", verificationResult.name()), x.a("is_retry", Boolean.valueOf(z2)), x.a("connection_error_reason", connectionErrorReason != null ? connectionErrorReason.name() : null)})));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, S.h());
    }

    public final void trackMaxEventsStoredLimitReached(boolean z) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(null, DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, this.commonProperties, this.appSessionID, null, null, 49, null);
        if (z) {
            trackEventInCurrentThread$purchases_defaultsBc8Release(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int i, String str) {
        t.g(str, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        q a = x.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(diagnosticsEntryName, S.l(new q[]{a, x.a("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), x.a("billing_response_code", Integer.valueOf(i)), x.a("billing_debug_message", str)}));
    }

    public final void trackPurchaseResult-myKFqkg(String str, ProductType productType, Integer num, String str2, long j, VerificationResult verificationResult) {
        t.g(str, "productId");
        t.g(productType, "productType");
        trackEvent(DiagnosticsEntryName.PURCHASE_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("product_id", str), x.a("product_type", DiagnosticsTrackerKt.access$getDiagnosticsName(productType)), x.a("error_code", num), x.a("error_message", str2), x.a("response_time_millis", Long.valueOf(ab.b.q(j))), x.a("verification_result", verificationResult != null ? verificationResult.name() : null)})));
    }

    public final void trackPurchaseStarted(String str, ProductType productType) {
        t.g(str, "productId");
        t.g(productType, "productType");
        trackEvent(DiagnosticsEntryName.PURCHASE_STARTED, S.l(new q[]{x.a("product_id", str), x.a("product_type", DiagnosticsTrackerKt.access$getDiagnosticsName(productType))}));
    }

    public final void trackRestorePurchasesResult-SxA4cEA(Integer num, String str, long j) {
        trackEvent(DiagnosticsEntryName.RESTORE_PURCHASES_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("error_code", num), x.a("error_message", str), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackRestorePurchasesStarted() {
        trackEvent(DiagnosticsEntryName.RESTORE_PURCHASES_STARTED, S.h());
    }

    public final void trackSyncPurchasesResult-SxA4cEA(Integer num, String str, long j) {
        trackEvent(DiagnosticsEntryName.SYNC_PURCHASES_RESULT, MapExtensionsKt.filterNotNullValues(S.l(new q[]{x.a("error_code", num), x.a("error_message", str), x.a("response_time_millis", Long.valueOf(ab.b.q(j)))})));
    }

    public final void trackSyncPurchasesStarted() {
        trackEvent(DiagnosticsEntryName.SYNC_PURCHASES_STARTED, S.h());
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        t.g(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new 1(diagnosticsEntry));
    }

    public /* synthetic */ DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher dispatcher, UUID uuid, int i, k kVar) {
        this(appConfig, diagnosticsFileHelper, diagnosticsHelper, dispatcher, (i & 16) != 0 ? EventsManager.Companion.getAppSessionID$purchases_defaultsBc8Release() : uuid);
    }
}
