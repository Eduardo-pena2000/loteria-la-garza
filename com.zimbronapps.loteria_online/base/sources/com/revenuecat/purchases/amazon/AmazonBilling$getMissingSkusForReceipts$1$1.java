package com.revenuecat.purchases.amazon;

import Ca.I;
import Qa.l;
import Qa.p;
import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Map;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$1 extends u implements l {
    final /* synthetic */ Map $errorMap;
    final /* synthetic */ p $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ M $receiptsLeft;
    final /* synthetic */ Map $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$1(Map map, Receipt receipt, M m, AmazonBilling amazonBilling, p pVar, Map map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = m;
        this.this$0 = amazonBilling;
        this.$onCompletion = pVar;
        this.$errorMap = map2;
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
        AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1 = new AmazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1(logIntent, jSONObject);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$getMissingSkusForReceipts$1$1$invoke$$inlined$log$1.invoke(), null);
                break;
        }
        Map map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        t.f(receiptId, "receipt.receiptId");
        Object obj = jSONObject.get("termSku");
        t.e(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        M m = this.$receiptsLeft;
        int i = m.a - 1;
        m.a = i;
        if (i == 0) {
            AmazonBilling.access$getCache$p(this.this$0).cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
