package com.revenuecat.purchases.hybridcommon.ui;

import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PresentPaywallOptions {
    private final Map customVariables;
    private final PaywallFontFamily fontFamily;
    private final PaywallListenerWrapper paywallListener;
    private final PaywallResultListener paywallResultListener;
    private final PaywallSource paywallSource;
    private final HybridPurchaseLogicBridge purchaseLogic;
    private final String requiredEntitlementIdentifier;
    private final Boolean shouldDisplayDismissButton;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener) {
        this(paywallResultListener, null, null, null, null, null, null, null, 254, null);
        t.g(paywallResultListener, "paywallResultListener");
    }

    public static /* synthetic */ PresentPaywallOptions copy$default(PresentPaywallOptions presentPaywallOptions, PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i, Object obj) {
        return presentPaywallOptions.copy((i & 1) != 0 ? presentPaywallOptions.paywallResultListener : paywallResultListener, (i & 2) != 0 ? presentPaywallOptions.paywallSource : paywallSource, (i & 4) != 0 ? presentPaywallOptions.requiredEntitlementIdentifier : str, (i & 8) != 0 ? presentPaywallOptions.shouldDisplayDismissButton : bool, (i & 16) != 0 ? presentPaywallOptions.fontFamily : paywallFontFamily, (i & 32) != 0 ? presentPaywallOptions.customVariables : map, (i & 64) != 0 ? presentPaywallOptions.paywallListener : paywallListenerWrapper, (i & 128) != 0 ? presentPaywallOptions.purchaseLogic : hybridPurchaseLogicBridge);
    }

    public final PaywallResultListener component1() {
        return this.paywallResultListener;
    }

    public final PaywallSource component2() {
        return this.paywallSource;
    }

    public final String component3() {
        return this.requiredEntitlementIdentifier;
    }

    public final Boolean component4() {
        return this.shouldDisplayDismissButton;
    }

    public final PaywallFontFamily component5() {
        return this.fontFamily;
    }

    public final Map component6() {
        return this.customVariables;
    }

    public final PaywallListenerWrapper component7() {
        return this.paywallListener;
    }

    public final HybridPurchaseLogicBridge component8() {
        return this.purchaseLogic;
    }

    public final PresentPaywallOptions copy(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
        return new PresentPaywallOptions(paywallResultListener, paywallSource, str, bool, paywallFontFamily, map, paywallListenerWrapper, hybridPurchaseLogicBridge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentPaywallOptions)) {
            return false;
        }
        PresentPaywallOptions presentPaywallOptions = (PresentPaywallOptions) obj;
        return t.c(this.paywallResultListener, presentPaywallOptions.paywallResultListener) && t.c(this.paywallSource, presentPaywallOptions.paywallSource) && t.c(this.requiredEntitlementIdentifier, presentPaywallOptions.requiredEntitlementIdentifier) && t.c(this.shouldDisplayDismissButton, presentPaywallOptions.shouldDisplayDismissButton) && t.c(this.fontFamily, presentPaywallOptions.fontFamily) && t.c(this.customVariables, presentPaywallOptions.customVariables) && t.c(this.paywallListener, presentPaywallOptions.paywallListener) && t.c(this.purchaseLogic, presentPaywallOptions.purchaseLogic);
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final PaywallFontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final PaywallListenerWrapper getPaywallListener() {
        return this.paywallListener;
    }

    public final PaywallResultListener getPaywallResultListener() {
        return this.paywallResultListener;
    }

    public final PaywallSource getPaywallSource() {
        return this.paywallSource;
    }

    public final HybridPurchaseLogicBridge getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    public final Boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        int hashCode = ((this.paywallResultListener.hashCode() * 31) + this.paywallSource.hashCode()) * 31;
        String str = this.requiredEntitlementIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shouldDisplayDismissButton;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaywallFontFamily paywallFontFamily = this.fontFamily;
        int hashCode4 = (hashCode3 + (paywallFontFamily == null ? 0 : paywallFontFamily.hashCode())) * 31;
        Map map = this.customVariables;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        PaywallListenerWrapper paywallListenerWrapper = this.paywallListener;
        int hashCode6 = (hashCode5 + (paywallListenerWrapper == null ? 0 : paywallListenerWrapper.hashCode())) * 31;
        HybridPurchaseLogicBridge hybridPurchaseLogicBridge = this.purchaseLogic;
        return hashCode6 + (hybridPurchaseLogicBridge != null ? hybridPurchaseLogicBridge.hashCode() : 0);
    }

    public String toString() {
        return "PresentPaywallOptions(paywallResultListener=" + this.paywallResultListener + ", paywallSource=" + this.paywallSource + ", requiredEntitlementIdentifier=" + this.requiredEntitlementIdentifier + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontFamily=" + this.fontFamily + ", customVariables=" + this.customVariables + ", paywallListener=" + this.paywallListener + ", purchaseLogic=" + this.purchaseLogic + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource) {
        this(paywallResultListener, paywallSource, null, null, null, null, null, null, 252, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str) {
        this(paywallResultListener, paywallSource, str, null, null, null, null, null, 248, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool) {
        this(paywallResultListener, paywallSource, str, bool, null, null, null, null, 240, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily) {
        this(paywallResultListener, paywallSource, str, bool, paywallFontFamily, null, null, null, 224, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map) {
        this(paywallResultListener, paywallSource, str, bool, paywallFontFamily, map, null, null, 192, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, PaywallListenerWrapper paywallListenerWrapper) {
        this(paywallResultListener, paywallSource, str, bool, paywallFontFamily, map, paywallListenerWrapper, null, 128, null);
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
    }

    public PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
        t.g(paywallResultListener, "paywallResultListener");
        t.g(paywallSource, "paywallSource");
        this.paywallResultListener = paywallResultListener;
        this.paywallSource = paywallSource;
        this.requiredEntitlementIdentifier = str;
        this.shouldDisplayDismissButton = bool;
        this.fontFamily = paywallFontFamily;
        this.customVariables = map;
        this.paywallListener = paywallListenerWrapper;
        this.purchaseLogic = hybridPurchaseLogicBridge;
    }

    public /* synthetic */ PresentPaywallOptions(PaywallResultListener paywallResultListener, PaywallSource paywallSource, String str, Boolean bool, PaywallFontFamily paywallFontFamily, Map map, PaywallListenerWrapper paywallListenerWrapper, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, int i, k kVar) {
        this(paywallResultListener, (i & 2) != 0 ? PaywallSource.DefaultOffering.INSTANCE : paywallSource, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : paywallFontFamily, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : paywallListenerWrapper, (i & 128) == 0 ? hybridPurchaseLogicBridge : null);
    }
}
