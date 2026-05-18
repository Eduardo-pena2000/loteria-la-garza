package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.o;
import com.revenuecat.purchases.models.SubscriptionOption;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ResolvedOffer {
    public static final int $stable = 0;

    public static final class ConfiguredOffer extends ResolvedOffer {
        public static final int $stable = 8;
        private final SubscriptionOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfiguredOffer(SubscriptionOption option) {
            super(null);
            t.g(option, "option");
            this.option = option;
        }

        public static /* synthetic */ ConfiguredOffer copy$default(ConfiguredOffer configuredOffer, SubscriptionOption subscriptionOption, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionOption = configuredOffer.option;
            }
            return configuredOffer.copy(subscriptionOption);
        }

        public final SubscriptionOption component1() {
            return this.option;
        }

        public final ConfiguredOffer copy(SubscriptionOption option) {
            t.g(option, "option");
            return new ConfiguredOffer(option);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfiguredOffer) && t.c(this.option, ((ConfiguredOffer) obj).option);
        }

        public final SubscriptionOption getOption() {
            return this.option;
        }

        public int hashCode() {
            return this.option.hashCode();
        }

        public String toString() {
            return "ConfiguredOffer(option=" + this.option + ')';
        }
    }

    public static final class NoConfiguration extends ResolvedOffer {
        public static final int $stable = 8;
        private final SubscriptionOption option;

        public NoConfiguration(SubscriptionOption subscriptionOption) {
            super(null);
            this.option = subscriptionOption;
        }

        public static /* synthetic */ NoConfiguration copy$default(NoConfiguration noConfiguration, SubscriptionOption subscriptionOption, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionOption = noConfiguration.option;
            }
            return noConfiguration.copy(subscriptionOption);
        }

        public final SubscriptionOption component1() {
            return this.option;
        }

        public final NoConfiguration copy(SubscriptionOption subscriptionOption) {
            return new NoConfiguration(subscriptionOption);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoConfiguration) && t.c(this.option, ((NoConfiguration) obj).option);
        }

        public final SubscriptionOption getOption() {
            return this.option;
        }

        public int hashCode() {
            SubscriptionOption subscriptionOption = this.option;
            if (subscriptionOption == null) {
                return 0;
            }
            return subscriptionOption.hashCode();
        }

        public String toString() {
            return "NoConfiguration(option=" + this.option + ')';
        }
    }

    public static final class OfferNotFound extends ResolvedOffer {
        public static final int $stable = 8;
        private final String configuredOfferId;
        private final SubscriptionOption fallbackOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferNotFound(String configuredOfferId, SubscriptionOption subscriptionOption) {
            super(null);
            t.g(configuredOfferId, "configuredOfferId");
            this.configuredOfferId = configuredOfferId;
            this.fallbackOption = subscriptionOption;
        }

        public static /* synthetic */ OfferNotFound copy$default(OfferNotFound offerNotFound, String str, SubscriptionOption subscriptionOption, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offerNotFound.configuredOfferId;
            }
            if ((i & 2) != 0) {
                subscriptionOption = offerNotFound.fallbackOption;
            }
            return offerNotFound.copy(str, subscriptionOption);
        }

        public final String component1() {
            return this.configuredOfferId;
        }

        public final SubscriptionOption component2() {
            return this.fallbackOption;
        }

        public final OfferNotFound copy(String configuredOfferId, SubscriptionOption subscriptionOption) {
            t.g(configuredOfferId, "configuredOfferId");
            return new OfferNotFound(configuredOfferId, subscriptionOption);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferNotFound)) {
                return false;
            }
            OfferNotFound offerNotFound = (OfferNotFound) obj;
            return t.c(this.configuredOfferId, offerNotFound.configuredOfferId) && t.c(this.fallbackOption, offerNotFound.fallbackOption);
        }

        public final String getConfiguredOfferId() {
            return this.configuredOfferId;
        }

        public final SubscriptionOption getFallbackOption() {
            return this.fallbackOption;
        }

        public int hashCode() {
            int hashCode = this.configuredOfferId.hashCode() * 31;
            SubscriptionOption subscriptionOption = this.fallbackOption;
            return hashCode + (subscriptionOption == null ? 0 : subscriptionOption.hashCode());
        }

        public String toString() {
            return "OfferNotFound(configuredOfferId=" + this.configuredOfferId + ", fallbackOption=" + this.fallbackOption + ')';
        }
    }

    public /* synthetic */ ResolvedOffer(k kVar) {
        this();
    }

    public final SubscriptionOption getSubscriptionOption() {
        if (this instanceof ConfiguredOffer) {
            return ((ConfiguredOffer) this).getOption();
        }
        if (this instanceof NoConfiguration) {
            return ((NoConfiguration) this).getOption();
        }
        if (this instanceof OfferNotFound) {
            return ((OfferNotFound) this).getFallbackOption();
        }
        throw new o();
    }

    public final boolean isPromoOffer() {
        return this instanceof ConfiguredOffer;
    }

    private ResolvedOffer() {
    }
}
