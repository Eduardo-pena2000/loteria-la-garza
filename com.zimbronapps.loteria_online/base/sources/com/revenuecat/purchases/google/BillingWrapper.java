package com.revenuecat.purchases.google;

import Ca.I;
import Ca.o;
import Ca.x;
import Da.A;
import Da.D;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import Ya.r;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import cb.B0;
import cb.O;
import cb.P;
import cb.Q;
import cb.W0;
import cb.e0;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.NoCoreLibraryDesugaringException;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.history.PurchaseHistoryManager;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingWrapper extends BillingAbstract implements PurchasesUpdatedListener, BillingClientStateListener {
    private static final Companion Companion = new Companion(null);
    private static final int MAX_PENDING_REQUEST_COUNT_REPORTED = 100;
    private volatile BillingClient billingClient;
    private final ClientFactory clientFactory;
    private final O coroutineScope;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean isAIDLEnabled;
    private final Handler mainHandler;
    private final Map purchaseContext;
    private final PurchaseHistoryManager purchaseHistoryManager;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue serviceRequests;

    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z) {
            t.g(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z;
        }

        public final BillingClient buildClient(PurchasesUpdatedListener purchasesUpdatedListener) {
            t.g(purchasesUpdatedListener, "listener");
            PendingPurchasesParams.Builder enableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
            if (this.pendingTransactionsForPrepaidPlansEnabled) {
                enableOneTimeProducts.enablePrepaidPlans();
            }
            PendingPurchasesParams build = enableOneTimeProducts.build();
            t.f(build, "newBuilder()\n           …\n                .build()");
            BillingClient build2 = BillingClient.newBuilder(this.context).enablePendingPurchases(build).setListener(purchasesUpdatedListener).build();
            t.f(build2, "newBuilder(context).enab…\n                .build()");
            return build2;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        public final void invoke(BillingConfig billingConfig) {
            t.g(billingConfig, "billingConfig");
            l lVar = this.$onSuccess;
            String countryCode = billingConfig.getCountryCode();
            t.f(countryCode, "billingConfig.countryCode");
            lVar.invoke(countryCode);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingConfig) obj);
            return I.a;
        }
    }

    public /* synthetic */ class 3 extends q implements l {
        public 3(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l) obj);
            return I.a;
        }

        public final void invoke(l lVar) {
            t.g(lVar, "p0");
            BillingWrapper.access$withConnectedClient((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, lVar);
        }
    }

    public /* synthetic */ class 4 extends q implements p {
        public 4(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (l) obj2);
            return I.a;
        }

        public final void invoke(Long l, l lVar) {
            t.g(lVar, "p1");
            BillingWrapper.access$executeRequestOnUIThread((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, l, lVar);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ BillingFlowParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Activity activity, BillingFlowParams billingFlowParams) {
            super(1);
            this.$activity = activity;
            this.$params = billingFlowParams;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(billingClient, "$this$withConnectedClient");
            BillingResult launchBillingFlow = billingClient.launchBillingFlow(this.$activity, this.$params);
            if (launchBillingFlow.getResponseCode() == 0) {
                launchBillingFlow = null;
            }
            if (launchBillingFlow != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1 billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1 = new BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1(logIntent, launchBillingFlow);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        return;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        return;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        return;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        return;
                    default:
                        return;
                }
                currentLogHandler.d(str, str2);
            }
        }
    }

    public static final class 4 extends u implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GooglePurchasingData $googlePurchasingData;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, GooglePurchasingData googlePurchasingData, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$googlePurchasingData = googlePurchasingData;
            this.$activity = activity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            StoreTransaction oldPurchase;
            List productIds;
            Result.Success access$buildPurchaseParams = BillingWrapper.access$buildPurchaseParams(BillingWrapper.this, (GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (!(access$buildPurchaseParams instanceof Result.Success)) {
                if (!(access$buildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) access$buildPurchaseParams).getValue());
                return;
            }
            BillingWrapper billingWrapper = BillingWrapper.this;
            GooglePurchasingData googlePurchasingData = this.$googlePurchasingData;
            ReplaceProductInfo replaceProductInfo = this.$replaceProductInfo;
            BillingWrapper.access$trackPurchaseStartIfNeeded(billingWrapper, googlePurchasingData, (replaceProductInfo == null || (oldPurchase = replaceProductInfo.getOldPurchase()) == null || (productIds = oldPurchase.getProductIds()) == null) ? null : (String) D.h0(productIds));
            BillingWrapper.access$launchBillingFlow(BillingWrapper.this, this.$activity, (BillingFlowParams) access$buildPurchaseParams.getValue());
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onReceivePurchaseHistory;
        final /* synthetic */ l $onReceivePurchaseHistoryError;

        public static final class 1 extends u implements l {
            final /* synthetic */ l $onReceivePurchaseHistory;
            final /* synthetic */ List $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(l lVar, List list) {
                super(1);
                this.$onReceivePurchaseHistory = lVar;
                this.$subsPurchasesList = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return I.a;
            }

            public final void invoke(List list) {
                t.g(list, "inAppPurchasesList");
                this.$onReceivePurchaseHistory.invoke(D.v0(this.$subsPurchasesList, list));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, l lVar2) {
            super(1);
            this.$onReceivePurchaseHistoryError = lVar;
            this.$onReceivePurchaseHistory = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "subsPurchasesList");
            BillingWrapper.queryPurchaseHistoryAsync$default(BillingWrapper.this, "inapp", new 1(this.$onReceivePurchaseHistory, list), this.$onReceivePurchaseHistoryError, false, 8, null);
        }
    }

    @Ia.f(c = "com.revenuecat.purchases.google.BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1", f = "BillingWrapper.kt", l = {399, 414, 421, 421, 425}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ l $onReceivePurchaseHistory;
        final /* synthetic */ l $onReceivePurchaseHistoryError;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, l lVar2, Ga.e eVar) {
            super(2, eVar);
            this.$onReceivePurchaseHistory = lVar;
            this.$onReceivePurchaseHistoryError = lVar2;
        }

        public static /* synthetic */ void a(l lVar, List list) {
            invokeSuspend$lambda$1(lVar, list);
        }

        public static /* synthetic */ void i(BillingWrapper billingWrapper, l lVar, l lVar2) {
            invokeSuspend$lambda$0(billingWrapper, lVar, lVar2);
        }

        private static final void invokeSuspend$lambda$0(BillingWrapper billingWrapper, l lVar, l lVar2) {
            billingWrapper.queryPurchaseHistoryAsync("inapp", lVar, lVar2, false);
        }

        private static final void invokeSuspend$lambda$1(l lVar, List list) {
            lVar.invoke(list);
        }

        private static final void invokeSuspend$lambda$3(BillingWrapper billingWrapper, l lVar, l lVar2) {
            billingWrapper.queryPurchaseHistoryAsync("inapp", lVar, lVar2, false);
        }

        public static /* synthetic */ void k(BillingWrapper billingWrapper, l lVar, l lVar2) {
            invokeSuspend$lambda$3(billingWrapper, lVar, lVar2);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return BillingWrapper.this.new 1(this.$onReceivePurchaseHistory, this.$onReceivePurchaseHistoryError, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.BillingWrapper.queryInAppPurchaseHistoryWithAIDL.1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class 2 extends q implements l {
        public 2(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l) obj);
            return I.a;
        }

        public final void invoke(l lVar) {
            t.g(lVar, "p0");
            BillingWrapper.access$withConnectedClient((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, lVar);
        }
    }

    public /* synthetic */ class 3 extends q implements p {
        public 3(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (l) obj2);
            return I.a;
        }

        public final void invoke(Long l, l lVar) {
            t.g(lVar, "p1");
            BillingWrapper.access$executeRequestOnUIThread((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, l, lVar);
        }
    }

    public /* synthetic */ class 3 extends q implements l {
        public 3(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l) obj);
            return I.a;
        }

        public final void invoke(l lVar) {
            t.g(lVar, "p0");
            BillingWrapper.access$withConnectedClient((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, lVar);
        }
    }

    public /* synthetic */ class 4 extends q implements p {
        public 4(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (l) obj2);
            return I.a;
        }

        public final void invoke(Long l, l lVar) {
            t.g(lVar, "p1");
            BillingWrapper.access$executeRequestOnUIThread((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, l, lVar);
        }
    }

    public /* synthetic */ class 2 extends q implements l {
        public 2(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l) obj);
            return I.a;
        }

        public final void invoke(l lVar) {
            t.g(lVar, "p0");
            BillingWrapper.access$withConnectedClient((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, lVar);
        }
    }

    public /* synthetic */ class 3 extends q implements p {
        public 3(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (l) obj2);
            return I.a;
        }

        public final void invoke(Long l, l lVar) {
            t.g(lVar, "p1");
            BillingWrapper.access$executeRequestOnUIThread((BillingWrapper) ((kotlin.jvm.internal.f) this).receiver, l, lVar);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ InAppMessageParams $inAppMessageParams;
        final /* synthetic */ Qa.a $subscriptionStatusChange;
        final /* synthetic */ WeakReference $weakActivity;

        public static final class 2 extends u implements l {
            final /* synthetic */ InAppMessageParams $inAppMessageParams;
            final /* synthetic */ Qa.a $subscriptionStatusChange;
            final /* synthetic */ WeakReference $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(WeakReference weakReference, InAppMessageParams inAppMessageParams, Qa.a aVar) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = inAppMessageParams;
                this.$subscriptionStatusChange = aVar;
            }

            public static /* synthetic */ void a(Qa.a aVar, InAppMessageResult inAppMessageResult) {
                invoke$lambda$7(aVar, inAppMessageResult);
            }

            private static final void invoke$lambda$7(Qa.a aVar, InAppMessageResult inAppMessageResult) {
                t.g(inAppMessageResult, "inAppMessageResult");
                int responseCode = inAppMessageResult.getResponseCode();
                if (responseCode == 0) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "No Google Play in-app message was available.");
                        return;
                    }
                    return;
                }
                if (responseCode != 1) {
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    String format = String.format("Unexpected billing code: %s", Arrays.copyOf(new Object[]{Integer.valueOf(responseCode)}, 1));
                    t.f(format, "format(...)");
                    currentLogHandler2.e("[Purchases] - ERROR", format, null);
                    return;
                }
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.d("[Purchases] - " + logLevel2.name(), "Subscription status was updated from in-app message.");
                }
                aVar.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BillingClient) obj);
                return I.a;
            }

            public final void invoke(BillingClient billingClient) {
                t.g(billingClient, "$this$withConnectedClient");
                Activity activity = (Activity) this.$weakActivity.get();
                if (activity == null) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), "Activity is null, not showing Google Play in-app message.");
                        return;
                    }
                    return;
                }
                if (activity.isFinishing()) {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Activity is finishing, not showing Google Play in-app message.");
                        return;
                    }
                    return;
                }
                if (!activity.isDestroyed()) {
                    billingClient.showInAppMessages(activity, this.$inAppMessageParams, new j(this.$subscriptionStatusChange));
                    return;
                }
                LogLevel logLevel3 = LogLevel.DEBUG;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Activity is destroyed, not showing Google Play in-app message.");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(WeakReference weakReference, InAppMessageParams inAppMessageParams, Qa.a aVar) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = inAppMessageParams;
            this.$subscriptionStatusChange = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingWrapper.access$withConnectedClient(BillingWrapper.this, new 2(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
                return;
            }
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error connecting to billing client to display in-app messages: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
        }
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, PurchaseHistoryManager purchaseHistoryManager, DateProvider dateProvider, O o, boolean z, int i, k kVar) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, purchaseHistoryManager, (i & 64) != 0 ? new DefaultDateProvider() : dateProvider, (i & 128) != 0 ? P.a(W0.b((B0) null, 1, (Object) null).plus(e0.b())) : o, (i & 256) != 0 ? true : z);
    }

    public static /* synthetic */ void a(BillingWrapper billingWrapper) {
        startConnectionOnMainThread$lambda$4(billingWrapper);
    }

    public static final /* synthetic */ Result access$buildPurchaseParams(BillingWrapper billingWrapper, GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        return billingWrapper.buildPurchaseParams(googlePurchasingData, replaceProductInfo, str, bool);
    }

    public static final /* synthetic */ void access$executeRequestOnUIThread(BillingWrapper billingWrapper, Long l, l lVar) {
        billingWrapper.executeRequestOnUIThread(l, lVar);
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(BillingWrapper billingWrapper) {
        return billingWrapper.deviceCache;
    }

    public static final /* synthetic */ Handler access$getMainHandler$p(BillingWrapper billingWrapper) {
        return billingWrapper.mainHandler;
    }

    public static final /* synthetic */ PurchaseHistoryManager access$getPurchaseHistoryManager$p(BillingWrapper billingWrapper) {
        return billingWrapper.purchaseHistoryManager;
    }

    public static final /* synthetic */ long access$getReconnectMilliseconds$p(BillingWrapper billingWrapper) {
        return billingWrapper.reconnectMilliseconds;
    }

    public static final /* synthetic */ String access$getStackTrace(BillingWrapper billingWrapper) {
        return billingWrapper.getStackTrace();
    }

    public static final /* synthetic */ void access$launchBillingFlow(BillingWrapper billingWrapper, Activity activity, BillingFlowParams billingFlowParams) {
        billingWrapper.launchBillingFlow(activity, billingFlowParams);
    }

    public static final /* synthetic */ void access$queryPurchaseType(BillingWrapper billingWrapper, String str, String str2, l lVar, l lVar2) {
        billingWrapper.queryPurchaseType(str, str2, lVar, lVar2);
    }

    public static final /* synthetic */ void access$trackPurchaseStartIfNeeded(BillingWrapper billingWrapper, GooglePurchasingData googlePurchasingData, String str) {
        billingWrapper.trackPurchaseStartIfNeeded(googlePurchasingData, str);
    }

    public static final /* synthetic */ void access$withConnectedClient(BillingWrapper billingWrapper, l lVar) {
        billingWrapper.withConnectedClient(lVar);
    }

    public static /* synthetic */ void b(BillingWrapper billingWrapper) {
        endConnection$lambda$13(billingWrapper);
    }

    private final Result buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
        newBuilder.setProductDetails(inAppProduct.getProductDetails());
        BillingFlowParams.ProductDetailsParams build = newBuilder.build();
        t.f(build, "newBuilder().apply {\n   …etails)\n        }.build()");
        try {
            BillingFlowParams.Builder obfuscatedAccountId = BillingFlowParams.newBuilder().setProductDetailsParamsList(Da.u.e(build)).setObfuscatedAccountId(UtilsKt.sha256(str));
            if (bool != null) {
                obfuscatedAccountId.setIsOfferPersonalized(bool.booleanValue());
            }
            BillingFlowParams build2 = obfuscatedAccountId.build();
            t.f(build2, "newBuilder()\n           …                 .build()");
            return new Result.Success(build2);
        } catch (NoClassDefFoundError e) {
            throw new NoCoreLibraryDesugaringException(e);
        }
    }

    private final Result buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new o();
    }

    private final List buildSubscriptionProductDetailsParams(GooglePurchasingData.Subscription subscription) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(buildSubscriptionProductDetailsParams$buildProductDetailParams(subscription));
        List addOnProducts = subscription.getAddOnProducts();
        if (addOnProducts != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : addOnProducts) {
                if (obj instanceof GooglePurchasingData.Subscription) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(w.y(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(buildSubscriptionProductDetailsParams$buildProductDetailParams((GooglePurchasingData.Subscription) it.next()));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    private static final BillingFlowParams.ProductDetailsParams buildSubscriptionProductDetailsParams$buildProductDetailParams(GooglePurchasingData.Subscription subscription) {
        BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
        newBuilder.setOfferToken(subscription.getToken());
        newBuilder.setProductDetails(subscription.getProductDetails());
        BillingFlowParams.ProductDetailsParams build = newBuilder.build();
        t.f(build, "newBuilder().apply {\n   …ls)\n            }.build()");
        return build;
    }

    private final Result buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        try {
            BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(buildSubscriptionProductDetailsParams(subscription));
            if (replaceProductInfo != null) {
                t.f(productDetailsParamsList, "buildSubscriptionPurchas…arams$lambda$61$lambda$59");
                BillingFlowParamsExtensionsKt.setUpgradeInfo(productDetailsParamsList, replaceProductInfo);
                I i = I.a;
            } else {
                t.f(productDetailsParamsList.setObfuscatedAccountId(UtilsKt.sha256(str)), "setObfuscatedAccountId(appUserID.sha256())");
            }
            if (bool != null) {
                productDetailsParamsList.setIsOfferPersonalized(bool.booleanValue());
            }
            BillingFlowParams build = productDetailsParamsList.build();
            t.f(build, "newBuilder()\n           …                 .build()");
            return new Result.Success(build);
        } catch (NoClassDefFoundError e) {
            throw new NoCoreLibraryDesugaringException(e);
        }
    }

    public static /* synthetic */ void c(BillingResult billingResult, BillingWrapper billingWrapper) {
        onBillingSetupFinished$lambda$39(billingResult, billingWrapper);
    }

    public static /* synthetic */ void d(l lVar) {
        executePendingRequests$lambda$3$lambda$2$lambda$0(lVar);
    }

    public static /* synthetic */ void e(l lVar, PurchasesError purchasesError) {
        sendErrorsToAllPendingRequests$lambda$66$lambda$65(lVar, purchasesError);
    }

    private static final void endConnection$lambda$13(BillingWrapper billingWrapper) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        synchronized (billingWrapper) {
            try {
                BillingClient billingClient = billingWrapper.billingClient;
                if (billingClient != null) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1 billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1 = new BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1(logIntent, billingClient);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str = "[Purchases] - " + logLevel.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str = "[Purchases] - " + logLevel4.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str = "[Purchases] - " + logLevel6.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str = "[Purchases] - " + logLevel7.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                                break;
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                    }
                    billingClient.endConnection();
                }
                billingWrapper.billingClient = null;
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void executePendingRequests() {
        Ca.q qVar;
        synchronized (this) {
            while (true) {
                try {
                    BillingClient billingClient = this.billingClient;
                    if (billingClient == null || !billingClient.isReady() || (qVar = (Ca.q) this.serviceRequests.poll()) == null) {
                        break;
                    }
                    t.f(qVar, "poll()");
                    l lVar = (l) qVar.a();
                    Long l = (Long) qVar.b();
                    if (l != null) {
                        this.mainHandler.postDelayed(new b(lVar), l.longValue());
                    } else {
                        this.mainHandler.post(new c(lVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            I i = I.a;
        }
    }

    private static final void executePendingRequests$lambda$3$lambda$2$lambda$0(l lVar) {
        lVar.invoke((Object) null);
    }

    private static final void executePendingRequests$lambda$3$lambda$2$lambda$1(l lVar) {
        lVar.invoke((Object) null);
    }

    private final synchronized void executeRequestOnUIThread(Long l, l lVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(x.a(lVar, l));
                BillingClient billingClient = this.billingClient;
                if (billingClient == null || billingClient.isReady()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            } else {
                lVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        billingWrapper.executeRequestOnUIThread(l, lVar);
    }

    public static /* synthetic */ void f(l lVar) {
        executePendingRequests$lambda$3$lambda$2$lambda$1(lVar);
    }

    public static /* synthetic */ void getPurchaseContext$purchases_defaultsBc8Release$annotations() {
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        t.f(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    private final void getStoreTransaction(Purchase purchase, l lVar) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$getStoreTransaction$$inlined$log$1 billingWrapper$getStoreTransaction$$inlined$log$1 = new BillingWrapper$getStoreTransaction$$inlined$log$1(logIntent, purchase);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
        }
        synchronized (this) {
            PurchaseContext purchaseContext = (PurchaseContext) this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                lVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String purchaseToken = purchase.getPurchaseToken();
            t.f(purchaseToken, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsBc8Release(purchaseToken, new BillingWrapper$getStoreTransaction$2$2(lVar, purchase));
            I i = I.a;
        }
    }

    private final void launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (activity.getIntent() == null) {
            LogIntent logIntent = LogIntent.WARNING;
            BillingWrapper$launchBillingFlow$$inlined$log$1 billingWrapper$launchBillingFlow$$inlined$log$1 = new BillingWrapper$launchBillingFlow$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        withConnectedClient(new 2(activity, billingFlowParams));
    }

    private static final void onBillingSetupFinished$lambda$39(BillingResult billingResult, BillingWrapper billingWrapper) {
        PurchasesError billingResponseToPurchasesError;
        LogHandler currentLogHandler;
        String str;
        String str2;
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 6) {
            if (responseCode != 7 && responseCode != 8) {
                if (responseCode != 12) {
                    switch (responseCode) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
                            if (t.c(billingResult.getDebugMessage(), "Google Play In-app Billing API version is less than 3")) {
                                String format = String.format("Billing is not available in this device. Make sure there's an account configured in Play Store. Reopen the Play Store or clean its caches if this keeps happening. Original error message: %s", Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                t.f(format, "format(...)");
                                billingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, format);
                                LogUtilsKt.errorLog(billingResponseToPurchasesError);
                            } else {
                                String format2 = String.format("Billing is not available in this device. %s", Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                t.f(format2, "format(...)");
                                billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.getResponseCode(), format2);
                                LogUtilsKt.errorLog(billingResponseToPurchasesError);
                            }
                            billingWrapper.sendErrorsToAllPendingRequests(billingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1(logIntent, billingWrapper);
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                                case 1:
                                    LogLevel logLevel = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                        str = "[Purchases] - " + logLevel.name();
                                        str2 = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel2 = LogLevel.WARN;
                                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel3 = LogLevel.INFO;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel4 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                        str = "[Purchases] - " + logLevel4.name();
                                        str2 = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                        break;
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel5 = LogLevel.INFO;
                                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel6 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                        str = "[Purchases] - " + logLevel6.name();
                                        str2 = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                        break;
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel7 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                        str = "[Purchases] - " + logLevel7.name();
                                        str2 = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                        break;
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel8 = LogLevel.WARN;
                                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel9 = LogLevel.WARN;
                                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 13:
                                    LogLevel logLevel10 = LogLevel.WARN;
                                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                        break;
                                    }
                                    break;
                                case 14:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                            }
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                                I i = I.a;
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000L;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3(logIntent2, billingResult);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
            }
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2(logIntent3, billingResult);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
            case 1:
                LogLevel logLevel21 = LogLevel.DEBUG;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel22 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel25 = LogLevel.INFO;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel26 = LogLevel.DEBUG;
                LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                    currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel27 = LogLevel.DEBUG;
                LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                    currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel28 = LogLevel.WARN;
                LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                    currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel29 = LogLevel.WARN;
                LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                    currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel30 = LogLevel.WARN;
                LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                    currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
        }
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    private final void queryInAppPurchaseHistoryWithAIDL(l lVar, l lVar2) {
        cb.i.d(this.coroutineScope, (Ga.i) null, (Q) null, new 1(lVar, lVar2, null), 3, (Object) null);
    }

    public static /* synthetic */ void queryPurchaseHistoryAsync$default(BillingWrapper billingWrapper, String str, l lVar, l lVar2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = billingWrapper.isAIDLEnabled && t.c(str, "inapp");
        }
        billingWrapper.queryPurchaseHistoryAsync(str, lVar, lVar2, z);
    }

    private final void queryPurchaseType(String str, String str2, l lVar, l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new 1(lVar2, str2), new 2(lVar), new 3(this), new 4(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (!this.reconnectionAlreadyScheduled) {
            LogIntent logIntent = LogIntent.WARNING;
            BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2 billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2 = new BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2(logIntent, this);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                    break;
            }
            this.reconnectionAlreadyScheduled = true;
            startConnectionOnMainThread(this.reconnectMilliseconds);
            this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * 2, 900000L);
            return;
        }
        LogIntent logIntent2 = LogIntent.WARNING;
        BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1 billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1 = new BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str = "[Purchases] - " + logLevel11.name();
                    str2 = (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str = "[Purchases] - " + logLevel14.name();
                    str2 = (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str = "[Purchases] - " + logLevel16.name();
                    str2 = (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str = "[Purchases] - " + logLevel17.name();
                    str2 = (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str, str2);
    }

    private final synchronized void sendErrorsToAllPendingRequests(PurchasesError purchasesError) {
        while (true) {
            Ca.q qVar = (Ca.q) this.serviceRequests.poll();
            if (qVar != null) {
                this.mainHandler.post(new e((l) qVar.a(), purchasesError));
            }
        }
    }

    private static final void sendErrorsToAllPendingRequests$lambda$66$lambda$65(l lVar, PurchasesError purchasesError) {
        lVar.invoke(purchasesError);
    }

    private static final void startConnectionOnMainThread$lambda$4(BillingWrapper billingWrapper) {
        billingWrapper.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        BillingClient billingClient = this.billingClient;
        BillingResult isFeatureSupported = billingClient != null ? billingClient.isFeatureSupported("fff") : null;
        if (isFeatureSupported == null || isFeatureSupported.getResponseCode() != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int responseCode = isFeatureSupported.getResponseCode();
        String debugMessage = isFeatureSupported.getDebugMessage();
        t.f(debugMessage, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(responseCode, debugMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void trackPurchaseStartIfNeeded(com.revenuecat.purchases.models.GooglePurchasingData r10, java.lang.String r11) {
        /*
            r9 = this;
            com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r0 = r9.diagnosticsTrackerIfEnabled
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r10 instanceof com.revenuecat.purchases.models.GooglePurchasingData.Subscription
            r1 = 0
            if (r0 == 0) goto Le
            r0 = r10
            com.revenuecat.purchases.models.GooglePurchasingData$Subscription r0 = (com.revenuecat.purchases.models.GooglePurchasingData.Subscription) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L50
            com.android.billingclient.api.ProductDetails r2 = r0.getProductDetails()
            if (r2 == 0) goto L50
            java.util.List r2 = r2.getSubscriptionOfferDetails()
            if (r2 == 0) goto L50
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails r3 = (com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails) r3
            java.lang.String r4 = r3.getOfferToken()
            java.lang.String r5 = r0.getToken()
            boolean r4 = kotlin.jvm.internal.t.c(r4, r5)
            if (r4 == 0) goto L21
            if (r3 == 0) goto L50
            com.android.billingclient.api.ProductDetails$PricingPhases r0 = r3.getPricingPhases()
            if (r0 == 0) goto L50
            java.util.List r0 = r0.getPricingPhaseList()
            goto L51
        L48:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "Collection contains no element matching the predicate."
            r10.<init>(r11)
            throw r10
        L50:
            r0 = r1
        L51:
            r2 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L7d
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L5f
        L5d:
            r6 = r5
            goto L78
        L5f:
            java.util.Iterator r6 = r0.iterator()
        L63:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r6.next()
            com.android.billingclient.api.ProductDetails$PricingPhase r7 = (com.android.billingclient.api.ProductDetails.PricingPhase) r7
            long r7 = r7.getPriceAmountMicros()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L63
            r6 = r4
        L78:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            if (r0 == 0) goto Laa
            java.util.List r0 = Da.D.b0(r0, r4)
            if (r0 == 0) goto Laa
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L8e
        L8c:
            r4 = r5
            goto La6
        L8e:
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            com.android.billingclient.api.ProductDetails$PricingPhase r1 = (com.android.billingclient.api.ProductDetails.PricingPhase) r1
            long r7 = r1.getPriceAmountMicros()
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 <= 0) goto L92
        La6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        Laa:
            com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r0 = r9.diagnosticsTrackerIfEnabled
            java.lang.String r10 = r10.getProductId()
            r0.trackGooglePurchaseStarted(r10, r11, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.BillingWrapper.trackPurchaseStartIfNeeded(com.revenuecat.purchases.models.GooglePurchasingData, java.lang.String):void");
    }

    private final void trackPurchaseUpdateReceivedIfNeeded(BillingResult billingResult, List list) {
        ArrayList arrayList;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker == null) {
            return;
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List products = ((Purchase) it.next()).getProducts();
                t.f(products, "it.products");
                A.D(arrayList, products);
            }
        } else {
            arrayList = null;
        }
        if (list != null) {
            arrayList2 = new ArrayList(w.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(PurchaseStateConversionsKt.toRevenueCatPurchaseState(((Purchase) it2.next()).getPurchaseState()).name());
            }
        }
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        t.f(debugMessage, "billingResult.debugMessage");
        diagnosticsTracker.trackGooglePurchaseUpdateReceived(arrayList, arrayList2, responseCode, debugMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void withConnectedClient(Qa.l r5) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.BillingWrapper.withConnectedClient(Qa.l):void");
    }

    public final void acknowledge$purchases_defaultsBc8Release(String str, PostReceiptInitiationSource postReceiptInitiationSource, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "token");
        t.g(postReceiptInitiationSource, "initiationSource");
        t.g(lVar, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$acknowledge$$inlined$log$1 billingWrapper$acknowledge$$inlined$log$1 = new BillingWrapper$acknowledge$$inlined$log$1(logIntent, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$acknowledge$2.INSTANCE, new BillingWrapper$acknowledge$3(this), new BillingWrapper$acknowledge$4(this)), 0L, 1, null);
    }

    public void consumeAndSave(boolean z, StoreTransaction storeTransaction, boolean z2, PostReceiptInitiationSource postReceiptInitiationSource) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(storeTransaction, "purchase");
        t.g(postReceiptInitiationSource, "initiationSource");
        if (storeTransaction.getType() == ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
        boolean isAcknowledged = originalGooglePurchase != null ? originalGooglePurchase.isAcknowledged() : false;
        boolean z3 = storeTransaction.getType() == ProductType.INAPP;
        BillingWrapper$consumeAndSave$addToken$1 billingWrapper$consumeAndSave$addToken$1 = new BillingWrapper$consumeAndSave$addToken$1(this, storeTransaction);
        if (!z3) {
            if (!z || isAcknowledged) {
                billingWrapper$consumeAndSave$addToken$1.invoke(storeTransaction.getPurchaseToken());
                return;
            } else {
                acknowledge$purchases_defaultsBc8Release(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, billingWrapper$consumeAndSave$addToken$1);
                return;
            }
        }
        if (z && z2) {
            consumePurchase$purchases_defaultsBc8Release(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, billingWrapper$consumeAndSave$addToken$1);
            return;
        }
        if (!z || isAcknowledged) {
            billingWrapper$consumeAndSave$addToken$1.invoke(storeTransaction.getPurchaseToken());
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$consumeAndSave$$inlined$log$1 billingWrapper$consumeAndSave$$inlined$log$1 = new BillingWrapper$consumeAndSave$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
        }
        acknowledge$purchases_defaultsBc8Release(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, billingWrapper$consumeAndSave$addToken$1);
    }

    public final void consumePurchase$purchases_defaultsBc8Release(String str, PostReceiptInitiationSource postReceiptInitiationSource, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "token");
        t.g(postReceiptInitiationSource, "initiationSource");
        t.g(lVar, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$consumePurchase$$inlined$log$1 billingWrapper$consumePurchase$$inlined$log$1 = new BillingWrapper$consumePurchase$$inlined$log$1(logIntent, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), lVar, BillingWrapper$consumePurchase$2.INSTANCE, new BillingWrapper$consumePurchase$3(this), new BillingWrapper$consumePurchase$4(this)), 0L, 1, null);
    }

    public void endConnection() {
        this.mainHandler.post(new d(this));
    }

    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str3;
        String str4;
        t.g(str, "appUserID");
        t.g(productType, "productType");
        t.g(str2, "productId");
        t.g(lVar, "onCompletion");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1 billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1 = new BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1(logIntent, str2, productType);
        I i = null;
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str3 = "[Purchases] - " + logLevel.name();
                    str4 = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str3 = "[Purchases] - " + logLevel4.name();
                    str4 = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str3 = "[Purchases] - " + logLevel6.name();
                    str4 = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str3 = "[Purchases] - " + logLevel7.name();
                    str4 = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
        }
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$2$1(lVar, str2, lVar2), lVar2, new BillingWrapper$findPurchaseInPurchaseHistory$2$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$2$3(this)), 0L, 1, null);
            i = I.a;
        }
        if (i == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "Type of product not recognized."));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized BillingClient getBillingClient() {
        return this.billingClient;
    }

    public final Map getPurchaseContext$purchases_defaultsBc8Release() {
        return this.purchaseContext;
    }

    public final void getPurchaseType$purchases_defaultsBc8Release(String str, l lVar) {
        t.g(str, "purchaseToken");
        t.g(lVar, "listener");
        queryPurchaseType("subs", str, lVar, new BillingWrapper$getPurchaseType$1(lVar, this, str));
    }

    public void getStorefront(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Billing client: Initiating getting country code.");
        }
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new 2(lVar), lVar2, new 3(this), new 4(this)), 0L, 1, null);
    }

    public boolean isConnected() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            return billingClient.isReady();
        }
        return false;
    }

    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        String optionId;
        ReplacementMode replacementMode;
        List addOnProducts;
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(activity, "activity");
        t.g(str, "appUserID");
        t.g(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format("Purchase for a %s purchase must be a %s.", Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            t.f(format, "format(...)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, format);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                I i = I.a;
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new o();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            BillingWrapper$makePurchaseAsync$$inlined$log$1 billingWrapper$makePurchaseAsync$$inlined$log$1 = new BillingWrapper$makePurchaseAsync$$inlined$log$1(logIntent, replaceProductInfo, googlePurchasingData);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
            }
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            BillingWrapper$makePurchaseAsync$$inlined$log$2 billingWrapper$makePurchaseAsync$$inlined$log$2 = new BillingWrapper$makePurchaseAsync$$inlined$log$2(logIntent2, googlePurchasingData);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
            }
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                replacementMode = null;
            }
            String productId = replacementMode == GoogleReplacementMode.DEFERRED ? (String) D.f0(replaceProductInfo.getOldPurchase().getProductIds()) : googlePurchasingData.getProductId();
            Map c = Da.Q.c();
            if (optionId != null) {
            }
            GooglePurchasingData.Subscription subscription = googlePurchasingData instanceof GooglePurchasingData.Subscription ? (GooglePurchasingData.Subscription) googlePurchasingData : null;
            if (subscription != null && (addOnProducts = subscription.getAddOnProducts()) != null) {
                ArrayList<GooglePurchasingData.Subscription> arrayList = new ArrayList();
                for (Object obj : addOnProducts) {
                    if (obj instanceof GooglePurchasingData.Subscription) {
                        arrayList.add(obj);
                    }
                }
                for (GooglePurchasingData.Subscription subscription2 : arrayList) {
                    c.put(subscription2.getProductId(), subscription2.getOptionId());
                }
                I i2 = I.a;
            }
            Map b = Da.Q.b(c);
            Map map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode2 = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            map.put(productId, new PurchaseContext(productType, presentedOfferingContext, optionId, replacementMode2 instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode2 : null, b));
            I i3 = I.a;
        }
        executeRequestOnUIThread$default(this, null, new 4(purchasingData, replaceProductInfo, str, bool, googlePurchasingData, activity), 1, null);
    }

    public void onBillingServiceDisconnected() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.WARNING;
        BillingWrapper$onBillingServiceDisconnected$$inlined$log$1 billingWrapper$onBillingServiceDisconnected$$inlined$log$1 = new BillingWrapper$onBillingServiceDisconnected$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGoogleBillingServiceDisconnected();
        }
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        t.g(billingResult, "billingResult");
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            t.f(debugMessage, "billingResult.debugMessage");
            diagnosticsTracker.trackGoogleBillingSetupFinished(responseCode, debugMessage, r.p(r.D(D.W(this.serviceRequests), 100)));
        }
        this.mainHandler.post(new a(billingResult, this));
    }

    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(billingResult, "billingResult");
        trackPurchaseUpdateReceivedIfNeeded(billingResult, list);
        List n = list == null ? v.n() : list;
        if (billingResult.getResponseCode() == 0 && !n.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = n.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, n, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingWrapper$onPurchasesUpdated$$inlined$log$1 billingWrapper$onPurchasesUpdated$$inlined$log$1 = new BillingWrapper$onPurchasesUpdated$$inlined$log$1(logIntent, billingResult, n);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
        }
        String str3 = "Error updating purchases. " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
        int responseCode = billingResult.getResponseCode();
        if (list == null && billingResult.getResponseCode() == 0) {
            str3 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            responseCode = 6;
        }
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(responseCode, str3);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(billingResponseToPurchasesError);
        }
    }

    public void queryAllPurchases(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onReceivePurchaseHistory");
        t.g(lVar2, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync$default(this, "subs", new 1(lVar2, lVar), lVar2, false, 8, null);
    }

    public void queryProductDetailsAsync(ProductType productType, Set set, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(productType, "productType");
        t.g(set, "productIds");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryProductDetailsAsync$$inlined$log$1 billingWrapper$queryProductDetailsAsync$$inlined$log$1 = new BillingWrapper$queryProductDetailsAsync$$inlined$log$1(logIntent, set);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, set, productType, getAppInBackground()), lVar, lVar2, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String str, l lVar, l lVar2, boolean z) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "productType");
        t.g(lVar, "onReceivePurchaseHistory");
        t.g(lVar2, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryPurchaseHistoryAsync$$inlined$log$1 billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1 = new BillingWrapper$queryPurchaseHistoryAsync$$inlined$log$1(logIntent, str);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
        }
        if (z) {
            queryInAppPurchaseHistoryWithAIDL(lVar, lVar2);
        } else {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, str, getAppInBackground()), lVar, lVar2, new 2(this), new 3(this)), 0L, 1, null);
        }
    }

    public void queryPurchases(String str, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryPurchases$$inlined$log$1 billingWrapper$queryPurchases$$inlined$log$1 = new BillingWrapper$queryPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), lVar, lVar2, new 2(this), new 3(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(BillingClient billingClient) {
        this.billingClient = billingClient;
    }

    public void showInAppMessagesIfNeeded(Activity activity, List list, Qa.a aVar) {
        t.g(activity, "activity");
        t.g(list, "inAppMessageTypes");
        t.g(aVar, "subscriptionStatusChange");
        if (list.isEmpty()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Tried to show in-app messages without specifying any types. Please add what types of in-app message you want to display.", null);
            return;
        }
        InAppMessageParams.Builder newBuilder = InAppMessageParams.newBuilder();
        t.f(newBuilder, "newBuilder()");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            newBuilder.addInAppMessageCategoryToShow(((InAppMessageType) it.next()).getInAppMessageCategoryId$purchases_defaultsBc8Release());
        }
        InAppMessageParams build = newBuilder.build();
        t.f(build, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread$default(this, null, new 2(new WeakReference(activity), build, aVar), 1, null);
    }

    public void startConnection() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                BillingClient billingClient = this.billingClient;
                if (billingClient != null) {
                    if (!billingClient.isReady()) {
                        LogIntent logIntent = LogIntent.DEBUG;
                        BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1 billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1 = new BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1(logIntent, billingClient);
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    str = "[Purchases] - " + logLevel.name();
                                    str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    str = "[Purchases] - " + logLevel4.name();
                                    str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    str = "[Purchases] - " + logLevel6.name();
                                    str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    str = "[Purchases] - " + logLevel7.name();
                                    str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                    currentLogHandler.d(str, str2);
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                                break;
                            case 13:
                                LogLevel logLevel10 = LogLevel.WARN;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                                    break;
                                }
                                break;
                            case 14:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                                break;
                        }
                        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                        if (diagnosticsTracker != null) {
                            diagnosticsTracker.trackGoogleBillingStartConnection();
                        }
                        try {
                            billingClient.startConnection(this);
                        } catch (IllegalStateException e) {
                            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                            BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2 billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2 = new BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2(logIntent2, e);
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                                case 1:
                                    LogLevel logLevel11 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel12 = LogLevel.WARN;
                                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel13 = LogLevel.INFO;
                                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel14 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel15 = LogLevel.INFO;
                                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel16 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel17 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel18 = LogLevel.WARN;
                                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel19 = LogLevel.WARN;
                                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 13:
                                    LogLevel logLevel20 = LogLevel.WARN;
                                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                        break;
                                    }
                                    break;
                                case 14:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                            }
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e.getMessage()));
                        } catch (SecurityException e2) {
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "There was a SecurityException when connecting to BillingClient. This has been reported to occur on some devices in unknown circumstances. See issuetracker: https://issuetracker.google.com/issues/457463701", e2);
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e2.getMessage()));
                        }
                    }
                    I i = I.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startConnectionOnMainThread(long j) {
        this.mainHandler.postDelayed(new f(this), j);
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
            super(1);
            this.$listener = lVar;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            LogUtilsKt.errorLog(purchasesError);
            this.$listener.invoke(ProductType.UNKNOWN);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, PurchaseHistoryManager purchaseHistoryManager, DateProvider dateProvider, O o, boolean z) {
        super(purchasesStateProvider);
        t.g(clientFactory, "clientFactory");
        t.g(handler, "mainHandler");
        t.g(deviceCache, "deviceCache");
        t.g(purchasesStateProvider, "purchasesStateProvider");
        t.g(purchaseHistoryManager, "purchaseHistoryManager");
        t.g(dateProvider, "dateProvider");
        t.g(o, "coroutineScope");
        this.clientFactory = clientFactory;
        this.mainHandler = handler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchaseHistoryManager = purchaseHistoryManager;
        this.dateProvider = dateProvider;
        this.coroutineScope = o;
        this.isAIDLEnabled = z;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue();
        this.reconnectMilliseconds = 1000L;
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ l $resultHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, String str) {
            super(1);
            this.$resultHandler = lVar;
            this.$purchaseToken = str;
        }

        public final void invoke(Map map) {
            t.g(map, "purchases");
            l lVar = this.$resultHandler;
            Collection collection = (Iterable) map.values();
            String str = this.$purchaseToken;
            boolean z = false;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (t.c(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z = true;
                        break;
                    }
                }
            }
            lVar.invoke(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }
    }
}
