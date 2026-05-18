package com.revenuecat.purchases;

import com.revenuecat.purchases.utils.Result;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class CustomerInfoDataResult {
    private final Boolean hadUnsyncedPurchasesBefore;
    private final Result result;

    public CustomerInfoDataResult(Result result, Boolean bool) {
        t.g(result, "result");
        this.result = result;
        this.hadUnsyncedPurchasesBefore = bool;
    }

    public static /* synthetic */ CustomerInfoDataResult copy$default(CustomerInfoDataResult customerInfoDataResult, Result result, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            result = customerInfoDataResult.result;
        }
        if ((i & 2) != 0) {
            bool = customerInfoDataResult.hadUnsyncedPurchasesBefore;
        }
        return customerInfoDataResult.copy(result, bool);
    }

    public final Result component1() {
        return this.result;
    }

    public final Boolean component2() {
        return this.hadUnsyncedPurchasesBefore;
    }

    public final CustomerInfoDataResult copy(Result result, Boolean bool) {
        t.g(result, "result");
        return new CustomerInfoDataResult(result, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerInfoDataResult)) {
            return false;
        }
        CustomerInfoDataResult customerInfoDataResult = (CustomerInfoDataResult) obj;
        return t.c(this.result, customerInfoDataResult.result) && t.c(this.hadUnsyncedPurchasesBefore, customerInfoDataResult.hadUnsyncedPurchasesBefore);
    }

    public final Boolean getHadUnsyncedPurchasesBefore() {
        return this.hadUnsyncedPurchasesBefore;
    }

    public final Result getResult() {
        return this.result;
    }

    public int hashCode() {
        int hashCode = this.result.hashCode() * 31;
        Boolean bool = this.hadUnsyncedPurchasesBefore;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CustomerInfoDataResult(result=" + this.result + ", hadUnsyncedPurchasesBefore=" + this.hadUnsyncedPurchasesBefore + ')';
    }

    public /* synthetic */ CustomerInfoDataResult(Result result, Boolean bool, int i, kotlin.jvm.internal.k kVar) {
        this(result, (i & 2) != 0 ? null : bool);
    }
}
