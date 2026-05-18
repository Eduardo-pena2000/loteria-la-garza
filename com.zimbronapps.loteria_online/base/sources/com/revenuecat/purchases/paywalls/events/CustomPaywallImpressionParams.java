package com.revenuecat.purchases.paywalls.events;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomPaywallImpressionParams {
    private final String offeringId;
    private final String paywallId;

    public CustomPaywallImpressionParams() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomPaywallImpressionParams)) {
            return false;
        }
        CustomPaywallImpressionParams customPaywallImpressionParams = (CustomPaywallImpressionParams) obj;
        return t.c(this.paywallId, customPaywallImpressionParams.paywallId) && t.c(this.offeringId, customPaywallImpressionParams.offeringId);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getPaywallId() {
        return this.paywallId;
    }

    public int hashCode() {
        String str = this.paywallId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offeringId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CustomPaywallImpressionParams(paywallId=" + this.paywallId + ", offeringId=" + this.offeringId + ')';
    }

    public CustomPaywallImpressionParams(String str) {
        this(str, null, 2, null);
    }

    public CustomPaywallImpressionParams(String str, String str2) {
        this.paywallId = str;
        this.offeringId = str2;
    }

    public /* synthetic */ CustomPaywallImpressionParams(String str, String str2, int i, k kVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
