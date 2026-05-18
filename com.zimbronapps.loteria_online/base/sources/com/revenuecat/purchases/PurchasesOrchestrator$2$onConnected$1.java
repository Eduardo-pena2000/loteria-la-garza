package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$2$onConnected$1 extends u implements Qa.l {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$2$onConnected$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String str) {
        t.g(str, "countryCode");
        PurchasesOrchestrator.access$setStorefrontCountryCode$p(this.this$0, str);
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str2 = "[Purchases] - " + logLevel.name();
            String format = String.format("Billing connected with country code: %s", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format, "format(...)");
            currentLogHandler.d(str2, format);
        }
    }
}
