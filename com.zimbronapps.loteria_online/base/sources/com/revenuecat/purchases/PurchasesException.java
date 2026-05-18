package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class PurchasesException extends Exception {
    private final PurchasesError error;
    private final String overridenMessage;

    public /* synthetic */ PurchasesException(PurchasesError purchasesError, String str, int i, kotlin.jvm.internal.k kVar) {
        this(purchasesError, (i & 2) != 0 ? null : str);
    }

    public final PurchasesErrorCode getCode() {
        return this.error.getCode();
    }

    public final PurchasesError getError() {
        return this.error;
    }

    public String getMessage() {
        String str = this.overridenMessage;
        return str == null ? this.error.getMessage() : str;
    }

    public final String getOverridenMessage$purchases_defaultsBc8Release() {
        return this.overridenMessage;
    }

    public final String getUnderlyingErrorMessage() {
        return this.error.getUnderlyingErrorMessage();
    }

    public PurchasesException(PurchasesError purchasesError, String str) {
        t.g(purchasesError, "error");
        this.error = purchasesError;
        this.overridenMessage = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchasesException(PurchasesError purchasesError) {
        this(purchasesError, null);
        t.g(purchasesError, "error");
    }
}
