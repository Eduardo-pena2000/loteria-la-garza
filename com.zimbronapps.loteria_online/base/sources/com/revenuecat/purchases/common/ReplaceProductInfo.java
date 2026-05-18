package com.revenuecat.purchases.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ReplaceProductInfo {
    private final StoreTransaction oldPurchase;
    private final ReplacementMode replacementMode;

    public ReplaceProductInfo(StoreTransaction storeTransaction, ReplacementMode replacementMode) {
        t.g(storeTransaction, "oldPurchase");
        this.oldPurchase = storeTransaction;
        this.replacementMode = replacementMode;
    }

    public static /* synthetic */ ReplaceProductInfo copy$default(ReplaceProductInfo replaceProductInfo, StoreTransaction storeTransaction, ReplacementMode replacementMode, int i, Object obj) {
        if ((i & 1) != 0) {
            storeTransaction = replaceProductInfo.oldPurchase;
        }
        if ((i & 2) != 0) {
            replacementMode = replaceProductInfo.replacementMode;
        }
        return replaceProductInfo.copy(storeTransaction, replacementMode);
    }

    public final StoreTransaction component1() {
        return this.oldPurchase;
    }

    public final ReplacementMode component2() {
        return this.replacementMode;
    }

    public final ReplaceProductInfo copy(StoreTransaction storeTransaction, ReplacementMode replacementMode) {
        t.g(storeTransaction, "oldPurchase");
        return new ReplaceProductInfo(storeTransaction, replacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceProductInfo)) {
            return false;
        }
        ReplaceProductInfo replaceProductInfo = (ReplaceProductInfo) obj;
        return t.c(this.oldPurchase, replaceProductInfo.oldPurchase) && t.c(this.replacementMode, replaceProductInfo.replacementMode);
    }

    public final StoreTransaction getOldPurchase() {
        return this.oldPurchase;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        int hashCode = this.oldPurchase.hashCode() * 31;
        ReplacementMode replacementMode = this.replacementMode;
        return hashCode + (replacementMode == null ? 0 : replacementMode.hashCode());
    }

    public String toString() {
        return "ReplaceProductInfo(oldPurchase=" + this.oldPurchase + ", replacementMode=" + this.replacementMode + ')';
    }

    public /* synthetic */ ReplaceProductInfo(StoreTransaction storeTransaction, ReplacementMode replacementMode, int i, k kVar) {
        this(storeTransaction, (i & 2) != 0 ? null : replacementMode);
    }
}
