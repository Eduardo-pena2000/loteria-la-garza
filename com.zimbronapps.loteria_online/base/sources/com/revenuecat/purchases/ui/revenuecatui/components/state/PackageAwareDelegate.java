package com.revenuecat.purchases.ui.revenuecatui.components.state;

import Qa.a;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageAwareDelegate {
    public static final int $stable = 8;
    private final h2 isSelected$delegate;
    private final h2 offerEligibility$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final PackageContext style;

    public static final class 2 extends u implements a {
        public 2() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.valueOf(PackageAwareDelegate.access$getStyle$p(PackageAwareDelegate.this).computeIsSelected((PaywallState.Loaded.Components.SelectedPackageInfo) PackageAwareDelegate.access$getSelectedPackageInfoProvider$p(PackageAwareDelegate.this).invoke(), ((Number) PackageAwareDelegate.access$getSelectedTabIndexProvider$p(PackageAwareDelegate.this).invoke()).intValue()));
        }
    }

    public PackageAwareDelegate(PackageContext style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider) {
        t.g(style, "style");
        t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
        t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.isSelected$delegate = U1.c(new 2());
        this.offerEligibility$delegate = U1.c(new PackageAwareDelegate$offerEligibility$2(this));
    }

    public static final /* synthetic */ a access$getSelectedOfferEligibilityProvider$p(PackageAwareDelegate packageAwareDelegate) {
        return packageAwareDelegate.selectedOfferEligibilityProvider;
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(PackageAwareDelegate packageAwareDelegate) {
        return packageAwareDelegate.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ a access$getSelectedTabIndexProvider$p(PackageAwareDelegate packageAwareDelegate) {
        return packageAwareDelegate.selectedTabIndexProvider;
    }

    public static final /* synthetic */ PackageContext access$getStyle$p(PackageAwareDelegate packageAwareDelegate) {
        return packageAwareDelegate.style;
    }

    public final OfferEligibility getOfferEligibility() {
        return (OfferEligibility) this.offerEligibility$delegate.getValue();
    }

    public final boolean isSelected() {
        return ((Boolean) this.isSelected$delegate.getValue()).booleanValue();
    }
}
