package com.revenuecat.purchases;

import Da.w;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsKt {
    public static final Offering withPresentedContext(Offering offering, String str, Offerings.Targeting targeting) {
        t.g(offering, "<this>");
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(w.y(availablePackages, 10));
        for (Package r2 : availablePackages) {
            PresentedOfferingContext presentedOfferingContext = r2.getPresentedOfferingContext();
            PresentedOfferingContext copy$default = PresentedOfferingContext.copy$default(presentedOfferingContext, null, str == null ? presentedOfferingContext.getPlacementIdentifier() : str, targeting != null ? new PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId()) : presentedOfferingContext.getTargetingContext(), 1, null);
            arrayList.add(new Package(r2.getIdentifier(), r2.getPackageType(), r2.getProduct().copyWithPresentedOfferingContext(copy$default), copy$default, r2.getWebCheckoutURL()));
        }
        return new Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall(), offering.getPaywallComponents(), offering.getWebCheckoutURL());
    }
}
