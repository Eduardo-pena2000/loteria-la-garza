package com.revenuecat.purchases.ui.revenuecatui.components.state;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PackageContext {

    public static final class DefaultImpls {
        public static /* synthetic */ boolean computeIsSelected(PackageContext packageContext, PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
            Package rcPackage;
            String packageUniqueId = packageContext.getPackageUniqueId();
            Package rcPackage2 = packageContext.getRcPackage();
            Integer tabIndex = packageContext.getTabIndex();
            if (packageUniqueId != null) {
                return t.c(packageUniqueId, selectedPackageInfo != null ? selectedPackageInfo.getUniqueId() : null);
            }
            if (rcPackage2 == null) {
                return tabIndex != null && tabIndex.intValue() == i;
            }
            String identifier = rcPackage2.getIdentifier();
            if (selectedPackageInfo != null && (rcPackage = selectedPackageInfo.getRcPackage()) != null) {
                r2 = rcPackage.getIdentifier();
            }
            return t.c(identifier, r2);
        }

        public static String getPackageUniqueId(PackageContext packageContext) {
            SubscriptionOption option;
            Package rcPackage = packageContext.getRcPackage();
            String str = null;
            if (rcPackage == null) {
                return null;
            }
            ResolvedOffer resolvedOffer = packageContext.getResolvedOffer();
            ResolvedOffer.ConfiguredOffer configuredOffer = resolvedOffer instanceof ResolvedOffer.ConfiguredOffer ? (ResolvedOffer.ConfiguredOffer) resolvedOffer : null;
            if (configuredOffer != null && (option = configuredOffer.getOption()) != null) {
                str = option.getId();
            }
            if (str == null) {
                return rcPackage.getIdentifier();
            }
            return rcPackage.getIdentifier() + ':' + str;
        }

        public static /* synthetic */ OfferEligibility resolveOfferEligibility(PackageContext packageContext, OfferEligibility selectedOfferEligibility) {
            t.g(selectedOfferEligibility, "selectedOfferEligibility");
            OfferEligibility offerEligibility = packageContext.getOfferEligibility();
            return offerEligibility == null ? selectedOfferEligibility : offerEligibility;
        }
    }

    /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i);

    OfferEligibility getOfferEligibility();

    String getPackageUniqueId();

    Package getRcPackage();

    ResolvedOffer getResolvedOffer();

    Integer getTabIndex();

    /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility);
}
