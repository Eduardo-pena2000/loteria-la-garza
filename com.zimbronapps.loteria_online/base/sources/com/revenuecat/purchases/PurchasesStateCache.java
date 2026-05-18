package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesStateCache implements PurchasesStateProvider {
    private PurchasesState purchasesState;

    public PurchasesStateCache(PurchasesState purchasesState) {
        t.g(purchasesState, "purchasesState");
        this.purchasesState = purchasesState;
    }

    public static /* synthetic */ PurchasesStateCache copy$default(PurchasesStateCache purchasesStateCache, PurchasesState purchasesState, int i, Object obj) {
        if ((i & 1) != 0) {
            purchasesState = purchasesStateCache.purchasesState;
        }
        return purchasesStateCache.copy(purchasesState);
    }

    public final PurchasesState component1() {
        return this.purchasesState;
    }

    public final PurchasesStateCache copy(PurchasesState purchasesState) {
        t.g(purchasesState, "purchasesState");
        return new PurchasesStateCache(purchasesState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasesStateCache) && t.c(this.purchasesState, ((PurchasesStateCache) obj).purchasesState);
    }

    public synchronized PurchasesState getPurchasesState() {
        return this.purchasesState;
    }

    public int hashCode() {
        return this.purchasesState.hashCode();
    }

    public synchronized void setPurchasesState(PurchasesState purchasesState) {
        t.g(purchasesState, "<set-?>");
        this.purchasesState = purchasesState;
    }

    public String toString() {
        return "PurchasesStateCache(purchasesState=" + this.purchasesState + ')';
    }
}
