package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ErrorsKt {
    public static final String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";

    public static final PurchasesError billingResponseToPurchasesError(int i, String str) {
        PurchasesErrorCode purchasesErrorCode;
        t.g(str, "underlyingErrorMessage");
        if (i != 12) {
            switch (i) {
                case -3:
                case -1:
                case 2:
                case 6:
                    purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                    break;
                case -2:
                case 3:
                case 8:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseNotAllowedError;
                    break;
                case 0:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
                case 1:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseCancelledError;
                    break;
                case 4:
                    purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                    break;
                case 5:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                    break;
                case 7:
                    purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
                    break;
                default:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
            }
        } else {
            purchasesErrorCode = PurchasesErrorCode.NetworkError;
        }
        return new PurchasesError(purchasesErrorCode, str);
    }

    public static final String getBillingResponseCodeName(int i) {
        if (i == 12) {
            return "NETWORK_ERROR";
        }
        switch (i) {
            case -3:
                return "SERVICE_TIMEOUT";
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return "UNKNOWN_BILLING_RESPONSE_CODE (" + i + ')';
        }
    }
}
