package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.A;
import Da.Q;
import Da.S;
import Da.w;
import Qa.l;
import Qa.p;
import Wa.n;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final l withConnectedClient;

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public static /* synthetic */ void a(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, BillingResult billingResult, List list) {
            invoke$lambda$1$lambda$0(queryPurchasesByTypeUseCase, billingResult, list);
        }

        private static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, BillingResult billingResult, List list) {
            t.g(billingResult, "result");
            t.g(list, "purchases");
            BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase, billingResult, QueryPurchasesByTypeUseCase.access$toMapOfGooglePurchaseWrapper(queryPurchasesByTypeUseCase, list, QueryPurchasesByTypeUseCase.access$getUseCaseParams$p(queryPurchasesByTypeUseCase).getProductType()), null, null, 12, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            I i;
            t.g(billingClient, "$this$invoke");
            QueryPurchasesParams buildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.access$getUseCaseParams$p(QueryPurchasesByTypeUseCase.this).getProductType());
            if (buildQueryPurchasesParams != null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                QueryPurchasesByTypeUseCase.access$queryPurchasesAsyncWithTrackingEnsuringOneResponse(queryPurchasesByTypeUseCase, billingClient, QueryPurchasesByTypeUseCase.access$getUseCaseParams$p(queryPurchasesByTypeUseCase).getProductType(), buildQueryPurchasesParams, new h(queryPurchasesByTypeUseCase));
                i = I.a;
            } else {
                i = null;
            }
            if (i == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String format = String.format("Invalid product type passed to %s.", Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1));
                t.f(format, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", format, null);
                BillingResult build = BillingResult.newBuilder().setResponseCode(5).build();
                t.f(build, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, build, S.h(), null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(queryPurchasesByTypeUseCaseParams, lVar2, pVar);
        t.g(queryPurchasesByTypeUseCaseParams, "useCaseParams");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesByTypeUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, PurchasesResponseListener purchasesResponseListener, BillingResult billingResult, List list) {
        queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2(atomicBoolean, queryPurchasesByTypeUseCase, str, date, purchasesResponseListener, billingResult, list);
    }

    public static final /* synthetic */ QueryPurchasesByTypeUseCaseParams access$getUseCaseParams$p(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase) {
        return queryPurchasesByTypeUseCase.useCaseParams;
    }

    public static final /* synthetic */ void access$queryPurchasesAsyncWithTrackingEnsuringOneResponse(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, BillingClient billingClient, String str, QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(billingClient, str, queryPurchasesParams, purchasesResponseListener);
    }

    public static final /* synthetic */ Map access$toMapOfGooglePurchaseWrapper(QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, List list, String str) {
        return queryPurchasesByTypeUseCase.toMapOfGooglePurchaseWrapper(list, str);
    }

    private final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(BillingClient billingClient, String str, QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        billingClient.queryPurchasesAsync(queryPurchasesParams, new g(new AtomicBoolean(false), this, str, this.useCaseParams.getDateProvider().getNow(), purchasesResponseListener));
    }

    private static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2(AtomicBoolean atomicBoolean, QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase, String str, Date date, PurchasesResponseListener purchasesResponseListener, BillingResult billingResult, List list) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(billingResult, "billingResult");
        t.g(list, "purchases");
        if (!atomicBoolean.getAndSet(true)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List products = ((Purchase) it.next()).getProducts();
                t.f(products, "it.products");
                A.D(arrayList, products);
            }
            queryPurchasesByTypeUseCase.trackGoogleQueryPurchasesRequestIfNeeded(str, arrayList, billingResult, date);
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, list);
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        QueryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1 queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1 = new QueryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1(logIntent, billingResult);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchasesByTypeUseCase$queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str2, str3);
    }

    private final Map toMapOfGooglePurchaseWrapper(List list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            String purchaseToken = purchase.getPurchaseToken();
            t.f(purchaseToken, "purchase.purchaseToken");
            q a = x.a(UtilsKt.sha1(purchaseToken), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, null, 30, null));
            linkedHashMap.put(a.c(), a.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, List list, BillingResult billingResult, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            t.f(debugMessage, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.trackGoogleQueryPurchasesRequest-zkXUZaI(str, responseCode, debugMessage, DurationExtensionsKt.between(ab.b.b, date, this.useCaseParams.getDateProvider().getNow()), list);
        }
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new 1());
    }

    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final l getOnError() {
        return this.onError;
    }

    public final l getOnSuccess() {
        return this.onSuccess;
    }

    public final l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(Map map) {
        t.g(map, "received");
        this.onSuccess.invoke(map);
    }
}
