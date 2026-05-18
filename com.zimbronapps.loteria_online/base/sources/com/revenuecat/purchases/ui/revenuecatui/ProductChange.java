package com.revenuecat.purchases.ui.revenuecatui;

import com.revenuecat.purchases.ReplacementMode;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductChange {
    public static final int $stable = 8;
    private final String oldProductId;
    private final ReplacementMode replacementMode;

    public ProductChange(String oldProductId, ReplacementMode replacementMode) {
        t.g(oldProductId, "oldProductId");
        this.oldProductId = oldProductId;
        this.replacementMode = replacementMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChange)) {
            return false;
        }
        ProductChange productChange = (ProductChange) obj;
        return t.c(this.oldProductId, productChange.oldProductId) && t.c(this.replacementMode, productChange.replacementMode);
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        int hashCode = this.oldProductId.hashCode() * 31;
        ReplacementMode replacementMode = this.replacementMode;
        return hashCode + (replacementMode == null ? 0 : replacementMode.hashCode());
    }

    public String toString() {
        return "ProductChange(oldProductId=" + this.oldProductId + ", replacementMode=" + this.replacementMode + ')';
    }
}
