package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesTransactionException extends PurchasesException {
    private final boolean userCancelled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionException(PurchasesError purchasesError, boolean z) {
        super(purchasesError);
        t.g(purchasesError, "purchasesError");
        this.userCancelled = z;
    }

    public final boolean getUserCancelled() {
        return this.userCancelled;
    }
}
