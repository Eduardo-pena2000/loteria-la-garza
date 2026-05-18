package com.revenuecat.purchases;

import Ca.I;
import Da.D;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    public static final class 1 implements ReceiveCustomerInfoCallback {
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;

        public 1(Qa.l lVar, Qa.l lVar2) {
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }

        public void onReceived(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            this.$onSuccess.invoke(customerInfo);
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $handleError;
        final /* synthetic */ Qa.l $handleSuccess;
        final /* synthetic */ boolean $isRestore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, boolean z, boolean z2, Qa.l lVar, Qa.l lVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z;
            this.$isRestore = z2;
            this.$handleSuccess = lVar;
            this.$handleError = lVar2;
        }

        public static final /* synthetic */ void access$invoke$handleLastPurchase(List list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, Qa.l lVar, Qa.l lVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            invoke$handleLastPurchase(list, syncPurchasesHelper, str, z, z2, lVar, lVar2, storeTransaction, storeTransaction2);
        }

        private static final void invoke$handleLastPurchase(List list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, Qa.l lVar, Qa.l lVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (t.c(storeTransaction, storeTransaction2)) {
                if (!list.isEmpty()) {
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    String format = String.format("Error syncing purchases. Error: %s", Arrays.copyOf(new Object[]{list}, 1));
                    t.f(format, "format(...)");
                    currentLogHandler.e("[Purchases] - ERROR", format, null);
                    lVar2.invoke(D.f0(list));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel.name(), "Synced purchases successfully");
                }
                SyncPurchasesHelper.access$retrieveCustomerInfo(syncPurchasesHelper, str, z, z2, lVar, lVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "allPurchases");
            if (list.isEmpty()) {
                SyncPurchasesHelper.access$retrieveCustomerInfo(SyncPurchasesHelper.this, this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) D.p0(list);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z = this.$isRestore;
            String str = this.$appUserID;
            boolean z2 = this.$appInBackground;
            Qa.l lVar = this.$handleSuccess;
            Qa.l lVar2 = this.$handleError;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StoreTransaction storeTransaction2 = (StoreTransaction) it.next();
                Qa.l lVar3 = lVar2;
                boolean z3 = z2;
                SyncPurchasesHelper.access$getPostReceiptHelper$p(syncPurchasesHelper).postTokenWithoutConsuming(storeTransaction2.getPurchaseToken(), new ReceiptInfo(storeTransaction2.getProductIds(), Long.valueOf(storeTransaction2.getPurchaseTime()), null, null, null, null, null, null, null, null, false, storeTransaction2.getStoreUserID(), storeTransaction2.getMarketplace(), 2044, null), z, str, PostReceiptInitiationSource.RESTORE, new SyncPurchasesHelper$syncPurchases$2$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z2, z, lVar, lVar3), new SyncPurchasesHelper$syncPurchases$2$1$2(arrayList, storeTransaction2, storeTransaction, syncPurchasesHelper, str, z3, z, lVar, lVar3), storeTransaction2.isAutoRenewing());
                lVar2 = lVar3;
                lVar = lVar;
                z2 = z3;
            }
        }
    }

    public static final class 3 extends u implements Qa.l {
        final /* synthetic */ Qa.l $handleError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(Qa.l lVar) {
            super(1);
            this.$handleError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(purchasesError, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1(logIntent, purchasesError);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$handleError.invoke(purchasesError);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        t.g(billingAbstract, "billing");
        t.g(identityManager, "identityManager");
        t.g(customerInfoHelper, "customerInfoHelper");
        t.g(postReceiptHelper, "postReceiptHelper");
        t.g(dateProvider, "dateProvider");
        this.billing = billingAbstract;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    public static final /* synthetic */ PostReceiptHelper access$getPostReceiptHelper$p(SyncPurchasesHelper syncPurchasesHelper) {
        return syncPurchasesHelper.postReceiptHelper;
    }

    public static final /* synthetic */ void access$retrieveCustomerInfo(SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, Qa.l lVar, Qa.l lVar2) {
        syncPurchasesHelper.retrieveCustomerInfo(str, z, z2, lVar, lVar2);
    }

    public static final /* synthetic */ void access$trackSyncPurchasesResultIfNeeded(SyncPurchasesHelper syncPurchasesHelper, PurchasesError purchasesError, Date date) {
        syncPurchasesHelper.trackSyncPurchasesResultIfNeeded(purchasesError, date);
    }

    private final void retrieveCustomerInfo(String str, boolean z, boolean z2, Qa.l lVar, Qa.l lVar2) {
        CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, str, CacheFetchPolicy.CACHED_OR_FETCHED, z, z2, false, new 1(lVar, lVar2), 16, null);
    }

    private final void trackSyncPurchasesResultIfNeeded(PurchasesError purchasesError, Date date) {
        PurchasesErrorCode code;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackSyncPurchasesResult-SxA4cEA((purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), purchasesError != null ? purchasesError.getMessage() : null, DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow()));
        }
    }

    public final void syncPurchases(boolean z, boolean z2, Qa.l lVar, Qa.l lVar2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        SyncPurchasesHelper$syncPurchases$$inlined$log$1 syncPurchasesHelper$syncPurchases$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        Date now = this.dateProvider.getNow();
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackSyncPurchasesStarted();
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        SyncPurchasesHelper$syncPurchases$handleSuccess$1 syncPurchasesHelper$syncPurchases$handleSuccess$1 = new SyncPurchasesHelper$syncPurchases$handleSuccess$1(this, now, lVar);
        SyncPurchasesHelper$syncPurchases$handleError$1 syncPurchasesHelper$syncPurchases$handleError$1 = new SyncPurchasesHelper$syncPurchases$handleError$1(this, now, lVar2);
        this.billing.queryAllPurchases(currentAppUserID, new 2(currentAppUserID, z2, z, syncPurchasesHelper$syncPurchases$handleSuccess$1, syncPurchasesHelper$syncPurchases$handleError$1), new 3(syncPurchasesHelper$syncPurchases$handleError$1));
    }

    public /* synthetic */ SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i, kotlin.jvm.internal.k kVar) {
        this(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker, (i & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
