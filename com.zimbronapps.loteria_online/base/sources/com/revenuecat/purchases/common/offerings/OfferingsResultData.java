package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsResultData {
    private final Set notFoundProductIds;
    private final Offerings offerings;
    private final Set requestedProductIds;

    public OfferingsResultData(Offerings offerings, Set set, Set set2) {
        t.g(offerings, "offerings");
        t.g(set, "requestedProductIds");
        t.g(set2, "notFoundProductIds");
        this.offerings = offerings;
        this.requestedProductIds = set;
        this.notFoundProductIds = set2;
    }

    public static /* synthetic */ OfferingsResultData copy$default(OfferingsResultData offeringsResultData, Offerings offerings, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            offerings = offeringsResultData.offerings;
        }
        if ((i & 2) != 0) {
            set = offeringsResultData.requestedProductIds;
        }
        if ((i & 4) != 0) {
            set2 = offeringsResultData.notFoundProductIds;
        }
        return offeringsResultData.copy(offerings, set, set2);
    }

    public final Offerings component1() {
        return this.offerings;
    }

    public final Set component2() {
        return this.requestedProductIds;
    }

    public final Set component3() {
        return this.notFoundProductIds;
    }

    public final OfferingsResultData copy(Offerings offerings, Set set, Set set2) {
        t.g(offerings, "offerings");
        t.g(set, "requestedProductIds");
        t.g(set2, "notFoundProductIds");
        return new OfferingsResultData(offerings, set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferingsResultData)) {
            return false;
        }
        OfferingsResultData offeringsResultData = (OfferingsResultData) obj;
        return t.c(this.offerings, offeringsResultData.offerings) && t.c(this.requestedProductIds, offeringsResultData.requestedProductIds) && t.c(this.notFoundProductIds, offeringsResultData.notFoundProductIds);
    }

    public final Set getNotFoundProductIds() {
        return this.notFoundProductIds;
    }

    public final Offerings getOfferings() {
        return this.offerings;
    }

    public final Set getRequestedProductIds() {
        return this.requestedProductIds;
    }

    public int hashCode() {
        return (((this.offerings.hashCode() * 31) + this.requestedProductIds.hashCode()) * 31) + this.notFoundProductIds.hashCode();
    }

    public String toString() {
        return "OfferingsResultData(offerings=" + this.offerings + ", requestedProductIds=" + this.requestedProductIds + ", notFoundProductIds=" + this.notFoundProductIds + ')';
    }
}
