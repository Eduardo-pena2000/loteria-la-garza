package com.revenuecat.purchases.amazon.handler;

import Ca.I;
import Qa.l;
import Qa.p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Map productTypes;
    private final Map purchaseCallbacks;
    private final PurchasingServiceProvider purchasingServiceProvider;

    public static final class PurchaseRequest {
        private final l onError;
        private final p onSuccess;
        private final Date startTime;
        private final StoreProduct storeProduct;

        public PurchaseRequest(StoreProduct storeProduct, Date date, p pVar, l lVar) {
            t.g(storeProduct, "storeProduct");
            t.g(date, "startTime");
            t.g(pVar, "onSuccess");
            t.g(lVar, "onError");
            this.storeProduct = storeProduct;
            this.startTime = date;
            this.onSuccess = pVar;
            this.onError = lVar;
        }

        public static /* synthetic */ PurchaseRequest copy$default(PurchaseRequest purchaseRequest, StoreProduct storeProduct, Date date, p pVar, l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                storeProduct = purchaseRequest.storeProduct;
            }
            if ((i & 2) != 0) {
                date = purchaseRequest.startTime;
            }
            if ((i & 4) != 0) {
                pVar = purchaseRequest.onSuccess;
            }
            if ((i & 8) != 0) {
                lVar = purchaseRequest.onError;
            }
            return purchaseRequest.copy(storeProduct, date, pVar, lVar);
        }

        public final StoreProduct component1() {
            return this.storeProduct;
        }

        public final Date component2() {
            return this.startTime;
        }

        public final p component3() {
            return this.onSuccess;
        }

        public final l component4() {
            return this.onError;
        }

        public final PurchaseRequest copy(StoreProduct storeProduct, Date date, p pVar, l lVar) {
            t.g(storeProduct, "storeProduct");
            t.g(date, "startTime");
            t.g(pVar, "onSuccess");
            t.g(lVar, "onError");
            return new PurchaseRequest(storeProduct, date, pVar, lVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseRequest)) {
                return false;
            }
            PurchaseRequest purchaseRequest = (PurchaseRequest) obj;
            return t.c(this.storeProduct, purchaseRequest.storeProduct) && t.c(this.startTime, purchaseRequest.startTime) && t.c(this.onSuccess, purchaseRequest.onSuccess) && t.c(this.onError, purchaseRequest.onError);
        }

        public final l getOnError() {
            return this.onError;
        }

        public final p getOnSuccess() {
            return this.onSuccess;
        }

        public final Date getStartTime() {
            return this.startTime;
        }

        public final StoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return (((((this.storeProduct.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.onSuccess.hashCode()) * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "PurchaseRequest(storeProduct=" + this.storeProduct + ", startTime=" + this.startTime + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ')';
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends ResultReceiver {
        final /* synthetic */ l $onError;
        final /* synthetic */ p $onSuccess;
        final /* synthetic */ StoreProduct $storeProduct;
        final /* synthetic */ PurchaseHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Handler handler, PurchaseHandler purchaseHandler, StoreProduct storeProduct, p pVar, l lVar) {
            super(handler);
            this.this$0 = purchaseHandler;
            this.$storeProduct = storeProduct;
            this.$onSuccess = pVar;
            this.$onError = lVar;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            Object obj;
            PurchaseHandler purchaseHandler = this.this$0;
            StoreProduct storeProduct = this.$storeProduct;
            p pVar = this.$onSuccess;
            l lVar = this.$onError;
            synchronized (purchaseHandler) {
                if (bundle != null) {
                    try {
                        obj = bundle.get("request_id");
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    obj = null;
                }
                RequestId requestId = obj instanceof RequestId ? (RequestId) obj : null;
                if (requestId != null) {
                    PurchaseHandler.access$getPurchaseCallbacks$p(purchaseHandler).put(requestId, new PurchaseRequest(storeProduct, PurchaseHandler.access$getDateProvider$p(purchaseHandler).getNow(), pVar, lVar));
                    PurchaseHandler.access$getProductTypes$p(purchaseHandler).put(storeProduct.getId(), storeProduct.getType());
                } else {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "No RequestId coming from ProxyAmazonBillingActivity", null);
                }
                I i2 = I.a;
            }
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context context, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        t.g(purchasingServiceProvider, "purchasingServiceProvider");
        t.g(context, "applicationContext");
        t.g(dateProvider, "dateProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.applicationContext = context;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.productTypes = new LinkedHashMap();
        this.purchaseCallbacks = new LinkedHashMap();
    }

    public static final /* synthetic */ DateProvider access$getDateProvider$p(PurchaseHandler purchaseHandler) {
        return purchaseHandler.dateProvider;
    }

    public static final /* synthetic */ Map access$getProductTypes$p(PurchaseHandler purchaseHandler) {
        return purchaseHandler.productTypes;
    }

    public static final /* synthetic */ Map access$getPurchaseCallbacks$p(PurchaseHandler purchaseHandler) {
        return purchaseHandler.purchaseCallbacks;
    }

    private final 1 createRequestIdResultReceiver(Handler handler, StoreProduct storeProduct, p pVar, l lVar) {
        return new 1(handler, this, storeProduct, pVar, lVar);
    }

    private final void startProxyActivity(Handler handler, Activity activity, StoreProduct storeProduct, p pVar, l lVar) {
        activity.startActivity(ProxyAmazonBillingActivity.Companion.newStartIntent(activity, createRequestIdResultReceiver(handler, storeProduct, pVar, lVar), storeProduct.getId(), this.purchasingServiceProvider));
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        PurchaseRequest purchaseRequest;
        PurchasesErrorCode code;
        t.g(purchaseResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            PurchaseHandler$onPurchaseResponse$$inlined$log$1 purchaseHandler$onPurchaseResponse$$inlined$log$1 = new PurchaseHandler$onPurchaseResponse$$inlined$log$1(logIntent, purchaseResponse);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$onPurchaseResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            ProxyAmazonBillingActivityBroadcastReceiver.Companion companion = ProxyAmazonBillingActivityBroadcastReceiver.Companion;
            String packageName = this.applicationContext.getPackageName();
            t.f(packageName, "applicationContext.packageName");
            this.applicationContext.sendBroadcast(companion.newPurchaseFinishedIntent(packageName));
            RequestId requestId = purchaseResponse.getRequestId();
            synchronized (this) {
                purchaseRequest = (PurchaseRequest) this.purchaseCallbacks.remove(requestId);
            }
            if (purchaseRequest != null) {
                StoreProduct component1 = purchaseRequest.component1();
                Date component2 = purchaseRequest.component2();
                p component3 = purchaseRequest.component3();
                l component4 = purchaseRequest.component4();
                PurchaseResponse.RequestStatus requestStatus = purchaseResponse.getRequestStatus();
                int i = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                PurchasesError purchasesError = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new PurchasesError(PurchasesErrorCode.StoreProblemError, "Failed to make purchase. There was an Amazon store problem.") : new PurchasesError(PurchasesErrorCode.StoreProblemError, "Failed to make purchase. Call is not supported") : new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, "Failed to make purchase. User already owns SKU.") : new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Failed to make purchase. SKU is invalid") : new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, "Failed to make purchase. This error normally means that the purchase was cancelled") : null;
                DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                if (diagnosticsTracker != null) {
                    diagnosticsTracker.trackAmazonPurchaseAttempt-9VgGkz4(component1.getId(), purchaseResponse.getRequestStatus().name(), (purchasesError == null || (code = purchasesError.getCode()) == null) ? null : Integer.valueOf(code.getCode()), purchasesError != null ? purchasesError.getMessage() : null, DurationExtensionsKt.between(ab.b.b, component2, this.dateProvider.getNow()));
                }
                if (purchasesError != null) {
                    component4.invoke(purchasesError);
                    return;
                }
                Receipt receipt = purchaseResponse.getReceipt();
                t.f(receipt, "response.receipt");
                UserData userData = purchaseResponse.getUserData();
                t.f(userData, "response.userData");
                component3.invoke(receipt, userData);
            }
        } catch (Exception e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseResponse", e);
            throw e;
        }
    }

    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p pVar, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(handler, "mainHandler");
        t.g(activity, "activity");
        t.g(str, "appUserID");
        t.g(storeProduct, "storeProduct");
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        LogIntent logIntent = LogIntent.PURCHASE;
        PurchaseHandler$purchase$$inlined$log$1 purchaseHandler$purchase$$inlined$log$1 = new PurchaseHandler$purchase$$inlined$log$1(logIntent, storeProduct);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) purchaseHandler$purchase$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchaseHandler$purchase$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseHandler$purchase$$inlined$log$1.invoke(), null);
                break;
        }
        startProxyActivity(handler, activity, storeProduct, pVar, lVar);
    }

    public /* synthetic */ PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context context, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i, k kVar) {
        this(purchasingServiceProvider, context, diagnosticsTracker, (i & 8) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
