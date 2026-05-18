package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.GetBillingConfigParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GetBillingConfigUseCase extends BillingClientUseCase {
    private final DeviceCache deviceCache;
    private final l onError;
    private final l onReceive;
    private final l withConnectedClient;

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public static /* synthetic */ void a(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, BillingResult billingResult, BillingConfig billingConfig) {
            invoke$lambda$1(atomicBoolean, getBillingConfigUseCase, billingResult, billingConfig);
        }

        private static final void invoke$lambda$1(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase, BillingResult billingResult, BillingConfig billingConfig) {
            LogHandler currentLogHandler;
            String str;
            String str2;
            t.g(billingResult, "result");
            if (!atomicBoolean.getAndSet(true)) {
                BillingClientUseCase.processResult$default(getBillingConfigUseCase, billingResult, billingConfig, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1 = new GetBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1(logIntent, billingResult);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    return;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    return;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    return;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) getBillingConfigUseCase$executeAsync$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    return;
                default:
                    return;
            }
            currentLogHandler.d(str, str2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            t.g(billingClient, "$this$invoke");
            billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new c(new AtomicBoolean(false), GetBillingConfigUseCase.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, DeviceCache deviceCache, l lVar, l lVar2, l lVar3, p pVar) {
        super(getBillingConfigUseCaseParams, lVar2, pVar);
        t.g(getBillingConfigUseCaseParams, "useCaseParams");
        t.g(deviceCache, "deviceCache");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new 1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final l getOnError() {
        return this.onError;
    }

    public final l getOnReceive() {
        return this.onReceive;
    }

    public final l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(BillingConfig billingConfig) {
        if (billingConfig == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, "Billing config is null even though Google return OK result"));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String countryCode = billingConfig.getCountryCode();
        t.f(countryCode, "received.countryCode");
        deviceCache.setStorefront$purchases_defaultsBc8Release(countryCode);
        this.onReceive.invoke(billingConfig);
    }
}
