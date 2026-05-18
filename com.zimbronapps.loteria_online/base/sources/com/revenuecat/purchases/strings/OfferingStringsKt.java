package com.revenuecat.purchases.strings;

import Ca.o;
import com.revenuecat.purchases.APIKeyValidator;
import com.revenuecat.purchases.Store;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingStringsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[APIKeyValidator.ValidationResult.values().length];
            try {
                iArr2[APIKeyValidator.ValidationResult.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.SIMULATED_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.GOOGLE_KEY_GALAXY_STORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.GALAXY_KEY_GOOGLE_STORE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.GALAXY_KEY_AMAZON_STORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[APIKeyValidator.ValidationResult.AMAZON_KEY_GALAXY_STORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ String access$indefiniteArticle(APIKeyValidator.ValidationResult validationResult, Store store) {
        return indefiniteArticle(validationResult, store);
    }

    public static final /* synthetic */ String access$storeNameForLogging(APIKeyValidator.ValidationResult validationResult, Store store) {
        return storeNameForLogging(validationResult, store);
    }

    private static final String indefiniteArticle(APIKeyValidator.ValidationResult validationResult, Store store) {
        switch (WhenMappings.$EnumSwitchMapping$1[validationResult.ordinal()]) {
            case 1:
                int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
                return (i == 1 || i != 2) ? "a" : "an";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "a";
            default:
                throw new o();
        }
    }

    private static final String storeNameForLogging(APIKeyValidator.ValidationResult validationResult, Store store) {
        switch (WhenMappings.$EnumSwitchMapping$1[validationResult.ordinal()]) {
            case 1:
                int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
                if (i == 1) {
                    return "Play Store";
                }
                if (i == 2) {
                    return "Amazon Appstore";
                }
                if (i == 3) {
                    return "Galaxy Store";
                }
                break;
            case 2:
                return "Play Store";
            case 3:
                return "Test Store";
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                throw new o();
        }
        return null;
    }
}
