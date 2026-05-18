package com.revenuecat.purchases;

import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Offerings {
    private final Map all;
    private final Offering current;
    private final boolean loadedFromDiskCache;
    private final HTTPResponseOriginalSource originalSource;
    private final Placements placements;
    private final Targeting targeting;

    public static final class Placements {
        private final String fallbackOfferingId;
        private final Map offeringIdsByPlacement;

        public Placements(String str, Map map) {
            t.g(map, "offeringIdsByPlacement");
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = map;
        }

        public static /* synthetic */ Placements copy$default(Placements placements, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        public final String component1() {
            return this.fallbackOfferingId;
        }

        public final Map component2() {
            return this.offeringIdsByPlacement;
        }

        public final Placements copy(String str, Map map) {
            t.g(map, "offeringIdsByPlacement");
            return new Placements(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placements)) {
                return false;
            }
            Placements placements = (Placements) obj;
            return t.c(this.fallbackOfferingId, placements.fallbackOfferingId) && t.c(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            String str = this.fallbackOfferingId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.offeringIdsByPlacement.hashCode();
        }

        public String toString() {
            return "Placements(fallbackOfferingId=" + this.fallbackOfferingId + ", offeringIdsByPlacement=" + this.offeringIdsByPlacement + ')';
        }
    }

    public static final class Targeting {
        private final int revision;
        private final String ruleId;

        public Targeting(int i, String str) {
            t.g(str, "ruleId");
            this.revision = i;
            this.ruleId = str;
        }

        public static /* synthetic */ Targeting copy$default(Targeting targeting, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = targeting.revision;
            }
            if ((i2 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i, str);
        }

        public final int component1() {
            return this.revision;
        }

        public final String component2() {
            return this.ruleId;
        }

        public final Targeting copy(int i, String str) {
            t.g(str, "ruleId");
            return new Targeting(i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Targeting)) {
                return false;
            }
            Targeting targeting = (Targeting) obj;
            return this.revision == targeting.revision && t.c(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.revision) * 31) + this.ruleId.hashCode();
        }

        public String toString() {
            return "Targeting(revision=" + this.revision + ", ruleId=" + this.ruleId + ')';
        }
    }

    public Offerings(Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z) {
        t.g(map, "all");
        t.g(hTTPResponseOriginalSource, "originalSource");
        this.current = offering;
        this.all = map;
        this.placements = placements;
        this.targeting = targeting;
        this.originalSource = hTTPResponseOriginalSource;
        this.loadedFromDiskCache = z;
    }

    public static /* synthetic */ Offerings copy$purchases_defaultsBc8Release$default(Offerings offerings, Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            offering = offerings.current;
        }
        if ((i & 2) != 0) {
            map = offerings.all;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            placements = offerings.placements;
        }
        Placements placements2 = placements;
        if ((i & 8) != 0) {
            targeting = offerings.targeting;
        }
        Targeting targeting2 = targeting;
        if ((i & 16) != 0) {
            hTTPResponseOriginalSource = offerings.originalSource;
        }
        HTTPResponseOriginalSource hTTPResponseOriginalSource2 = hTTPResponseOriginalSource;
        if ((i & 32) != 0) {
            z = offerings.loadedFromDiskCache;
        }
        return offerings.copy$purchases_defaultsBc8Release(offering, map2, placements2, targeting2, hTTPResponseOriginalSource2, z);
    }

    public final Offerings copy$purchases_defaultsBc8Release(Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z) {
        t.g(map, "all");
        t.g(hTTPResponseOriginalSource, "originalSource");
        return new Offerings(offering, map, placements, targeting, hTTPResponseOriginalSource, z);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Offerings) && t.c(new OfferingsComparableData(this), new OfferingsComparableData((Offerings) obj));
    }

    public final Offering get(String str) {
        t.g(str, "identifier");
        return getOffering(str);
    }

    public final Map getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getCurrentOfferingForPlacement(String str) {
        t.g(str, "placementId");
        Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        String str2 = (String) placements.getOfferingIdsByPlacement().get(str);
        Offering offering = str2 != null ? getOffering(str2) : null;
        String fallbackOfferingId = placements.getFallbackOfferingId();
        Offering offering2 = fallbackOfferingId != null ? getOffering(fallbackOfferingId) : null;
        boolean containsKey = placements.getOfferingIdsByPlacement().containsKey(str);
        if (offering == null) {
            offering = containsKey ? null : offering2;
        }
        if (offering != null) {
            return OfferingsKt.withPresentedContext(offering, str, this.targeting);
        }
        return null;
    }

    public final boolean getLoadedFromDiskCache$purchases_defaultsBc8Release() {
        return this.loadedFromDiskCache;
    }

    public final Offering getOffering(String str) {
        t.g(str, "identifier");
        return (Offering) this.all.get(str);
    }

    public final HTTPResponseOriginalSource getOriginalSource$purchases_defaultsBc8Release() {
        return this.originalSource;
    }

    public final Placements getPlacements$purchases_defaultsBc8Release() {
        return this.placements;
    }

    public final Targeting getTargeting$purchases_defaultsBc8Release() {
        return this.targeting;
    }

    public int hashCode() {
        return new OfferingsComparableData(this).hashCode();
    }

    public String toString() {
        return "<Offerings\n current: " + this.current + "\nall:  " + this.all + ",\nplacements: " + this.placements + ",\ntargeting: " + this.targeting + "\n>";
    }

    public /* synthetic */ Offerings(Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, kotlin.jvm.internal.k kVar) {
        this(offering, map, (i & 4) != 0 ? null : placements, (i & 8) != 0 ? null : targeting, (i & 16) != 0 ? HTTPResponseOriginalSource.MAIN : hTTPResponseOriginalSource, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offerings(Offering offering, Map map) {
        this(offering, map, null, null, null, false, 48, null);
        t.g(map, "all");
    }
}
