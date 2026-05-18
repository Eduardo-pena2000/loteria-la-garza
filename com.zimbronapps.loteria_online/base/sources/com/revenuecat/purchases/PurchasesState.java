package com.revenuecat.purchases;

import Da.S;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import java.util.Map;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    public static /* synthetic */ PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        if ((i & 8) != 0) {
            z = purchasesState.appInBackground;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = purchasesState.firstTimeInForeground;
        }
        return purchasesState.copy(bool, map2, productChangeCallback2, z3, z2);
    }

    public final Boolean component1() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map component2() {
        return this.purchaseCallbacksByProductId;
    }

    public final ProductChangeCallback component3() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final boolean component5() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2) {
        t.g(map, "purchaseCallbacksByProductId");
        return new PurchasesState(bool, map, productChangeCallback, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) obj;
        return t.c(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && t.c(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && t.c(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int hashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.purchaseCallbacksByProductId.hashCode()) * 31;
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        return ((((hashCode + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31) + Boolean.hashCode(this.appInBackground)) * 31) + Boolean.hashCode(this.firstTimeInForeground);
    }

    public String toString() {
        return "PurchasesState(allowSharingPlayStoreAccount=" + this.allowSharingPlayStoreAccount + ", purchaseCallbacksByProductId=" + this.purchaseCallbacksByProductId + ", deprecatedProductChangeCallback=" + this.deprecatedProductChangeCallback + ", appInBackground=" + this.appInBackground + ", firstTimeInForeground=" + this.firstTimeInForeground + ')';
    }

    public PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2) {
        t.g(map, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = map;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z;
        this.firstTimeInForeground = z2;
    }

    public /* synthetic */ PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? S.h() : map, (i & 4) == 0 ? productChangeCallback : null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
    }
}
