package com.revenuecat.purchases.amazon.handler;

import Ca.I;
import Ca.q;
import Ca.x;
import Qa.l;
import Qa.p;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseUpdatesHandler implements PurchaseUpdatesResponseListener {
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map requests;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseUpdatesHandler(PurchasingServiceProvider purchasingServiceProvider) {
        t.g(purchasingServiceProvider, "purchasingServiceProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.requests = new LinkedHashMap();
    }

    private final void invokeWithStoreProblem(l lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        q qVar;
        t.g(purchaseUpdatesResponse, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            PurchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1 purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1 = new PurchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1(logIntent, purchaseUpdatesResponse);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            RequestId requestId = purchaseUpdatesResponse.getRequestId();
            synchronized (this) {
                qVar = (q) this.requests.remove(requestId);
            }
            if (qVar != null) {
                p pVar = (p) qVar.a();
                l lVar = (l) qVar.b();
                PurchaseUpdatesResponse.RequestStatus requestStatus = purchaseUpdatesResponse.getRequestStatus();
                int i = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i == -1) {
                    invokeWithStoreProblem(lVar, "Failed to get purchase updates. There was an Amazon store problem.");
                    return;
                }
                if (i == 1) {
                    List receipts = purchaseUpdatesResponse.getReceipts();
                    t.f(receipts, "response.receipts");
                    UserData userData = purchaseUpdatesResponse.getUserData();
                    t.f(userData, "response.userData");
                    pVar.invoke(receipts, userData);
                    return;
                }
                if (i == 2) {
                    invokeWithStoreProblem(lVar, "Failed to get purchase updates.");
                } else {
                    if (i != 3) {
                        return;
                    }
                    invokeWithStoreProblem(lVar, "Failed to get purchase updates. Call is not supported.");
                }
            }
        } catch (Exception e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseUpdatesResponse", e);
            throw e;
        }
    }

    public void queryPurchases(p pVar, l lVar) {
        t.g(pVar, "onSuccess");
        t.g(lVar, "onError");
        RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, x.a(pVar, lVar));
            I i = I.a;
        }
    }
}
