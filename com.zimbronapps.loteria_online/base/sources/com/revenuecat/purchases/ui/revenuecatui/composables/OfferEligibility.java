package com.revenuecat.purchases.ui.revenuecatui.composables;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class OfferEligibility {
    public static final int $stable = 0;

    public static final class Ineligible extends OfferEligibility {
        public static final int $stable = 0;
        public static final Ineligible INSTANCE = new Ineligible();

        private Ineligible() {
            super(null);
        }
    }

    public static final class IntroOfferMultiple extends OfferEligibility {
        public static final int $stable = 0;
        public static final IntroOfferMultiple INSTANCE = new IntroOfferMultiple();

        private IntroOfferMultiple() {
            super(null);
        }
    }

    public static final class IntroOfferSingle extends OfferEligibility {
        public static final int $stable = 0;
        public static final IntroOfferSingle INSTANCE = new IntroOfferSingle();

        private IntroOfferSingle() {
            super(null);
        }
    }

    public static final class PromoOfferIneligible extends OfferEligibility {
        public static final int $stable = 0;
        public static final PromoOfferIneligible INSTANCE = new PromoOfferIneligible();

        private PromoOfferIneligible() {
            super(null);
        }
    }

    public static final class PromoOfferMultiple extends OfferEligibility {
        public static final int $stable = 0;
        public static final PromoOfferMultiple INSTANCE = new PromoOfferMultiple();

        private PromoOfferMultiple() {
            super(null);
        }
    }

    public static final class PromoOfferSingle extends OfferEligibility {
        public static final int $stable = 0;
        public static final PromoOfferSingle INSTANCE = new PromoOfferSingle();

        private PromoOfferSingle() {
            super(null);
        }
    }

    public /* synthetic */ OfferEligibility(k kVar) {
        this();
    }

    public final boolean getHasMultipleDiscountedPhases() {
        return (this instanceof IntroOfferMultiple) || (this instanceof PromoOfferMultiple);
    }

    public final boolean isIntroOffer() {
        return (this instanceof IntroOfferSingle) || (this instanceof IntroOfferMultiple);
    }

    public final boolean isPromoOffer() {
        return (this instanceof PromoOfferSingle) || (this instanceof PromoOfferMultiple);
    }

    private OfferEligibility() {
    }
}
