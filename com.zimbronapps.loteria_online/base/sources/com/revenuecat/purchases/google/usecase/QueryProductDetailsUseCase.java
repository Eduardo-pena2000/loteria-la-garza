package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Da.D;
import Da.v;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.UnfetchedProduct;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.QueryProductDetailsParamsBuilderException;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final l withConnectedClient;

    public static final class 2 extends u implements l {
        final /* synthetic */ Set $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Set set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        public static /* synthetic */ void a(QueryProductDetailsUseCase queryProductDetailsUseCase, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
            invoke$processResult(queryProductDetailsUseCase, billingResult, queryProductDetailsResult);
        }

        private static final /* synthetic */ void invoke$processResult(QueryProductDetailsUseCase queryProductDetailsUseCase, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
            BillingClientUseCase.processResult$default(queryProductDetailsUseCase, billingResult, queryProductDetailsResult, null, null, 12, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            t.g(billingClient, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.access$getUseCaseParams$p(QueryProductDetailsUseCase.this).getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            try {
                QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
                QueryProductDetailsUseCase.access$queryProductDetailsAsyncEnsuringOneResponse(queryProductDetailsUseCase, billingClient, googleProductType, this.$nonEmptyProductIds, new e(queryProductDetailsUseCase));
            } catch (QueryProductDetailsParamsBuilderException e) {
                l onError = QueryProductDetailsUseCase.this.getOnError();
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append(": ");
                Throwable cause = e.getCause();
                sb.append(cause != null ? cause.getMessage() : null);
                onError.invoke(new PurchasesError(purchasesErrorCode, sb.toString()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(queryProductDetailsUseCaseParams, lVar2, pVar);
        t.g(queryProductDetailsUseCaseParams, "useCaseParams");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryProductDetailsUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, ProductDetailsResponseListener productDetailsResponseListener, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        queryProductDetailsAsyncEnsuringOneResponse$lambda$14(atomicBoolean, queryProductDetailsUseCase, set, str, date, productDetailsResponseListener, billingResult, queryProductDetailsResult);
    }

    public static final /* synthetic */ String access$convertUnfetchedProductStatusCodeToString(QueryProductDetailsUseCase queryProductDetailsUseCase, int i) {
        return queryProductDetailsUseCase.convertUnfetchedProductStatusCodeToString(i);
    }

    public static final /* synthetic */ QueryProductDetailsUseCaseParams access$getUseCaseParams$p(QueryProductDetailsUseCase queryProductDetailsUseCase) {
        return queryProductDetailsUseCase.useCaseParams;
    }

    public static final /* synthetic */ void access$queryProductDetailsAsyncEnsuringOneResponse(QueryProductDetailsUseCase queryProductDetailsUseCase, BillingClient billingClient, String str, Set set, ProductDetailsResponseListener productDetailsResponseListener) {
        queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(billingClient, str, set, productDetailsResponseListener);
    }

    private final String convertUnfetchedProductStatusCodeToString(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "INVALID_PRODUCT_ID_FORMAT";
        }
        if (i == 3) {
            return "PRODUCT_NOT_FOUND";
        }
        if (i == 4) {
            return "NO_ELIGIBLE_OFFER";
        }
        return "UNKNOWN_STATUS_CODE: " + i;
    }

    private final synchronized void queryProductDetailsAsyncEnsuringOneResponse(BillingClient billingClient, String str, Set set, ProductDetailsResponseListener productDetailsResponseListener) {
        billingClient.queryProductDetailsAsync(BillingClientParamBuildersKt.buildQueryProductDetailsParams(str, set), new d(new AtomicBoolean(false), this, set, str, this.useCaseParams.getDateProvider().getNow(), productDetailsResponseListener));
    }

    private static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$14(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, ProductDetailsResponseListener productDetailsResponseListener, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(billingResult, "billingResult");
        t.g(queryProductDetailsResult, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(set, str, billingResult, date);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, queryProductDetailsResult);
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 = new QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1(logIntent, billingResult);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str2, str3);
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(Set set, String str, BillingResult billingResult, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            t.f(debugMessage, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.trackGoogleQueryProductDetailsRequest-9VgGkz4(set, str, responseCode, debugMessage, DurationExtensionsKt.between(ab.b.b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    public void executeAsync() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        Iterable productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set Q0 = D.Q0(arrayList);
        if (!Q0.isEmpty()) {
            this.withConnectedClient.invoke(new 2(Q0));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        QueryProductDetailsUseCase$executeAsync$$inlined$log$1 queryProductDetailsUseCase$executeAsync$$inlined$log$1 = new QueryProductDetailsUseCase$executeAsync$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
        }
        this.onReceive.invoke(v.n());
    }

    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final l getOnError() {
        return this.onError;
    }

    public final l getOnReceive() {
        return this.onReceive;
    }

    public final l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(QueryProductDetailsResult queryProductDetailsResult) {
        LogHandler currentLogHandler;
        String str;
        Object invoke;
        LogHandler currentLogHandler2;
        String str2;
        Object invoke2;
        LogHandler currentLogHandler3;
        String str3;
        String str4;
        LogHandler currentLogHandler4;
        String str5;
        String str6;
        t.g(queryProductDetailsResult, "received");
        LogIntent logIntent = LogIntent.DEBUG;
        QueryProductDetailsUseCase$onOk$$inlined$log$1 queryProductDetailsUseCase$onOk$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$$inlined$log$1(logIntent, this);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str5 = "[Purchases] - " + logLevel.name();
                    str6 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(str5, str6);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel2.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler6.i("[Purchases] - " + logLevel3.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str5 = "[Purchases] - " + logLevel4.name();
                    str6 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(str5, str6);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler7.i("[Purchases] - " + logLevel5.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str5 = "[Purchases] - " + logLevel6.name();
                    str6 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(str5, str6);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str5 = "[Purchases] - " + logLevel7.name();
                    str6 = (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(str5, str6);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
        }
        LogIntent logIntent2 = LogIntent.PURCHASE;
        QueryProductDetailsUseCase$onOk$$inlined$log$2 queryProductDetailsUseCase$onOk$$inlined$log$2 = new QueryProductDetailsUseCase$onOk$$inlined$log$2(logIntent2, queryProductDetailsResult);
        switch (iArr[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.d("[Purchases] - " + logLevel11.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.d("[Purchases] - " + logLevel14.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.i("[Purchases] - " + logLevel15.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d("[Purchases] - " + logLevel16.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.d("[Purchases] - " + logLevel17.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w("[Purchases] - " + logLevel18.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler19.w("[Purchases] - " + logLevel19.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler20.w("[Purchases] - " + logLevel20.name(), (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
        }
        List unfetchedProductList = queryProductDetailsResult.getUnfetchedProductList();
        t.f(unfetchedProductList, "it");
        if (unfetchedProductList.isEmpty()) {
            unfetchedProductList = null;
        }
        if (unfetchedProductList != null) {
            LogIntent logIntent3 = LogIntent.INFO;
            QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1(logIntent3, queryProductDetailsResult);
            switch (iArr[logIntent3.ordinal()]) {
                case 1:
                    LogLevel logLevel21 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        str3 = "[Purchases] - " + logLevel21.name();
                        str4 = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(str3, str4);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel22 = LogLevel.WARN;
                    LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler21.w("[Purchases] - " + logLevel22.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel23 = LogLevel.INFO;
                    LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler22.i("[Purchases] - " + logLevel23.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel24 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        str3 = "[Purchases] - " + logLevel24.name();
                        str4 = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(str3, str4);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel25 = LogLevel.INFO;
                    LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler23.i("[Purchases] - " + logLevel25.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel26 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        str3 = "[Purchases] - " + logLevel26.name();
                        str4 = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(str3, str4);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel27 = LogLevel.DEBUG;
                    currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        str3 = "[Purchases] - " + logLevel27.name();
                        str4 = (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(str3, str4);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel28 = LogLevel.WARN;
                    LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler24.w("[Purchases] - " + logLevel28.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel29 = LogLevel.WARN;
                    LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler25.w("[Purchases] - " + logLevel29.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel30 = LogLevel.WARN;
                    LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel30.name(), (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
            }
            I i = I.a;
        }
        Iterable<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
        if (productDetailsList.isEmpty()) {
            productDetailsList = null;
        }
        if (productDetailsList != null) {
            for (ProductDetails productDetails : productDetailsList) {
                LogIntent logIntent4 = LogIntent.PURCHASE;
                QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1(logIntent4, productDetails);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                    case 1:
                        LogLevel logLevel31 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                            str2 = "[Purchases] - " + logLevel31.name();
                            invoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel32 = LogLevel.WARN;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                            currentLogHandler27.w("[Purchases] - " + logLevel32.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 4:
                        LogLevel logLevel33 = LogLevel.INFO;
                        LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                            currentLogHandler28.i("[Purchases] - " + logLevel33.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 5:
                        LogLevel logLevel34 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                            str2 = "[Purchases] - " + logLevel34.name();
                            invoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel35 = LogLevel.INFO;
                        LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                            currentLogHandler29.i("[Purchases] - " + logLevel35.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 8:
                        LogLevel logLevel36 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                            str2 = "[Purchases] - " + logLevel36.name();
                            invoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                    case 9:
                        LogLevel logLevel37 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                            str2 = "[Purchases] - " + logLevel37.name();
                            invoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                    case 10:
                        LogLevel logLevel38 = LogLevel.WARN;
                        LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                            currentLogHandler30.w("[Purchases] - " + logLevel38.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 11:
                        LogLevel logLevel39 = LogLevel.WARN;
                        LogHandler currentLogHandler31 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                            currentLogHandler31.w("[Purchases] - " + logLevel39.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        LogLevel logLevel40 = LogLevel.WARN;
                        LogHandler currentLogHandler32 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                            currentLogHandler32.w("[Purchases] - " + logLevel40.name(), (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                }
                currentLogHandler2.d(str2, (String) invoke2);
            }
            I i2 = I.a;
        }
        Iterable<UnfetchedProduct> unfetchedProductList2 = queryProductDetailsResult.getUnfetchedProductList();
        if (unfetchedProductList2.isEmpty()) {
            unfetchedProductList2 = null;
        }
        if (unfetchedProductList2 != null) {
            for (UnfetchedProduct unfetchedProduct : unfetchedProductList2) {
                LogIntent logIntent5 = LogIntent.INFO;
                QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 = new QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(logIntent5, unfetchedProduct, this);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                    case 1:
                        LogLevel logLevel41 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                            str = "[Purchases] - " + logLevel41.name();
                            invoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        LogLevel logLevel42 = LogLevel.WARN;
                        LogHandler currentLogHandler33 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                            currentLogHandler33.w("[Purchases] - " + logLevel42.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 4:
                        LogLevel logLevel43 = LogLevel.INFO;
                        LogHandler currentLogHandler34 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                            currentLogHandler34.i("[Purchases] - " + logLevel43.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 5:
                        LogLevel logLevel44 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                            str = "[Purchases] - " + logLevel44.name();
                            invoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        LogLevel logLevel45 = LogLevel.INFO;
                        LogHandler currentLogHandler35 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                            currentLogHandler35.i("[Purchases] - " + logLevel45.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 8:
                        LogLevel logLevel46 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                            str = "[Purchases] - " + logLevel46.name();
                            invoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                    case 9:
                        LogLevel logLevel47 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                            str = "[Purchases] - " + logLevel47.name();
                            invoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                    case 10:
                        LogLevel logLevel48 = LogLevel.WARN;
                        LogHandler currentLogHandler36 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                            currentLogHandler36.w("[Purchases] - " + logLevel48.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 11:
                        LogLevel logLevel49 = LogLevel.WARN;
                        LogHandler currentLogHandler37 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                            currentLogHandler37.w("[Purchases] - " + logLevel49.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        LogLevel logLevel50 = LogLevel.WARN;
                        LogHandler currentLogHandler38 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                            currentLogHandler38.w("[Purchases] - " + logLevel50.name(), (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                }
                currentLogHandler.d(str, (String) invoke);
            }
            I i3 = I.a;
        }
        List productDetailsList2 = queryProductDetailsResult.getProductDetailsList();
        t.f(productDetailsList2, "received.productDetailsList");
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(productDetailsList2));
    }
}
