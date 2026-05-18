package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2 extends u implements Qa.l {
    final /* synthetic */ Qa.l $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2(Qa.l lVar) {
        super(1);
        this.$callback = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return I.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(purchasesError, "error");
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1(logIntent, purchasesError);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$2$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        Qa.l lVar = this.$callback;
        if (lVar != null) {
            lVar.invoke(new SyncPendingPurchaseResult.Error(purchasesError));
        }
    }
}
