package com.revenuecat.purchases.ui.revenuecatui;

import Da.S;
import Qa.a;
import Qa.p;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final int hashMultiplier = 31;
    private final Map customVariables;
    private final a dismissRequest;
    private final p dismissRequestWithExitOffering;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final PaywallMode mode;
    private final OfferingSelection offeringSelection;
    private final PaywallPurchaseLogic purchaseLogic;
    private final boolean shouldDisplayDismissButton;

    public static final class Builder {
        public static final int $stable = 8;
        private Map customVariables;
        private final a dismissRequest;
        private p dismissRequestWithExitOffering;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private PaywallMode mode;
        private OfferingSelection offeringSelection;
        private PaywallPurchaseLogic purchaseLogic;
        private boolean shouldDisplayDismissButton;

        public Builder(a dismissRequest) {
            t.g(dismissRequest, "dismissRequest");
            this.dismissRequest = dismissRequest;
            this.offeringSelection = OfferingSelection.None.INSTANCE;
            this.mode = PaywallMode.Companion.getDefault();
            this.customVariables = S.h();
        }

        public final PaywallOptions build() {
            return new PaywallOptions(this);
        }

        public final Map getCustomVariables$revenuecatui_defaultsBc8Release() {
            return this.customVariables;
        }

        public final a getDismissRequest$revenuecatui_defaultsBc8Release() {
            return this.dismissRequest;
        }

        public final p getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release() {
            return this.dismissRequestWithExitOffering;
        }

        public final FontProvider getFontProvider$revenuecatui_defaultsBc8Release() {
            return this.fontProvider;
        }

        public final PaywallListener getListener$revenuecatui_defaultsBc8Release() {
            return this.listener;
        }

        public final PaywallMode getMode$revenuecatui_defaultsBc8Release() {
            return this.mode;
        }

        public final OfferingSelection getOfferingSelection$revenuecatui_defaultsBc8Release() {
            return this.offeringSelection;
        }

        public final PaywallPurchaseLogic getPurchaseLogic$revenuecatui_defaultsBc8Release() {
            return this.purchaseLogic;
        }

        public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setCustomVariables(Map variables) {
            t.g(variables, "variables");
            this.customVariables = CustomVariableKeyValidator.INSTANCE.validateAndFilter(variables);
            return this;
        }

        public final void setCustomVariables$revenuecatui_defaultsBc8Release(Map map) {
            t.g(map, "<set-?>");
            this.customVariables = map;
        }

        public final void setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(p pVar) {
            this.dismissRequestWithExitOffering = pVar;
        }

        public final Builder setFontProvider(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
            return this;
        }

        public final void setFontProvider$revenuecatui_defaultsBc8Release(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
        }

        public final Builder setListener(PaywallListener paywallListener) {
            this.listener = paywallListener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsBc8Release(PaywallListener paywallListener) {
            this.listener = paywallListener;
        }

        public final void setMode$revenuecatui_defaultsBc8Release(PaywallMode paywallMode) {
            t.g(paywallMode, "<set-?>");
            this.mode = paywallMode;
        }

        public final Builder setOffering(Offering offering) {
            this.offeringSelection = offering != null ? new OfferingSelection.OfferingType(offering) : OfferingSelection.None.INSTANCE;
            return this;
        }

        public final Builder setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext) {
            OfferingSelection offeringSelection = idAndPresentedOfferingContext;
            if (idAndPresentedOfferingContext == null) {
                offeringSelection = OfferingSelection.None.INSTANCE;
            }
            this.offeringSelection = offeringSelection;
            return this;
        }

        public final void setOfferingSelection$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection) {
            t.g(offeringSelection, "<set-?>");
            this.offeringSelection = offeringSelection;
        }

        public final Builder setPurchaseLogic(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
            return this;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsBc8Release(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
        }

        public final Builder setShouldDisplayDismissButton(boolean z) {
            this.shouldDisplayDismissButton = z;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(boolean z) {
            this.shouldDisplayDismissButton = z;
        }

        public final Builder setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(p pVar) {
            this.dismissRequestWithExitOffering = pVar;
            return this;
        }

        public final Builder setMode$revenuecatui_defaultsBc8Release(PaywallMode mode) {
            t.g(mode, "mode");
            this.mode = mode;
            return this;
        }

        public final Builder setOfferingSelection$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection) {
            if (offeringSelection == null) {
                offeringSelection = OfferingSelection.None.INSTANCE;
            }
            this.offeringSelection = offeringSelection;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public PaywallOptions(OfferingSelection offeringSelection, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode mode, a dismissRequest, p pVar, Map customVariables) {
        t.g(offeringSelection, "offeringSelection");
        t.g(mode, "mode");
        t.g(dismissRequest, "dismissRequest");
        t.g(customVariables, "customVariables");
        this.offeringSelection = offeringSelection;
        this.shouldDisplayDismissButton = z;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = paywallPurchaseLogic;
        this.mode = mode;
        this.dismissRequest = dismissRequest;
        this.dismissRequestWithExitOffering = pVar;
        this.customVariables = customVariables;
    }

    public static /* synthetic */ PaywallOptions copy$revenuecatui_defaultsBc8Release$default(PaywallOptions paywallOptions, OfferingSelection offeringSelection, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode paywallMode, a aVar, p pVar, Map map, int i, Object obj) {
        return paywallOptions.copy$revenuecatui_defaultsBc8Release((i & 1) != 0 ? paywallOptions.offeringSelection : offeringSelection, (i & 2) != 0 ? paywallOptions.shouldDisplayDismissButton : z, (i & 4) != 0 ? paywallOptions.fontProvider : fontProvider, (i & 8) != 0 ? paywallOptions.listener : paywallListener, (i & 16) != 0 ? paywallOptions.purchaseLogic : paywallPurchaseLogic, (i & 32) != 0 ? paywallOptions.mode : paywallMode, (i & 64) != 0 ? paywallOptions.dismissRequest : aVar, (i & 128) != 0 ? paywallOptions.dismissRequestWithExitOffering : pVar, (i & 256) != 0 ? paywallOptions.customVariables : map);
    }

    public final PaywallOptions copy$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode mode, a dismissRequest, p pVar, Map customVariables) {
        t.g(offeringSelection, "offeringSelection");
        t.g(mode, "mode");
        t.g(dismissRequest, "dismissRequest");
        t.g(customVariables, "customVariables");
        return new PaywallOptions(offeringSelection, z, fontProvider, paywallListener, paywallPurchaseLogic, mode, dismissRequest, pVar, customVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallOptions)) {
            return false;
        }
        PaywallOptions paywallOptions = (PaywallOptions) obj;
        if (t.c(this.offeringSelection, paywallOptions.offeringSelection) && this.shouldDisplayDismissButton == paywallOptions.shouldDisplayDismissButton && t.c(this.fontProvider, paywallOptions.fontProvider) && t.c(this.listener, paywallOptions.listener) && t.c(this.purchaseLogic, paywallOptions.purchaseLogic) && this.mode == paywallOptions.mode && t.c(this.customVariables, paywallOptions.customVariables)) {
            return t.c(this.dismissRequest, paywallOptions.dismissRequest);
        }
        return false;
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final a getDismissRequest() {
        return this.dismissRequest;
    }

    public final p getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release() {
        return this.dismissRequestWithExitOffering;
    }

    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    public final PaywallMode getMode$revenuecatui_defaultsBc8Release() {
        return this.mode;
    }

    public final OfferingSelection getOfferingSelection$revenuecatui_defaultsBc8Release() {
        return this.offeringSelection;
    }

    public final PaywallPurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        String offeringIdentifier = this.offeringSelection.getOfferingIdentifier();
        return ((((((offeringIdentifier != null ? offeringIdentifier.hashCode() : 0) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31) + this.mode.hashCode()) * 31) + this.customVariables.hashCode();
    }

    public String toString() {
        return "PaywallOptions(offeringSelection=" + this.offeringSelection + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ", mode=" + this.mode + ", dismissRequest=" + this.dismissRequest + ", dismissRequestWithExitOffering=" + this.dismissRequestWithExitOffering + ", customVariables=" + this.customVariables + ')';
    }

    public /* synthetic */ PaywallOptions(OfferingSelection offeringSelection, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode paywallMode, a aVar, p pVar, Map map, int i, k kVar) {
        this(offeringSelection, z, fontProvider, paywallListener, paywallPurchaseLogic, paywallMode, aVar, (i & 128) != 0 ? null : pVar, (i & 256) != 0 ? S.h() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallOptions(Builder builder) {
        this(builder.getOfferingSelection$revenuecatui_defaultsBc8Release(), builder.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(), builder.getFontProvider$revenuecatui_defaultsBc8Release(), builder.getListener$revenuecatui_defaultsBc8Release(), builder.getPurchaseLogic$revenuecatui_defaultsBc8Release(), builder.getMode$revenuecatui_defaultsBc8Release(), builder.getDismissRequest$revenuecatui_defaultsBc8Release(), builder.getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(), builder.getCustomVariables$revenuecatui_defaultsBc8Release());
        t.g(builder, "builder");
    }
}
