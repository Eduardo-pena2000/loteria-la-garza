package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ColorsFactory {
    public static final int $stable = 0;
    public static final ColorsFactory INSTANCE = new ColorsFactory();

    private ColorsFactory() {
    }

    public final TemplateConfiguration.Colors create(PaywallData.Configuration.Colors paywallDataColors) {
        t.g(paywallDataColors, "paywallDataColors");
        int colorInt = paywallDataColors.getBackground().getColorInt();
        int colorInt2 = paywallDataColors.getText1().getColorInt();
        PaywallColor text2 = paywallDataColors.getText2();
        int colorInt3 = text2 != null ? text2.getColorInt() : colorInt2;
        PaywallColor text3 = paywallDataColors.getText3();
        int colorInt4 = text3 != null ? text3.getColorInt() : colorInt3;
        int colorInt5 = paywallDataColors.getCallToActionBackground().getColorInt();
        int colorInt6 = paywallDataColors.getCallToActionForeground().getColorInt();
        PaywallColor callToActionSecondaryBackground = paywallDataColors.getCallToActionSecondaryBackground();
        Integer valueOf = callToActionSecondaryBackground != null ? Integer.valueOf(callToActionSecondaryBackground.getColorInt()) : null;
        PaywallColor accent1 = paywallDataColors.getAccent1();
        int colorInt7 = accent1 != null ? accent1.getColorInt() : colorInt6;
        PaywallColor accent2 = paywallDataColors.getAccent2();
        int colorInt8 = accent2 != null ? accent2.getColorInt() : colorInt7;
        PaywallColor accent3 = paywallDataColors.getAccent3();
        int colorInt9 = accent3 != null ? accent3.getColorInt() : colorInt8;
        PaywallColor closeButton = paywallDataColors.getCloseButton();
        Integer valueOf2 = closeButton != null ? Integer.valueOf(closeButton.getColorInt()) : null;
        PaywallColor tierControlBackground = paywallDataColors.getTierControlBackground();
        Integer valueOf3 = tierControlBackground != null ? Integer.valueOf(tierControlBackground.getColorInt()) : null;
        PaywallColor tierControlForeground = paywallDataColors.getTierControlForeground();
        Integer valueOf4 = tierControlForeground != null ? Integer.valueOf(tierControlForeground.getColorInt()) : null;
        PaywallColor tierControlSelectedBackground = paywallDataColors.getTierControlSelectedBackground();
        Integer valueOf5 = tierControlSelectedBackground != null ? Integer.valueOf(tierControlSelectedBackground.getColorInt()) : null;
        PaywallColor tierControlSelectedForeground = paywallDataColors.getTierControlSelectedForeground();
        Integer valueOf6 = tierControlSelectedForeground != null ? Integer.valueOf(tierControlSelectedForeground.getColorInt()) : null;
        return new TemplateConfiguration.Colors(s0.b(colorInt), s0.b(colorInt2), s0.b(colorInt3), s0.b(colorInt4), s0.b(colorInt5), s0.b(colorInt6), valueOf != null ? r0.m(s0.b(valueOf.intValue())) : null, s0.b(colorInt7), s0.b(colorInt8), s0.b(colorInt9), valueOf2 != null ? r0.m(s0.b(valueOf2.intValue())) : null, valueOf3 != null ? r0.m(s0.b(valueOf3.intValue())) : null, valueOf4 != null ? r0.m(s0.b(valueOf4.intValue())) : null, valueOf5 != null ? r0.m(s0.b(valueOf5.intValue())) : null, valueOf6 != null ? r0.m(s0.b(valueOf6.intValue())) : null, null);
    }
}
