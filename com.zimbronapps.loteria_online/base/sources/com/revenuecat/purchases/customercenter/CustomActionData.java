package com.revenuecat.purchases.customercenter;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomActionData {
    private final String actionIdentifier;
    private final String purchaseIdentifier;

    public CustomActionData(String str, String str2) {
        t.g(str, "actionIdentifier");
        this.actionIdentifier = str;
        this.purchaseIdentifier = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomActionData)) {
            return false;
        }
        CustomActionData customActionData = (CustomActionData) obj;
        return t.c(this.actionIdentifier, customActionData.actionIdentifier) && t.c(this.purchaseIdentifier, customActionData.purchaseIdentifier);
    }

    public final String getActionIdentifier() {
        return this.actionIdentifier;
    }

    public final String getPurchaseIdentifier() {
        return this.purchaseIdentifier;
    }

    public int hashCode() {
        int hashCode = this.actionIdentifier.hashCode() * 31;
        String str = this.purchaseIdentifier;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomActionData(actionIdentifier=" + this.actionIdentifier + ", purchaseIdentifier=" + this.purchaseIdentifier + ')';
    }
}
