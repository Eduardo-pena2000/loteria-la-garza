package com.revenuecat.purchases.deeplinks;

import Ca.I;
import Qa.l;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.CustomerInfoUpdateHandler;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebPurchaseRedemptionHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final IdentityManager identityManager;
    private final Handler mainHandler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ RedeemWebPurchaseListener.Result $result;
        final /* synthetic */ RedeemWebPurchaseListener $resultListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
            super(0);
            this.$resultListener = redeemWebPurchaseListener;
            this.$result = result;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.$resultListener.handleResult(this.$result);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ RedeemWebPurchaseListener $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(RedeemWebPurchaseListener redeemWebPurchaseListener) {
            super(1);
            this.$listener = redeemWebPurchaseListener;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RedeemWebPurchaseListener.Result) obj);
            return I.a;
        }

        public final void invoke(RedeemWebPurchaseListener.Result result) {
            t.g(result, "result");
            if (!(result instanceof RedeemWebPurchaseListener.Result.Success)) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error redeeming web purchase: " + result, null);
                WebPurchaseRedemptionHelper.access$dispatchResult(WebPurchaseRedemptionHelper.this, this.$listener, result);
                return;
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Successfully redeemed web purchase. Updating customer info.");
            }
            WebPurchaseRedemptionHelper.access$getOfflineEntitlementsManager$p(WebPurchaseRedemptionHelper.this).resetOfflineCustomerInfoCache();
            WebPurchaseRedemptionHelper.access$getCustomerInfoUpdateHandler$p(WebPurchaseRedemptionHelper.this).cacheAndNotifyListeners(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo());
            WebPurchaseRedemptionHelper.access$dispatchResult(WebPurchaseRedemptionHelper.this, this.$listener, result);
        }
    }

    public WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler) {
        t.g(backend, "backend");
        t.g(identityManager, "identityManager");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        this.backend = backend;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.mainHandler = handler;
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        dispatch$lambda$1(aVar);
    }

    public static final /* synthetic */ void access$dispatchResult(WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
        webPurchaseRedemptionHelper.dispatchResult(redeemWebPurchaseListener, result);
    }

    public static final /* synthetic */ CustomerInfoUpdateHandler access$getCustomerInfoUpdateHandler$p(WebPurchaseRedemptionHelper webPurchaseRedemptionHelper) {
        return webPurchaseRedemptionHelper.customerInfoUpdateHandler;
    }

    public static final /* synthetic */ OfflineEntitlementsManager access$getOfflineEntitlementsManager$p(WebPurchaseRedemptionHelper webPurchaseRedemptionHelper) {
        return webPurchaseRedemptionHelper.offlineEntitlementsManager;
    }

    private final void dispatch(Qa.a aVar) {
        if (t.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(aVar));
    }

    private static final void dispatch$lambda$1(Qa.a aVar) {
        aVar.invoke();
    }

    private final void dispatchResult(RedeemWebPurchaseListener redeemWebPurchaseListener, RedeemWebPurchaseListener.Result result) {
        dispatch(new 1(redeemWebPurchaseListener, result));
    }

    public final void handleRedeemWebPurchase(WebPurchaseRedemption webPurchaseRedemption, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        t.g(webPurchaseRedemption, "webPurchaseRedemption");
        t.g(redeemWebPurchaseListener, "listener");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Starting web purchase redemption.");
        }
        this.backend.postRedeemWebPurchase(this.identityManager.getCurrentAppUserID(), webPurchaseRedemption.getRedemptionToken$purchases_defaultsBc8Release(), new 2(redeemWebPurchaseListener));
    }

    public /* synthetic */ WebPurchaseRedemptionHelper(Backend backend, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, Handler handler, int i, k kVar) {
        this(backend, identityManager, offlineEntitlementsManager, customerInfoUpdateHandler, (i & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
