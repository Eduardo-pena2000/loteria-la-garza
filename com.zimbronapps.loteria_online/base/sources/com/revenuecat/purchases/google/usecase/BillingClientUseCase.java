package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class BillingClientUseCase {
    private final boolean backoffForNetworkErrors;
    private final p executeRequestOnUIThread;
    private final int maxRetries;
    private final l onError;
    private int retryAttempt;
    private long retryBackoff;
    private final UseCaseParams useCaseParams;

    public /* synthetic */ class 1 extends q implements l {
        public 1(Object obj) {
            super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(obj);
            return I.a;
        }

        public final void invoke(Object obj) {
            ((BillingClientUseCase) ((kotlin.jvm.internal.f) this).receiver).onOk(obj);
        }
    }

    public /* synthetic */ class 2 extends q implements l {
        public 2(Object obj) {
            super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingResult) obj);
            return I.a;
        }

        public final void invoke(BillingResult billingResult) {
            t.g(billingResult, "p0");
            BillingClientUseCase.access$forwardError((BillingClientUseCase) ((kotlin.jvm.internal.f) this).receiver, billingResult);
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingClientUseCase.this.executeAsync();
            } else {
                BillingClientUseCase.access$getOnError$p(BillingClientUseCase.this).invoke(purchasesError);
            }
        }
    }

    public BillingClientUseCase(UseCaseParams useCaseParams, l lVar, p pVar) {
        t.g(useCaseParams, "useCaseParams");
        t.g(lVar, "onError");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onError = lVar;
        this.executeRequestOnUIThread = pVar;
        this.maxRetries = 3;
        this.retryBackoff = BillingClientUseCaseKt.access$getRETRY_TIMER_START$p();
    }

    public static final /* synthetic */ void access$forwardError(BillingClientUseCase billingClientUseCase, BillingResult billingResult) {
        billingClientUseCase.forwardError(billingResult);
    }

    public static final /* synthetic */ l access$getOnError$p(BillingClientUseCase billingClientUseCase) {
        return billingClientUseCase.onError;
    }

    public static final /* synthetic */ String access$getStackTrace(BillingClientUseCase billingClientUseCase) {
        return billingClientUseCase.getStackTrace();
    }

    public static final /* synthetic */ UseCaseParams access$getUseCaseParams$p(BillingClientUseCase billingClientUseCase) {
        return billingClientUseCase.useCaseParams;
    }

    private final void backoffOrErrorIfServiceUnavailable(l lVar, BillingResult billingResult) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1 = new BillingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$backoffOrErrorIfServiceUnavailable$$inlined$log$1.invoke(), null);
                break;
        }
        if (ab.b.h(this.retryBackoff, this.useCaseParams.getAppInBackground() ? BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME() : BillingClientUseCaseKt.getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND()) < 0) {
            retryWithBackoff();
        } else {
            lVar.invoke(billingResult);
        }
    }

    private final void backoffOrRetryNetworkError(l lVar, BillingResult billingResult) {
        int i;
        if (getBackoffForNetworkErrors() && ab.b.h(this.retryBackoff, BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME()) < 0) {
            retryWithBackoff();
        } else if (getBackoffForNetworkErrors() || (i = this.retryAttempt) >= this.maxRetries) {
            lVar.invoke(billingResult);
        } else {
            this.retryAttempt = i + 1;
            executeAsync();
        }
    }

    private final void forwardError(BillingResult billingResult) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        String str3 = getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$forwardError$$inlined$log$1 billingClientUseCase$forwardError$$inlined$log$1 = new BillingClientUseCase$forwardError$$inlined$log$1(logIntent, str3);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingClientUseCase$forwardError$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingClientUseCase$forwardError$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$forwardError$$inlined$log$1.invoke(), null);
                break;
        }
        l lVar = this.onError;
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.getResponseCode(), str3);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        lVar.invoke(billingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        t.f(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, BillingResult billingResult, Object obj, l lVar, l lVar2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
        }
        if ((i & 4) != 0) {
            lVar = new 1(billingClientUseCase);
        }
        if ((i & 8) != 0) {
            lVar2 = new 2(billingClientUseCase);
        }
        billingClientUseCase.processResult(billingResult, obj, lVar, lVar2);
    }

    private final void retryWithBackoff() {
        long j = this.retryBackoff;
        this.retryBackoff = DurationExtensionsKt.min-QTBD994(ab.b.G(j, 2), BillingClientUseCaseKt.getRETRY_TIMER_MAX_TIME());
        run(ab.b.q(j));
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        billingClientUseCase.run(j);
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final p getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(Object obj);

    public final void processResult(BillingResult billingResult, Object obj, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(billingResult, "billingResult");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        BillingResponse fromCode = BillingResponse.Companion.fromCode(billingResult.getResponseCode());
        if (t.c(fromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoff = BillingClientUseCaseKt.access$getRETRY_TIMER_START$p();
            lVar.invoke(obj);
            return;
        }
        if (!t.c(fromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            if (t.c(fromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
                backoffOrErrorIfServiceUnavailable(lVar2, billingResult);
                return;
            }
            if (t.c(fromCode, BillingResponse.NetworkError.INSTANCE) ? true : t.c(fromCode, BillingResponse.Error.INSTANCE)) {
                backoffOrRetryNetworkError(lVar2, billingResult);
                return;
            } else {
                lVar2.invoke(billingResult);
                return;
            }
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingClientUseCase$processResult$$inlined$log$1 billingClientUseCase$processResult$$inlined$log$1 = new BillingClientUseCase$processResult$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) billingClientUseCase$processResult$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) billingClientUseCase$processResult$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingClientUseCase$processResult$$inlined$log$1.invoke(), null);
                break;
        }
        run$default(this, 0L, 1, null);
    }

    public final void run(long j) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j), new 1());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void withConnectedClient(com.android.billingclient.api.BillingClient r4, Qa.l r5) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.usecase.BillingClientUseCase.withConnectedClient(com.android.billingclient.api.BillingClient, Qa.l):void");
    }
}
