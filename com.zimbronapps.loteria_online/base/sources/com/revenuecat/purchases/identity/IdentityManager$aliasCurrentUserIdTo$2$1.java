package com.revenuecat.purchases.identity;

import Ca.I;
import Ca.s;
import Ga.e;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IdentityManager$aliasCurrentUserIdTo$2$1 extends u implements Qa.a {
    final /* synthetic */ e $continuation;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ String $oldAppUserID;
    final /* synthetic */ IdentityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$aliasCurrentUserIdTo$2$1(IdentityManager identityManager, e eVar, String str, String str2) {
        super(0);
        this.this$0 = identityManager;
        this.$continuation = eVar;
        this.$newAppUserID = str;
        this.$oldAppUserID = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        IdentityManager identityManager = this.this$0;
        String str3 = this.$newAppUserID;
        String str4 = this.$oldAppUserID;
        synchronized (identityManager) {
            try {
                LogIntent logIntent = LogIntent.USER;
                IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1 identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1 = new IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1(logIntent, str4, str3);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) identityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                        break;
                }
                IdentityManager.access$getOfferingsCache$p(identityManager).clearCache();
                IdentityManager.access$getDeviceCache$p(identityManager).clearCustomerInfoCache$purchases_defaultsBc8Release(str3);
                IdentityManager.access$getOfflineEntitlementsManager$p(identityManager).resetOfflineCustomerInfoCache();
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = this.$continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(I.a));
    }
}
