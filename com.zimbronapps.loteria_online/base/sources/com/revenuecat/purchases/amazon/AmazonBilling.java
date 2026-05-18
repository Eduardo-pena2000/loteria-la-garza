package com.revenuecat.purchases.amazon;

import Ca.I;
import Ca.o;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.w;
import Qa.l;
import Qa.p;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    private final Handler mainHandler;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue serviceRequests;
    private final UserDataResponseListener userDataHandler;

    public static final class 1 extends u implements l {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.access$getPurchasingServiceProvider$p(AmazonBilling.this).notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onCompletion;
        final /* synthetic */ l $onError;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar, String str, l lVar2) {
            super(1);
            this.$onCompletion = lVar;
            this.$productId = str;
            this.$onError = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            Object obj;
            t.g(list, "it");
            String str = this.$productId;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (t.c(str, ((StoreTransaction) obj).getProductIds().get(0))) {
                        break;
                    }
                }
            }
            StoreTransaction storeTransaction = (StoreTransaction) obj;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            String format = String.format("Couldn't find existing purchase for SKU: %s", Arrays.copyOf(new Object[]{this.$productId}, 1));
            t.f(format, "format(...)");
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, format));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        public static final class 1 extends u implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LWAConsentStatus.values().length];
                    try {
                        iArr[LWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AmazonBilling amazonBilling, l lVar, l lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return I.a;
            }

            public final void invoke(UserData userData) {
                AmazonLWAConsentStatus amazonLWAConsentStatus;
                t.g(userData, "userData");
                LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                if (lWAConsentStatus == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, "Failed to get LWA Consent Status from user data. It was null."));
                    return;
                }
                l lVar = this.$onSuccess;
                int i = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                if (i == 1) {
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                } else {
                    if (i != 2) {
                        throw new o();
                    }
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                }
                lVar.invoke(amazonLWAConsentStatus);
            }
        }

        public static final class 2 extends u implements l {
            final /* synthetic */ l $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(l lVar) {
                super(1);
                this.$onError = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "error");
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String format = String.format("Error obtaining LWA Consent Status in Amazon: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
                t.f(format, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", format, null);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.access$getUserDataHandler$p(AmazonBilling.this).getUserData(new 1(AmazonBilling.this, this.$onSuccess, this.$onError), new 2(this.$onError));
                return;
            }
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error connecting to billing client to get LWA consent status: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            this.$onError.invoke(purchasesError);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        public static final class 1 extends u implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AmazonBilling amazonBilling, l lVar, l lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return I.a;
            }

            public final void invoke(UserData userData) {
                t.g(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, "Failed to get marketplace from user data. It was null."));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        public static final class 2 extends u implements l {
            final /* synthetic */ l $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(l lVar) {
                super(1);
                this.$onError = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "error");
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                String format = String.format("Error obtaining storefront in Amazon: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
                t.f(format, "format(...)");
                currentLogHandler.e("[Purchases] - ERROR", format, null);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.access$getUserDataHandler$p(AmazonBilling.this).getUserData(new 1(AmazonBilling.this, this.$onSuccess, this.$onError), new 2(this.$onError));
                return;
            }
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error connecting to billing client to get store country: %s", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            this.$onError.invoke(purchasesError);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return I.a;
        }

        public final void invoke(JSONObject jSONObject) {
            t.g(jSONObject, "response");
            Object obj = jSONObject.get("termSku");
            t.e(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(Da.u.e(storeTransaction));
            }
        }
    }

    public /* synthetic */ class 2 extends q implements l {
        public 2(Object obj) {
            super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "p0");
            AmazonBilling.access$onPurchaseError((AmazonBilling) ((f) this).receiver, purchasesError);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        public static final class 1 extends u implements p {
            final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingContext = presentedOfferingContext;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Receipt) obj, (UserData) obj2);
                return I.a;
            }

            public final void invoke(Receipt receipt, UserData userData) {
                t.g(receipt, "receipt");
                t.g(userData, "userData");
                AmazonBilling.access$handleReceipt(this.this$0, receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
            }
        }

        public static final class 2 extends u implements l {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                AmazonBilling.access$onPurchaseError(this.this$0, purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.access$onPurchaseError(AmazonBilling.this, purchasesError);
                return;
            }
            PurchaseResponseListener access$getPurchaseHandler$p = AmazonBilling.access$getPurchaseHandler$p(AmazonBilling.this);
            Handler access$getMainHandler$p = AmazonBilling.access$getMainHandler$p(AmazonBilling.this);
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            access$getPurchaseHandler$p.purchase(access$getMainHandler$p, activity, str, amazonStoreProduct, new 1(AmazonBilling.this, amazonStoreProduct, this.$presentedOfferingContext), new 2(AmazonBilling.this));
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar, String str, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$purchaseToken = str;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return I.a;
        }

        public final void invoke(JSONObject jSONObject) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(jSONObject, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 = new AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1(logIntent, jSONObject);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            String access$getTermSkuFromJSON = AmazonBilling.access$getTermSkuFromJSON(AmazonBilling.this, jSONObject);
            if (access$getTermSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(jSONObject));
            } else {
                AmazonBilling.access$getCache$p(AmazonBilling.this).cacheSkusByToken(Q.f(x.a(this.$purchaseToken, access$getTermSkuFromJSON)));
                this.$onSuccess.invoke(access$getTermSkuFromJSON);
            }
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(purchasesError));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$onReceivePurchaseHistory = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "it");
            this.$onReceivePurchaseHistory.invoke(D.L0(map.values()));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onReceive;
        final /* synthetic */ Set $productIds;

        public static final class 1 extends u implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onReceive;
            final /* synthetic */ Set $productIds;
            final /* synthetic */ AmazonBilling this$0;

            public static final class 1 extends u implements l {
                final /* synthetic */ l $onReceive;
                final /* synthetic */ Set $productIds;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(AmazonBilling amazonBilling, Date date, Set set, l lVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onReceive = lVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List) obj);
                    return I.a;
                }

                public final void invoke(List list) {
                    t.g(list, "it");
                    AmazonBilling.access$trackAmazonQueryProductDetailsRequestIfNeeded(this.this$0, true, this.$requestStartTime, this.$productIds);
                    this.$onReceive.invoke(list);
                }
            }

            public static final class 2 extends u implements l {
                final /* synthetic */ l $onError;
                final /* synthetic */ Set $productIds;
                final /* synthetic */ Date $requestStartTime;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 2(AmazonBilling amazonBilling, Date date, Set set, l lVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onError = lVar;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return I.a;
                }

                public final void invoke(PurchasesError purchasesError) {
                    t.g(purchasesError, "it");
                    AmazonBilling.access$trackAmazonQueryProductDetailsRequestIfNeeded(this.this$0, false, this.$requestStartTime, this.$productIds);
                    this.$onError.invoke(purchasesError);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AmazonBilling amazonBilling, Set set, l lVar, l lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = lVar;
                this.$onError = lVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return I.a;
            }

            public final void invoke(UserData userData) {
                t.g(userData, "userData");
                Date now = AmazonBilling.access$getDateProvider$p(this.this$0).getNow();
                ProductDataResponseListener access$getProductDataHandler$p = AmazonBilling.access$getProductDataHandler$p(this.this$0);
                Set set = this.$productIds;
                String marketplace = userData.getMarketplace();
                t.f(marketplace, "userData.marketplace");
                access$getProductDataHandler$p.getProductData(set, marketplace, new 1(this.this$0, now, this.$productIds, this.$onReceive), new 2(this.this$0, now, this.$productIds, this.$onError));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, Set set, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$productIds = set;
            this.$onReceive = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.access$getUserDataHandler$p(AmazonBilling.this).getUserData(new 1(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        public static final class 1 extends u implements p {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            public static final class 1 extends u implements p {
                final /* synthetic */ List $filteredReceipts;
                final /* synthetic */ l $onError;
                final /* synthetic */ l $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(AmazonBilling amazonBilling, l lVar, List list, UserData userData, l lVar2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = lVar;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = lVar2;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Map) obj, (Map) obj2);
                    return I.a;
                }

                public final void invoke(Map map, Map map2) {
                    t.g(map, "tokensToSkusMap");
                    t.g(map2, "errors");
                    AmazonBilling.access$logErrorsIfAny(this.this$0, map2);
                    if (map.isEmpty()) {
                        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Error fetching purchase history. All receipts are invalid."));
                    } else {
                        this.$onSuccess.invoke(AmazonBilling.access$toMapOfReceiptHashesToRestoredPurchases(this.this$0, this.$filteredReceipts, map, this.$userData));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AmazonBilling amazonBilling, Date date, boolean z, l lVar, l lVar2) {
                super(2);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$filterOnlyActivePurchases = z;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List) obj, (UserData) obj2);
                return I.a;
            }

            public final void invoke(List list, UserData userData) {
                t.g(list, "receipts");
                t.g(userData, "userData");
                AmazonBilling.access$trackAmazonQueryPurchasesRequestIfNeeded(this.this$0, true, this.$requestStartTime, list);
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    List arrayList = new ArrayList();
                    for (Object obj : list) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(AmazonBilling.access$getDateProvider$p(amazonBilling).getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    this.$onSuccess.invoke(S.h());
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                t.f(userId, "userData.userId");
                AmazonBilling.access$getMissingSkusForReceipts(amazonBilling2, userId, list, new 1(this.this$0, this.$onError, list, userData, this.$onSuccess));
            }
        }

        public static final class 2 extends u implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ Date $requestStartTime;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(AmazonBilling amazonBilling, Date date, l lVar) {
                super(1);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$onError = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                AmazonBilling.access$trackAmazonQueryPurchasesRequestIfNeeded(this.this$0, false, this.$requestStartTime, null);
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, boolean z, l lVar2) {
            super(1);
            this.$onError = lVar;
            this.$filterOnlyActivePurchases = z;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                Date now = AmazonBilling.access$getDateProvider$p(AmazonBilling.this).getNow();
                AmazonBilling.access$getPurchaseUpdatesHandler$p(AmazonBilling.this).queryPurchases(new 1(AmazonBilling.this, now, this.$filterOnlyActivePurchases, this.$onSuccess, this.$onError), new 2(AmazonBilling.this, now, this.$onError));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i, k kVar) {
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i & 128) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        this(context, amazonBackend, amazonCache, z, handler, purchasesStateProvider, diagnosticsTracker, defaultPurchasingServiceProvider, (i & 256) != 0 ? new ProductDataHandler(defaultPurchasingServiceProvider, handler) : productDataResponseListener, (i & 512) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context, diagnosticsTracker, null, 8, null) : purchaseResponseListener, (i & 1024) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i & 2048) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler, null, 4, null) : userDataResponseListener, (i & 4096) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public static /* synthetic */ void a(AmazonBilling amazonBilling) {
        startConnectionOnMainThread$lambda$0(amazonBilling);
    }

    public static final /* synthetic */ AmazonCache access$getCache$p(AmazonBilling amazonBilling) {
        return amazonBilling.cache;
    }

    public static final /* synthetic */ DateProvider access$getDateProvider$p(AmazonBilling amazonBilling) {
        return amazonBilling.dateProvider;
    }

    public static final /* synthetic */ Handler access$getMainHandler$p(AmazonBilling amazonBilling) {
        return amazonBilling.mainHandler;
    }

    public static final /* synthetic */ void access$getMissingSkusForReceipts(AmazonBilling amazonBilling, String str, List list, p pVar) {
        amazonBilling.getMissingSkusForReceipts(str, list, pVar);
    }

    public static final /* synthetic */ ProductDataResponseListener access$getProductDataHandler$p(AmazonBilling amazonBilling) {
        return amazonBilling.productDataHandler;
    }

    public static final /* synthetic */ PurchaseResponseListener access$getPurchaseHandler$p(AmazonBilling amazonBilling) {
        return amazonBilling.purchaseHandler;
    }

    public static final /* synthetic */ PurchaseUpdatesResponseListener access$getPurchaseUpdatesHandler$p(AmazonBilling amazonBilling) {
        return amazonBilling.purchaseUpdatesHandler;
    }

    public static final /* synthetic */ PurchasingServiceProvider access$getPurchasingServiceProvider$p(AmazonBilling amazonBilling) {
        return amazonBilling.purchasingServiceProvider;
    }

    public static final /* synthetic */ String access$getTermSkuFromJSON(AmazonBilling amazonBilling, JSONObject jSONObject) {
        return amazonBilling.getTermSkuFromJSON(jSONObject);
    }

    public static final /* synthetic */ UserDataResponseListener access$getUserDataHandler$p(AmazonBilling amazonBilling) {
        return amazonBilling.userDataHandler;
    }

    public static final /* synthetic */ void access$handleReceipt(AmazonBilling amazonBilling, Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        amazonBilling.handleReceipt(receipt, userData, storeProduct, presentedOfferingContext);
    }

    public static final /* synthetic */ void access$logErrorsIfAny(AmazonBilling amazonBilling, Map map) {
        amazonBilling.logErrorsIfAny(map);
    }

    public static final /* synthetic */ void access$onPurchaseError(AmazonBilling amazonBilling, PurchasesError purchasesError) {
        amazonBilling.onPurchaseError(purchasesError);
    }

    public static final /* synthetic */ Map access$toMapOfReceiptHashesToRestoredPurchases(AmazonBilling amazonBilling, List list, Map map, UserData userData) {
        return amazonBilling.toMapOfReceiptHashesToRestoredPurchases(list, map, userData);
    }

    public static final /* synthetic */ void access$trackAmazonQueryProductDetailsRequestIfNeeded(AmazonBilling amazonBilling, boolean z, Date date, Set set) {
        amazonBilling.trackAmazonQueryProductDetailsRequestIfNeeded(z, date, set);
    }

    public static final /* synthetic */ void access$trackAmazonQueryPurchasesRequestIfNeeded(AmazonBilling amazonBilling, boolean z, Date date, List list) {
        amazonBilling.trackAmazonQueryPurchasesRequestIfNeeded(z, date, list);
    }

    public static /* synthetic */ void b(l lVar) {
        executePendingRequests$lambda$14$lambda$13(lVar);
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                try {
                    runOnUIThread(new a((l) this.serviceRequests.remove()));
                } catch (Throwable th) {
                    throw th;
                }
            }
            I i = I.a;
        }
    }

    private static final void executePendingRequests$lambda$14$lambda$13(l lVar) {
        lVar.invoke((Object) null);
    }

    private final synchronized void executeRequestOnUIThread(l lVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(lVar);
                if (isConnected()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void getMissingSkusForReceipts(String str, List list, p pVar) {
        AmazonBilling amazonBilling = this;
        Map receiptSkus = amazonBilling.cache.getReceiptSkus();
        Map C = S.C(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Receipt> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(x.a(receipt.getReceiptId(), receipt.getSku()));
        }
        S.t(C, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj3).getReceiptId())) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            pVar.invoke(C, linkedHashMap);
            return;
        }
        M m = new M();
        m.a = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            t.f(receiptId, "receipt.receiptId");
            amazonBackend.getAmazonReceiptData(receiptId, str, new AmazonBilling$getMissingSkusForReceipts$1$1(C, receipt2, m, this, pVar, linkedHashMap), new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, m, pVar, C));
            amazonBilling = this;
        }
    }

    private final String getTermSkuFromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getString("termSku");
        } catch (JSONException unused) {
            return null;
        }
    }

    private final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(Da.u.e(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        t.f(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        t.f(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new 1(receipt, presentedOfferingContext, userData, this), new 2(this));
    }

    private final void logErrorsIfAny(Map map) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (map.isEmpty()) {
            return;
        }
        String n0 = D.n0(map.keySet(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        AmazonBilling$logErrorsIfAny$$inlined$log$1 amazonBilling$logErrorsIfAny$$inlined$log$1 = new AmazonBilling$logErrorsIfAny$$inlined$log$1(logIntent, n0);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                return;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                return;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke();
                    break;
                } else {
                    return;
                }
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                return;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                    return;
                }
                return;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                return;
            default:
                return;
        }
        currentLogHandler.d(str, str2);
    }

    private final void onPurchaseError(PurchasesError purchasesError) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final boolean shouldFinishTransactions() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        if (this.finishTransactions) {
            return true;
        }
        LogIntent logIntent = LogIntent.AMAZON_WARNING;
        AmazonBilling$shouldFinishTransactions$$inlined$log$1 amazonBilling$shouldFinishTransactions$$inlined$log$1 = new AmazonBilling$shouldFinishTransactions$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return false;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return false;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return false;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                return false;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                }
                return false;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            default:
                return false;
        }
    }

    private static final void startConnectionOnMainThread$lambda$0(AmazonBilling amazonBilling) {
        amazonBilling.startConnection();
    }

    private final Map toMapOfReceiptHashesToRestoredPurchases(List list, Map map, UserData userData) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Receipt receipt = (Receipt) it.next();
            String str3 = (String) map.get(receipt.getReceiptId());
            Ca.q qVar = null;
            if (str3 == null) {
                LogIntent logIntent = LogIntent.AMAZON_ERROR;
                AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 = new AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                }
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str3, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                t.f(receiptId, "receipt.receiptId");
                qVar = x.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return S.x(arrayList);
    }

    private final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean z, Date date, Set set) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackAmazonQueryProductDetailsRequest-KLykuaI(DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow()), z, set);
        }
    }

    private final void trackAmazonQueryPurchasesRequestIfNeeded(boolean z, Date date, List list) {
        ArrayList arrayList;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long between = DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow());
            if (list != null) {
                arrayList = new ArrayList(w.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Receipt) it.next()).getSku());
                }
            } else {
                arrayList = null;
            }
            diagnosticsTracker.trackAmazonQueryPurchasesRequest-KLykuaI(between, z, arrayList);
        }
    }

    public void consumeAndSave(boolean z, StoreTransaction storeTransaction, boolean z2, PostReceiptInitiationSource postReceiptInitiationSource) {
        t.g(storeTransaction, "purchase");
        t.g(postReceiptInitiationSource, "initiationSource");
        if (!shouldFinishTransactions() || storeTransaction.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (z) {
            executeRequestOnUIThread(new 1(storeTransaction));
        }
        this.cache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken(), storeTransaction.isAutoRenewing());
    }

    public void endConnection() {
    }

    public void findPurchaseInPurchaseHistory(String str, com.revenuecat.purchases.ProductType productType, String str2, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str3;
        String str4;
        t.g(str, "appUserID");
        t.g(productType, "productType");
        t.g(str2, "productId");
        t.g(lVar, "onCompletion");
        t.g(lVar2, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 = new AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1(logIntent, str2, productType);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str3 = "[Purchases] - " + logLevel.name();
                    str4 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str3 = "[Purchases] - " + logLevel4.name();
                    str4 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str3 = "[Purchases] - " + logLevel6.name();
                    str4 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str3 = "[Purchases] - " + logLevel7.name();
                    str4 = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(str3, str4);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
        }
        queryAllPurchases(str, new 2(lVar, str2, lVar2), lVar2);
    }

    public void getAmazonLWAConsentStatus(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        executeRequestOnUIThread(new 1(lVar2, lVar));
    }

    public void getProductData(Set set, String str, l lVar, l lVar2) {
        t.g(set, "skus");
        t.g(str, "marketplace");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        this.productDataHandler.getProductData(set, str, lVar, lVar2);
    }

    public void getStorefront(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        executeRequestOnUIThread(new 1(lVar2, lVar));
    }

    public void getUserData(l lVar, l lVar2) {
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        this.userDataHandler.getUserData(lVar, lVar2);
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(activity, "activity");
        t.g(str, "appUserID");
        t.g(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format("Purchase for a %s purchase must be a %s.", Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
            t.f(format, "format(...)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, format);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (shouldFinishTransactions()) {
            if (replaceProductInfo == null) {
                executeRequestOnUIThread(new 2(activity, str, storeProduct, presentedOfferingContext));
                return;
            }
            LogIntent logIntent = LogIntent.AMAZON_WARNING;
            AmazonBilling$makePurchaseAsync$$inlined$log$1 amazonBilling$makePurchaseAsync$$inlined$log$1 = new AmazonBilling$makePurchaseAsync$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    return;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    return;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    return;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    return;
                default:
                    return;
            }
            currentLogHandler.d(str2, str3);
        }
    }

    public void normalizePurchaseData(String str, String str2, String str3, l lVar, l lVar2) {
        t.g(str, "productID");
        t.g(str2, "purchaseToken");
        t.g(str3, "storeUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        String str4 = (String) this.cache.getReceiptSkus().get(str2);
        if (str4 != null) {
            lVar.invoke(str4);
        } else {
            this.amazonBackend.getAmazonReceiptData(str2, str3, new 2(lVar2, str2, lVar), new 3(lVar2));
        }
    }

    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        t.g(productDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(productDataResponse);
        }
    }

    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        t.g(purchaseResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(purchaseResponse);
        }
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        t.g(purchaseUpdatesResponse, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
        }
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        t.g(userDataResponse, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(userDataResponse);
        }
    }

    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, p pVar, l lVar) {
        t.g(handler, "mainHandler");
        t.g(activity, "activity");
        t.g(str, "appUserID");
        t.g(storeProduct, "storeProduct");
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        this.purchaseHandler.purchase(handler, activity, str, storeProduct, pVar, lVar);
    }

    public void queryAllPurchases(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onReceivePurchaseHistory");
        t.g(lVar2, "onReceivePurchaseHistoryError");
        queryPurchases(false, (l) new 1(lVar), lVar2);
    }

    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set set, l lVar, l lVar2) {
        t.g(productType, "productType");
        t.g(set, "productIds");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new 1(lVar2, set, lVar));
        }
    }

    public void queryPurchases(p pVar, l lVar) {
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        this.purchaseUpdatesHandler.queryPurchases(pVar, lVar);
    }

    public void showInAppMessagesIfNeeded(Activity activity, List list, Qa.a aVar) {
        t.g(activity, "activity");
        t.g(list, "inAppMessageTypes");
        t.g(aVar, "subscriptionStatusChange");
    }

    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    public void startConnectionOnMainThread(long j) {
        runOnUIThread(new b(this));
    }

    public void queryPurchases(String str, l lVar, l lVar2) {
        t.g(str, "appUserID");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        if (shouldFinishTransactions()) {
            queryPurchases(true, lVar, lVar2);
        }
    }

    private final void queryPurchases(boolean z, l lVar, l lVar2) {
        executeRequestOnUIThread(new 1(lVar2, z, lVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider) {
        super(purchasesStateProvider);
        t.g(context, "applicationContext");
        t.g(amazonBackend, "amazonBackend");
        t.g(amazonCache, "cache");
        t.g(handler, "mainHandler");
        t.g(purchasesStateProvider, "stateProvider");
        t.g(purchasingServiceProvider, "purchasingServiceProvider");
        t.g(productDataResponseListener, "productDataHandler");
        t.g(purchaseResponseListener, "purchaseHandler");
        t.g(purchaseUpdatesResponseListener, "purchaseUpdatesHandler");
        t.g(userDataResponseListener, "userDataHandler");
        t.g(dateProvider, "dateProvider");
        this.applicationContext = context;
        this.amazonBackend = amazonBackend;
        this.cache = amazonCache;
        this.finishTransactions = z;
        this.mainHandler = handler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataResponseListener;
        this.purchaseHandler = purchaseResponseListener;
        this.purchaseUpdatesHandler = purchaseUpdatesResponseListener;
        this.userDataHandler = userDataResponseListener;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, DeviceCache deviceCache, boolean z, Handler handler, BackendHelper backendHelper, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker) {
        this(context, new AmazonBackend(backendHelper), new AmazonCache(deviceCache), z, handler, purchasesStateProvider, diagnosticsTracker, null, null, null, null, null, null, 8064, null);
        t.g(context, "applicationContext");
        t.g(deviceCache, "cache");
        t.g(handler, "mainHandler");
        t.g(backendHelper, "backendHelper");
        t.g(purchasesStateProvider, "stateProvider");
    }
}
