package com.revenuecat.purchases.ui.revenuecatui;

import Da.S;
import Qa.a;
import Qa.l;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogOptions {
    public static final int $stable = 0;
    private final Map customVariables;
    private final a dismissRequest;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final Offering offering;
    private final PaywallPurchaseLogic purchaseLogic;
    private final l shouldDisplayBlock;
    private final boolean shouldDisplayDismissButton;

    public static final class Builder {
        public static final int $stable = 8;
        private a dismissRequest;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private Offering offering;
        private PaywallPurchaseLogic purchaseLogic;
        private l shouldDisplayBlock;
        private boolean shouldDisplayDismissButton = true;
        private Map customVariables = S.h();

        public final PaywallDialogOptions build() {
            return new PaywallDialogOptions(this);
        }

        public final Map getCustomVariables$revenuecatui_defaultsBc8Release() {
            return this.customVariables;
        }

        public final a getDismissRequest$revenuecatui_defaultsBc8Release() {
            return this.dismissRequest;
        }

        public final FontProvider getFontProvider$revenuecatui_defaultsBc8Release() {
            return this.fontProvider;
        }

        public final PaywallListener getListener$revenuecatui_defaultsBc8Release() {
            return this.listener;
        }

        public final Offering getOffering$revenuecatui_defaultsBc8Release() {
            return this.offering;
        }

        public final PaywallPurchaseLogic getPurchaseLogic$revenuecatui_defaultsBc8Release() {
            return this.purchaseLogic;
        }

        public final l getShouldDisplayBlock$revenuecatui_defaultsBc8Release() {
            return this.shouldDisplayBlock;
        }

        public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setCustomPurchaseLogic(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
            return this;
        }

        public final Builder setCustomVariables(Map variables) {
            t.g(variables, "variables");
            this.customVariables = variables;
            return this;
        }

        public final void setCustomVariables$revenuecatui_defaultsBc8Release(Map map) {
            t.g(map, "<set-?>");
            this.customVariables = map;
        }

        public final Builder setDismissRequest(a dismissRequest) {
            t.g(dismissRequest, "dismissRequest");
            this.dismissRequest = dismissRequest;
            return this;
        }

        public final void setDismissRequest$revenuecatui_defaultsBc8Release(a aVar) {
            this.dismissRequest = aVar;
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

        public final Builder setOffering(Offering offering) {
            this.offering = offering;
            return this;
        }

        public final void setOffering$revenuecatui_defaultsBc8Release(Offering offering) {
            this.offering = offering;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsBc8Release(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
        }

        public final Builder setRequiredEntitlementIdentifier(String str) {
            if (str != null) {
                this.shouldDisplayBlock = HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(str);
            }
            return this;
        }

        public final Builder setShouldDisplayBlock(l lVar) {
            this.shouldDisplayBlock = lVar;
            return this;
        }

        public final void setShouldDisplayBlock$revenuecatui_defaultsBc8Release(l lVar) {
            this.shouldDisplayBlock = lVar;
        }

        public final Builder setShouldDisplayDismissButton(boolean z) {
            this.shouldDisplayDismissButton = z;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(boolean z) {
            this.shouldDisplayDismissButton = z;
        }
    }

    public PaywallDialogOptions(l lVar, a aVar, Offering offering, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, Map customVariables) {
        t.g(customVariables, "customVariables");
        this.shouldDisplayBlock = lVar;
        this.dismissRequest = aVar;
        this.offering = offering;
        this.shouldDisplayDismissButton = z;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = paywallPurchaseLogic;
        this.customVariables = customVariables;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallDialogOptions)) {
            return false;
        }
        PaywallDialogOptions paywallDialogOptions = (PaywallDialogOptions) obj;
        return t.c(this.shouldDisplayBlock, paywallDialogOptions.shouldDisplayBlock) && t.c(this.dismissRequest, paywallDialogOptions.dismissRequest) && t.c(this.offering, paywallDialogOptions.offering) && this.shouldDisplayDismissButton == paywallDialogOptions.shouldDisplayDismissButton && t.c(this.fontProvider, paywallDialogOptions.fontProvider) && t.c(this.listener, paywallDialogOptions.listener) && t.c(this.purchaseLogic, paywallDialogOptions.purchaseLogic) && t.c(this.customVariables, paywallDialogOptions.customVariables);
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final a getDismissRequest() {
        return this.dismissRequest;
    }

    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    public final Offering getOffering() {
        return this.offering;
    }

    public final OfferingSelection getOfferingSelection$revenuecatui_defaultsBc8Release() {
        Offering offering = this.offering;
        return offering != null ? new OfferingSelection.OfferingType(offering) : OfferingSelection.None.INSTANCE;
    }

    public final PaywallPurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final l getShouldDisplayBlock() {
        return this.shouldDisplayBlock;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        l lVar = this.shouldDisplayBlock;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        a aVar = this.dismissRequest;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Offering offering = this.offering;
        int hashCode3 = (((hashCode2 + (offering == null ? 0 : offering.hashCode())) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31;
        FontProvider fontProvider = this.fontProvider;
        int hashCode4 = (hashCode3 + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
        PaywallListener paywallListener = this.listener;
        int hashCode5 = (hashCode4 + (paywallListener == null ? 0 : paywallListener.hashCode())) * 31;
        PaywallPurchaseLogic paywallPurchaseLogic = this.purchaseLogic;
        return ((hashCode5 + (paywallPurchaseLogic != null ? paywallPurchaseLogic.hashCode() : 0)) * 31) + this.customVariables.hashCode();
    }

    public String toString() {
        return "PaywallDialogOptions(shouldDisplayBlock=" + this.shouldDisplayBlock + ", dismissRequest=" + this.dismissRequest + ", offering=" + this.offering + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ", customVariables=" + this.customVariables + ')';
    }

    public /* synthetic */ PaywallDialogOptions(l lVar, a aVar, Offering offering, boolean z, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, Map map, int i, k kVar) {
        this(lVar, aVar, offering, z, fontProvider, paywallListener, paywallPurchaseLogic, (i & 128) != 0 ? S.h() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallDialogOptions(Builder builder) {
        this(builder.getShouldDisplayBlock$revenuecatui_defaultsBc8Release(), builder.getDismissRequest$revenuecatui_defaultsBc8Release(), builder.getOffering$revenuecatui_defaultsBc8Release(), builder.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(), builder.getFontProvider$revenuecatui_defaultsBc8Release(), builder.getListener$revenuecatui_defaultsBc8Release(), builder.getPurchaseLogic$revenuecatui_defaultsBc8Release(), builder.getCustomVariables$revenuecatui_defaultsBc8Release());
        t.g(builder, "builder");
    }
}
