package com.revenuecat.purchases;

import Za.B;
import Za.E;
import Za.G;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class APIKeyValidator {

    public enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        GALAXY,
        LEGACY,
        TEST,
        OTHER_PLATFORM
    }

    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        GOOGLE_KEY_GALAXY_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        AMAZON_KEY_GALAXY_STORE,
        GALAXY_KEY_GOOGLE_STORE,
        GALAXY_KEY_AMAZON_STORE,
        LEGACY,
        SIMULATED_STORE,
        OTHER_PLATFORM
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ValidationResult.SIMULATED_STORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        return B.N(str, "goog_", false, 2, (Object) null) ? APIKeyPlatform.GOOGLE : B.N(str, "amzn_", false, 2, (Object) null) ? APIKeyPlatform.AMAZON : B.N(str, "galx_", false, 2, (Object) null) ? APIKeyPlatform.GALAXY : B.N(str, "test_", false, 2, (Object) null) ? APIKeyPlatform.TEST : !E.S(str, '_', false, 2, (Object) null) ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    private final void logValidationResult(ValidationResult validationResult) {
        switch (WhenMappings.$EnumSwitchMapping$0[validationResult.ordinal()]) {
            case 1:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using an Amazon API key but have configured the SDK for the Google play store.\nEither use a Google API key which should look like 'goog_1a2b3c4d5e6f7h' or configure the SDK to use Amazon.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using a Google API key but have configured the SDK for the Amazon app store.\nEither use an Amazon API key which should look like 'amzn_1a2b3c4d5e6f7h' or configure the SDK to use Google.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 3:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using a Galaxy Store API key but have configured the SDK for the Google Play Store.\nEither use a Google API key which should look like 'goog_1a2b3c4d5e6f7h' or configure the SDK to use the Galaxy Store.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 4:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using a Google API key but have configured the SDK for the Galaxy Store.\nEither use a Galaxy Store API key which should look like 'galx_1a2b3c4d5e6f7h' or configure the SDK to use the Play Store.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 5:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using a Galaxy Store API key but have configured the SDK for the Amazon App Store.\nEither use an Amazon API key which should look like 'amzn_1a2b3c4d5e6f7h' or configure the SDK to use the Galaxy Store.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Looks like you're using an Amazon API key but have configured the SDK for the Galaxy Store.\nEither use a Galaxy Store API key which should look like 'galx_1a2b3c4d5e6f7h' or configure the SDK to use Amazon.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 7:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Looks like you're using a legacy API key.\nThis is still supported, but it's recommended to migrate to using platform-specific API key, which should look like 'goog_1a2b3c4d5e6f7h', 'amzn_1a2b3c4d5e6f7h', or 'galx_1a2b3c4d5e6f7h'.\nSee https://rev.cat/auth for more details.");
                    break;
                }
                break;
            case 8:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "The specified API Key is not recognized.\nEnsure that you are using the public app-specific API key, which should look like 'goog_1a2b3c4d5e6f7h', 'amzn_1a2b3c4d5e6f7h', or 'galx_1a2b3c4d5e6f7h'.\nSee https://rev.cat/auth for more details.", null);
                break;
            case 9:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Using a Test Store API key.\nThe Test Store is for development only. Never use a Test Store API key in production. Our SDK will crash if using it in production. Test Store purchases are simulated, do not use Google Play or Amazon store, and generate no revenue. Apps submitted with a Test Store API key will be rejected during App Review.");
                    break;
                }
                break;
        }
    }

    private final ValidationResult validate(String str, Store store) {
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(str);
        if (apiKeyPlatform == APIKeyPlatform.TEST) {
            return ValidationResult.SIMULATED_STORE;
        }
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform3 = APIKeyPlatform.GALAXY;
        return (apiKeyPlatform == aPIKeyPlatform3 && store == Store.GALAXY) ? ValidationResult.VALID : (apiKeyPlatform == aPIKeyPlatform && store == Store.AMAZON) ? ValidationResult.GOOGLE_KEY_AMAZON_STORE : (apiKeyPlatform == aPIKeyPlatform2 && store == Store.PLAY_STORE) ? ValidationResult.AMAZON_KEY_GOOGLE_STORE : (apiKeyPlatform == aPIKeyPlatform && store == Store.GALAXY) ? ValidationResult.GOOGLE_KEY_GALAXY_STORE : (apiKeyPlatform == aPIKeyPlatform3 && store == Store.PLAY_STORE) ? ValidationResult.GALAXY_KEY_GOOGLE_STORE : (apiKeyPlatform == aPIKeyPlatform3 && store == Store.AMAZON) ? ValidationResult.GALAXY_KEY_AMAZON_STORE : (apiKeyPlatform == aPIKeyPlatform2 && store == Store.GALAXY) ? ValidationResult.AMAZON_KEY_GALAXY_STORE : apiKeyPlatform == APIKeyPlatform.LEGACY ? ValidationResult.LEGACY : apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM ? ValidationResult.OTHER_PLATFORM : ValidationResult.OTHER_PLATFORM;
    }

    public final String redactApiKey(String str) {
        String q1;
        String substring;
        t.g(str, "apiKey");
        int e0 = E.e0(str, '_', 0, false, 6, (Object) null);
        if (e0 == -1) {
            q1 = "";
            substring = str;
        } else {
            int i = e0 + 1;
            q1 = G.q1(str, i);
            substring = str.substring(i);
            t.f(substring, "substring(...)");
        }
        if (substring.length() < 6) {
            return str;
        }
        return q1 + G.q1(substring, 2) + "********" + G.r1(substring, 4);
    }

    public final ValidationResult validateAndLog(String str, Store store) {
        t.g(str, "apiKey");
        t.g(store, "configuredStore");
        ValidationResult validate = validate(str, store);
        logValidationResult(validate);
        return validate;
    }
}
