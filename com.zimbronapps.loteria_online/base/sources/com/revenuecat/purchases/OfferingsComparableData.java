package com.revenuecat.purchases;

import com.revenuecat.purchases.Offerings;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class OfferingsComparableData {
    private final Map all;
    private final Offering current;
    private final Offerings.Placements placements;
    private final Offerings.Targeting targeting;

    public OfferingsComparableData(Offering offering, Map map, Offerings.Placements placements, Offerings.Targeting targeting) {
        t.g(map, "all");
        this.current = offering;
        this.all = map;
        this.placements = placements;
        this.targeting = targeting;
    }

    public static /* synthetic */ OfferingsComparableData copy$default(OfferingsComparableData offeringsComparableData, Offering offering, Map map, Offerings.Placements placements, Offerings.Targeting targeting, int i, Object obj) {
        if ((i & 1) != 0) {
            offering = offeringsComparableData.current;
        }
        if ((i & 2) != 0) {
            map = offeringsComparableData.all;
        }
        if ((i & 4) != 0) {
            placements = offeringsComparableData.placements;
        }
        if ((i & 8) != 0) {
            targeting = offeringsComparableData.targeting;
        }
        return offeringsComparableData.copy(offering, map, placements, targeting);
    }

    public final Offering component1() {
        return this.current;
    }

    public final Map component2() {
        return this.all;
    }

    public final Offerings.Placements component3() {
        return this.placements;
    }

    public final Offerings.Targeting component4() {
        return this.targeting;
    }

    public final OfferingsComparableData copy(Offering offering, Map map, Offerings.Placements placements, Offerings.Targeting targeting) {
        t.g(map, "all");
        return new OfferingsComparableData(offering, map, placements, targeting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferingsComparableData)) {
            return false;
        }
        OfferingsComparableData offeringsComparableData = (OfferingsComparableData) obj;
        return t.c(this.current, offeringsComparableData.current) && t.c(this.all, offeringsComparableData.all) && t.c(this.placements, offeringsComparableData.placements) && t.c(this.targeting, offeringsComparableData.targeting);
    }

    public final Map getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offerings.Placements getPlacements() {
        return this.placements;
    }

    public final Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        Offering offering = this.current;
        int hashCode = (((offering == null ? 0 : offering.hashCode()) * 31) + this.all.hashCode()) * 31;
        Offerings.Placements placements = this.placements;
        int hashCode2 = (hashCode + (placements == null ? 0 : placements.hashCode())) * 31;
        Offerings.Targeting targeting = this.targeting;
        return hashCode2 + (targeting != null ? targeting.hashCode() : 0);
    }

    public String toString() {
        return "OfferingsComparableData(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfferingsComparableData(Offerings offerings) {
        this(offerings.getCurrent(), offerings.getAll(), offerings.getPlacements$purchases_defaultsBc8Release(), offerings.getTargeting$purchases_defaultsBc8Release());
        t.g(offerings, "offerings");
    }
}
