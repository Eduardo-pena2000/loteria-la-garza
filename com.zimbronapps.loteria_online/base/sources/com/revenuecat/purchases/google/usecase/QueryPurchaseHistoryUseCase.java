package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryPurchasesParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchaseHistoryUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onReceive;
    private final QueryPurchaseHistoryUseCaseParams useCaseParams;
    private final l withConnectedClient;

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public static /* synthetic */ void a(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, BillingResult billingResult, List list) {
            invoke$lambda$7$lambda$6(atomicBoolean, queryPurchaseHistoryUseCase, date, billingResult, list);
        }

        private static final void invoke$lambda$7$lambda$6(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date, BillingResult billingResult, List list) {
            I i;
            LogHandler currentLogHandler;
            String str;
            Object invoke;
            LogHandler currentLogHandler2;
            String str2;
            String str3;
            t.g(billingResult, "billingResult");
            t.g(list, "activePurchases");
            if (atomicBoolean.getAndSet(true)) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1(logIntent, billingResult);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str2 = "[Purchases] - " + logLevel.name();
                            str3 = (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str2 = "[Purchases] - " + logLevel4.name();
                            str3 = (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str2 = "[Purchases] - " + logLevel6.name();
                            str3 = (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str2 = "[Purchases] - " + logLevel7.name();
                            str3 = (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    default:
                        return;
                }
                currentLogHandler2.d(str2, str3);
                return;
            }
            QueryPurchaseHistoryUseCase.access$trackGoogleQueryPurchaseHistoryRequestIfNeeded(queryPurchaseHistoryUseCase, QueryPurchaseHistoryUseCase.access$getUseCaseParams$p(queryPurchaseHistoryUseCase).getProductType(), billingResult, date);
            List<Purchase> list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                for (Purchase purchase : list2) {
                    LogIntent logIntent2 = LogIntent.RC_PURCHASE_SUCCESS;
                    QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1(logIntent2, purchase);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str = "[Purchases] - " + logLevel11.name();
                                invoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                                break;
                            }
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str = "[Purchases] - " + logLevel14.name();
                                invoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                                break;
                            }
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel15.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str = "[Purchases] - " + logLevel16.name();
                                invoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                                break;
                            }
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str = "[Purchases] - " + logLevel17.name();
                                invoke = queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke();
                                break;
                            }
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel19.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel20.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke());
                            } else {
                                continue;
                            }
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1.invoke(), null);
                            continue;
                    }
                    currentLogHandler.d(str, (String) invoke);
                }
                i = I.a;
            } else {
                i = null;
            }
            if (i == null) {
                LogIntent logIntent3 = LogIntent.DEBUG;
                QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2 queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2 = new QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2(logIntent3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel21 = LogLevel.DEBUG;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            currentLogHandler15.d("[Purchases] - " + logLevel21.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel22 = LogLevel.WARN;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            currentLogHandler16.w("[Purchases] - " + logLevel22.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler17.i("[Purchases] - " + logLevel23.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            currentLogHandler18.d("[Purchases] - " + logLevel24.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel25 = LogLevel.INFO;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            currentLogHandler19.i("[Purchases] - " + logLevel25.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel26 = LogLevel.DEBUG;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            currentLogHandler20.d("[Purchases] - " + logLevel26.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel27 = LogLevel.DEBUG;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            currentLogHandler21.d("[Purchases] - " + logLevel27.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel28 = LogLevel.WARN;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            currentLogHandler22.w("[Purchases] - " + logLevel28.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler23.w("[Purchases] - " + logLevel29.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel30 = LogLevel.WARN;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler24.w("[Purchases] - " + logLevel30.name(), (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) queryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                }
            }
            ArrayList arrayList = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase2 = (Purchase) it.next();
                t.f(purchase2, "it");
                arrayList.add(StoreTransactionConversionsKt.toStoreTransaction$default(purchase2, ProductTypeConversionsKt.toRevenueCatProductType(QueryPurchaseHistoryUseCase.access$getUseCaseParams$p(queryPurchaseHistoryUseCase).getProductType()), null, null, null, null, 30, null));
            }
            BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, billingResult, arrayList, null, null, 12, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            I i;
            t.g(billingClient, "$this$invoke");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Date now = QueryPurchaseHistoryUseCase.access$getUseCaseParams$p(QueryPurchaseHistoryUseCase.this).getDateProvider().getNow();
            QueryPurchasesParams buildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchaseHistoryUseCase.access$getUseCaseParams$p(QueryPurchaseHistoryUseCase.this).getProductType());
            if (buildQueryPurchasesParams != null) {
                billingClient.queryPurchasesAsync(buildQueryPurchasesParams, new f(atomicBoolean, QueryPurchaseHistoryUseCase.this, now));
                i = I.a;
            } else {
                i = null;
            }
            if (i == null) {
                QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase = QueryPurchaseHistoryUseCase.this;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String format = String.format("Invalid product type passed to %s.", Arrays.copyOf(new Object[]{"queryPurchaseHistory"}, 1));
                t.f(format, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", format, null);
                BillingResult build = BillingResult.newBuilder().setResponseCode(5).build();
                t.f(build, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchaseHistoryUseCase, build, null, null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(queryPurchaseHistoryUseCaseParams, lVar2, pVar);
        t.g(queryPurchaseHistoryUseCaseParams, "useCaseParams");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchaseHistoryUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static final /* synthetic */ QueryPurchaseHistoryUseCaseParams access$getUseCaseParams$p(QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase) {
        return queryPurchaseHistoryUseCase.useCaseParams;
    }

    public static final /* synthetic */ void access$trackGoogleQueryPurchaseHistoryRequestIfNeeded(QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, String str, BillingResult billingResult, Date date) {
        queryPurchaseHistoryUseCase.trackGoogleQueryPurchaseHistoryRequestIfNeeded(str, billingResult, date);
    }

    private final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String str, BillingResult billingResult, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            t.f(debugMessage, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y(str, responseCode, debugMessage, DurationExtensionsKt.between(ab.b.b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new 1());
    }

    public String getErrorMessage() {
        return "Error receiving purchase history";
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

    public void onOk(List list) {
        l lVar = this.onReceive;
        if (list == null) {
            list = v.n();
        }
        lVar.invoke(list);
    }
}
