package com.revenuecat.purchases;

import Ca.I;
import Da.v;
import Qa.p;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    public static final class 2 extends u implements p {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;
        final /* synthetic */ List $results;
        final /* synthetic */ List $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, PostPendingTransactionsHelper postPendingTransactionsHelper, List list2, Qa.l lVar, Qa.l lVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (CustomerInfo) obj2);
            return I.a;
        }

        public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            t.g(storeTransaction, "<anonymous parameter 0>");
            t.g(customerInfo, "customerInfo");
            this.$results.add(new Result.Success(customerInfo));
            PostPendingTransactionsHelper.access$callCompletionFromResults(this.this$0, this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;
        final /* synthetic */ List $results;
        final /* synthetic */ List $transactionsToSync;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(List list, PostPendingTransactionsHelper postPendingTransactionsHelper, List list2, Qa.l lVar, Qa.l lVar2) {
            super(2);
            this.$results = list;
            this.this$0 = postPendingTransactionsHelper;
            this.$transactionsToSync = list2;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoreTransaction) obj, (PurchasesError) obj2);
            return I.a;
        }

        public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
            t.g(storeTransaction, "<anonymous parameter 0>");
            t.g(purchasesError, "purchasesError");
            this.$results.add(new Result.Error(purchasesError));
            PostPendingTransactionsHelper.access$callCompletionFromResults(this.this$0, this.$transactionsToSync, this.$results, this.$onError, this.$onSuccess);
        }
    }

    public PostPendingTransactionsHelper(AppConfig appConfig, DeviceCache deviceCache, BillingAbstract billingAbstract, Dispatcher dispatcher, IdentityManager identityManager, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostReceiptHelper postReceiptHelper) {
        t.g(appConfig, "appConfig");
        t.g(deviceCache, "deviceCache");
        t.g(billingAbstract, "billing");
        t.g(dispatcher, "dispatcher");
        t.g(identityManager, "identityManager");
        t.g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        t.g(postReceiptHelper, "postReceiptHelper");
        this.appConfig = appConfig;
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dispatcher = dispatcher;
        this.identityManager = identityManager;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static /* synthetic */ void a(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Qa.l lVar) {
        syncPendingPurchaseQueue$lambda$2(postPendingTransactionsHelper, str, z, lVar);
    }

    public static final /* synthetic */ void access$callCompletionFromResults(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, Qa.l lVar, Qa.l lVar2) {
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, lVar, lVar2);
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(PostPendingTransactionsHelper postPendingTransactionsHelper) {
        return postPendingTransactionsHelper.deviceCache;
    }

    public static final /* synthetic */ PostReceiptHelper access$getPostReceiptHelper$p(PostPendingTransactionsHelper postPendingTransactionsHelper) {
        return postPendingTransactionsHelper.postReceiptHelper;
    }

    public static final /* synthetic */ void access$postTransactionsWithCompletion(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, boolean z, String str, Qa.a aVar, Qa.l lVar, Qa.l lVar2) {
        postPendingTransactionsHelper.postTransactionsWithCompletion(list, z, str, aVar, lVar, lVar2);
    }

    private final void callCompletionFromResults(List list, List list2, Qa.l lVar, Qa.l lVar2) {
        if (list.size() == list2.size()) {
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.x();
                }
                Result.Success success = (Result) obj;
                if (success instanceof Result.Error) {
                    if (lVar != null) {
                        lVar.invoke(((Result.Error) success).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i == list2.size() - 1 && lVar2 != null) {
                        t.e(success, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        lVar2.invoke(success.getValue());
                    }
                    i = i2;
                }
            }
        }
    }

    public static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, lVar, lVar2);
    }

    private final void postTransactionsWithCompletion(List list, boolean z, String str, Qa.a aVar, Qa.l lVar, Qa.l lVar2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.postTransactionWithProductDetailsHelper.postTransactions(list, z, str, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, false, new 2(arrayList, this, list, lVar, lVar2), new 3(arrayList, this, list, lVar, lVar2));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1 = new PostPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$postTransactionsWithCompletion$$inlined$log$1.invoke(), null);
                break;
        }
        aVar.invoke();
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z, Qa.l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z, lVar);
    }

    private static final void syncPendingPurchaseQueue$lambda$2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Qa.l lVar) {
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(postPendingTransactionsHelper, z, str, lVar), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2(lVar));
    }

    public final void syncPendingPurchaseQueue(boolean z, Qa.l lVar) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$2.invoke(), null);
                    break;
            }
            Dispatcher.enqueue$default(this.dispatcher, new f(this, this.identityManager.getCurrentAppUserID(), z, lVar), null, 2, null);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str = "[Purchases] - " + logLevel11.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str = "[Purchases] - " + logLevel14.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str = "[Purchases] - " + logLevel16.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str = "[Purchases] - " + logLevel17.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$$inlined$log$1.invoke(), null);
                break;
        }
        if (lVar != null) {
            lVar.invoke(SyncPendingPurchaseResult.AutoSyncDisabled.INSTANCE);
        }
    }
}
