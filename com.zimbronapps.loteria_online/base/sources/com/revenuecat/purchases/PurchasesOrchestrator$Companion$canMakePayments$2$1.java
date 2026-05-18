package com.revenuecat.purchases;

import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements BillingClientStateListener {
    final /* synthetic */ BillingClient $billingClient;
    final /* synthetic */ Callback $callback;
    final /* synthetic */ List $features;
    final /* synthetic */ AtomicBoolean $hasResponded;
    final /* synthetic */ Handler $mainHandler;

    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, AtomicBoolean atomicBoolean, Callback callback, BillingClient billingClient, List list) {
        this.$mainHandler = handler;
        this.$hasResponded = atomicBoolean;
        this.$callback = callback;
        this.$billingClient = billingClient;
        this.$features = list;
    }

    public static /* synthetic */ void a(AtomicBoolean atomicBoolean, BillingResult billingResult, Callback callback, BillingClient billingClient, List list) {
        onBillingSetupFinished$lambda$3(atomicBoolean, billingResult, callback, billingClient, list);
    }

    public static /* synthetic */ void b(BillingClient billingClient, AtomicBoolean atomicBoolean, Callback callback) {
        onBillingServiceDisconnected$lambda$6(billingClient, atomicBoolean, callback);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void onBillingServiceDisconnected$lambda$6(BillingClient billingClient, AtomicBoolean atomicBoolean, Callback callback) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogHandler currentLogHandler2;
        String str3;
        String str4;
        try {
            try {
                billingClient.endConnection();
            } catch (IllegalArgumentException e) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2(logIntent, e);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler3.d("[Purchases] - " + logLevel.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler4.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel4.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler7.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel6.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler9.d("[Purchases] - " + logLevel7.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler11.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler12.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$2.invoke(), null);
                        break;
                }
                if (atomicBoolean.getAndSet(true)) {
                    LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                    PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3(logIntent2);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel11 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                str3 = "[Purchases] - " + logLevel11.name();
                                str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke();
                                break;
                            } else {
                                return;
                            }
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke(), null);
                            return;
                        case 3:
                            LogLevel logLevel12 = LogLevel.WARN;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler13.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 4:
                            LogLevel logLevel13 = LogLevel.INFO;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler14.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 5:
                            LogLevel logLevel14 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                str3 = "[Purchases] - " + logLevel14.name();
                                str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke();
                                break;
                            } else {
                                return;
                            }
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke(), null);
                            return;
                        case 7:
                            LogLevel logLevel15 = LogLevel.INFO;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler15.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 8:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                str3 = "[Purchases] - " + logLevel16.name();
                                str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke();
                                break;
                            } else {
                                return;
                            }
                        case 9:
                            LogLevel logLevel17 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                str3 = "[Purchases] - " + logLevel17.name();
                                str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke();
                                break;
                            } else {
                                return;
                            }
                        case 10:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 11:
                            LogLevel logLevel19 = LogLevel.WARN;
                            LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke(), null);
                            return;
                        case 13:
                            LogLevel logLevel20 = LogLevel.WARN;
                            LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler18.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke());
                                return;
                            }
                            return;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$3.invoke(), null);
                            return;
                        default:
                            return;
                    }
                }
            }
            if (atomicBoolean.getAndSet(true)) {
                LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
                PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1(logIntent3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                    case 1:
                        LogLevel logLevel21 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                            str3 = "[Purchases] - " + logLevel21.name();
                            str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 3:
                        LogLevel logLevel22 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 4:
                        LogLevel logLevel23 = LogLevel.INFO;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                            currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 5:
                        LogLevel logLevel24 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                            str3 = "[Purchases] - " + logLevel24.name();
                            str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 7:
                        LogLevel logLevel25 = LogLevel.INFO;
                        LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                            currentLogHandler21.i("[Purchases] - " + logLevel25.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 8:
                        LogLevel logLevel26 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                            str3 = "[Purchases] - " + logLevel26.name();
                            str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        LogLevel logLevel27 = LogLevel.DEBUG;
                        currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                            str3 = "[Purchases] - " + logLevel27.name();
                            str4 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke();
                            break;
                        } else {
                            return;
                        }
                    case 10:
                        LogLevel logLevel28 = LogLevel.WARN;
                        LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                            currentLogHandler22.w("[Purchases] - " + logLevel28.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 11:
                        LogLevel logLevel29 = LogLevel.WARN;
                        LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                            currentLogHandler23.w("[Purchases] - " + logLevel29.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    case 13:
                        LogLevel logLevel30 = LogLevel.WARN;
                        LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                            currentLogHandler24.w("[Purchases] - " + logLevel30.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke());
                            return;
                        }
                        return;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1.invoke(), null);
                        return;
                    default:
                        return;
                }
                currentLogHandler2.d(str3, str4);
                return;
            }
            callback.onReceived(Boolean.FALSE);
        } catch (Throwable th) {
            if (atomicBoolean.getAndSet(true)) {
                LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
                PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4(logIntent4);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                    case 1:
                        LogLevel logLevel31 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                            str = "[Purchases] - " + logLevel31.name();
                            str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel32 = LogLevel.WARN;
                        LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                            currentLogHandler25.w("[Purchases] - " + logLevel32.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel33 = LogLevel.INFO;
                        LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                            currentLogHandler26.i("[Purchases] - " + logLevel33.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel34 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                            str = "[Purchases] - " + logLevel34.name();
                            str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel35 = LogLevel.INFO;
                        LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                            currentLogHandler27.i("[Purchases] - " + logLevel35.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel36 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                            str = "[Purchases] - " + logLevel36.name();
                            str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel37 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                            str = "[Purchases] - " + logLevel37.name();
                            str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel38 = LogLevel.WARN;
                        LogHandler currentLogHandler28 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                            currentLogHandler28.w("[Purchases] - " + logLevel38.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel39 = LogLevel.WARN;
                        LogHandler currentLogHandler29 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                            currentLogHandler29.w("[Purchases] - " + logLevel39.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel40 = LogLevel.WARN;
                        LogHandler currentLogHandler30 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                            currentLogHandler30.w("[Purchases] - " + logLevel40.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$4.invoke(), null);
                        break;
                }
            } else {
                callback.onReceived(Boolean.FALSE);
            }
            throw th;
        }
    }

    private static final void onBillingSetupFinished$lambda$3(AtomicBoolean atomicBoolean, BillingResult billingResult, Callback callback, BillingClient billingClient, List list) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        boolean z = true;
        if (atomicBoolean.getAndSet(true)) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1(logIntent, billingResult);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke(), null);
                    return;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke(), null);
                    return;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke();
                        break;
                    } else {
                        return;
                    }
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke(), null);
                    return;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke());
                        return;
                    }
                    return;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1.invoke(), null);
                    return;
                default:
                    return;
            }
            currentLogHandler.d(str, str2);
            return;
        }
        try {
            if (!BillingResultExtensionsKt.isSuccessful(billingResult)) {
                callback.onReceived(Boolean.FALSE);
                billingClient.endConnection();
                return;
            }
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BillingResult isFeatureSupported = billingClient.isFeatureSupported(((BillingFeature) it.next()).getPlayBillingClientName());
                    t.f(isFeatureSupported, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(isFeatureSupported)) {
                        z = false;
                        break;
                    }
                }
            }
            billingClient.endConnection();
            callback.onReceived(Boolean.valueOf(z));
        } catch (IllegalArgumentException e) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2 purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2 = new PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2(logIntent2, e);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) purchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$2.invoke(), null);
                    break;
            }
            callback.onReceived(Boolean.FALSE);
        }
    }

    public void onBillingServiceDisconnected() {
        this.$mainHandler.post(new k(this.$billingClient, this.$hasResponded, this.$callback));
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        t.g(billingResult, "billingResult");
        this.$mainHandler.post(new l(this.$hasResponded, billingResult, this.$callback, this.$billingClient, this.$features));
    }
}
