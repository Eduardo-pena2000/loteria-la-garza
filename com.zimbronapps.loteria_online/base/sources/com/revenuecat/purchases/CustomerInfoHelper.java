package com.revenuecat.purchases;

import Ca.I;
import Ca.o;
import Da.S;
import Qa.p;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.utils.Result;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoHelper {
    public static final Companion Companion = new Companion(null);
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final boolean uiPreviewMode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final CustomerInfo createPreviewCustomerInfo$purchases_defaultsBc8Release() {
            Date date = new Date();
            EntitlementInfos entitlementInfos = new EntitlementInfos(S.h(), VerificationResult.NOT_REQUESTED);
            Map h = S.h();
            Map h2 = S.h();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("subscriptions", new JSONObject());
            jSONObject2.put("non_subscriptions", new JSONObject());
            I i = I.a;
            jSONObject.put("subscriber", jSONObject2);
            return new CustomerInfo(entitlementInfos, h, h2, date, 3, date, "$RC_PREVIEW_MODE_USER", null, null, jSONObject);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ Qa.l $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.l lVar, CustomerInfo customerInfo) {
            super(0);
            this.$callback = lVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, null));
        }
    }

    public static final class 3 extends u implements Qa.a {
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(Qa.l lVar, PurchasesError purchasesError) {
            super(0);
            this.$callback = lVar;
            this.$error = purchasesError;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$callback.invoke(new CustomerInfoDataResult(new Result.Error(this.$error), null, 2, null));
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ Qa.l $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.l lVar, CustomerInfo customerInfo) {
            super(0);
            this.$callback = lVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            Qa.l lVar = this.$callback;
            if (lVar != null) {
                lVar.invoke(new CustomerInfoDataResult(new Result.Success(this.$cachedCustomerInfo), null, 2, null));
            }
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Qa.l $callback;

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar, CustomerInfo customerInfo) {
                super(0);
                this.$callback = lVar;
                this.$info = customerInfo;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new Result.Success(this.$info));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar) {
            super(1);
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(customerInfo, "info");
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.access$getOfflineEntitlementsManager$p(CustomerInfoHelper.this).resetOfflineCustomerInfoCache();
            CustomerInfoHelper.access$getCustomerInfoUpdateHandler$p(CustomerInfoHelper.this).cacheAndNotifyListeners(customerInfo);
            CustomerInfoHelper.access$dispatch(CustomerInfoHelper.this, new 2(this.$callback, customerInfo));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $callback;

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            public static final class 1 extends u implements Qa.a {
                final /* synthetic */ Qa.l $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(Qa.l lVar, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = lVar;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    Qa.l lVar = this.$callback;
                    if (lVar != null) {
                        lVar.invoke(new Result.Success(this.$offlineComputedCustomerInfo));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(CustomerInfoHelper customerInfoHelper, Qa.l lVar) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "offlineComputedCustomerInfo");
                CustomerInfoHelper.access$getCustomerInfoUpdateHandler$p(this.this$0).notifyListeners(customerInfo);
                CustomerInfoHelper.access$dispatch(this.this$0, new 1(this.$callback, customerInfo));
            }
        }

        public static final class 3 extends u implements Qa.l {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            public static final class 1 extends u implements Qa.a {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ Qa.l $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(Qa.l lVar, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = lVar;
                    this.$backendError = purchasesError;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    Qa.l lVar = this.$callback;
                    if (lVar != null) {
                        lVar.invoke(new Result.Error(this.$backendError));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(CustomerInfoHelper customerInfoHelper, Qa.l lVar, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = lVar;
                this.$backendError = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                CustomerInfoHelper.access$dispatch(this.this$0, new 1(this.$callback, this.$backendError));
            }
        }

        public static final class 4 extends u implements Qa.a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 4(Qa.l lVar, PurchasesError purchasesError) {
                super(0);
                this.$callback = lVar;
                this.$backendError = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new Result.Error(this.$backendError));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, Qa.l lVar) {
            super(2);
            this.$appUserID = str;
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z) {
            t.g(purchasesError, "backendError");
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error fetching customer data: %s.", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            CustomerInfoHelper.access$getDeviceCache$p(CustomerInfoHelper.this).clearCustomerInfoCacheTimestamp$purchases_defaultsBc8Release(this.$appUserID);
            if (CustomerInfoHelper.access$getOfflineEntitlementsManager$p(CustomerInfoHelper.this).shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z, this.$appUserID)) {
                CustomerInfoHelper.access$getOfflineEntitlementsManager$p(CustomerInfoHelper.this).calculateAndCacheOfflineCustomerInfo(this.$appUserID, new 2(CustomerInfoHelper.this, this.$callback), new 3(CustomerInfoHelper.this, this.$callback, purchasesError));
            } else {
                CustomerInfoHelper.access$dispatch(CustomerInfoHelper.this, new 4(this.$callback, purchasesError));
            }
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $callback;

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ SyncPendingPurchaseResult $syncResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar, SyncPendingPurchaseResult syncPendingPurchaseResult) {
                super(0);
                this.$callback = lVar;
                this.$syncResult = syncPendingPurchaseResult;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new CustomerInfoDataResult(new Result.Success(((SyncPendingPurchaseResult.Success) this.$syncResult).getCustomerInfo()), Boolean.TRUE));
                }
            }
        }

        public static final class 3 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result) obj);
                return I.a;
            }

            public final void invoke(Result result) {
                t.g(result, "result");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new CustomerInfoDataResult(result, Boolean.TRUE));
                }
            }
        }

        public static final class 4 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 4(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result) obj);
                return I.a;
            }

            public final void invoke(Result result) {
                t.g(result, "result");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new CustomerInfoDataResult(result, null, 2, null));
                }
            }
        }

        public static final class 5 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 5(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Result) obj);
                return I.a;
            }

            public final void invoke(Result result) {
                t.g(result, "result");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new CustomerInfoDataResult(result, Boolean.FALSE));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, boolean z, Qa.l lVar) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z;
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SyncPendingPurchaseResult) obj);
            return I.a;
        }

        public final void invoke(SyncPendingPurchaseResult syncPendingPurchaseResult) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(syncPendingPurchaseResult, "syncResult");
            if (!(syncPendingPurchaseResult instanceof SyncPendingPurchaseResult.Success)) {
                if (syncPendingPurchaseResult instanceof SyncPendingPurchaseResult.Error) {
                    CustomerInfoHelper.access$getCustomerInfoFetchOnly(CustomerInfoHelper.this, this.$appUserID, this.$appInBackground, new 3(this.$callback));
                    return;
                } else if (syncPendingPurchaseResult instanceof SyncPendingPurchaseResult.AutoSyncDisabled) {
                    CustomerInfoHelper.access$getCustomerInfoFetchOnly(CustomerInfoHelper.this, this.$appUserID, this.$appInBackground, new 4(this.$callback));
                    return;
                } else {
                    if (syncPendingPurchaseResult instanceof SyncPendingPurchaseResult.NoPendingPurchasesToSync) {
                        CustomerInfoHelper.access$getCustomerInfoFetchOnly(CustomerInfoHelper.this, this.$appUserID, this.$appInBackground, new 5(this.$callback));
                        return;
                    }
                    return;
                }
            }
            LogIntent logIntent = LogIntent.RC_SUCCESS;
            CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 = new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            CustomerInfoHelper.access$dispatch(CustomerInfoHelper.this, new 2(this.$callback, syncPendingPurchaseResult));
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z, DateProvider dateProvider, Handler handler) {
        t.g(deviceCache, "deviceCache");
        t.g(backend, "backend");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        t.g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        t.g(dateProvider, "dateProvider");
        t.g(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.uiPreviewMode = z;
        this.dateProvider = dateProvider;
        this.handler = handler;
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        dispatch$lambda$6(aVar);
    }

    public static final /* synthetic */ void access$dispatch(CustomerInfoHelper customerInfoHelper, Qa.a aVar) {
        customerInfoHelper.dispatch(aVar);
    }

    public static final /* synthetic */ void access$getCustomerInfoFetchOnly(CustomerInfoHelper customerInfoHelper, String str, boolean z, Qa.l lVar) {
        customerInfoHelper.getCustomerInfoFetchOnly(str, z, lVar);
    }

    public static final /* synthetic */ CustomerInfoUpdateHandler access$getCustomerInfoUpdateHandler$p(CustomerInfoHelper customerInfoHelper) {
        return customerInfoHelper.customerInfoUpdateHandler;
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(CustomerInfoHelper customerInfoHelper) {
        return customerInfoHelper.deviceCache;
    }

    public static final /* synthetic */ OfflineEntitlementsManager access$getOfflineEntitlementsManager$p(CustomerInfoHelper customerInfoHelper) {
        return customerInfoHelper.offlineEntitlementsManager;
    }

    public static final /* synthetic */ void access$trackGetCustomerInfoResultIfNeeded(CustomerInfoHelper customerInfoHelper, boolean z, Date date, CustomerInfoDataResult customerInfoDataResult, CacheFetchPolicy cacheFetchPolicy) {
        customerInfoHelper.trackGetCustomerInfoResultIfNeeded(z, date, customerInfoDataResult, cacheFetchPolicy);
    }

    private final void dispatch(Qa.a aVar) {
        if (t.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            aVar.invoke();
        } else {
            this.handler.post(new a(aVar));
        }
    }

    private static final void dispatch$lambda$6(Qa.a aVar) {
        aVar.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(str) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String str, Qa.l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        if (lVar == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, "Requested a cached CustomerInfo but it's not available.");
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new 3(lVar, purchasesError));
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new 2(lVar, cachedCustomerInfo));
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z, boolean z2, Qa.l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo == null) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d("[Purchases] - " + logLevel4.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel6.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel7.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo(str, z, z2, lVar);
            return;
        }
        LogIntent logIntent2 = LogIntent.DEBUG;
        CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 = new CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1(logIntent2);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    str2 = "[Purchases] - " + logLevel11.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    str2 = "[Purchases] - " + logLevel14.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel15.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    str2 = "[Purchases] - " + logLevel16.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    str2 = "[Purchases] - " + logLevel17.name();
                    str3 = (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new 2(lVar, cachedCustomerInfo));
        updateCachedCustomerInfoIfStale(str, z, z2);
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, Qa.l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z, z2, lVar);
    }

    private final void getCustomerInfoFetchOnly(String str, boolean z, Qa.l lVar) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow$purchases_defaultsBc8Release(str);
        this.backend.getCustomerInfo(str, z, new 1(lVar), new 2(str, lVar));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, Qa.l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z, lVar);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z, boolean z2, Qa.l lVar) {
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(str, z)) {
            postPendingPurchasesAndFetchCustomerInfo(str, z, z2, lVar);
        } else {
            getCustomerInfoCachedOrFetched(str, z, z2, lVar);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, Qa.l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z, z2, lVar);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String str, boolean z, boolean z2, Qa.l lVar) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(z2, new 1(str, z, lVar));
    }

    public static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, Qa.l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z, z2, lVar);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z, boolean z2, boolean z3, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 16) != 0) {
            z3 = false;
        }
        boolean z4 = z3;
        if ((i & 32) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z, z2, z4, receiveCustomerInfoCallback);
    }

    private final void trackGetCustomerInfoResultIfNeeded(boolean z, Date date, CustomerInfoDataResult customerInfoDataResult, CacheFetchPolicy cacheFetchPolicy) {
        CustomerInfo customerInfo;
        PurchasesError purchasesError;
        PurchasesErrorCode code;
        EntitlementInfos entitlements;
        if (!z || this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long between = DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow());
        Result result = customerInfoDataResult.getResult();
        if (result instanceof Result.Success) {
            customerInfo = (CustomerInfo) customerInfoDataResult.getResult().getValue();
        } else {
            if (!(result instanceof Result.Error)) {
                throw new o();
            }
            customerInfo = null;
        }
        Result result2 = customerInfoDataResult.getResult();
        if (result2 instanceof Result.Success) {
            purchasesError = null;
        } else {
            if (!(result2 instanceof Result.Error)) {
                throw new o();
            }
            purchasesError = (PurchasesError) customerInfoDataResult.getResult().getValue();
        }
        this.diagnosticsTrackerIfEnabled.trackGetCustomerInfoResult-17CK4j0(cacheFetchPolicy, (customerInfo == null || (entitlements = customerInfo.getEntitlements()) == null) ? null : entitlements.getVerification(), customerInfoDataResult.getHadUnsyncedPurchasesBefore(), purchasesError != null ? purchasesError.getMessage() : null, (purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), between);
    }

    private final void trackGetCustomerInfoStartedIfNeeded(boolean z) {
        DiagnosticsTracker diagnosticsTracker;
        if (!z || (diagnosticsTracker = this.diagnosticsTrackerIfEnabled) == null) {
            return;
        }
        diagnosticsTracker.trackGetCustomerInfoStarted();
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z, boolean z2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsBc8Release(str, z)) {
            LogIntent logIntent = LogIntent.DEBUG;
            CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 = new CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1(logIntent, z);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo$default(this, str, z, z2, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String str, CacheFetchPolicy cacheFetchPolicy, boolean z, boolean z2, boolean z3, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        t.g(str, "appUserID");
        t.g(cacheFetchPolicy, "fetchPolicy");
        if (this.uiPreviewMode) {
            if (receiveCustomerInfoCallback != null) {
                dispatch(new CustomerInfoHelper$retrieveCustomerInfo$1$1(receiveCustomerInfoCallback));
                return;
            }
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str2 = "[Purchases] - " + logLevel.name();
            String format = String.format("Retrieving customer info with policy: %s", Arrays.copyOf(new Object[]{cacheFetchPolicy}, 1));
            t.f(format, "format(...)");
            currentLogHandler.d(str2, format);
        }
        trackGetCustomerInfoStartedIfNeeded(z3);
        CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 = (receiveCustomerInfoCallback != null || z3) ? new CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(this, z3, this.dateProvider.getNow(), cacheFetchPolicy, receiveCustomerInfoCallback) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[cacheFetchPolicy.ordinal()];
        if (i == 1) {
            getCustomerInfoCacheOnly(str, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
            return;
        }
        if (i == 2) {
            postPendingPurchasesAndFetchCustomerInfo(str, z, z2, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else if (i == 3) {
            getCustomerInfoCachedOrFetched(str, z, z2, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else {
            if (i != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(str, z, z2, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        }
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, DiagnosticsTracker diagnosticsTracker, boolean z, DateProvider dateProvider, Handler handler, int i, kotlin.jvm.internal.k kVar) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i & 256) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
