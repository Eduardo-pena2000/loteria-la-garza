package com.revenuecat.purchases.ui.revenuecatui.activity;

import Da.D;
import Da.S;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableKeyValidator;
import com.revenuecat.purchases.ui.revenuecatui.ExperimentalPreviewRevenueCatUIPurchasesAPI;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityLaunchOptions {
    public static final int $stable = 8;
    private final Map customVariables;
    private final boolean edgeToEdge;
    private final ParcelizableFontProvider fontProvider;
    private final PaywallListener listener;
    private final Offering offering;
    private final String offeringIdentifier;
    private final PresentedOfferingContext presentedOfferingContext;
    private final PaywallPurchaseLogic purchaseLogic;
    private final boolean shouldDisplayDismissButton;

    public static final class Builder {
        public static final int $stable = 8;
        private ParcelizableFontProvider fontProvider;
        private PaywallListener listener;
        private Offering offering;
        private String offeringIdentifier;
        private PresentedOfferingContext presentedOfferingContext;
        private PaywallPurchaseLogic purchaseLogic;
        private boolean shouldDisplayDismissButton = true;
        private boolean edgeToEdge = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        private Map customVariables = S.h();

        public final PaywallActivityLaunchOptions build() {
            return new PaywallActivityLaunchOptions(this.offering, this.fontProvider, this.shouldDisplayDismissButton, this.edgeToEdge, this.customVariables, this.purchaseLogic, this.listener, this.offeringIdentifier, this.presentedOfferingContext, null);
        }

        public final Builder setCustomVariables(Map customVariables) {
            t.g(customVariables, "customVariables");
            this.customVariables = CustomVariableKeyValidator.INSTANCE.validateAndFilter(customVariables);
            return this;
        }

        public final Builder setEdgeToEdge(boolean z) {
            this.edgeToEdge = z;
            return this;
        }

        public final Builder setFontProvider(ParcelizableFontProvider parcelizableFontProvider) {
            this.fontProvider = parcelizableFontProvider;
            return this;
        }

        @ExperimentalPreviewRevenueCatUIPurchasesAPI
        public final Builder setListener(PaywallListener paywallListener) {
            this.listener = paywallListener;
            return this;
        }

        public final Builder setOffering(Offering offering) {
            this.offering = offering;
            this.offeringIdentifier = null;
            this.presentedOfferingContext = null;
            return this;
        }

        @InternalRevenueCatAPI
        public final Builder setOfferingIdentifier(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext) {
            t.g(offeringIdentifier, "offeringIdentifier");
            t.g(presentedOfferingContext, "presentedOfferingContext");
            this.offeringIdentifier = offeringIdentifier;
            this.presentedOfferingContext = presentedOfferingContext;
            this.offering = null;
            return this;
        }

        @ExperimentalPreviewRevenueCatUIPurchasesAPI
        public final Builder setPurchaseLogic(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
            return this;
        }

        public final Builder setShouldDisplayDismissButton(boolean z) {
            this.shouldDisplayDismissButton = z;
            return this;
        }
    }

    public /* synthetic */ PaywallActivityLaunchOptions(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map map, PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener, String str, PresentedOfferingContext presentedOfferingContext, k kVar) {
        this(offering, parcelizableFontProvider, z, z2, map, paywallPurchaseLogic, paywallListener, str, presentedOfferingContext);
    }

    public final Map getCustomVariables$revenuecatui_defaultsBc8Release() {
        return this.customVariables;
    }

    public final boolean getEdgeToEdge$revenuecatui_defaultsBc8Release() {
        return this.edgeToEdge;
    }

    public final ParcelizableFontProvider getFontProvider$revenuecatui_defaultsBc8Release() {
        return this.fontProvider;
    }

    public final PaywallListener getListener$revenuecatui_defaultsBc8Release() {
        return this.listener;
    }

    public final Offering getOffering$revenuecatui_defaultsBc8Release() {
        return this.offering;
    }

    public final String getOfferingIdentifier$revenuecatui_defaultsBc8Release() {
        return this.offeringIdentifier;
    }

    public final PresentedOfferingContext getPresentedOfferingContext$revenuecatui_defaultsBc8Release() {
        return this.presentedOfferingContext;
    }

    public final PaywallPurchaseLogic getPurchaseLogic$revenuecatui_defaultsBc8Release() {
        return this.purchaseLogic;
    }

    public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release() {
        return this.shouldDisplayDismissButton;
    }

    public final OfferingSelection.IdAndPresentedOfferingContext toOfferingSelection$revenuecatui_defaultsBc8Release() {
        if (this.offeringIdentifier != null) {
            return new OfferingSelection.IdAndPresentedOfferingContext(this.offeringIdentifier, this.presentedOfferingContext);
        }
        if (this.offering == null) {
            return null;
        }
        String identifier = this.offering.getIdentifier();
        Package r3 = (Package) D.h0(this.offering.getAvailablePackages());
        return new OfferingSelection.IdAndPresentedOfferingContext(identifier, r3 != null ? r3.getPresentedOfferingContext() : null);
    }

    private PaywallActivityLaunchOptions(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map map, PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener, String str, PresentedOfferingContext presentedOfferingContext) {
        this.offering = offering;
        this.fontProvider = parcelizableFontProvider;
        this.shouldDisplayDismissButton = z;
        this.edgeToEdge = z2;
        this.customVariables = map;
        this.purchaseLogic = paywallPurchaseLogic;
        this.listener = paywallListener;
        this.offeringIdentifier = str;
        this.presentedOfferingContext = presentedOfferingContext;
    }
}
