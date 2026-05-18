package com.revenuecat.purchases.ui.revenuecatui.data;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductChangeInfo {
    public static final int $stable = 0;
    private final String oldProductId;
    private final GoogleReplacementMode replacementMode;

    public ProductChangeInfo(String oldProductId, GoogleReplacementMode replacementMode) {
        t.g(oldProductId, "oldProductId");
        t.g(replacementMode, "replacementMode");
        this.oldProductId = oldProductId;
        this.replacementMode = replacementMode;
    }

    public static /* synthetic */ ProductChangeInfo copy$default(ProductChangeInfo productChangeInfo, String str, GoogleReplacementMode googleReplacementMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productChangeInfo.oldProductId;
        }
        if ((i & 2) != 0) {
            googleReplacementMode = productChangeInfo.replacementMode;
        }
        return productChangeInfo.copy(str, googleReplacementMode);
    }

    public final String component1() {
        return this.oldProductId;
    }

    public final GoogleReplacementMode component2() {
        return this.replacementMode;
    }

    public final ProductChangeInfo copy(String oldProductId, GoogleReplacementMode replacementMode) {
        t.g(oldProductId, "oldProductId");
        t.g(replacementMode, "replacementMode");
        return new ProductChangeInfo(oldProductId, replacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChangeInfo)) {
            return false;
        }
        ProductChangeInfo productChangeInfo = (ProductChangeInfo) obj;
        return t.c(this.oldProductId, productChangeInfo.oldProductId) && this.replacementMode == productChangeInfo.replacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final GoogleReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        return (this.oldProductId.hashCode() * 31) + this.replacementMode.hashCode();
    }

    public String toString() {
        return "ProductChangeInfo(oldProductId=" + this.oldProductId + ", replacementMode=" + this.replacementMode + ')';
    }
}
