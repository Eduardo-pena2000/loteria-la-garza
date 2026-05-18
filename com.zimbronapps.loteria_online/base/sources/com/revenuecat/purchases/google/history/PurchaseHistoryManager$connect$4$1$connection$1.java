package com.revenuecat.purchases.google.history;

import Ca.s;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import cb.n;
import com.android.vending.billing.IInAppBillingService;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHistoryManager$connect$4$1$connection$1 implements ServiceConnection {
    final /* synthetic */ n $continuation;
    final /* synthetic */ PurchaseHistoryManager this$0;

    public PurchaseHistoryManager$connect$4$1$connection$1(n nVar, PurchaseHistoryManager purchaseHistoryManager) {
        this.$continuation = nVar;
        this.this$0 = purchaseHistoryManager;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        Config config = Config.INSTANCE;
        if (config.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "AIDL Billing service connected");
        }
        if (this.$continuation.isActive()) {
            PurchaseHistoryManager.access$setBillingService$p(this.this$0, IInAppBillingService.Stub.asInterface(iBinder));
            PurchaseHistoryManager.access$setServiceConnection$p(this.this$0, this);
            n nVar = this.$continuation;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(Boolean.TRUE));
            return;
        }
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (config.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler2.d("[Purchases] - " + logLevel.name(), "AIDL Billing service connected after cancellation, cleaning up");
        }
        PurchaseHistoryManager.access$cleanup(this.this$0);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "AIDL Billing service disconnected");
        }
        PurchaseHistoryManager.access$cleanup(this.this$0);
    }
}
