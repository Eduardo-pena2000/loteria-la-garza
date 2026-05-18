package com.revenuecat.purchases.google.history;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHistoryManager$connect$4$1$1 extends u implements l {
    final /* synthetic */ PurchaseHistoryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHistoryManager$connect$4$1$1(PurchaseHistoryManager purchaseHistoryManager) {
        super(1);
        this.this$0 = purchaseHistoryManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.a;
    }

    public final void invoke(Throwable th) {
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Connection cancelled, cleaning up service if needed");
        }
        PurchaseHistoryManager.access$cleanup(this.this$0);
    }
}
