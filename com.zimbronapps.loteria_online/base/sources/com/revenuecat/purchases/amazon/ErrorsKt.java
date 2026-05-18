package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError purchasesError) {
        t.g(purchasesError, "error");
        return new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + purchasesError);
    }

    public static final PurchasesError missingTermSkuError(JSONObject jSONObject) {
        t.g(jSONObject, "response");
        return new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + jSONObject);
    }
}
