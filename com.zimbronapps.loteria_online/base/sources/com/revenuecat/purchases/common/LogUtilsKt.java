package com.revenuecat.purchases.common;

import Qa.p;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LogUtilsKt {
    private static final String PURCHASES_LOG_TAG = "[Purchases]";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesErrorCode.values().length];
            try {
                iArr[PurchasesErrorCode.UnknownError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesErrorCode.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PurchasesErrorCode.SignatureVerificationError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PurchasesErrorCode.TestStoreSimulatedPurchaseError.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PurchasesErrorCode.StoreProblemError.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidReceiptError.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PurchasesErrorCode.IneligibleError.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void debugLog(Qa.a aVar) {
        t.g(aVar, "messageBuilder");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) aVar.invoke());
        }
    }

    public static final LogLevel debugLogsEnabled(LogLevel.Companion companion, boolean z) {
        t.g(companion, "<this>");
        return z ? LogLevel.DEBUG : LogLevel.INFO;
    }

    public static final void errorLog(Throwable th, Qa.a aVar) {
        t.g(aVar, "messageBuilder");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) aVar.invoke(), th);
    }

    public static /* synthetic */ void errorLog$default(Throwable th, Qa.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        t.g(aVar, "messageBuilder");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) aVar.invoke(), th);
    }

    public static final boolean getDebugLogsEnabled(LogLevel logLevel) {
        t.g(logLevel, "<this>");
        return logLevel.compareTo(LogLevel.DEBUG) <= 0;
    }

    public static final void infoLog(Qa.a aVar) {
        t.g(aVar, "messageBuilder");
        LogLevel logLevel = LogLevel.INFO;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.i("[Purchases] - " + logLevel.name(), (String) aVar.invoke());
        }
    }

    private static final void logIfEnabled(LogLevel logLevel, p pVar, Qa.a aVar) {
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            pVar.invoke("[Purchases] - " + logLevel.name(), aVar.invoke());
        }
    }

    public static final void verboseLog(Qa.a aVar) {
        t.g(aVar, "messageBuilder");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), (String) aVar.invoke());
        }
    }

    public static final void warnLog(Qa.a aVar) {
        t.g(aVar, "messageBuilder");
        LogLevel logLevel = LogLevel.WARN;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.w("[Purchases] - " + logLevel.name(), (String) aVar.invoke());
        }
    }

    public static final void errorLog(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        switch (WhenMappings.$EnumSwitchMapping$0[purchasesError.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                LogIntent logIntent = LogIntent.RC_ERROR;
                LogUtilsKt$errorLog$$inlined$log$1 logUtilsKt$errorLog$$inlined$log$1 = new LogUtilsKt$errorLog$$inlined$log$1(logIntent, purchasesError);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d("[Purchases] - " + logLevel.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d("[Purchases] - " + logLevel4.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d("[Purchases] - " + logLevel6.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel7.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w("[Purchases] - " + logLevel8.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel9.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w("[Purchases] - " + logLevel10.name(), (String) logUtilsKt$errorLog$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$1.invoke(), null);
                        break;
                }
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                LogUtilsKt$errorLog$$inlined$log$2 logUtilsKt$errorLog$$inlined$log$2 = new LogUtilsKt$errorLog$$inlined$log$2(logIntent2, purchasesError);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel11 = LogLevel.DEBUG;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler11.d("[Purchases] - " + logLevel11.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel12 = LogLevel.WARN;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler12.w("[Purchases] - " + logLevel12.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel13 = LogLevel.INFO;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler13.i("[Purchases] - " + logLevel13.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel14 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel14.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel15 = LogLevel.INFO;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler15.i("[Purchases] - " + logLevel15.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler16.d("[Purchases] - " + logLevel16.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel17 = LogLevel.DEBUG;
                        LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler17.d("[Purchases] - " + logLevel17.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler18.w("[Purchases] - " + logLevel18.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel19 = LogLevel.WARN;
                        LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                            currentLogHandler19.w("[Purchases] - " + logLevel19.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel20 = LogLevel.WARN;
                        LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                            currentLogHandler20.w("[Purchases] - " + logLevel20.name(), (String) logUtilsKt$errorLog$$inlined$log$2.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) logUtilsKt$errorLog$$inlined$log$2.invoke(), null);
                        break;
                }
        }
    }
}
