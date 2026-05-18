package com.revenuecat.purchases.google.history;

import com.revenuecat.purchases.google.ErrorsKt;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHistoryResult {
    private final String continuationToken;
    private final List records;
    private final int responseCode;

    public PurchaseHistoryResult(int i, List list, String str) {
        t.g(list, "records");
        this.responseCode = i;
        this.records = list;
        this.continuationToken = str;
    }

    public static /* synthetic */ PurchaseHistoryResult copy$default(PurchaseHistoryResult purchaseHistoryResult, int i, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = purchaseHistoryResult.responseCode;
        }
        if ((i2 & 2) != 0) {
            list = purchaseHistoryResult.records;
        }
        if ((i2 & 4) != 0) {
            str = purchaseHistoryResult.continuationToken;
        }
        return purchaseHistoryResult.copy(i, list, str);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final List component2() {
        return this.records;
    }

    public final String component3() {
        return this.continuationToken;
    }

    public final PurchaseHistoryResult copy(int i, List list, String str) {
        t.g(list, "records");
        return new PurchaseHistoryResult(i, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
        return this.responseCode == purchaseHistoryResult.responseCode && t.c(this.records, purchaseHistoryResult.records) && t.c(this.continuationToken, purchaseHistoryResult.continuationToken);
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List getRecords() {
        return this.records;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseCodeString() {
        return ErrorsKt.getBillingResponseCodeName(this.responseCode);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.responseCode) * 31) + this.records.hashCode()) * 31;
        String str = this.continuationToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSuccess() {
        return this.responseCode == 0;
    }

    public String toString() {
        return "PurchaseHistoryResult(responseCode=" + this.responseCode + ", records=" + this.records + ", continuationToken=" + this.continuationToken + ')';
    }
}
